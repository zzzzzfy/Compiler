package Misc.Oprand;

import java.util.HashSet;

public class GlobalMemOprand extends MemOprand {
    public GlobalMemOprand(Oprand _base) {
        super(_base, null, null);
    }

    @Override
    public HashSet<Oprand> getUsed() {
        HashSet<Oprand> ret = new HashSet<>();
        return ret;
    }

    @Override
    public void print() {
        System.out.print("qword ");
        System.out.print("[rel ");
        base.print();
        System.out.print("]");
    }

    @Override
    public String getCode() {
        String ret = "";
        ret += "qword ";
        ret += "[rel ";
        ret += base.getCode();
        ret += "]";
        return ret;
    }
}
