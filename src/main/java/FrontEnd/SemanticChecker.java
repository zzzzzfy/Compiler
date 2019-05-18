package FrontEnd;

import Misc.Oprand.ImmOprand;
import Misc.Scope.ClassScope;
import Misc.Scope.GlobalScope;
import Misc.Scope.Scope;
import Misc.Type.*;

import java.util.HashMap;

public class SemanticChecker extends ASTVisitor {
    private GlobalScope<TypeDef> rootScope;
//  private ClassScope<TypeDef> curClassScope;
    private int loopNum;
    private String curClass;
    private TypeDef funcRetType;
    public HashMap<String, Node> funcNode;
    private int stateNum;

    public SemanticChecker(GlobalScope<TypeDef> root, HashMap<String, Node> _funcNode) {
        rootScope = root;
//      curClassScope = null;
        loopNum = 0;
        curClass = "";
        funcRetType = null;
        funcNode = _funcNode;
        stateNum = 0;
    }

    boolean checkTypeExist(TypeDef type) {
        if (type instanceof ArrayTypeDef) type = ((ArrayTypeDef)type).getSingleType();
        if (type instanceof SpecialTypeDef) {
            ClassTypeDef belong = (ClassTypeDef) rootScope.findItem(((SpecialTypeDef) type).getTypeId());
            if (belong == null) return false;
            ((SpecialTypeDef) type).setBelongClass(belong);
        }
        return true;
    }

    boolean checkLeftValue(ExprNode node) {
        if (node instanceof VarEleExprNode) return true;
        if (node instanceof PriPntExprNode &&
            checkLeftValue((ExprNode) node.childs.get(1))) return true;
        if (node instanceof PriArrExprNode) return true;
        return false;
    }

    boolean matchFuncForm(FuncTypeDef func, FunEleExprNode node) {
        int num = func.getParaNum();
        if (num != node.childs.size()) return false;
        for (int i = 0 ; i < num ; ++ i) {
            Node child = node.childs.get(i);
            if (!AssignOpType.checkExpr(func.getPara(i), child.type)) return false;
        }
        return true;
    }

    TypeDef typeCheckObj(ClassTypeDef nodeclass, Node node) throws Exception {
        if (!nodeclass.contain(node.id)) throw new NoDefinedVarError(node.pos);
        TypeDef type = nodeclass.getEntity(node.id);
        if (node instanceof FunEleExprNode) {
            if (!(type instanceof FuncTypeDef)) throw new NoDefinedVarError(node.pos);
            if (!matchFuncForm((FuncTypeDef)type, (FunEleExprNode)node)) throw new NoDefinedVarError(node.pos);
            return ((FuncTypeDef)type).getRetType();
        } else {
            if (!(type instanceof VarTypeDef)) throw new NoDefinedVarError(node.pos);
            node.reName = (checkAddrType(type) ? "A" : "V") + "_" + node.id + "_" + nodeclass.getScopeName();
            return type;
        }
    }

    @Override
    void visit(VarDefNode curNode) throws Exception {
        if (curNode.type instanceof VoidTypeDef
            || (curNode.type instanceof ArrayTypeDef
                && ((ArrayTypeDef)(curNode.type)).getSingleType() instanceof VoidTypeDef)) {
            throw new VoidDefVarError(curNode.pos);
        }
        if (!checkTypeExist(curNode.type)) throw new NoDefinedTypeError(curNode.pos);
        ++ stateNum;
        visitChild(curNode);
        if (curNode.childs.size() > 0) {
            ExprNode expr = (ExprNode)curNode.childs.get(0);
            if (!curNode.type.equals(expr.type)) {
                if (!AssignOpType.checkExpr(curNode.type, expr.type)) {
                    throw new NoCastExpr(expr.pos);
                }
            }
        }
        Scope<TypeDef> curScope = curNode.belong;
        if (curScope instanceof ClassScope) curNode.inClass = curClass;
        else {
            if (!curScope.addItem(curNode.id, curNode.type)) {
                throw new ReDefinedError(curNode.pos);
            }
        }
        curNode.reName = (checkAddrType(curNode.type) ? "A" : "V") + "_" + curNode.id + "_" + curScope.getName();
    }

