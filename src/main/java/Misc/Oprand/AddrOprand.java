package Misc.Oprand;

import java.util.HashMap;
import java.util.HashSet;

public class AddrOprand extends Oprand {
    Oprand base, offSet, scale;
    Oprand disp = null;
    public AddrOprand(Oprand _base, Oprand _offSet, Oprand _scale) {
        base = _base;
        offSet = _offSet;
        scale = _scale;
    }

    public Oprand getBase() {
        return base;
    }

    public void setBase(Oprand _base) {
        base = _base;
    }

    public Oprand getOffSet() {
        return offSet;
    }

    public void setOffSet(Oprand _offset) {
        offSet = _offset;
    }

    public Oprand getScale() {
        return scale;
    }

    public void setDisp(Oprand _disp) {
        disp = _disp;
    }

    @Override
    public void print() {
        System.out.print("[");
        base.print();
        if (offSet != null) {
            System.out.print("+");
            offSet.print();
            System.out.print("*");
            scale.print();
        }
        if (disp != null) {
            System.out.print("+");
            disp.print();
        }
        System.out.print("]");
    }

    @Override
    public String getCode() {
        String ret = "";
        ret += "[";
        ret += base.getCode();
        if (offSet != null) {
            ret += "+";
            ret += offSet.getCode();
            ret += "*";
            ret += scale.getCode();
        }
        if (disp != null) {
            ret += "+";
            ret += disp.getCode();
        }
        ret += "]";
        return ret;
    }

    public HashSet<Oprand> getUsed() {
        HashSet<Oprand> ret = new HashSet<>();
        if (base != null && base instanceof RegOprand) ret.add(base);
        if (offSet != null && offSet instanceof RegOprand) ret.add(offSet);
        if (scale != null && scale instanceof RegOprand) ret.add(scale);
        return ret;
    }

    public void replaceUseReg(HashMap<Oprand, Oprand> set) {
        if (this instanceof GlobalMemOprand) return;
        if (base != null && base instanceof RegOprand) {
            if (set.containsKey(base)) base = set.get(base);
        }
        if (offSet != null && offSet instanceof RegOprand) {
            if (set.containsKey(offSet)) offSet = set.get(offSet);
        }
    }

    public AddrOprand copy() {
        if (this instanceof MemOprand) {
            return ((MemOprand) this).copy();
        } else {
            if (this instanceof ArrayAddrOprand) {
                return new ArrayAddrOprand(base, offSet, scale);
            } else {
                return new AddrOprand(base, offSet, scale);
            }
        }
    }
}
