package Misc.Quad;

import Misc.Mix.CFGNode;
import Misc.Oprand.Oprand;
import Misc.Oprand.StackSlot;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public abstract class Quad {
    public String op;
    Oprand rt, r1, r2;

    public CFGNode block;
    public Quad pre;
    public Quad nxt;

    public Quad() {
        op = "";
        rt = null;
        r1 = null;
        r2 = null;
        pre = null;
        nxt = null;
        block = null;
    }

    public void prepend(Quad q) {
        q.block = block;
        if (this.pre == null) {
            q.nxt = this;
            this.pre = q;
            block.head = q;
        } else {
            pre.nxt = q;
            q.pre = pre;
            q.nxt = this;
            this.pre = q;
        }
    }

    public void append(Quad q) {
        q.block = block;
        if (this.nxt == null) {
            this.nxt = q;
            q.pre = this;
            block.tail = q;
        } else {
            q.nxt = this.nxt;
            this.nxt.pre = q;
            this.nxt = q;
            q.pre = this;
        }
    }

    public void remove() {
        if (this.pre == null && this.nxt == null) {
            block.head = block.tail = null;
        } else if (pre == null) {
            block.head = nxt;
            nxt.pre = null;
        } else if (nxt == null) {
            block.tail = pre;
            pre.nxt = null;
        } else {
            pre.nxt = nxt;
            nxt.pre = pre;
        }
    }
    
    public void replace(Quad q) {
        q.block = block;
        if (pre == null && nxt == null) {
            block.head = block.tail = q;
            q.pre = q.nxt = null;
        } else if (pre == null) {
            block.head = q;
            q.pre = null;
            this.nxt.pre = q;
            q.nxt = this.nxt;
        } else if (nxt == null) {
            q.pre = this.pre;
            this.pre.nxt = q;
            block.tail = q;
            q.nxt = null;
        } else {
            q.pre = this.pre;
            this.pre.nxt = q;
            q.nxt = this.nxt;
            this.nxt.pre = q;
        }
    }

    public LinkedList<StackSlot> getStackSlots() {
        LinkedList<StackSlot> ret = new LinkedList<>();
        if (rt != null && rt instanceof StackSlot) {
            ret.add((StackSlot) rt);
        }
        if (r1 != null && r1 instanceof StackSlot) {
            ret.add((StackSlot) r1);
        }
        if (r2 != null && r2 instanceof StackSlot) {
            ret.add((StackSlot) r2);
        }
        return ret;
    }

    public Oprand getRt() {
        return rt;
    }

    public void setRt(Oprand _rt) {
        rt = _rt;
    }

    public Oprand getR1() {
        return r1;
    }

    public void setR1(Oprand _r1) {
        r1 = _r1;
    }

    public Oprand getR2() {
        return r2;
    }

    public void setR2(Oprand _r2) {
        r2 = _r2;
    }

    public abstract void print();

    public abstract HashSet<Oprand> getUsed();

    public abstract HashSet<Oprand> getDefined();

    public abstract void replaceUseReg(HashMap<Oprand, Oprand> set);

    public abstract void replaceDefReg(HashMap<Oprand, Oprand> set);

    public abstract void printCode();
}