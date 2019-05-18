package Misc.Scope;

public class GlobalScope<T> extends Scope<T> {
    public GlobalScope(Scope<T> Parent, String Name) {
        super(Parent, Name);
    }
}
