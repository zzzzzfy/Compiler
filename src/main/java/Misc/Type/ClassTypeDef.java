package Misc.Type;

import Misc.Scope.Scope;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeDef extends TypeDef {
    Map<String, TypeDef> objects;
    HashMap<String, Long> varIdx;
    Scope<TypeDef> blg;
    Long classSize;
    String className;

    public ClassTypeDef() {
        blg = null;
        objects = new HashMap<>();
        varIdx = new HashMap<>();
        classSize = 0L;
        className = "";
    }

    public ClassTypeDef(Map<String, TypeDef> objectList, HashMap<String, Long> _varIdx, Scope<TypeDef> _blg, String _className, Long _classSize) {
        objects = new HashMap<>();
        for (Map.Entry <String, TypeDef> iter : objectList.entrySet()) {
            objects.put(iter.getKey(), iter.getValue());
        }
        classSize = _classSize;
        varIdx = new HashMap<>(_varIdx);
        /* for (int i = 0 ; i < _varIdx.size() ; ++ i) {
            // System.out.generateCode("_varIdx i:");
            // System.out.println(_varIdx.get(i));
            varIdx.put(_varIdx.get(i), classSize);
            classSize += 1;
        }*/

        blg = _blg;
        className = _className;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public Long getSize() {
        return classSize;
    }

    public String getScopeName() {
        return blg.getName();
    }

    public void insertObject(String key, TypeDef typ) {
        objects.put(key, typ);
    }

    @Override
    public boolean equals(TypeDef other) {
        if (!(other instanceof ClassTypeDef)) return false;
        if (objects.size() != ((ClassTypeDef)other).objects.size()) return false;
        for (String p : objects.keySet()) {
            if (!((ClassTypeDef)other).objects.containsKey(p) ||
                !((ClassTypeDef)other).objects.get(p).equals(objects.get(p))){
                return false;
            }
        }
        return true;
    }

    public boolean contain(String str) {
        return objects.containsKey(str);
    }

    public boolean containVar(String var) {
        return varIdx.containsKey(var);
    }

    public Long getVarIdx(String var) {
        // System.out.generateCode("getVarIdx");
        // System.out.println(var);
        return varIdx.get(var);
    }

    public TypeDef getEntity(String str) {
        return objects.get(str);
    }
}
