package Misc.Quad;

import Misc.Oprand.Oprand;

import java.util.HashMap;
import java.util.HashSet;

import static Misc.Mix.InstType.POP;

public class PopQuad extends Quad {
    public PopQuad(Oprand _rt) {
        super();
        op = POP;
        rt = _rt;
    }

    @Override
    public void print() {
        System.out.print("                              ");
        System.out.print(op + " ");
        rt.print();
        System.out.println("");
    }

    @Override
    public void printCode() {
        System.out.print("        ");
        System.out.print(op + " ");
        rt.print();
        System.out.println("");
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
    public void replaceUseReg(HashMap<Oprand, Oprand> set) { }

    @Override
    public void replaceDefReg(HashMap<Oprand, Oprand> set) { }
}
