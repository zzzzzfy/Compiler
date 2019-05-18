package Misc.Scope;

public class ClassScope<T> extends Scope<T> {
    public ClassScope(Scope<T> Parent, String Name) {
        super(Parent, Name);
    }
}
