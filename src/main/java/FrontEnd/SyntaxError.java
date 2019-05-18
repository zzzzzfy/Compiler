package FrontEnd;

public class SyntaxError extends Exception {
    public PositionDef pos;

    SyntaxError (PositionDef l) {
        pos = new PositionDef(l);
    }

    public String toString() {
        return "SyntaxError";
    }
}

class ReDefinedError extends SyntaxError {
    ReDefinedError(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "ReDefinedError";
    }
}

class NoDefinedVarError extends SyntaxError {
    NoDefinedVarError(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "NoDefinedVarError";
    }
}

class NoDefinedTypeError extends SyntaxError {
    NoDefinedTypeError(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "NoDefinedTypeError";
    }
}

class WrongNameConsFunc extends SyntaxError {
    WrongNameConsFunc(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "WrongNameConsFunc";
    }
}

class DisMatchedFormError extends SyntaxError {
    DisMatchedFormError(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "DisMatchedFormError";
    }
}

class DisMatchedTypeError extends SyntaxError {
    DisMatchedTypeError(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "DisMatchedTypeError";
    }
}

class DisMatchedFuncReturn extends SyntaxError {
    DisMatchedFuncReturn (PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "DisMatchedFuncReturn";
    }
}

class BrkOutIterStat extends SyntaxError {
    BrkOutIterStat (PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "BrkOutIterStat";
    }
}

class CntOutIterStat extends SyntaxError {
    CntOutIterStat (PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "CntOutIterStat";
    }
}

class NotConditionExpr extends SyntaxError {
    NotConditionExpr(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "NotConditionExpr";
    }
}

class NoCastExpr extends SyntaxError {
    NoCastExpr(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "NoCastExpr";
    }
}

class NotLeftValue extends SyntaxError {
    NotLeftValue(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "NotLeftValue";
    }
}

class NullPointer extends SyntaxError {
    NullPointer(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "NullPointer";
    }
}

class VoidDefVarError extends SyntaxError {
    VoidDefVarError (PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "VoidDefVarError";
    }
}

class NoMainFuncError extends SyntaxError {
    NoMainFuncError(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "NoMainFuncError";
    }
}

class NoDefinedOpError extends SyntaxError {
    NoDefinedOpError(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "NoDefinedOpError";
    }
}

class ThisBeAssigned extends SyntaxError {
    ThisBeAssigned(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {return "ThisBeAssigned";}
}

class ThisOutOfClass extends SyntaxError {
    ThisOutOfClass(PositionDef l) {
        super(l);
    }
    @Override
    public String toString() {
        return "ThisOutOfClass";
    }
}