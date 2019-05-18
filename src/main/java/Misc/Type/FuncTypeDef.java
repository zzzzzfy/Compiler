package Misc.Type;

import java.util.ArrayList;

public class FuncTypeDef extends TypeDef {
    VarTypeDef retType;
    ArrayList<VarTypeDef> paraList;

    public FuncTypeDef(VarTypeDef typ) {
        retType = typ;
        paraList = new ArrayList<>();
    }

    public FuncTypeDef(VarTypeDef typ, VarTypeDef... params) {
        retType = typ;
        paraList = new ArrayList<>();
        for (int i = 0 ; i < params.length ; ++ i) {
            paraList.add(params[i]);
        }
    }

    @Override
    public boolean equals(TypeDef other) {
        if (!(other instanceof FuncTypeDef)) return false;
        if (!retType.equals(((FuncTypeDef)other).retType)) return false;
        if (paraList.size() != ((FuncTypeDef)other).paraList.size()) return false;
        for (int i = 0 ; i < paraList.size() ; ++ i) {
            if (!paraList.get(i).equals(((FuncTypeDef)other).paraList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void insert(VarTypeDef typ) {
        paraList.add(typ);
        return;
    }

    public VarTypeDef getRetType() {
        return retType;
    }

    public int getParaNum() {
        return paraList.size();
    }

    public VarTypeDef getPara(int k) {
        return paraList.get(k);
    }

    @Override
    public Long getSize() {
        return 0L; // wait to change
    }
}
