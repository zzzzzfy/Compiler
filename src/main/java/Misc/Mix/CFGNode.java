package Misc.Mix;

import Misc.Quad.Quad;

import java.util.ArrayList;

public class CFGNode {
    public Quad head;
    public Quad tail;
    ArrayList<CFGNode> froms;
    public ArrayList<CFGNode> tos;
    ArrayList<CFGNode> commonSuc;
    ArrayList<CFGNode> branchSuc;
    String labelName;
    int idx;

    public boolean hasNxt;

    public CFGNode(int labelIdx) {
        froms = new ArrayList<>();
        tos = new ArrayList<>();
        labelName = "label_" + Integer.toString(labelIdx);
        head = null;
        tail = null;
        hasNxt = false;
    }

    public void prepend(Quad q) {
        if (q != null) q.block = this;
        if (head == null) {
            q.pre = q.nxt = null;
            head = tail = q;
        } else {
            head.prepend(q);
        }
    }

    public void append(Quad q) {
        if (q != null) q.block = this;
        if (head == null) {
            q.pre = q.nxt = null;
            head = tail = q;
        } else {
            tail.append(q);
        }
    }

    public void insertQuad(Quad q) {
        if (q != null) q.block = this;
        append(q);
    }

    public void addTo(CFGNode to) {
        tos.add(to);
    }

    public void addFrom(CFGNode from) {
        froms.add(from);
    }

    public String getName() {
        return labelName;
    }

    public boolean hasFrom() {
        return froms.size() > 0;
    }

    public ArrayList<CFGNode> getFrom() {
        return froms;
    }

    public ArrayList<CFGNode> getTo() {
        return tos;
    }

    public void print() {
        System.out.println(labelName + ":");
        for (Quad q = head; q != null ; q = q.nxt) {
            q.print();
        }
        System.out.print("(From: ");
        for (int i = 0 ; i < froms.size() ; ++ i) {
            System.out.print(froms.get(i).getName() + " ");
        }
        System.out.println(")");
        System.out.print("(To: ");
        for (int i = 0 ; i < tos.size() ; ++ i) {
            System.out.print(tos.get(i).getName() + " ");
        }
        System.out.println(")");
        System.out.println();
        System.out.println();
    }

    public void printCode() {
        //if (!hasFrom() && head == tail && hasNxt) return;
        if (hasFrom()) {
            System.out.println(labelName + ":");
        }
        for (Quad q = head; q != null ; q = q.nxt) {
            if (hasNxt && q == tail) continue;
            q.printCode();
        }
    }

    public void setIdx(int _idx) {
        idx = _idx;
    }

    public int getIdx() {
        return idx;
    }

    public void setCommonSuc(ArrayList<CFGNode> x) {
        commonSuc = x;
    }

    public void setBranchSuc(ArrayList<CFGNode> x) {
        branchSuc = x;
    }
/*
    public LinkedList <Quad> getQuads() {
        return quads;
    }
*/
}
