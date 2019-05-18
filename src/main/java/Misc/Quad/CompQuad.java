package Misc.Quad;

import Misc.Oprand.MemOprand;
import Misc.Oprand.Oprand;
import Misc.Oprand.RegOprand;

import java.util.HashMap;
import java.util.HashSet;

import static Misc.Mix.InstType.CMP;

public class CompQuad extends Quad {
    public CompQuad(Oprand _r1, Oprand _r2) {
        super();
        op = CMP;
        r1 = _r1;
        r2 = _r2;
    }

    @Override
    public void print() {
        System.out.print("                              ");
        System.out.print("cmp ");
        r1.print();
        System.out.print(" ");
        r2.print();
        System.out.print(" ");
        System.out.println();
    }

    @Override
    public void printCode() {
        System.out.print("        ");
        System.out.print("cmp ");
        r1.print();
        System.out.print(", ");
        r2.print();
        System.out.println();
    }

    @Override
    public HashSet<Oprand> getUsed() {
        HashSet<Oprand> ret = new HashSet<>();
        if (r1 instanceof MemOprand) {
            ret.addAll(((MemOprand) r1).getUsed());
        } else if (r1 instanceof RegOprand) {
            ret.add(r1);
        }
        if (r2 instanceof MemOprand) {
            ret.addAll(((MemOprand) r2).getUsed());
        } else if (r2 instanceof RegOprand) {
            ret.add(r2);
        }
        return ret;
    }

    @Override
    public void replaceUseReg(HashMap<Oprand, Oprand> set) {
        if (r1 instanceof RegOprand && set.containsKey(r1)) {
            r1 = set.get(r1);
        } else if (r1 instanceof MemOprand) {
            r1 = ((MemOprand) r1).copy();
            ((MemOprand) r1).replaceUseReg(set);
        }

        if (r2 instanceof RegOprand && set.containsKey(r2)) {
            r2 = set.get(r2);
        } else if (r2 instanceof MemOprand) {
            r2 = ((MemOprand) r2).copy();
            ((MemOprand) r2).replaceUseReg(set);
        }
    }

    @Override
    public HashSet<Oprand> getDefined() {
        HashSet<Oprand> ret = new HashSet<>();
        return ret;
    }

    @Override
    public void replaceDefReg(HashMap<Oprand, Oprand> set) {
        return;
    }
}