    @Override
    void visit(ClassDefNode curNode) throws Exception {
        curClass = curNode.id;
 //       curClassScope = (ClassScope<TypeDef>)curNode.belong;
        visitChild(curNode);
        curNode.type = rootScope.findItem(curNode.id);
        curClass = "";
 //       curClassScope = null;
    }

    @Override
    void visit(FunctionDefNode curNode) throws Exception {
        if(!checkTypeExist(curNode.type)) throw new NoDefinedTypeError(curNode.pos);
        funcRetType = curNode.type;
        stateNum = 0;
        visitChild(curNode);
        curNode.stateNum = stateNum;
        funcRetType = null;
        // System.err.generateCode(curNode.id + " stateNum: " + stateNum);
        if (curNode.belong instanceof ClassScope) {
            curNode.inClass = curClass;
            funcNode.put(curNode.inClass + "_" + curNode.id, curNode);
        } else {
            funcNode.put(curNode.id, curNode);
        }
    }

    @Override
    void visit(ConstructFuncNode curNode) throws Exception {
        if (!curClass.equals(curNode.id)) throw new WrongNameConsFunc(curNode.pos);
        funcRetType = curNode.type;
        stateNum = 0;
        visitChild(curNode);
        curNode.stateNum = stateNum;
        funcRetType = null;
        curNode.inClass = curClass;
        funcNode.put(curClass + "_" + curClass, curNode);
    }

    @Override
    void visit(CondStateNode curNode) throws Exception {
        ++ stateNum;
        visitChild(curNode);
        ExprNode expr = (ExprNode)curNode.childs.get(0);
        if (!(expr.type instanceof BoolTypeDef)) throw new NotConditionExpr(expr.pos);
    }

    @Override
    void visit(ForStateNode curNode) throws Exception {
        ++ stateNum;
        ++ loopNum;
        visitChild(curNode);
        -- loopNum;
        ExprNode expr = (ExprNode)curNode.childs.get(1);
        if (!(expr instanceof EmptyExprNode)) {
            if (!(expr.type instanceof BoolTypeDef)) throw new NotConditionExpr(expr.pos);
        }
    }

    @Override
    void visit(WhileStateNode curNode) throws Exception {
        ++ stateNum;
        ++ loopNum;
        visitChild(curNode);
        -- loopNum;
        ExprNode expr = (ExprNode)curNode.childs.get(0);
        if (!(expr.type instanceof BoolTypeDef)) throw new NotConditionExpr(expr.pos);
    }

    @Override
    void visit(BreakStateNode curNode) throws Exception {
        ++ stateNum;
        if (loopNum == 0) throw new BrkOutIterStat(curNode.pos);
    }

    @Override
    void visit(ContinStateNode curNode) throws Exception {
        ++ stateNum;
        if (loopNum == 0) throw new CntOutIterStat(curNode.pos);
    }

    @Override
    void visit(ReturnStateNode curNode) throws Exception {
        ++ stateNum;
        if (funcRetType instanceof VoidTypeDef) {
            if (!curNode.childs.isEmpty()) throw new DisMatchedFuncReturn(curNode.pos);
        } else {
            if (curNode.childs.isEmpty()) throw new DisMatchedFuncReturn(curNode.pos);
            visitChild(curNode);
            ExprNode expr = (ExprNode) curNode.childs.get(0);
            if(!AssignOpType.checkExpr(funcRetType, expr.type)) {
                throw new DisMatchedFuncReturn(curNode.pos);
            }
        }
    }

    @Override
    void visit(VarDefStateNode curNode) throws Exception {
        visitChild(curNode);
    }

