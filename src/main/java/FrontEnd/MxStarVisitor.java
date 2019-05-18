// Generated from /home/zzzzzzfy/Desktop/Compiler/smthing/MyCompiler/src/main/java/FrontEnd/MxStar.g4 by ANTLR 4.7.2
package FrontEnd;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxStarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxStarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxStarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MxStarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(MxStarParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(MxStarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#noAssignVarDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoAssignVarDec(MxStarParser.NoAssignVarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#constructFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructFunc(MxStarParser.ConstructFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(MxStarParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#paraDecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaDecList(MxStarParser.ParaDecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#paraDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaDec(MxStarParser.ParaDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blkState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkState(MxStarParser.BlkStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprState(MxStarParser.ExprStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondState(MxStarParser.CondStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopState(MxStarParser.LoopStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpState(MxStarParser.JumpStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullState(MxStarParser.NullStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#varDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefStatement(MxStarParser.VarDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noArrTId}
	 * labeled alternative in {@link MxStarParser#typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoArrTId(MxStarParser.NoArrTIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTId}
	 * labeled alternative in {@link MxStarParser#typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTId(MxStarParser.ArrayTIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#noArrayTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoArrayTypeId(MxStarParser.NoArrayTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#simpleTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeId(MxStarParser.SimpleTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#varDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefList(MxStarParser.VarDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(MxStarParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MxStarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#condStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondStatement(MxStarParser.CondStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileState}
	 * labeled alternative in {@link MxStarParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileState(MxStarParser.WhileStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forState}
	 * labeled alternative in {@link MxStarParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForState(MxStarParser.ForStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnState}
	 * labeled alternative in {@link MxStarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnState(MxStarParser.ReturnStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakState}
	 * labeled alternative in {@link MxStarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakState(MxStarParser.BreakStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueState}
	 * labeled alternative in {@link MxStarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueState(MxStarParser.ContinueStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MxStarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logOrExp}
	 * labeled alternative in {@link MxStarParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogOrExp(MxStarParser.LogOrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logOrAgnExp}
	 * labeled alternative in {@link MxStarParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogOrAgnExp(MxStarParser.LogOrAgnExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logAndExp}
	 * labeled alternative in {@link MxStarParser#logicOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogAndExp(MxStarParser.LogAndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logOrLogAndExp}
	 * labeled alternative in {@link MxStarParser#logicOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogOrLogAndExp(MxStarParser.LogOrLogAndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link MxStarParser#logicAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(MxStarParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logAndOrExp}
	 * labeled alternative in {@link MxStarParser#logicAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogAndOrExp(MxStarParser.LogAndOrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orXorExp}
	 * labeled alternative in {@link MxStarParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrXorExp(MxStarParser.OrXorExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorExp}
	 * labeled alternative in {@link MxStarParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExp(MxStarParser.XorExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link MxStarParser#xorExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(MxStarParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorAndExp}
	 * labeled alternative in {@link MxStarParser#xorExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorAndExp(MxStarParser.XorAndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andEquExp}
	 * labeled alternative in {@link MxStarParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndEquExp(MxStarParser.AndEquExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equExp}
	 * labeled alternative in {@link MxStarParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquExp(MxStarParser.EquExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equCompExp}
	 * labeled alternative in {@link MxStarParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquCompExp(MxStarParser.EquCompExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExp}
	 * labeled alternative in {@link MxStarParser#equalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExp(MxStarParser.CompExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExp}
	 * labeled alternative in {@link MxStarParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExp(MxStarParser.ShiftExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compshiftExp}
	 * labeled alternative in {@link MxStarParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompshiftExp(MxStarParser.CompshiftExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftAddExp}
	 * labeled alternative in {@link MxStarParser#shiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftAddExp(MxStarParser.ShiftAddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link MxStarParser#shiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(MxStarParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addMulExp}
	 * labeled alternative in {@link MxStarParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddMulExp(MxStarParser.AddMulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExp}
	 * labeled alternative in {@link MxStarParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(MxStarParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lfUExp}
	 * labeled alternative in {@link MxStarParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLfUExp(MxStarParser.LfUExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mullfUExp}
	 * labeled alternative in {@link MxStarParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMullfUExp(MxStarParser.MullfUExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rtUExp}
	 * labeled alternative in {@link MxStarParser#leftUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtUExp(MxStarParser.RtUExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftUExp}
	 * labeled alternative in {@link MxStarParser#leftUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftUExp(MxStarParser.LeftUExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link MxStarParser#leftUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExp(MxStarParser.NewExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#newVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewVar(MxStarParser.NewVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priExp}
	 * labeled alternative in {@link MxStarParser#rightUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriExp(MxStarParser.PriExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightUExp}
	 * labeled alternative in {@link MxStarParser#rightUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightUExp(MxStarParser.RightUExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priPntExp}
	 * labeled alternative in {@link MxStarParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriPntExp(MxStarParser.PriPntExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eleExp}
	 * labeled alternative in {@link MxStarParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEleExp(MxStarParser.EleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priArrExp}
	 * labeled alternative in {@link MxStarParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriArrExp(MxStarParser.PriArrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterEleExp(MxStarParser.LiterEleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisEleExp(MxStarParser.ThisEleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEleExp(MxStarParser.VarEleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunEleExp(MxStarParser.FunEleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sonEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSonEleExp(MxStarParser.SonEleExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxStarParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(MxStarParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicLiter(MxStarParser.LogicLiterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiter(MxStarParser.IntLiterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiter(MxStarParser.StringLiterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiter(MxStarParser.NullLiterContext ctx);
}