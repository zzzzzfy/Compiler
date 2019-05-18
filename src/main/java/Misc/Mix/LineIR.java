package Misc.Mix;

import Misc.Type.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class LineIR {
    ArrayList<FuncFrame> funcs;

    HashMap<String, Long> classSizeList;
    HashMap<String, Long> strLiters;
    public HashMap<String, FuncFrame> stringToFunc;
    ArrayList<String> globalVar;
    Long strLiterSize;
    HashMap<String, Pair<String, Long> > roData;

    Long globalVarSize;

    ArrayList<String> global;
    public int tmpCnt;

    public LineIR() {
        tmpCnt = -1;
        funcs = new ArrayList<>();
        classSizeList = new HashMap<>();
        strLiters = new HashMap<>();
        stringToFunc = new HashMap<>();
        globalVar = new ArrayList<>();
        strLiterSize = 0L;
        globalVarSize = 0L;
        global = new ArrayList<>();
        roData = new HashMap<>();
    }
    public void addTmp(){
        tmpCnt++;
    }

    public int getTmpCnt() {
        return tmpCnt;
    }

    public void pushClassSize(String className, Long Size) {
        classSizeList.put(className, Size);
    }

    public void pushGlobalVar(String varName) {
        globalVar.add(varName);
        globalVarSize += 1;
        global.add(varName);
    }

    public void pushFunc(FuncFrame func) {
        funcs.add(func);
        stringToFunc.put(func.name, func);
        global.add(func.name);
    }

    public void addRoData(String name, byte[] list) {
        int len = list.length;
        String str = "";
        for (int i = 0 ; i < len ; ++ i) {
            String tmp = Integer.toHexString(list[i]).toUpperCase();
            if (tmp.length() == 1) tmp = '0' + tmp;
            str += tmp + "H, ";
        }
        str += "00H";
        roData.put(name, new Pair<>(str, (long) len));
    }

    public HashMap<String, Pair <String, Long> > getRoData() {
        return roData;
    }

    public Long addStrLiter(String str) {
        /* Long ret = strLiters.get(str);
        if (ret != null) return ret;
        else */
        Long ret = strLiterSize;
        addRoData("S_" + Long.toString(ret), str.getBytes());
        strLiters.put(str, strLiterSize);
        strLiterSize += 1;
        return ret;
    }

    public void print() {
        for (int i = 0 ; i < funcs.size() ; ++ i) {
            funcs.get(i).print();
        }
    }

    public void printCode() {
        for (FuncFrame func : funcs) {
            func.printCode();
        }
    }

    public ArrayList<FuncFrame> getFuncs() {
        return funcs;
    }

    public ArrayList<String> getGlobal() {
        return global;
    }

    public ArrayList<String> getGlobalVar() {
        return globalVar;
    }
}
