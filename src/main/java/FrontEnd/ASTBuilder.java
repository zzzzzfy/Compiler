
package FrontEnd;

import Misc.Type.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ASTBuilder extends MxStarBaseVisitor <Node> {
    @Override
    public ProgramNode visitProgram(MxStarParser.ProgramContext ctx) {
        ProgramNode ret = new ProgramNode();
        for (int i = 0 ; i < ctx.getChildCount() ; ++ i) {
            ret.childs.add(visit(ctx.getChild(i)));
        }
        return ret;
    }

    @Override
    public ClassDefNode visitClassDef(MxStarParser.ClassDefContext ctx) {
        ClassDefNode ret = new ClassDefNode();
        ret.id = ctx.Identifier().getText();
        ret.childs.addAll(visit(ctx.classBody()).childs);
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public ClassDefNode visitClassBody(MxStarParser.ClassBodyContext ctx) {
        ClassDefNode ret = new ClassDefNode();
        for (MxStarParser.NoAssignVarDecContext p : ctx.noAssignVarDec()) {
            ret.childs.add(visit(p));
        }
        for (MxStarParser.FunctionDefContext p : ctx.functionDef()) {
            ret.childs.add(visit(p));
        }
        if (ctx.constructFunc() != null) ret.childs.add(visit(ctx.constructFunc()));
        return ret;
    }

    @Override
    public VarDefStateNode visitNoAssignVarDec(MxStarParser.NoAssignVarDecContext ctx) {
        VarDefStateNode ret = new VarDefStateNode();
        ret.type = TypeDef.build(ctx.paraDec().typeId().getText());
        VarDefNode tmp = new VarDefNode();
        TerminalNode end = ctx.paraDec().Identifier();
        tmp.id = end.getText();
        tmp.type = ret.type;
        tmp.pos = new PositionDef(end.getSymbol());
        ret.childs.add(tmp);

        for (int i = 0 ; i < ctx.Identifier().size() ; ++ i) {
            tmp = new VarDefNode();
            end = ctx.Identifier(i);
            tmp.id = end.getText();
            tmp.type = ret.type;
            tmp.pos = new PositionDef(end.getSymbol());
            ret.childs.add(tmp);
        }

        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public ConstructFuncNode visitConstructFunc(MxStarParser.ConstructFuncContext ctx) {
        ConstructFuncNode ret = new ConstructFuncNode();
        ret.id = ctx.Identifier().getText();
        ret.childs.add(visit(ctx.block()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public FunctionDefNode visitFunctionDef(MxStarParser.FunctionDefContext ctx) {
        FunctionDefNode ret = new FunctionDefNode();
        if (ctx.typeId() == null) ret.type = TypeDef.build("void");
        else ret.type = TypeDef.build(ctx.typeId().getText());
        ret.id = ctx.Identifier().getText();
        if (ctx.paraDecList() != null) ret.childs.addAll(visit(ctx.paraDecList()).childs);
        ret.childs.add(visit(ctx.block()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public FunctionDefNode visitParaDecList(MxStarParser.ParaDecListContext ctx) {
        FunctionDefNode ret = new FunctionDefNode();
        for (MxStarParser.ParaDecContext p : ctx.paraDec()) {
            ret.childs.add(visit(p));
        }
        return ret;
    }

    @Override
    public VarDefNode visitParaDec(MxStarParser.ParaDecContext ctx) {
        VarDefNode ret = new VarDefNode();
        ret.type = TypeDef.build(ctx.typeId().getText());
        ret.id = ctx.Identifier().getText();
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitBlkState(MxStarParser.BlkStateContext ctx) { return visit(ctx.block()); }

    @Override
    public ExprStateNode visitExprState(MxStarParser.ExprStateContext ctx) {
        ExprStateNode ret = new ExprStateNode();
        ret.childs.add(visit(ctx.expression()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitCondState(MxStarParser.CondStateContext ctx) { return visit(ctx.condStatement()); }

    @Override
    public Node visitLoopState(MxStarParser.LoopStateContext ctx) { return visit(ctx.loopStatement()); }

    @Override
    public Node visitJumpState(MxStarParser.JumpStateContext ctx) { return visit(ctx.jumpStatement()); }

    @Override
    public NullStateNode visitNullState(MxStarParser.NullStateContext ctx) {
        NullStateNode ret = new NullStateNode();
        return ret;
    }

    @Override
    public VarDefStateNode visitVarDefStatement(MxStarParser.VarDefStatementContext ctx) {
        VarDefStateNode ret = new VarDefStateNode();
        ret.type = TypeDef.build(ctx.typeId().getText());
        ret.childs.addAll(visit(ctx.varDefList()).childs);
        for (int i = 0 ; i < ret.childs.size() ; ++ i) {
            ret.childs.get(i).type = ret.type;
        }
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }
/*
    @Override public I visitArrayTId(MxStarParser.ArrayTIdContext ctx) { return visitChildren(ctx); }

    @Override public T visitNoArrTId(MxStarParser.NoArrTIdContext ctx) { return visitChildren(ctx); }

    @Override public T visitNoArrayTypeId(MxStarParser.NoArrayTypeIdContext ctx) { return visitChildren(ctx); }
*/
    @Override
    public VarDefStateNode visitVarDefList(MxStarParser.VarDefListContext ctx) {
        VarDefStateNode ret = new VarDefStateNode();
        for (MxStarParser.VarDefContext p : ctx.varDef()) {
            ret.childs.add(visit(p));
        }
        return ret;
    }

    @Override
    public VarDefNode visitVarDef(MxStarParser.VarDefContext ctx) {
        VarDefNode ret = new VarDefNode();
        ret.id = ctx.Identifier().getText();
        if (ctx.expression() != null) ret.childs.add(visit(ctx.expression()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public BlockStateNode visitBlock(MxStarParser.BlockContext ctx) {
        BlockStateNode ret = new BlockStateNode();
        for (int i = 1 ; i < ctx.getChildCount() - 1 ; ++ i) {
            ret.childs.add(visit(ctx.getChild(i)));
        }
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public CondStateNode visitCondStatement(MxStarParser.CondStatementContext ctx) {
        CondStateNode ret = new CondStateNode();
        ret.id = ctx.If().getText();
        ret.childs.add(visit(ctx.expression()));
        for (MxStarParser.StatementContext p : ctx.statement()) {
            ret.childs.add(visit(p));
        }
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public WhileStateNode visitWhileState(MxStarParser.WhileStateContext ctx) {
        WhileStateNode ret = new WhileStateNode();
        ret.id = ctx.While().getText();
        ret.childs.add(visit(ctx.expression()));
        ret.childs.add(visit(ctx.statement()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public ForStateNode visitForState(MxStarParser.ForStateContext ctx) {
        ForStateNode ret = new ForStateNode();
        ret.id = ctx.For().getText();
        if (ctx.initExp != null) ret.childs.add(visit(ctx.initExp));
        else ret.childs.add(new EmptyExprNode());
        if (ctx.condExp != null) ret.childs.add(visit(ctx.condExp));
        else ret.childs.add(new EmptyExprNode());
        if (ctx.loopExp != null) ret.childs.add(visit(ctx.loopExp));
        else ret.childs.add(new EmptyExprNode());
        ret.childs.add(visit(ctx.statement()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public ReturnStateNode visitReturnState(MxStarParser.ReturnStateContext ctx) {
        ReturnStateNode ret = new ReturnStateNode();
        ret.id = ctx.Return().getText();
        if (ctx.expression() != null) {
            ret.childs.add(visit(ctx.expression()));
        }
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public BreakStateNode visitBreakState(MxStarParser.BreakStateContext ctx) {
        BreakStateNode ret = new BreakStateNode();
        ret.id = ctx.Break().getText();
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public ContinStateNode visitContinueState(MxStarParser.ContinueStateContext ctx) {
        ContinStateNode ret = new ContinStateNode();
        ret.id = ctx.Continue().getText();
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitExpression(MxStarParser.ExpressionContext ctx) { return visit(ctx.assignExpr()); }

    @Override
    public Node visitLogOrExp(MxStarParser.LogOrExpContext ctx) { return visit(ctx.logicOrExpr()); }

    @Override
    public BinExprNode visitLogOrAgnExp(MxStarParser.LogOrAgnExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.logicOrExpr()));
        ret.childs.add(visit(ctx.assignExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public BinExprNode visitLogOrLogAndExp(MxStarParser.LogOrLogAndExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.logicOrExpr()));
        ret.childs.add(visit(ctx.logicAndExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitLogAndExp(MxStarParser.LogAndExpContext ctx) { return visit(ctx.logicAndExpr()); }

    @Override
    public BinExprNode visitLogAndOrExp(MxStarParser.LogAndOrExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.logicAndExpr()));
        ret.childs.add(visit(ctx.orExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitOrExp(MxStarParser.OrExpContext ctx) { return visit(ctx.orExpr()); }

    @Override
    public Node visitXorExp(MxStarParser.XorExpContext ctx) { return visit(ctx.xorExpr()); }

    @Override
    public BinExprNode visitOrXorExp(MxStarParser.OrXorExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.orExpr()));
        ret.childs.add(visit(ctx.xorExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitAndExp(MxStarParser.AndExpContext ctx) { return visit(ctx.andExpr()); }

    @Override
    public BinExprNode visitXorAndExp(MxStarParser.XorAndExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.xorExpr()));
        ret.childs.add(visit(ctx.andExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public BinExprNode visitAndEquExp(MxStarParser.AndEquExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.andExpr()));
        ret.childs.add(visit(ctx.equalExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitEquExp(MxStarParser.EquExpContext ctx) { return visit(ctx.equalExpr()); }

    @Override
    public BinExprNode visitEquCompExp(MxStarParser.EquCompExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.equalExpr()));
        ret.childs.add(visit(ctx.compExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitCompExp(MxStarParser.CompExpContext ctx) { return visit(ctx.compExpr()); }

    @Override
    public BinExprNode visitCompshiftExp(MxStarParser.CompshiftExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.compExpr()));
        ret.childs.add(visit(ctx.shiftExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitShiftExp(MxStarParser.ShiftExpContext ctx) { return visit(ctx.shiftExpr()); }

    @Override
    public Node visitAddExp(MxStarParser.AddExpContext ctx) { return visit(ctx.addExpr()); }

    @Override
    public BinExprNode visitShiftAddExp(MxStarParser.ShiftAddExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.shiftExpr()));
        ret.childs.add(visit(ctx.addExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitMulExp(MxStarParser.MulExpContext ctx) { return visit(ctx.mulExpr()); }

    @Override
    public BinExprNode visitAddMulExp(MxStarParser.AddMulExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.addExpr()));
        ret.childs.add(visit(ctx.mulExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitLfUExp(MxStarParser.LfUExpContext ctx) { return visit(ctx.leftUnaryExpr()); }

    @Override
    public BinExprNode visitMullfUExp(MxStarParser.MullfUExpContext ctx) {
        BinExprNode ret = new BinExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.mulExpr()));
        ret.childs.add(visit(ctx.leftUnaryExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitRtUExp(MxStarParser.RtUExpContext ctx) { return visit(ctx.rightUnaryExpr()); }

    @Override
    public LUnaryExprNode visitLeftUExp(MxStarParser.LeftUExpContext ctx) {
        LUnaryExprNode ret = new LUnaryExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.leftUnaryExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitNewExp(MxStarParser.NewExpContext ctx) { return visit(ctx.newVar()); }

    @Override
    public NewVarNode visitNewVar(MxStarParser.NewVarContext ctx) {
        NewVarNode ret = new NewVarNode();
        if (ctx.Identifier() != null) {
            ret.type = TypeDef.build(ctx.Identifier().getText());
        } else {
            ret.type = TypeDef.build(ctx.noArrayTypeId().getText());
        }
            int dim = 0;
        String text = ctx.getText();
        for (int i = 0 ; i < text.length() ; ++ i) {
            if (text.charAt(i) == '[') ++ dim;
        }

        int siz = ctx.expression().size();
        for (int i = dim - 1 ; i >= 0 ; -- i) {
            NewVarNode tmp = new NewVarNode();
            if (i < siz) tmp.childs.add(visit(ctx.expression(i)));
            else tmp.childs.add(new EmptyExprNode());
            tmp.childs.add(ret);
            tmp.type = new ArrayTypeDef((VarTypeDef) ret.type);
            ret = tmp;
        }
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public RUnaryExprNode visitRightUExp(MxStarParser.RightUExpContext ctx) {
        RUnaryExprNode ret = new RUnaryExprNode();
        ret.id = ctx.op.getText();
        ret.childs.add(visit(ctx.rightUnaryExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitPriExp(MxStarParser.PriExpContext ctx) { return visit(ctx.primaryExpr()); }

    @Override
    public PriArrExprNode visitPriArrExp(MxStarParser.PriArrExpContext ctx) {
        PriArrExprNode ret = new PriArrExprNode();
        ret.childs.add(visit(ctx.primaryExpr()));
        ret.childs.add(visit(ctx.expression()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public PriPntExprNode visitPriPntExp(MxStarParser.PriPntExpContext ctx) {
        PriPntExprNode ret = new PriPntExprNode();
        ret.childs.add(visit(ctx.primaryExpr()));
        ret.childs.add(visit(ctx.elementExpr()));
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitEleExp(MxStarParser.EleExpContext ctx) { return visit(ctx.elementExpr()); }

    @Override
    public Node visitLiterEleExp(MxStarParser.LiterEleExpContext ctx) { return visit(ctx.literal()); }

    @Override
    public VarEleExprNode visitThisEleExp(MxStarParser.ThisEleExpContext ctx) {
        VarEleExprNode ret = new VarEleExprNode();
        ret.id = ctx.This().getText();
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public VarEleExprNode visitVarEleExp(MxStarParser.VarEleExpContext ctx)  {
        VarEleExprNode ret = new VarEleExprNode();
        ret.id = ctx.Identifier().getText();
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public FunEleExprNode visitFunEleExp(MxStarParser.FunEleExpContext ctx) {
        FunEleExprNode ret = new FunEleExprNode();
        ret.id = ctx.Identifier().getText();
        if (ctx.expressionList() != null) ret.childs.addAll(visit(ctx.expressionList()).childs);
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public Node visitSonEleExp(MxStarParser.SonEleExpContext ctx) { return visit(ctx.expression()); }

    @Override
    public FunEleExprNode visitExpressionList(MxStarParser.ExpressionListContext ctx) {
        FunEleExprNode ret = new FunEleExprNode();
        for (int i = 0 ; i < ctx.expression().size(); ++ i) {
            ret.childs.add(visit(ctx.expression(i)));
        }
        return ret;
    }

    @Override
    public LogLitNode visitLogicLiter(MxStarParser.LogicLiterContext ctx) {
        LogLitNode ret = new LogLitNode();
        ret.type = new BoolTypeDef();
        ret.id = ctx.LogicLiteral().getText();
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public IntLitNode visitIntLiter(MxStarParser.IntLiterContext ctx) {
        IntLitNode ret = new IntLitNode();
        ret.type = new IntTypeDef();
        ret.id = ctx.IntLiteral().getText();
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public StrLitNode visitStringLiter(MxStarParser.StringLiterContext ctx) {
        StrLitNode ret = new StrLitNode();
        ret.type = new StringTypeDef();
        String tmp = ctx.StringLiteral().getText();
        tmp = tmp.substring(1, tmp.length() - 1);
        ret.id = "";
        for (int i = 0 ; i < tmp.length() ; ++ i) {
            if (tmp.charAt(i) != '\\') ret.id += tmp.charAt(i);
            else if (i + 1 < tmp.length()) {
                switch (tmp.charAt(i + 1)) {
                    case '\\': ret.id += '\\'; break;
                    case 'n' : ret.id += '\n'; break;
                    case 't' : ret.id += '\t'; break;
                    case '\"': ret.id += '\"'; break;
                }
                ++ i;
            }
        }
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }

    @Override
    public NullLitNode visitNullLiter(MxStarParser.NullLiterContext ctx) {
        NullLitNode ret = new NullLitNode();
        ret.type = new NullTypeDef();
        ret.id = ctx.NullLiteral().getText();
        ret.pos = new PositionDef(ctx.start);
        return ret;
    }
}