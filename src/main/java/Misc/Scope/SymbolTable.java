package Misc.Scope;

import Misc.Type.Pair;

import java.util.HashMap;

public class SymbolTable<T> {
    HashMap<String, T> table;

    public SymbolTable() {
        table = new HashMap<String, T>();
    }

    public T findtarget(String name) {
        return table.get(name);
    }

    public boolean insert(Pair<String, T> item) {
        return insert(item.getKey(), item.getValue());
    }

    public boolean insert(String key, T val) {
        if (table.get(key) != null) return false;
        table.put(key, val);
        return true;
    }

    public HashMap<String, T> getHashMap() {
        return (HashMap<String, T>)table.clone();
    }

    public int getSize() {
        return table.size();
    }
}
