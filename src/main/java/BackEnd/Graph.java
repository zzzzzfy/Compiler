package BackEnd;

import Misc.Oprand.Oprand;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    HashMap<Oprand, HashSet<Oprand> > graph;

    public Graph() {
        graph = new HashMap<>();
    }

    public Graph(Graph other) {
        graph = new HashMap<>();
        for (Oprand reg : other.getAllRegs()) {
            graph.put(reg, new HashSet<>(other.getAdjs(reg)));
        }
    }

    public Collection<Oprand> getAllRegs() {
        return graph.keySet();
    }

    public HashSet<Oprand> getAdjs(Oprand reg) {
        if (graph.containsKey(reg)) {
            return graph.get(reg);
        }
        return new HashSet<>();
    }

    public void addReg(Oprand reg) {
        if (graph.containsKey(reg)) return;
        graph.put(reg, new HashSet<Oprand>());
    }

    public void addRegs(HashSet<Oprand> regs) {
        for (Oprand reg : regs) {
            addReg(reg);
        }
    }

    public void addEdge(Oprand reg1, Oprand reg2) {
        if (reg1 == reg2) return;
        graph.get(reg1).add(reg2);
        graph.get(reg2).add(reg1);
    }

    public int getDegree(Oprand reg) {
        if (!graph.containsKey(reg)) return 0;
        return graph.get(reg).size();
    }

    public void delReg(Oprand reg) {
        if (!graph.containsKey(reg)) return;
        for (Oprand v : getAdjs(reg)) {
            graph.get(v).remove(reg);
        }
        graph.remove(reg);
    }
}
