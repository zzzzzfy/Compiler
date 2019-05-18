package FrontEnd;

import Misc.Type.*;

public abstract class OpType {
    String op;

    OpType(String OP) {
        op = OP;
    }

    static OpType getOpType(String OP) {
        if (OP.equals("=")) return new AssignOpType(OP);

        if (OP.equals("+") || OP.equals("-") || OP.equals("*") || OP.equals("/") || OP.equals("%"))
            return new ArithOpType(OP);

        if (OP.equals("<") || OP.equals(">") || OP.equals("==") || OP.equals("!=") || OP.equals("<=") || OP.equals(">="))
            return new CompOpType(OP);

        if (OP.equals("&&") || OP.equals("||") || OP.equals("!"))
            return new LogicOpType(OP);

        if (OP.equals("<<") || OP.equals(">>") || OP.equals("&") || OP.equals("|") || OP.equals("^") || OP.equals("~"))
            return new BitOpType(OP);

        if (OP.equals("++") || OP.equals("--"))
            return new SelfOpType(OP);

        assert (false);
        return new FakeOpType(OP);
    }
    abstract boolean containsType(TypeDef type);
}

class ArithOpType extends OpType {
    ArithOpType(String OP) {
        super(OP);
    }

    @Override
    boolean containsType(TypeDef type) {
        return (type instanceof IntTypeDef) || (op.equals("+") && type instanceof StringTypeDef);
    }
}

class CompOpType extends OpType {
    CompOpType(String OP) {
        super(OP);
    }

    @Override
    boolean containsType(TypeDef type) {
        if (op.equals("==") || op.equals("!=")) return true;
        return (type instanceof IntTypeDef) || (type instanceof StringTypeDef);
    }

    boolean checkExpr(TypeDef left, TypeDef right) {
        if (op.equals("==") || op.equals("!=")) {
            if (left instanceof OtherTypeDef || left instanceof ArrayTypeDef) {
                return left.equals(right) || right instanceof NullTypeDef;
            }
            if (right instanceof OtherTypeDef || right instanceof ArrayTypeDef) {
                return left.equals(right) || left instanceof NullTypeDef;
            }
        }
        return left.equals(right);
    }
}

class LogicOpType extends OpType {
    LogicOpType(String OP) {
        super(OP);
    }

    @Override
    boolean containsType(TypeDef type) {
        return (type instanceof BoolTypeDef);
    }
}

class BitOpType extends OpType {
    BitOpType(String OP) {
        super(OP);
    }

    @Override
    boolean containsType(TypeDef type) {
        return (type instanceof IntTypeDef);
    }
}

class AssignOpType extends OpType {
    AssignOpType(String OP) {
        super(OP);
    }

    @Override
    boolean containsType(TypeDef type) {
        return (type instanceof VarTypeDef);
    }

    static boolean checkExpr(TypeDef left, TypeDef right) {
        if (left instanceof OtherTypeDef || left instanceof ArrayTypeDef) {
            return left.equals(right) || right instanceof NullTypeDef;
        }
        return left.equals(right);
    }
}

class SelfOpType extends OpType {
    SelfOpType(String OP) {
        super(OP);
    }

    @Override
    boolean containsType(TypeDef type) {
        return (type instanceof IntTypeDef);
    }
}

class FakeOpType extends OpType {
    FakeOpType(String OP) {
        super(OP);
    }

    @Override
    boolean containsType(TypeDef type) {
        return false;
    }
}
