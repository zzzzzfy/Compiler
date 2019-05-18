// Generated from /home/zzzzzzfy/Desktop/Compiler/smthing/MyCompiler/src/main/java/FrontEnd/MxStar.g4 by ANTLR 4.7.2
package FrontEnd;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxStarParser}.
 */
public interface MxStarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxStarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MxStarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MxStarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MxStarParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MxStarParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MxStarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MxStarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#noAssignVarDec}.
	 * @param ctx the parse tree
	 */
	void enterNoAssignVarDec(MxStarParser.NoAssignVarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#noAssignVarDec}.
	 * @param ctx the parse tree
	 */
	void exitNoAssignVarDec(MxStarParser.NoAssignVarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#constructFunc}.
	 * @param ctx the parse tree
	 */
	void enterConstructFunc(MxStarParser.ConstructFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#constructFunc}.
	 * @param ctx the parse tree
	 */
	void exitConstructFunc(MxStarParser.ConstructFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(MxStarParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(MxStarParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#paraDecList}.
	 * @param ctx the parse tree
	 */
	void enterParaDecList(MxStarParser.ParaDecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#paraDecList}.
	 * @param ctx the parse tree
	 */
	void exitParaDecList(MxStarParser.ParaDecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#paraDec}.
	 * @param ctx the parse tree
	 */
	void enterParaDec(MxStarParser.ParaDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#paraDec}.
	 * @param ctx the parse tree
	 */
	void exitParaDec(MxStarParser.ParaDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blkState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlkState(MxStarParser.BlkStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blkState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlkState(MxStarParser.BlkStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprState(MxStarParser.ExprStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprState(MxStarParser.ExprStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCondState(MxStarParser.CondStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCondState(MxStarParser.CondStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopState(MxStarParser.LoopStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopState(MxStarParser.LoopStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterJumpState(MxStarParser.JumpStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitJumpState(MxStarParser.JumpStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNullState(MxStarParser.NullStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullState}
	 * labeled alternative in {@link MxStarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNullState(MxStarParser.NullStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#varDefStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarDefStatement(MxStarParser.VarDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#varDefStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarDefStatement(MxStarParser.VarDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noArrTId}
	 * labeled alternative in {@link MxStarParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterNoArrTId(MxStarParser.NoArrTIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noArrTId}
	 * labeled alternative in {@link MxStarParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitNoArrTId(MxStarParser.NoArrTIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTId}
	 * labeled alternative in {@link MxStarParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterArrayTId(MxStarParser.ArrayTIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTId}
	 * labeled alternative in {@link MxStarParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitArrayTId(MxStarParser.ArrayTIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#noArrayTypeId}.
	 * @param ctx the parse tree
	 */
	void enterNoArrayTypeId(MxStarParser.NoArrayTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#noArrayTypeId}.
	 * @param ctx the parse tree
	 */
	void exitNoArrayTypeId(MxStarParser.NoArrayTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#simpleTypeId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeId(MxStarParser.SimpleTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#simpleTypeId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeId(MxStarParser.SimpleTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#varDefList}.
	 * @param ctx the parse tree
	 */
	void enterVarDefList(MxStarParser.VarDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#varDefList}.
	 * @param ctx the parse tree
	 */
	void exitVarDefList(MxStarParser.VarDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(MxStarParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(MxStarParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MxStarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MxStarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#condStatement}.
	 * @param ctx the parse tree
	 */
	void enterCondStatement(MxStarParser.CondStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#condStatement}.
	 * @param ctx the parse tree
	 */
	void exitCondStatement(MxStarParser.CondStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileState}
	 * labeled alternative in {@link MxStarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileState(MxStarParser.WhileStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileState}
	 * labeled alternative in {@link MxStarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileState(MxStarParser.WhileStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forState}
	 * labeled alternative in {@link MxStarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForState(MxStarParser.ForStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forState}
	 * labeled alternative in {@link MxStarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForState(MxStarParser.ForStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnState}
	 * labeled alternative in {@link MxStarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnState(MxStarParser.ReturnStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnState}
	 * labeled alternative in {@link MxStarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnState(MxStarParser.ReturnStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakState}
	 * labeled alternative in {@link MxStarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakState(MxStarParser.BreakStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakState}
	 * labeled alternative in {@link MxStarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakState(MxStarParser.BreakStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueState}
	 * labeled alternative in {@link MxStarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueState(MxStarParser.ContinueStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueState}
	 * labeled alternative in {@link MxStarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueState(MxStarParser.ContinueStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MxStarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MxStarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logOrExp}
	 * labeled alternative in {@link MxStarParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogOrExp(MxStarParser.LogOrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logOrExp}
	 * labeled alternative in {@link MxStarParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogOrExp(MxStarParser.LogOrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logOrAgnExp}
	 * labeled alternative in {@link MxStarParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogOrAgnExp(MxStarParser.LogOrAgnExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logOrAgnExp}
	 * labeled alternative in {@link MxStarParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogOrAgnExp(MxStarParser.LogOrAgnExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logAndExp}
	 * labeled alternative in {@link MxStarParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogAndExp(MxStarParser.LogAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logAndExp}
	 * labeled alternative in {@link MxStarParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogAndExp(MxStarParser.LogAndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logOrLogAndExp}
	 * labeled alternative in {@link MxStarParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogOrLogAndExp(MxStarParser.LogOrLogAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logOrLogAndExp}
	 * labeled alternative in {@link MxStarParser#logicOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogOrLogAndExp(MxStarParser.LogOrLogAndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link MxStarParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(MxStarParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link MxStarParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(MxStarParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logAndOrExp}
	 * labeled alternative in {@link MxStarParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogAndOrExp(MxStarParser.LogAndOrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logAndOrExp}
	 * labeled alternative in {@link MxStarParser#logicAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogAndOrExp(MxStarParser.LogAndOrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orXorExp}
	 * labeled alternative in {@link MxStarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrXorExp(MxStarParser.OrXorExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orXorExp}
	 * labeled alternative in {@link MxStarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrXorExp(MxStarParser.OrXorExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorExp}
	 * labeled alternative in {@link MxStarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterXorExp(MxStarParser.XorExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorExp}
	 * labeled alternative in {@link MxStarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitXorExp(MxStarParser.XorExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link MxStarParser#xorExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(MxStarParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link MxStarParser#xorExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(MxStarParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorAndExp}
	 * labeled alternative in {@link MxStarParser#xorExpr}.
	 * @param ctx the parse tree
	 */
	void enterXorAndExp(MxStarParser.XorAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorAndExp}
	 * labeled alternative in {@link MxStarParser#xorExpr}.
	 * @param ctx the parse tree
	 */
	void exitXorAndExp(MxStarParser.XorAndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andEquExp}
	 * labeled alternative in {@link MxStarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndEquExp(MxStarParser.AndEquExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andEquExp}
	 * labeled alternative in {@link MxStarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndEquExp(MxStarParser.AndEquExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equExp}
	 * labeled alternative in {@link MxStarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterEquExp(MxStarParser.EquExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equExp}
	 * labeled alternative in {@link MxStarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitEquExp(MxStarParser.EquExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equCompExp}
	 * labeled alternative in {@link MxStarParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEquCompExp(MxStarParser.EquCompExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equCompExp}
	 * labeled alternative in {@link MxStarParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEquCompExp(MxStarParser.EquCompExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExp}
	 * labeled alternative in {@link MxStarParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExp(MxStarParser.CompExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExp}
	 * labeled alternative in {@link MxStarParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExp(MxStarParser.CompExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExp}
	 * labeled alternative in {@link MxStarParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftExp(MxStarParser.ShiftExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExp}
	 * labeled alternative in {@link MxStarParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftExp(MxStarParser.ShiftExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compshiftExp}
	 * labeled alternative in {@link MxStarParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompshiftExp(MxStarParser.CompshiftExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compshiftExp}
	 * labeled alternative in {@link MxStarParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompshiftExp(MxStarParser.CompshiftExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftAddExp}
	 * labeled alternative in {@link MxStarParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftAddExp(MxStarParser.ShiftAddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftAddExp}
	 * labeled alternative in {@link MxStarParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftAddExp(MxStarParser.ShiftAddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link MxStarParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(MxStarParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link MxStarParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(MxStarParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addMulExp}
	 * labeled alternative in {@link MxStarParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddMulExp(MxStarParser.AddMulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addMulExp}
	 * labeled alternative in {@link MxStarParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddMulExp(MxStarParser.AddMulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExp}
	 * labeled alternative in {@link MxStarParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(MxStarParser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExp}
	 * labeled alternative in {@link MxStarParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(MxStarParser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lfUExp}
	 * labeled alternative in {@link MxStarParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterLfUExp(MxStarParser.LfUExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lfUExp}
	 * labeled alternative in {@link MxStarParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitLfUExp(MxStarParser.LfUExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mullfUExp}
	 * labeled alternative in {@link MxStarParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMullfUExp(MxStarParser.MullfUExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mullfUExp}
	 * labeled alternative in {@link MxStarParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMullfUExp(MxStarParser.MullfUExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rtUExp}
	 * labeled alternative in {@link MxStarParser#leftUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterRtUExp(MxStarParser.RtUExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rtUExp}
	 * labeled alternative in {@link MxStarParser#leftUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitRtUExp(MxStarParser.RtUExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftUExp}
	 * labeled alternative in {@link MxStarParser#leftUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftUExp(MxStarParser.LeftUExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftUExp}
	 * labeled alternative in {@link MxStarParser#leftUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftUExp(MxStarParser.LeftUExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link MxStarParser#leftUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewExp(MxStarParser.NewExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link MxStarParser#leftUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewExp(MxStarParser.NewExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#newVar}.
	 * @param ctx the parse tree
	 */
	void enterNewVar(MxStarParser.NewVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#newVar}.
	 * @param ctx the parse tree
	 */
	void exitNewVar(MxStarParser.NewVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priExp}
	 * labeled alternative in {@link MxStarParser#rightUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPriExp(MxStarParser.PriExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priExp}
	 * labeled alternative in {@link MxStarParser#rightUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPriExp(MxStarParser.PriExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightUExp}
	 * labeled alternative in {@link MxStarParser#rightUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterRightUExp(MxStarParser.RightUExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightUExp}
	 * labeled alternative in {@link MxStarParser#rightUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitRightUExp(MxStarParser.RightUExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priPntExp}
	 * labeled alternative in {@link MxStarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPriPntExp(MxStarParser.PriPntExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priPntExp}
	 * labeled alternative in {@link MxStarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPriPntExp(MxStarParser.PriPntExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eleExp}
	 * labeled alternative in {@link MxStarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterEleExp(MxStarParser.EleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eleExp}
	 * labeled alternative in {@link MxStarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitEleExp(MxStarParser.EleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priArrExp}
	 * labeled alternative in {@link MxStarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPriArrExp(MxStarParser.PriArrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priArrExp}
	 * labeled alternative in {@link MxStarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPriArrExp(MxStarParser.PriArrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void enterLiterEleExp(MxStarParser.LiterEleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void exitLiterEleExp(MxStarParser.LiterEleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void enterThisEleExp(MxStarParser.ThisEleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void exitThisEleExp(MxStarParser.ThisEleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarEleExp(MxStarParser.VarEleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarEleExp(MxStarParser.VarEleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunEleExp(MxStarParser.FunEleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunEleExp(MxStarParser.FunEleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sonEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void enterSonEleExp(MxStarParser.SonEleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sonEleExp}
	 * labeled alternative in {@link MxStarParser#elementExpr}.
	 * @param ctx the parse tree
	 */
	void exitSonEleExp(MxStarParser.SonEleExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxStarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(MxStarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxStarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(MxStarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLogicLiter(MxStarParser.LogicLiterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLogicLiter(MxStarParser.LogicLiterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLiter(MxStarParser.IntLiterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLiter(MxStarParser.IntLiterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiter(MxStarParser.StringLiterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiter(MxStarParser.StringLiterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiter(MxStarParser.NullLiterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiter}
	 * labeled alternative in {@link MxStarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiter(MxStarParser.NullLiterContext ctx);
}