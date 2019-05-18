package Misc.Oprand;

public class StackSlot extends MemOprand {
    public StackSlot() {
        super(null, null, null);
    }

    @Override
    public void print() {
        if (base == null) {
            System.out.print("stack[]");
        } else {
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
}
