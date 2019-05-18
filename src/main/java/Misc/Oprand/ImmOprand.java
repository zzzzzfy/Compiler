package Misc.Oprand;

public class ImmOprand extends Oprand {
    Long val;
    public ImmOprand(Long _val) {
        val = _val;
    }

    public Long getVal() {
         return val;
    }

    @Override
    public void print() {
        System.out.print(val);
    }

    @Override
    public String getCode() {
        String ret = Long.toString(val);
        return ret;
    }
}
