package Misc.Quad;

import Misc.Mix.CFGNode;
import Misc.Oprand.Oprand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class JumpQuad extends Quad {
    CFGNode label1;
    CFGNode label2;

    public JumpQuad(String _op, CFGNode _label1) {
        super();
        op = _op;
        label1 = _label1;
        label2 = null;
    }

    public JumpQuad(String _op, CFGNode _label1, CFGNode _label2) {
        super();
        op = _op;
        label1 = _label1;
        label2 = _label2;
    }

    public ArrayList<CFGNode> getLabel() {
        ArrayList<CFGNode> ret = new ArrayList<>();
        ret.add(label1);
        if (label2 != null) {
            ret.add(label2);
        }
        return ret;
    }

    public CFGNode getLabel2() {
        return label2;
    }

    public CFGNode getLabel1() {
        return label1;
    }

    public void setLabel2(CFGNode _label2) {
        label2 = _label2;
    }

    public void setLabel1(CFGNode _label1) {
        label1 = _label1;
    }

    @Override
    public void print() {
        System.out.print("                              ");
        System.out.print(op + " ");
        System.out.print(label1.getName() + " ");
        if (label2 != null) {
            System.out.print(label2.getName() + " ");
        }
        System.out.println();
    }

    @Override
    public void printCode() {
        System.out.print("        ");
        System.out.print(op + " ");
        System.out.print(label1.getName());
        System.out.println();
    }

    @Override
    public HashSet<Oprand> getUsed() {
        HashSet<Oprand> ret = new HashSet<>();
        return ret;
    }

    @Override
    public HashSet<Oprand> getDefined() {
        HashSet<Oprand> ret = new HashSet<>();
        return ret;
    }

    @Override
    public void replaceUseReg(HashMap<Oprand, Oprand> set) {
        return;
    }

    @Override
    public void replaceDefReg(HashMap<Oprand, Oprand> set) {
        return;
    }
}

/*
    jmp     label1
    je      label1  label2
    jne     label1  label2
    jl      label1  label2
    jle     label1  label2
    jg      label1  label2
    jge     label1  label2

*/