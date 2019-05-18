package BackEnd;

import Misc.Mix.CFGNode;
import Misc.Mix.FuncFrame;
import Misc.Mix.LineIR;
import Misc.Oprand.*;
import Misc.Quad.ArthQuad;
import Misc.Quad.Quad;

import java.util.*;

import static Misc.Mix.Register.*;
import static Misc.Mix.InstType.MOV;

public class RegisterAllocater {

    LineIR lineIR;
    ActionAnalyzer actAnalysiser;
    Graph graph, oldGraph;
    int tmpVarIdx;
    HashSet<Oprand> simplifyList;
    HashSet<Oprand> spillList;
    HashSet<Oprand> spilledRegs;
    LinkedList<Oprand> orderStack;
    HashMap<Oprand, Oprand> colors;
    ArrayList<PhysicalReg> generalRegs;
    int regNum;

    public RegisterAllocater(LineIR _lineIR) {
        lineIR = _lineIR;
        actAnalysiser = new ActionAnalyzer();
        tmpVarIdx = _lineIR.getTmpCnt();
        generalRegs = new ArrayList<>();
        generalRegs.addAll(callerSave);
        generalRegs.addAll(calleeSave);
        regNum = generalRegs.size();
    }

    public void work() {
        ArrayList<FuncFrame> funcs = lineIR.getFuncs();
        for (int i = 0 ; i < funcs.size() ; ++ i) {
            processFunc(funcs.get(i));
        }
    }

    private void simplify() {
        Oprand reg = simplifyList.iterator().next();
        HashSet<Oprand> adjs = new HashSet<>(graph.getAdjs(reg));
        graph.delReg(reg);
        for (Oprand v : adjs) {
            if (graph.getDegree(v) < regNum && spillList.contains(v)) {
                spillList.remove(v);
                simplifyList.add(v);
            }
        }
        simplifyList.remove(reg);
        orderStack.addFirst(reg);
    }

    private void spill() {
        Oprand p = null;
        int deg = -1;
        for (Oprand v : spillList) {
            int curDeg = graph.getDegree(v);
            if (curDeg > deg) {
                p = v;
                deg = curDeg;
            }
        }
        graph.delReg(p);
        spillList.remove(p);
        orderStack.addFirst(p);
    }

    private boolean assignColors() {
        for (Oprand v : orderStack) {
            if (v instanceof PhysicalReg) {
                colors.put(v, v);
            }
        }
        boolean ret = true;
        for (Oprand v : orderStack) {
            if (v instanceof PhysicalReg) continue;
            HashSet<PhysicalReg> choices = new HashSet<>(generalRegs);
            for (Oprand u : oldGraph.getAdjs(v)) {
                if (colors.containsKey(u)) {
                    choices.remove(colors.get(u));
                }
            }
            if (choices.isEmpty()) {
                spilledRegs.add(v);
                ret = false;
            } else {
                PhysicalReg p = null;
                for (PhysicalReg reg : callerSave) {
                    if (choices.contains(reg)) {
                        p = reg;
                        break;
                    }
                }
                if (p == null) {
                    p = choices.iterator().next();
                }
                colors.put(v, p);
            }
        }
        return ret;
    }

    private void replaceRegs(FuncFrame func) {
        for (Map.Entry p : colors.entrySet()) {
            func.phyRegs.add((Oprand) p.getValue());
        }

        for (CFGNode block : func.getCFG()) {
            for (Quad q = block.head; q != null ; q = q.nxt) {
                q.replaceUseReg(colors);
                q.replaceDefReg(colors);
            }
        }
    }

    RegOprand newTempVar(boolean isAddr) {
        tmpVarIdx += 1;
        return getReg((isAddr ? "A" : "V") + "_" + Integer.toString(tmpVarIdx), true, 0);
    }

    private void spillRegs(FuncFrame func) {
        HashMap<Oprand, MemOprand> spillPlaces = new HashMap<>();
        for (Oprand v : spilledRegs) {
            if (v.memPos != null) {
                spillPlaces.put(v, v.memPos);
            } else {
                spillPlaces.put(v, new StackSlot());
            }
        }

        for (CFGNode block : func.getCFG()) {
            for (Quad q = block.head; q != null ; q = q.nxt) {
                HashSet<Oprand> used = new HashSet<>(q.getUsed());
                HashSet<Oprand> defined = new HashSet<>(q.getDefined());
                HashMap<Oprand, Oprand> renameMap = new HashMap<>();
                used.retainAll(spilledRegs);
                defined.retainAll(spilledRegs);
                for (Oprand reg : used) {
                    if (!renameMap.containsKey(reg)) {
                        renameMap.put(reg, newTempVar(false));
                    }
                }
                for (Oprand reg : defined) {
                    if (!renameMap.containsKey(reg)) {
                        renameMap.put(reg, newTempVar(false));
                    }
                }
                q.replaceDefReg(renameMap);
                q.replaceUseReg(renameMap);

                for (Oprand reg : used) {
                    q.prepend(new ArthQuad(MOV, renameMap.get(reg), spillPlaces.get(reg)));
                }
                for (Oprand reg : defined) {
                    q.append(new ArthQuad(MOV, spillPlaces.get(reg), renameMap.get(reg)));
                    q = q.nxt;
                }
            }
        }
    }

    private void processFunc(FuncFrame curfunc) {
        while (true) {
            graph = actAnalysiser.getConflictGraph(curfunc);
            oldGraph = new Graph(graph);

            simplifyList = new HashSet<>();
            spillList = new HashSet<>();
            spilledRegs = new HashSet<>();
            orderStack = new LinkedList<>();
            colors = new HashMap<>();

            for (Oprand reg : graph.getAllRegs()) {
                if (graph.getDegree(reg) < regNum) {
                    simplifyList.add(reg);
                } else {
                    spillList.add(reg);
                }
            }

            while (!simplifyList.isEmpty() || !spillList.isEmpty()) {
                if (!simplifyList.isEmpty()) simplify();
                else spill();
            }

            if (assignColors()) {
                replaceRegs(curfunc);
                break;
            } else {
                spillRegs(curfunc);
            }

        }
    }
}
