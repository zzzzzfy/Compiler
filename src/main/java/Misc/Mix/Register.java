package Misc.Mix;

import Misc.Oprand.PhysicalReg;
import Misc.Oprand.RegOprand;

import java.util.ArrayList;
import java.util.HashMap;

public class Register {
    public static HashMap<String, RegOprand> virtualRegs;

    public static ArrayList<PhysicalReg> callerSave;
    public static ArrayList<PhysicalReg> calleeSave;
    public static ArrayList<PhysicalReg> args;

    public static PhysicalReg rax = new PhysicalReg("rax");
    public static PhysicalReg rcx = new PhysicalReg("rcx");
    public static PhysicalReg rdx = new PhysicalReg("rdx");
    public static PhysicalReg rbx = new PhysicalReg("rbx");
    public static PhysicalReg rsp = new PhysicalReg("rsp");
    public static PhysicalReg rbp = new PhysicalReg("rbp");
    public static PhysicalReg rsi = new PhysicalReg("rsi");
    public static PhysicalReg rdi = new PhysicalReg("rdi");
    public static PhysicalReg r8  = new PhysicalReg("r8");
    public static PhysicalReg r9  = new PhysicalReg("r9");
    public static PhysicalReg r10 = new PhysicalReg("r10");
    public static PhysicalReg r11 = new PhysicalReg("r11");
    public static PhysicalReg r12 = new PhysicalReg("r12");
    public static PhysicalReg r13 = new PhysicalReg("r13");
    public static PhysicalReg r14 = new PhysicalReg("r14");
    public static PhysicalReg r15 = new PhysicalReg("r15");

    public static RegOprand getReg(String name, boolean isTemp, int depth) {
        if (depth != -1) name += "_" + Integer.toString(depth);
        if (virtualRegs.containsKey(name)) {
            return virtualRegs.get(name);
        } else {
            RegOprand newReg = new RegOprand(name, isTemp);
            virtualRegs.put(name, newReg);
            return newReg;
        }
    }

    public static void init() {
        virtualRegs = new HashMap<>();

        callerSave = new ArrayList<>();
        calleeSave = new ArrayList<>();
        args = new ArrayList<>();

        callerSave.add(rax);
        callerSave.add(rcx);
        callerSave.add(rdx);
        callerSave.add(rsi);
        callerSave.add(rdi);
        callerSave.add(r8);
        callerSave.add(r9);
        callerSave.add(r10);
        callerSave.add(r11);

        calleeSave.add(rbx);
        calleeSave.add(r12);
        calleeSave.add(r13);
        calleeSave.add(r14);
        calleeSave.add(r15);

        args.add(rdi);
        args.add(rsi);
        args.add(rdx);
        args.add(rcx);
        args.add(r8);
        args.add(r9);
    }
}
