package Misc.Oprand;

public class MemOprand extends AddrOprand {
    public MemOprand(Oprand _base, Oprand _offSet, Oprand _scale) {
        super(_base, _offSet, _scale);
    }

    @Override
    public void print() {
        System.out.print("qword ");
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
        ret += "qword ";
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

    public MemOprand copy() {
        if (this instanceof StackSlot) {
            return this;
        } else if (this instanceof GlobalMemOprand) {
            return new GlobalMemOprand(base);
        } else {
            return new MemOprand(base, offSet, scale);
        }
    }
}
