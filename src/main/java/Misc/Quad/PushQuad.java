package Misc.Quad;

import Misc.Oprand.MemOprand;
import Misc.Oprand.Oprand;
import Misc.Oprand.RegOprand;

import java.util.HashMap;
import java.util.HashSet;

import static Misc.Mix.InstType.PUSH;

public class PushQuad extends Quad {
    public PushQuad(Oprand _r1) {
        super();
        op = PUSH;
        r1 = _r1;
    }

    @Override
    public HashSet<Oprand> getUsed() {
        HashSet<Oprand> ret = new HashSet<>();
        if (r1 instanceof MemOprand) {
            ret.addAll(((MemOprand) r1).getUsed());
        } else if (r1 instanceof RegOprand) {
            ret.add(r1);
        }
        return ret;
    }

    @Override
    public HashSet<Oprand> getDefined() {
        HashSet<Oprand> ret = new HashSet<>();
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
    }

    @Override
    public void replaceDefReg(HashMap<Oprand, Oprand> set) {
        return;
    }

    @Override
    public void print() {
        System.out.print("                              ");
        System.out.print(op + " ");
        r1.print();
        System.out.println("");
    }

    @Override
    public void printCode() {
        System.out.print("        ");
        System.out.print(op + " ");
        r1.print();
        System.out.println();
    }
}
