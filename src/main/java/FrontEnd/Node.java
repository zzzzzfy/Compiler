
package FrontEnd;

import Misc.Oprand.Oprand;
import Misc.Scope.Scope;
import Misc.Type.TypeDef;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    String id;
    String reName;
    TypeDef type;
    String inClass;
    String strLiter;
    Oprand reg;
    PositionDef pos;
    List<Node> childs;
    Scope<TypeDef> belong;
    int stateNum;
    public boolean isStrTop;
    boolean willJump;
    boolean unique;
    boolean willUse;
    boolean leftVal;

    public void accept(ASTVisitor visitor) throws Exception {
        visitor.visit(this);
    }

    public Node copy() {
        Node ret = null;
        if (this instanceof ProgramNode) ret = new ProgramNode();
        else
        if (this instanceof VarDefNode) ret = new VarDefNode();
        else
        if (this instanceof ClassDefNode) ret = new ClassDefNode();
        else
        if (this instanceof ConstructFuncNode) ret = new ConstructFuncNode();
        else
        if (this instanceof FunctionDefNode) ret = new FunctionDefNode();
        else
        if (this instanceof BlockStateNode) ret = new BlockStateNode();
        else
        if (this instanceof ExprStateNode) ret = new ExprStateNode();
        else
        if (this instanceof CondStateNode) ret = new CondStateNode();
        else
        if (this instanceof ForStateNode) ret = new ForStateNode();
        else
        if (this instanceof WhileStateNode) ret = new WhileStateNode();
        else
        if (this instanceof ReturnStateNode) ret = new ReturnStateNode();
        else
        if (this instanceof BreakStateNode) ret = new BreakStateNode();
        else
        if (this instanceof ContinStateNode) ret = new ContinStateNode();
        else
        if (this instanceof NullStateNode) ret = new NullStateNode();
        else
        if (this instanceof VarDefStateNode) ret = new VarDefStateNode();
        else
        if (this instanceof EmptyExprNode) ret = new EmptyExprNode();
        else
        if (this instanceof BinExprNode) ret = new BinExprNode();
        else
        if (this instanceof LUnaryExprNode) ret = new LUnaryExprNode();
        else
        if (this instanceof RUnaryExprNode) ret = new RUnaryExprNode();
        else
        if (this instanceof NewVarNode) ret = new NewVarNode();
        else
        if (this instanceof FunEleExprNode) ret = new FunEleExprNode();
        else
        if (this instanceof VarEleExprNode) ret = new VarEleExprNode();
        else
        if (this instanceof PriArrExprNode) ret = new PriArrExprNode();
        else
        if (this instanceof PriPntExprNode) ret = new PriPntExprNode();
        else
        if (this instanceof IntLitNode) ret = new IntLitNode();
        else
        if (this instanceof LogLitNode) ret = new LogLitNode();
        else
        if (this instanceof NullLitNode) ret = new NullLitNode();
        else
        if (this instanceof StrLitNode) ret = new StrLitNode();
        ret.id = id;
        ret.reName = reName;
        ret.type = type;
        ret.inClass = inClass;
        ret.strLiter = strLiter;
        ret.reg = reg;
        ret.pos = pos;
        for (int i = 0 ; i < childs.size() ; ++ i) {
            ret.childs.add(childs.get(i).copy());
        }
        ret.belong = belong;
        ret.unique = unique;
        ret.willUse = willUse;
        ret.leftVal = leftVal;
        ret.willJump = willJump;
        ret.isStrTop = isStrTop;
        ret.stateNum = stateNum;
        return ret;
    }

    Node() {
        id = "";
        reName = "";
        type = TypeDef.build("void");
        inClass = "";
        strLiter = "";
        reg = null;
        pos  = null;
        childs = new ArrayList<>();
        belong = null;
        unique = false;
        willUse = true;
        leftVal = false;
        willJump = true;
        isStrTop = false;
        stateNum = 0;
    }

    public void setUnique() {
        unique = true;
    }
    public boolean isUnique() {
        return unique;
    }
    public void setNotUse() {
        willUse = false;
    }
    public boolean isWillUse() {
        return willUse;
    }
    public void setLeftVal() {
        leftVal = true;
    }
    public boolean isLeftVal() {
        return leftVal;
    }
    public void setNoJump() {
        willJump = false;
    }
    public boolean isWillJump() {
        return willJump;
    }
}

class ProgramNode extends Node {
    ProgramNode() { super(); }
}

class ClassDefNode extends Node {
    ClassDefNode() { super(); }
}

/*
class NoAssignVarDecNode extends Node {
    NoAssignVarDecNode() { super(); }
}
*/
class ConstructFuncNode extends Node {
    ConstructFuncNode() { super(); }
}

class FunctionDefNode extends Node {
    FunctionDefNode() { super(); }
}

/*
class ParaDecNode extends Node {
    ParaDecNode() { super(); }
}
*/
abstract class StateNode extends Node {
    StateNode() { super(); }
}

class VarDefStateNode extends StateNode {
    VarDefStateNode() { super(); }
}

class VarDefNode extends Node {
    VarDefNode() { super(); }
}

class BlockStateNode extends StateNode {
    BlockStateNode() { super(); }
}

class ExprStateNode extends StateNode {
    ExprStateNode() { super(); }
}

class CondStateNode extends StateNode {
    CondStateNode() { super(); }
}

class WhileStateNode extends StateNode {
    WhileStateNode() { super(); }
}

class ForStateNode extends StateNode {
    ForStateNode() { super(); }
}

class ReturnStateNode extends StateNode {
    ReturnStateNode() { super(); }
}

class BreakStateNode extends StateNode {
    BreakStateNode() { super(); }
}

class ContinStateNode extends StateNode {
    ContinStateNode() { super(); }
}

class NullStateNode extends StateNode {
    NullStateNode() { super(); }
}

abstract class ExprNode extends Node {
    ExprNode() { super(); }
}

class BinExprNode extends ExprNode {
    BinExprNode() { super(); }
}

class EmptyExprNode extends ExprNode {
    EmptyExprNode() { super(); }
}

abstract class UnaryExprNode extends ExprNode {
    UnaryExprNode() { super(); }
}

class LUnaryExprNode extends UnaryExprNode {
    LUnaryExprNode() { super(); }
}

class RUnaryExprNode extends UnaryExprNode {
    RUnaryExprNode() { super(); }
}

class NewVarNode extends ExprNode {
    NewVarNode() { super(); }
}

class PriArrExprNode extends ExprNode {
    PriArrExprNode() { super(); }
}

class PriPntExprNode extends ExprNode {
    PriPntExprNode() { super(); }
}

/*
class ElementExprNode extends ExprNode {
    ElementExprNode() { super(); }
}
*/
class VarEleExprNode extends ExprNode {
    VarEleExprNode() { super(); }
}

class FunEleExprNode extends ExprNode {
    FunEleExprNode() { super(); }
}

abstract class LiteralNode extends ExprNode {
    LiteralNode() { super(); }
}

class LogLitNode extends LiteralNode {
    LogLitNode() { super(); }
}

class IntLitNode extends LiteralNode {
    IntLitNode() { super(); }
}

class StrLitNode extends LiteralNode {
    StrLitNode() { super(); }
}

class NullLitNode extends LiteralNode {
    NullLitNode() { super(); }
}