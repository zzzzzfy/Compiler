package FrontEnd;

public abstract class ASTVisitor {
    void visit(Node node) throws Exception {
        if (node instanceof ProgramNode) visit((ProgramNode) node);

        if (node instanceof VarDefNode) visit((VarDefNode) node);

        if (node instanceof ClassDefNode) visit((ClassDefNode) node);

        if (node instanceof ConstructFuncNode) visit((ConstructFuncNode) node);

        if (node instanceof FunctionDefNode) visit((FunctionDefNode) node);

        if (node instanceof BlockStateNode) visit((BlockStateNode) node);

        if (node instanceof ExprStateNode) visit((ExprStateNode) node);

        if (node instanceof CondStateNode) visit((CondStateNode) node);

        if (node instanceof ForStateNode) visit((ForStateNode) node);

        if (node instanceof WhileStateNode) visit((WhileStateNode) node);

        if (node instanceof ReturnStateNode) visit((ReturnStateNode) node);

        if (node instanceof BreakStateNode) visit((BreakStateNode) node);

        if (node instanceof ContinStateNode) visit((ContinStateNode) node);

        if (node instanceof NullStateNode) visit((NullStateNode) node);

        if (node instanceof VarDefStateNode) visit((VarDefStateNode) node);

        if (node instanceof EmptyExprNode) visit((EmptyExprNode) node);

        if (node instanceof BinExprNode) visit((BinExprNode) node);

        if (node instanceof LUnaryExprNode) visit((LUnaryExprNode) node);

        if (node instanceof RUnaryExprNode) visit((RUnaryExprNode) node);

        if (node instanceof NewVarNode) visit((NewVarNode) node);

        if (node instanceof FunEleExprNode) visit((FunEleExprNode) node);

        if (node instanceof VarEleExprNode) visit((VarEleExprNode) node);

        if (node instanceof PriArrExprNode) visit((PriArrExprNode) node);

        if (node instanceof PriPntExprNode) visit((PriPntExprNode) node);

        if (node instanceof IntLitNode) visit((IntLitNode) node);

        if (node instanceof LogLitNode) visit((LogLitNode) node);

        if (node instanceof NullLitNode) visit((NullLitNode) node);

        if (node instanceof StrLitNode) visit((StrLitNode) node);
    }

    void visitChild(Node node) throws Exception {
        if (node == null) return;
        for (int i = 0; i < node.childs.size(); ++i) {
            visit(node.childs.get(i));
        }
    }
    
    void visit(ProgramNode node) throws Exception { visitChild(node); }

    void visit(VarDefNode node) throws Exception { visitChild(node); }

    void visit(ClassDefNode node) throws Exception { visitChild(node); }

    void visit(FunctionDefNode node) throws Exception { visitChild(node); }

    void visit(ConstructFuncNode node) throws Exception { visitChild(node); }

    void visit(BlockStateNode node) throws Exception { visitChild(node); }

    void visit(ExprStateNode node) throws Exception { visitChild(node); }

    void visit(CondStateNode node) throws Exception { visitChild(node); }

    void visit(ForStateNode node) throws Exception { visitChild(node); }

    void visit(WhileStateNode node) throws Exception { visitChild(node); }

    void visit(ReturnStateNode node) throws Exception { visitChild(node); }

    void visit(BreakStateNode node) throws Exception { visitChild(node); }

    void visit(ContinStateNode node) throws Exception { visitChild(node); }

    void visit(NullStateNode node) throws Exception { visitChild(node); }

    void visit(VarDefStateNode node) throws Exception { visitChild(node); }

    void visit(EmptyExprNode node) throws Exception { visitChild(node); }

    void visit(BinExprNode node) throws Exception { visitChild(node); }

    void visit(LUnaryExprNode node) throws Exception { visitChild(node); }

    void visit(RUnaryExprNode node) throws Exception { visitChild(node); }

    void visit(NewVarNode node) throws Exception { visitChild(node); }

    void visit(FunEleExprNode node) throws Exception { visitChild(node); }

    void visit(VarEleExprNode node) throws Exception { visitChild(node); }

    void visit(PriArrExprNode node) throws Exception { visitChild(node); }

    void visit(PriPntExprNode node) throws Exception { visitChild(node); }

    void visit(IntLitNode node) throws Exception { visitChild(node); }

    void visit(LogLitNode node) throws Exception { visitChild(node); }

    void visit(NullLitNode node) throws Exception { visitChild(node); }

    void visit(StrLitNode node) throws Exception { visitChild(node); }
}
