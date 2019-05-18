package Misc.Oprand;

public class ArrayAddrOprand extends AddrOprand {
    public ArrayAddrOprand(Oprand _base, Oprand _offset, Oprand _scale) {
        super(_base, _offset, _scale);
        disp = new ImmOprand(8L);
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
        System.out.print("+8]");
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
        ret += "+8]";
        return ret;
    }
}
