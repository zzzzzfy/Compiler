package BackEnd;

import Misc.Mix.BuiltInCode;
import Misc.Mix.CFGNode;
import Misc.Mix.FuncFrame;
import Misc.Mix.LineIR;
import Misc.Oprand.*;
import Misc.Quad.*;
import Misc.Type.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

import static Misc.Mix.Register.*;
import static Misc.Mix.InstType.*;

public class CodeGen {
    LineIR lineIR;

    public CodeGen(LineIR _lineIR) {
        lineIR = _lineIR;
    }

    public void work() {
        for (FuncFrame func : lineIR.getFuncs()) {
            processFunc(func);
        }
        generateCode();
    }

    void processFunc(FuncFrame curfunc) {
        LinkedList<Oprand> parameters = curfunc.parameters;
        if (parameters.size() > 6) {
            // System.out.println(curfunc.getName());
            // System.out.println(parameters.size());
            for (int i = 6 ; i < parameters.size() ; ++ i) {
                curfunc.params.add((StackSlot) parameters.get(i).memPos);
            }
        }
        HashSet<StackSlot> slotsSet = new HashSet<>();
        for (CFGNode block : curfunc.getCFG()) {
            for (Quad q = block.head; q != null ; q = q.nxt) {
                if (q instanceof FuncQuad && q.op.equals(CALL)) {
                    long val = ((ImmOprand) q.getR1()).getVal();
                    if (val > 6) {
                        q.append(new ArthQuad(ADD, rsp, new ImmOprand((val - 6) * 8)));
                    }
                }
                for (StackSlot s : q.getStackSlots()) {
                    if (!curfunc.params.contains(s)) {
                        slotsSet.add(s);
                    }
                }
            }
        }
        curfunc.temps.addAll(slotsSet);
        for (int i = 0 ; i < curfunc.params.size() ; ++ i) {
            StackSlot s = curfunc.params.get(i);
            s.setBase(rbp);
            s.setDisp(new ImmOprand((long)(16 + 8 * i)));
        }
        for (int i = 0 ; i < curfunc.temps.size() ; ++ i) {
            StackSlot s = curfunc.temps.get(i);
            s.setBase(rbp);
            s.setDisp(new ImmOprand((long)(-8 - 8 * i)));
        }

        Quad head = curfunc.getStart().head;
        if (head == null) {
            curfunc.getStart().insertQuad(new PushQuad(rbp));
            head = curfunc.getStart().head;
            head.append(new ArthQuad(MOV, rbp, rsp));
            head = head.nxt;
            head.append(new ArthQuad(SUB, rsp, new ImmOprand((long) curfunc.getFuncSize())));
            head = head.nxt;
        } else {
            head.prepend(new PushQuad(rbp));
            head.prepend(new ArthQuad(MOV, rbp, rsp));
            head.prepend(new ArthQuad(SUB, rsp, new ImmOprand((long) curfunc.getFuncSize())));
            head = head.pre;
        }


        HashSet<Oprand> callees = new HashSet<>(curfunc.phyRegs);
        callees.retainAll(calleeSave);
        for (Oprand reg : callees) {
            head.append(new PushQuad(reg));
        }
        CFGNode end = curfunc.getEnd();
        /* if (end == null) {
            System.out.println("*********************" + curfunc.getName());
        }*/
        for (Oprand reg : callees) {
            end.tail.prepend(new PopQuad(reg));
        }
        end.tail.prepend(new ArthQuad(MOV, rsp, rbp));
        end.tail.prepend(new PopQuad(rbp));
        // end.insertQuad(new FuncQuad(RET, null));
    }

    ArrayList<String> globals = new ArrayList<>();
    ArrayList<String> externs = new ArrayList<>();
    ArrayList<String> codes = new ArrayList<>();

    void initPrint() {
        globals.addAll(lineIR.getGlobal());

        globals.add("print");
        globals.add("println");
        globals.add("getString");
        globals.add("getInt");
        globals.add("toString");
        globals.add("string_length");
        globals.add("string_substring");
        globals.add("string_parseInt");
        globals.add("string_ord");
        globals.add("string_strcat");
        globals.add("string_compare");

        externs.add("strcmp");
        externs.add("__sprintf_chk");
        externs.add("memcpy");
        externs.add("malloc");
        externs.add("__isoc99_scanf");
        externs.add("puts");
        externs.add("__printf_chk");

    }

    public ArrayList<String> generateCode() {
        initPrint();
        codes.add("default rel");
        codes.add("");
        for (int i = 0; i < globals.size(); ++i) {
            codes.add("global " + globals.get(i));
        }
        codes.add("");
        for (int i = 0; i < externs.size(); ++i) {
            codes.add("extern " + externs.get(i));
        }

        codes.add("");

        codes.add(BuiltInCode.text);
        codes.add("\n" + "SECTION .text" + "\n");

        for (int i = 0 ; i < codes.size() ; ++ i) {
            System.out.println(codes.get(i));
        }

        codes.clear();

        lineIR.printCode();

        codes.add("\n" + "\n" + "SECTION .data    align=8");
        codes.add("");
        codes.add("\n" + "\n" + "SECTION .bss     align=8");

        for (String globalVar : lineIR.getGlobalVar()) {
            codes.add(globalVar + ":");
            codes.add(String.format("%-8s resq %d", " ", 1));
        }

        codes.add("\n" + "SECTION .rodata");
        for (Map.Entry p : lineIR.getRoData().entrySet()) {
            codes.add(p.getKey() + ": ");
            codes.add(String.format("%-8s dq %s", " ", ((Pair <String, Long>) p.getValue()).getValue()));
            codes.add(String.format("%-8s db %s", " ", ((Pair <String, Long>) p.getValue()).getKey()));
        }

        codes.add(BuiltInCode.roData);
        codes.add("");

        for (int i = 0 ; i < codes.size() ; ++ i) {
            System.out.println(codes.get(i));
        }
        return codes;
//        codes.clear();
    }
}
