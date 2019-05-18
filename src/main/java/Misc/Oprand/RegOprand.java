package Misc.Oprand;

public class RegOprand extends Oprand {
    String regName;
    boolean isTemp;
    public RegOprand(String _regName, boolean _isTemp) {
        regName = _regName;
        isTemp = _isTemp;
    }

    public String getRegName() {
        return regName;
    }

    public boolean isTmp() {
        return isTemp;
    }

    @Override
    public void print() {
        System.out.print(regName);
    }

    @Override
    public String getCode() {
        return regName;
    }
}