    @Override
    public void visit(ExprStateNode node) throws Exception {
        ++ stateNum;
        visitChild(node);
    }

    @Override
    void visit(BinExprNode curNode) throws Exception {
        ++ stateNum;
        visitChild(curNode);
        ExprNode left = (ExprNode)curNode.childs.get(0);
        ExprNode right = (ExprNode)curNode.childs.get(1);
        OpType op = OpType.getOpType(curNode.id);
        if (!left.type.equals(right.type)) {
            boolean flag = false;
            if (op instanceof AssignOpType && AssignOpType.checkExpr(left.type, right.type)) flag = true;
            if (op instanceof CompOpType && ((CompOpType)op).checkExpr(left.type, right.type)) flag = true;
            if (!flag) throw new NoCastExpr(curNode.pos);
        }
        if (op instanceof AssignOpType) {
            if (!checkLeftValue(left)) throw new NotLeftValue(left.pos);
            if (left instanceof VarEleExprNode && left.id.equals("this")) throw new ThisBeAssigned(left.pos);
            curNode.type = TypeDef.build("void");
        } else if (op.containsType(left.type)) {
            if (op instanceof CompOpType) curNode.type = new BoolTypeDef();
            else curNode.type = left.type;
        } else throw new NoDefinedOpError(curNode.pos);

        if (left.isUnique() && right.isUnique()) {
            -- stateNum;
            curNode.setUnique();
            switch (curNode.id) {
                case "+":
                    if (left.type instanceof IntTypeDef) {
                        curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() + ((ImmOprand)right.reg).getVal());
                    } else {
                        curNode.strLiter = left.strLiter + right.strLiter;
                    }
                    break;
                case "-":
                    curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() - ((ImmOprand)right.reg).getVal());
                    break;
                case "*":
                    curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() * ((ImmOprand)right.reg).getVal());
                    break;
                case "/":
                    curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() / ((ImmOprand)right.reg).getVal());
                    break;
                case "%":
                    curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() % ((ImmOprand)right.reg).getVal());
                    break;
                case "<":
                    if (left.type instanceof StringTypeDef) {
                        if (left.strLiter.compareTo(right.strLiter) < 0) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    } else {
                        if (((ImmOprand)left.reg).getVal() < ((ImmOprand)right.reg).getVal()) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    }
                    break;
                case ">":
                    if (left.type instanceof StringTypeDef) {
                        if (left.strLiter.compareTo(right.strLiter) > 0) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    } else {
                        if (((ImmOprand)left.reg).getVal() > ((ImmOprand)right.reg).getVal()) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    }
                    break;
                case "==":
                    if (left.type instanceof StringTypeDef) {
                        if (left.strLiter.compareTo(right.strLiter) == 0) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    } else {
                        if (((ImmOprand)left.reg).getVal() == ((ImmOprand)right.reg).getVal()) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    }
                    break;
                case "!=":
                    if (left.type instanceof StringTypeDef) {
                        if (left.strLiter.compareTo(right.strLiter) != 0) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    } else {
                        if (((ImmOprand)left.reg).getVal() != ((ImmOprand)right.reg).getVal()) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    }
                    break;
                case "<=":
                    if (left.type instanceof StringTypeDef) {
                        if (left.strLiter.compareTo(right.strLiter) <= 0) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    } else {
                        if (((ImmOprand)left.reg).getVal() <= ((ImmOprand)right.reg).getVal()) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    }
                    break;
                case ">=":
                    if (left.type instanceof StringTypeDef) {
                        if (left.strLiter.compareTo(right.strLiter) >= 0) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    } else {
                        if (((ImmOprand)left.reg).getVal() >= ((ImmOprand)right.reg).getVal()) {
                            curNode.reg = new ImmOprand(1L);
                        } else {
                            curNode.reg = new ImmOprand(0L);
                        }
                    }
                    break;
                case "&&":
                    if ((((ImmOprand)left.reg).getVal() == 1L) && (((ImmOprand)right.reg).getVal() == 1L)) {
                        curNode.reg = new ImmOprand(1L);
                    } else {
                        curNode.reg = new ImmOprand(0L);
                    }
                    break;
                case "||":
                    if ((((ImmOprand)left.reg).getVal() == 1L) || (((ImmOprand)right.reg).getVal() == 1L)) {
                        curNode.reg = new ImmOprand(1L);
                    } else {
                        curNode.reg = new ImmOprand(0L);
                    }
                    break;
                case "<<":
                    curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() << ((ImmOprand)right.reg).getVal());
                    break;
                case ">>":
                    curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() >> ((ImmOprand)right.reg).getVal());
                    break;
                case "&":
                    curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() & ((ImmOprand)right.reg).getVal());
                    break;
                case "|":
                    curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() | ((ImmOprand)right.reg).getVal());
                    break;
                case "^":
                    curNode.reg = new ImmOprand(((ImmOprand)left.reg).getVal() ^ ((ImmOprand)right.reg).getVal());
                    break;
            }
        }
    }

    Long getNot(Long a) {
        if (a > 0L) return 0L;
        return 1L;
    }

    @Override
    void visit(LUnaryExprNode curNode) throws Exception {
        ++ stateNum;
        visitChild(curNode);
        ExprNode expr = (ExprNode)curNode.childs.get(0);
        OpType op = OpType.getOpType(curNode.id);
        if (op instanceof SelfOpType && !checkLeftValue(expr)) throw new NotLeftValue(expr.pos);
        if (!op.containsType(expr.type)) throw new NoCastExpr(curNode.pos);
        curNode.type = expr.type;
        if (expr.isUnique()) {
            -- stateNum;
            curNode.setUnique();
            switch (curNode.id) {
                case "+":
                    curNode.reg = expr.reg;
                    break;
                case "-":
                    // System.out.println("yes_neg");
                    curNode.reg = new ImmOprand(- ((ImmOprand)expr.reg).getVal());
                    break;
                case "!":
                    curNode.reg = new ImmOprand(getNot(((ImmOprand)expr.reg).getVal()));
                    break;
                case "~":
                    curNode.reg = new ImmOprand(~ ((ImmOprand)expr.reg).getVal());
                    break;
            }
        }
    }

    @Override
    void visit(RUnaryExprNode curNode) throws Exception {
        ++ stateNum;
        visitChild(curNode);
        ExprNode expr = (ExprNode)curNode.childs.get(0);
        OpType op = OpType.getOpType(curNode.id);
        if (op instanceof SelfOpType && !checkLeftValue(expr)) throw new NotLeftValue(expr.pos);
        if (!op.containsType(expr.type)) throw new NoCastExpr(curNode.pos);
        curNode.type = expr.type;

    }

    @Override
    void visit(NewVarNode curNode) throws Exception {
        ++ stateNum;
        if (curNode.childs.isEmpty()) {
            if (!checkTypeExist(curNode.type)) throw new NoDefinedOpError(curNode.pos);
            return;
        }
        visitChild(curNode);
        /* for (int i = 0 ; i < curNode.childs.size() ; ++ i) {
            ExprNode expr = (ExprNode)(curNode.childs.get(i));
            if (!(expr instanceof EmptyExprNode) && !(expr.type instanceof IntTypeDef)) {
                throw new NoCastExpr(expr.pos);
            }
        }
        if (curNode.childs.size() > 0) {
            curNode.type = new ArrayTypeDef((VarTypeDef) curNode.type, curNode.childs.size());
        }*/
        Node expr = curNode.childs.get(0);
        if (!(expr instanceof EmptyExprNode) && !(expr.type instanceof IntTypeDef)) {
            throw new NoCastExpr(expr.pos);
        }
    }

    @Override
    void visit(FunEleExprNode curNode) throws Exception {
        ++ stateNum;
        visitChild(curNode);
        Pair<Scope<TypeDef>, TypeDef> ret = curNode.belong.matchVarName(curNode.id);
        if (ret == null) throw new NoDefinedTypeError(curNode.pos);
        if (ret.getKey() instanceof ClassScope) curNode.inClass = curClass;
        TypeDef func = ret.getValue();
        if ((!(func instanceof FuncTypeDef)) || (!matchFuncForm((FuncTypeDef)func, curNode))) {
            throw new NoDefinedTypeError(curNode.pos);
        }
        curNode.type = ((FuncTypeDef)func).getRetType();
    }

    @Override
    void visit(PriArrExprNode curNode) throws Exception {
        ++ stateNum;
        visitChild(curNode);
        Node pointer = curNode.childs.get(0);
        if (!(pointer.type instanceof ArrayTypeDef)) throw new NullPointer(curNode.pos);
        curNode.type = ((ArrayTypeDef)pointer.type).getInnerType();
    }

    @Override
    void visit(PriPntExprNode curNode) throws Exception {
        ++ stateNum;
        Node child = curNode.childs.get(0);
        Node object = curNode.childs.get(1);
        visit(child);
        if (child.type instanceof ArrayTypeDef) {
            if (object.id.equals("size") && object.childs.size() == 0) curNode.type = new IntTypeDef();
            else throw new NoDefinedTypeError(object.pos);
            return;
        }
        if (!(child.type instanceof SpecialTypeDef)) throw new NoCastExpr(curNode.pos);
        ClassTypeDef nodeclass = (ClassTypeDef)rootScope.findItem(((SpecialTypeDef)child.type).getTypeId());

        visitChild(object);
        curNode.type = typeCheckObj(nodeclass, object);
        if (curNode.type instanceof SpecialTypeDef) {
            ClassTypeDef tmp = (ClassTypeDef) rootScope.findItem(((SpecialTypeDef)curNode.type).getTypeId());
            ((SpecialTypeDef) curNode.type).setBelongClass(tmp);
        }
        object.inClass = ((SpecialTypeDef)child.type).getTypeId();
        object.type = curNode.type;
    }

    boolean checkAddrType(TypeDef type) {
        return (type instanceof ArrayTypeDef) || (type instanceof SpecialTypeDef);
    }

    @Override
    void visit(VarEleExprNode curNode) throws Exception {
        if (curNode.id.equals("this")) {
            if (curClass.equals("")) throw new ThisOutOfClass(curNode.pos);
            curNode.type = new OtherTypeDef(curClass);
            ((OtherTypeDef)curNode.type).setBelongClass((ClassTypeDef)rootScope.findItem(curClass));
            curNode.reName = curClass + "_" + "this";
            return;
        }
        Pair<Scope<TypeDef>, TypeDef> ret = curNode.belong.matchVarName(curNode.id);
        if (ret == null) {
            System.out.println(curNode.id);
            throw new NoDefinedVarError(curNode.pos);
        }
        if (ret.getKey() instanceof ClassScope) {
            curNode.inClass = curClass;
        }
        curNode.type = ret.getValue();
        curNode.reName = (checkAddrType(curNode.type) ? "A" : "V") + "_" + curNode.id + "_" + ret.getKey().getName();
    }

    @Override
    public void visit(IntLitNode node) throws Exception {
        node.reg = new ImmOprand(Long.parseLong(node.id));
        node.setUnique();
    }

    @Override
    public void visit(LogLitNode node) throws Exception {
        if (node.id.equals("true")) node.reg = new ImmOprand(1L);
        else node.reg = new ImmOprand(0L);
        node.setUnique();
    }

    @Override
    public void visit(NullLitNode node) throws Exception {
        node.reg = new ImmOprand(0L);
        node.setUnique();
    }

    @Override
    public void visit(StrLitNode node) throws Exception {
        node.strLiter = node.id;
        node.setUnique();
    }
}