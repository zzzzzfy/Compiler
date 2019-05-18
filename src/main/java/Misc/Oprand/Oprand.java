package Misc.Oprand;

public abstract class Oprand {
    public MemOprand memPos = null;

    public void setMemPos(MemOprand pos) { // too dangerous
        memPos = pos;
    }

    public abstract void print();

    public abstract String getCode();
}

/*
    imm             value
    reg             reg
    address         base offset scale
    memory          qword
 */