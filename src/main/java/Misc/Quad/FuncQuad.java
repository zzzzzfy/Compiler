package Misc.Quad;

import Misc.Oprand.ImmOprand;
import Misc.Oprand.Oprand;

import java.util.HashMap;
import java.util.HashSet;

import static Misc.Mix.Register.*;
import static Misc.Mix.InstType.CALL;
import static Misc.Mix.InstType.RET;

public class FuncQuad extends Quad {
    public String funcName;
    public boolean isReaRet;

    public FuncQuad(String _op, Oprand _r1, Oprand _r2) { // param
        super();
        op = _op;
        r1 = _r1;
        r2 = _r2;
        funcName = "";
    }

    public FuncQuad(String _op, Oprand _r1) { // ret
        super();
        op = _op;
        r1 = _r1;
        funcName = "";
        isReaRet = false;
    }

    public FuncQuad(String _op, Oprand _rt, String func, Oprand _r1) { // call
        super();
        op = _op;
        rt = _rt;
        funcName = func;
        r1 = _r1;
    }

    @Override
    public HashSet<Oprand> getUsed() {
        HashSet<Oprand> ret = new HashSet<>();
        if (op.equals(CALL)) {
            int paramNum = (int)((ImmOprand) r1).getVal().longValue();
            if (paramNum > 6) paramNum = 6;
            for (int i = 0 ; i < paramNum ; ++ i) {
                ret.add(args.get(i));
            }
        } else if (op.equals(RET)) {
            ret.add(rax);
        }
        return ret;
    }

    @Override
    public HashSet<Oprand> getDefined() {
        HashSet<Oprand> ret = new HashSet<>();
        if (op.equals(CALL)) {
            for (Oprand p : callerSave) {
                ret.add(p);
            }
        }
        return ret;
    }

    @Override
    public void replaceUseReg(HashMap<Oprand, Oprand> set) {
        return;
    }

    @Override
    public void replaceDefReg(HashMap<Oprand, Oprand> set) {
        return;
    }

    @Override
    public void print() {
        System.out.print("                              ");
        System.out.print(op + " ");
        if (rt != null) {
            rt.print();
            System.out.print(" ");
        }
        if (!funcName.equals("")) {
            System.out.print(funcName + " ");
        }
        if (r1 != null) {
            r1.print();
            System.out.print(" ");
        }
        System.out.println();
    }

    @Override
    public void printCode() {
        System.out.print("        ");
        System.out.print(op + " ");
        if (op.equals(CALL)) {
            System.out.print(funcName);
        }
        System.out.println();
    }
}

/*
    param   r1
    call    rt  func  r1
    ret     r1
 */