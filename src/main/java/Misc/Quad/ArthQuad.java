package Misc.Quad;

import Misc.Oprand.AddrOprand;
import Misc.Oprand.MemOprand;
import Misc.Oprand.Oprand;
import Misc.Oprand.RegOprand;

import java.util.HashMap;
import java.util.HashSet;

import static Misc.Mix.Register.rax;
import static Misc.Mix.Register.rdx;
import static Misc.Mix.InstType.*;

public class ArthQuad extends Quad {
    public ArthQuad(String _op) {
        super();
        op = _op;
    }

    public ArthQuad(String _op, Oprand _rt, Oprand _r1) {
        super();
        op = _op;
        rt = _rt;
        r1 = _r1;
    }

    public ArthQuad(String _op, Oprand _rt, Oprand _r1, Oprand _r2) {
        op = _op;
        rt = _rt;
        r1 = _r1;
        r2 = _r2;
    }

    @Override
    public void print() {
        System.out.print("                              ");
        System.out.print(op + " ");
        rt.print();
        System.out.print(" ");
        r1.print();
        System.out.print(" ");

        if (r2 != null) {
            r2.print();
            System.out.print(" ");
        }
        System.out.println();
    }

    @Override
    public void printCode() {
        System.out.print("        ");
        System.out.print(op + " ");
        if (rt != null) {
            rt.print();
            if (r1 != null) {
                System.out.print(", ");
                if (op.equals(SAR) || op.equals(SAL)) {
                    System.out.print("cl");
                } else {
                    r1.print();
                }
            }
        } else if (r1 != null) {
            r1.print();
        }
        System.out.println();
    }

    @Override
    public HashSet<Oprand> getUsed() {
        HashSet<Oprand> ret = new HashSet<>();
        if (op.equals(CDQ)) {
            return ret;
        } else if (op.equals(NOT) || op.equals(NEG) || op.equals(INC)) {
            if (rt instanceof MemOprand) {
                ret.addAll(((MemOprand) rt).getUsed());
            } else if (rt instanceof RegOprand) {
                ret.add(rt);
            }
        } else if (op.equals(MOV) || op.equals(LEA)) {
            if (rt instanceof MemOprand) {
                ret.addAll(((MemOprand) rt).getUsed());
            }
            if (r1 instanceof AddrOprand) {
                ret.addAll(((AddrOprand) r1).getUsed());
            } else if (r1 instanceof RegOprand) {
                ret.add(r1);
            }
        } else {
            if (r1 != null) {
                if (r1 instanceof MemOprand) {
                    ret.addAll(((MemOprand) r1).getUsed());
                } else if (r1 instanceof RegOprand) {
                    ret.add(r1);
                }
            }
            if (rt != null) {
                if (rt instanceof MemOprand) {
                    ret.addAll(((MemOprand) rt).getUsed());
                } else if (rt instanceof RegOprand) {
                    ret.add(rt);
                }
            }
            if (op.equals(IMUL)) {
                ret.add(rax);
            } else if (op.equals(IDIV)) {
                ret.add(rax);
                ret.add(rdx);
            }
        }
        return ret;
    }

    @Override
    public void replaceUseReg(HashMap<Oprand, Oprand> set) {
        if (op.equals(CDQ)) {
            return;
        } else if (op.equals(NOT) || op.equals(NEG) || op.equals(INC)) {
            if (rt instanceof RegOprand && set.containsKey(rt)) {
                rt = set.get(rt);
            } else if (rt instanceof MemOprand) {
                rt = ((MemOprand) rt).copy();
                ((MemOprand) rt).replaceUseReg(set);
            }
        } else if (op.equals(MOV) || op.equals(LEA)) {
            if (r1 instanceof RegOprand && set.containsKey(r1)) {
                r1 = set.get(r1);
            } else if (r1 instanceof AddrOprand) {
                r1 = ((AddrOprand) r1).copy();
                ((AddrOprand) r1).replaceUseReg(set);
            }
            if (rt instanceof MemOprand) {
                rt = ((MemOprand) rt).copy();
                ((MemOprand) rt).replaceUseReg(set);
            }
        } else {
            if (r1 instanceof RegOprand && set.containsKey(r1)) {
                r1 = set.get(r1);
            } else if (r1 instanceof MemOprand) {
                r1 = ((MemOprand) r1).copy();
                ((MemOprand) r1).replaceUseReg(set);
            }

            if (rt instanceof RegOprand && set.containsKey(rt)) {
                rt = set.get(rt);
            } else if (rt instanceof MemOprand) {
                rt = ((MemOprand) rt).copy();
                ((MemOprand) rt).replaceUseReg(set);
            }
        }
    }

    @Override
    public void replaceDefReg(HashMap<Oprand, Oprand> set) {
        if (op.equals(CDQ)) {
            return;
        } else if (rt instanceof RegOprand && set.containsKey(rt)) {
            rt = set.get(rt);
        }
    }

    @Override
    public HashSet<Oprand> getDefined() {
        HashSet<Oprand> ret = new HashSet<>();
        if (rt != null && rt instanceof RegOprand) {
            ret.add(rt);
        }
        if (op.equals(IMUL) || op.equals(IDIV)) {
            ret.add(rax);
            ret.add(rdx);
        }
        return ret;
    }


}

/*
    mov     rt  r1 | imm            mov rt r1
    lea     rt  address[]           lea rt addr

    cdq                             cdq

    add     rt  r1  r2              add rt r1
    sub     rt  r1  r2              sub rt r1
    mul     rt  r1  r2             imul r1
    div     rt  r1  r2             idiv r1
    mod     rt  r1  r2             idiv r1

    sal     rt  r1  r2              sal rt r1
    sar     rt  r1  r2              sar rt r1
    and     rt  r1  r2              and rt r1
    or      rt  r1  r2              or  rt r1
    xor     rt  r1  r2              xor rt r1
    not     rt  r1  // -            not rt
    neg     rt  r1  // ~            neg rt
 */