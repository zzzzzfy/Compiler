package Misc.Oprand;

public class StrOprand extends ImmOprand {
    public StrOprand(Long _val) {
        super(_val);
    }
    @Override
    public void print() {
        System.out.print("S_" + Long.toString(val));
    }

    @Override
    public String getCode() {
        String ret = "S_" + Long.toString(val);
        return ret;
    }
}
