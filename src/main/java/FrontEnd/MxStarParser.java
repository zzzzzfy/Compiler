// Generated from /home/zzzzzzfy/Desktop/Compiler/smthing/MyCompiler/src/main/java/FrontEnd/MxStar.g4 by ANTLR 4.7.2
package FrontEnd;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxStarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, LogicLiteral=33, IntLiteral=34, StringLiteral=35, NullLiteral=36, 
		Bool=37, Int=38, String=39, Void=40, Null=41, True=42, False=43, If=44, 
		Else=45, For=46, While=47, Break=48, Continue=49, Return=50, New=51, Class=52, 
		This=53, Identifier=54, Comment=55, WhiteSpace=56;
	public static final int
		RULE_program = 0, RULE_classDef = 1, RULE_classBody = 2, RULE_noAssignVarDec = 3, 
		RULE_constructFunc = 4, RULE_functionDef = 5, RULE_paraDecList = 6, RULE_paraDec = 7, 
		RULE_statement = 8, RULE_varDefStatement = 9, RULE_typeId = 10, RULE_noArrayTypeId = 11, 
		RULE_simpleTypeId = 12, RULE_varDefList = 13, RULE_varDef = 14, RULE_block = 15, 
		RULE_condStatement = 16, RULE_loopStatement = 17, RULE_jumpStatement = 18, 
		RULE_expression = 19, RULE_assignExpr = 20, RULE_logicOrExpr = 21, RULE_logicAndExpr = 22, 
		RULE_orExpr = 23, RULE_xorExpr = 24, RULE_andExpr = 25, RULE_equalExpr = 26, 
		RULE_compExpr = 27, RULE_shiftExpr = 28, RULE_addExpr = 29, RULE_mulExpr = 30, 
		RULE_leftUnaryExpr = 31, RULE_newVar = 32, RULE_rightUnaryExpr = 33, RULE_primaryExpr = 34, 
		RULE_elementExpr = 35, RULE_expressionList = 36, RULE_literal = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDef", "classBody", "noAssignVarDec", "constructFunc", 
			"functionDef", "paraDecList", "paraDec", "statement", "varDefStatement", 
			"typeId", "noArrayTypeId", "simpleTypeId", "varDefList", "varDef", "block", 
			"condStatement", "loopStatement", "jumpStatement", "expression", "assignExpr", 
			"logicOrExpr", "logicAndExpr", "orExpr", "xorExpr", "andExpr", "equalExpr", 
			"compExpr", "shiftExpr", "addExpr", "mulExpr", "leftUnaryExpr", "newVar", 
			"rightUnaryExpr", "primaryExpr", "elementExpr", "expressionList", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "','", "';'", "'('", "')'", "'['", "']'", "'='", 
			"'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'>='", "'<='", 
			"'>'", "'<'", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", 
			"'--'", "'~'", "'!'", "'.'", null, null, null, null, "'bool'", "'int'", 
			"'string'", "'void'", "'null'", "'true'", "'false'", "'if'", "'else'", 
			"'for'", "'while'", "'break'", "'continue'", "'return'", "'new'", "'class'", 
			"'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "LogicLiteral", 
			"IntLiteral", "StringLiteral", "NullLiteral", "Bool", "Int", "String", 
			"Void", "Null", "True", "False", "If", "Else", "For", "While", "Break", 
			"Continue", "Return", "New", "Class", "This", "Identifier", "Comment", 
			"WhiteSpace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MxStar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxStarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public List<VarDefStatementContext> varDefStatement() {
			return getRuleContexts(VarDefStatementContext.class);
		}
		public VarDefStatementContext varDefStatement(int i) {
			return getRuleContext(VarDefStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Class) | (1L << Identifier))) != 0)) {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(76);
					classDef();
					}
					break;
				case 2:
					{
					setState(77);
					functionDef();
					}
					break;
				case 3:
					{
					setState(78);
					varDefStatement();
					}
					break;
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(MxStarParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(MxStarParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(Class);
			setState(85);
			match(Identifier);
			setState(86);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<NoAssignVarDecContext> noAssignVarDec() {
			return getRuleContexts(NoAssignVarDecContext.class);
		}
		public NoAssignVarDecContext noAssignVarDec(int i) {
			return getRuleContext(NoAssignVarDecContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public ConstructFuncContext constructFunc() {
			return getRuleContext(ConstructFuncContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(89);
						noAssignVarDec();
						}
						break;
					case 2:
						{
						setState(90);
						functionDef();
						}
						break;
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(96);
				constructFunc();
				}
				break;
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(99);
					noAssignVarDec();
					}
					break;
				case 2:
					{
					setState(100);
					functionDef();
					}
					break;
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoAssignVarDecContext extends ParserRuleContext {
		public ParaDecContext paraDec() {
			return getRuleContext(ParaDecContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(MxStarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MxStarParser.Identifier, i);
		}
		public NoAssignVarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noAssignVarDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterNoAssignVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitNoAssignVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitNoAssignVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoAssignVarDecContext noAssignVarDec() throws RecognitionException {
		NoAssignVarDecContext _localctx = new NoAssignVarDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_noAssignVarDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			paraDec();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(109);
				match(T__2);
				setState(110);
				match(Identifier);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructFuncContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MxStarParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterConstructFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitConstructFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitConstructFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructFuncContext constructFunc() throws RecognitionException {
		ConstructFuncContext _localctx = new ConstructFuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(Identifier);
			setState(119);
			match(T__4);
			setState(120);
			match(T__5);
			setState(121);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MxStarParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public TerminalNode Void() { return getToken(MxStarParser.Void, 0); }
		public ParaDecListContext paraDecList() {
			return getRuleContext(ParaDecListContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case Int:
			case String:
			case Identifier:
				{
				setState(123);
				typeId(0);
				}
				break;
			case Void:
				{
				setState(124);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
			match(Identifier);
			setState(128);
			match(T__4);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(129);
				paraDecList();
				}
			}

			setState(132);
			match(T__5);
			setState(133);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaDecListContext extends ParserRuleContext {
		public List<ParaDecContext> paraDec() {
			return getRuleContexts(ParaDecContext.class);
		}
		public ParaDecContext paraDec(int i) {
			return getRuleContext(ParaDecContext.class,i);
		}
		public ParaDecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paraDecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterParaDecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitParaDecList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitParaDecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaDecListContext paraDecList() throws RecognitionException {
		ParaDecListContext _localctx = new ParaDecListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paraDecList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			paraDec();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(136);
				match(T__2);
				setState(137);
				paraDec();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaDecContext extends ParserRuleContext {
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MxStarParser.Identifier, 0); }
		public ParaDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paraDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterParaDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitParaDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitParaDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaDecContext paraDec() throws RecognitionException {
		ParaDecContext _localctx = new ParaDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paraDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			typeId(0);
			setState(144);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlkStateContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlkStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterBlkState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitBlkState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitBlkState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopStateContext extends StatementContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LoopStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLoopState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLoopState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLoopState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStateContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterExprState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitExprState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitExprState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondStateContext extends StatementContext {
		public CondStatementContext condStatement() {
			return getRuleContext(CondStatementContext.class,0);
		}
		public CondStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterCondState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitCondState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitCondState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpStateContext extends StatementContext {
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public JumpStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterJumpState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitJumpState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitJumpState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullStateContext extends StatementContext {
		public NullStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterNullState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitNullState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitNullState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new BlkStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				block();
				}
				break;
			case T__4:
			case T__22:
			case T__23:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case LogicLiteral:
			case IntLiteral:
			case StringLiteral:
			case NullLiteral:
			case New:
			case This:
			case Identifier:
				_localctx = new ExprStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				expression();
				setState(148);
				match(T__3);
				}
				break;
			case If:
				_localctx = new CondStateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				condStatement();
				}
				break;
			case For:
			case While:
				_localctx = new LoopStateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				loopStatement();
				}
				break;
			case Break:
			case Continue:
			case Return:
				_localctx = new JumpStateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				jumpStatement();
				}
				break;
			case T__3:
				_localctx = new NullStateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefStatementContext extends ParserRuleContext {
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public VarDefListContext varDefList() {
			return getRuleContext(VarDefListContext.class,0);
		}
		public VarDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterVarDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitVarDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitVarDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefStatementContext varDefStatement() throws RecognitionException {
		VarDefStatementContext _localctx = new VarDefStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDefStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			typeId(0);
			setState(157);
			varDefList();
			setState(158);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdContext extends ParserRuleContext {
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
	 
		public TypeIdContext() { }
		public void copyFrom(TypeIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoArrTIdContext extends TypeIdContext {
		public NoArrayTypeIdContext noArrayTypeId() {
			return getRuleContext(NoArrayTypeIdContext.class,0);
		}
		public NoArrTIdContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterNoArrTId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitNoArrTId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitNoArrTId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTIdContext extends TypeIdContext {
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public ArrayTIdContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterArrayTId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitArrayTId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitArrayTId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		return typeId(0);
	}

	private TypeIdContext typeId(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeIdContext _localctx = new TypeIdContext(_ctx, _parentState);
		TypeIdContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_typeId, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NoArrTIdContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(161);
			noArrayTypeId();
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTIdContext(new TypeIdContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_typeId);
					setState(163);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(164);
					match(T__6);
					setState(165);
					match(T__7);
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoArrayTypeIdContext extends ParserRuleContext {
		public SimpleTypeIdContext simpleTypeId() {
			return getRuleContext(SimpleTypeIdContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MxStarParser.Identifier, 0); }
		public NoArrayTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noArrayTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterNoArrayTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitNoArrayTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitNoArrayTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoArrayTypeIdContext noArrayTypeId() throws RecognitionException {
		NoArrayTypeIdContext _localctx = new NoArrayTypeIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_noArrayTypeId);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				simpleTypeId();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeIdContext extends ParserRuleContext {
		public TerminalNode Bool() { return getToken(MxStarParser.Bool, 0); }
		public TerminalNode Int() { return getToken(MxStarParser.Int, 0); }
		public TerminalNode String() { return getToken(MxStarParser.String, 0); }
		public SimpleTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterSimpleTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitSimpleTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitSimpleTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeIdContext simpleTypeId() throws RecognitionException {
		SimpleTypeIdContext _localctx = new SimpleTypeIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleTypeId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefListContext extends ParserRuleContext {
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public VarDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterVarDefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitVarDefList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitVarDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefListContext varDefList() throws RecognitionException {
		VarDefListContext _localctx = new VarDefListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			varDef();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(178);
				match(T__2);
				setState(179);
				varDef();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MxStarParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(Identifier);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(186);
				match(T__8);
				setState(187);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VarDefStatementContext> varDefStatement() {
			return getRuleContexts(VarDefStatementContext.class);
		}
		public VarDefStatementContext varDefStatement(int i) {
			return getRuleContext(VarDefStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__0);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << LogicLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << This) | (1L << Identifier))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(191);
					statement();
					}
					break;
				case 2:
					{
					setState(192);
					varDefStatement();
					}
					break;
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MxStarParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(MxStarParser.Else, 0); }
		public CondStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterCondStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitCondStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitCondStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondStatementContext condStatement() throws RecognitionException {
		CondStatementContext _localctx = new CondStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(If);
			setState(201);
			match(T__4);
			setState(202);
			expression();
			setState(203);
			match(T__5);
			setState(204);
			statement();
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(205);
				match(Else);
				setState(206);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStateContext extends LoopStatementContext {
		public ExpressionContext initExp;
		public ExpressionContext condExp;
		public ExpressionContext loopExp;
		public TerminalNode For() { return getToken(MxStarParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStateContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterForState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitForState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitForState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStateContext extends LoopStatementContext {
		public TerminalNode While() { return getToken(MxStarParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStateContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterWhileState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitWhileState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitWhileState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loopStatement);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				_localctx = new WhileStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(While);
				setState(210);
				match(T__4);
				setState(211);
				expression();
				setState(212);
				match(T__5);
				setState(213);
				statement();
				}
				break;
			case For:
				_localctx = new ForStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(For);
				setState(216);
				match(T__4);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << LogicLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << New) | (1L << This) | (1L << Identifier))) != 0)) {
					{
					setState(217);
					((ForStateContext)_localctx).initExp = expression();
					}
				}

				setState(220);
				match(T__3);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << LogicLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << New) | (1L << This) | (1L << Identifier))) != 0)) {
					{
					setState(221);
					((ForStateContext)_localctx).condExp = expression();
					}
				}

				setState(224);
				match(T__3);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << LogicLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << New) | (1L << This) | (1L << Identifier))) != 0)) {
					{
					setState(225);
					((ForStateContext)_localctx).loopExp = expression();
					}
				}

				setState(228);
				match(T__5);
				setState(229);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStateContext extends JumpStatementContext {
		public TerminalNode Return() { return getToken(MxStarParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStateContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterReturnState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitReturnState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitReturnState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStateContext extends JumpStatementContext {
		public TerminalNode Continue() { return getToken(MxStarParser.Continue, 0); }
		public ContinueStateContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterContinueState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitContinueState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitContinueState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStateContext extends JumpStatementContext {
		public TerminalNode Break() { return getToken(MxStarParser.Break, 0); }
		public BreakStateContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterBreakState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitBreakState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitBreakState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jumpStatement);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				_localctx = new ReturnStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(Return);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << LogicLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << New) | (1L << This) | (1L << Identifier))) != 0)) {
					{
					setState(233);
					expression();
					}
				}

				setState(236);
				match(T__3);
				}
				break;
			case Break:
				_localctx = new BreakStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(Break);
				setState(238);
				match(T__3);
				}
				break;
			case Continue:
				_localctx = new ContinueStateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(Continue);
				setState(240);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			assignExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExprContext extends ParserRuleContext {
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
	 
		public AssignExprContext() { }
		public void copyFrom(AssignExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogOrAgnExpContext extends AssignExprContext {
		public Token op;
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public LogOrAgnExpContext(AssignExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLogOrAgnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLogOrAgnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLogOrAgnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogOrExpContext extends AssignExprContext {
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public LogOrExpContext(AssignExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLogOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLogOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLogOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignExpr);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new LogOrExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				logicOrExpr(0);
				}
				break;
			case 2:
				_localctx = new LogOrAgnExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				logicOrExpr(0);
				{
				setState(247);
				((LogOrAgnExpContext)_localctx).op = match(T__8);
				}
				setState(248);
				assignExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicOrExprContext extends ParserRuleContext {
		public LogicOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOrExpr; }
	 
		public LogicOrExprContext() { }
		public void copyFrom(LogicOrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogAndExpContext extends LogicOrExprContext {
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public LogAndExpContext(LogicOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLogAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLogAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLogAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogOrLogAndExpContext extends LogicOrExprContext {
		public Token op;
		public LogicOrExprContext logicOrExpr() {
			return getRuleContext(LogicOrExprContext.class,0);
		}
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public LogOrLogAndExpContext(LogicOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLogOrLogAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLogOrLogAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLogOrLogAndExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOrExprContext logicOrExpr() throws RecognitionException {
		return logicOrExpr(0);
	}

	private LogicOrExprContext logicOrExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicOrExprContext _localctx = new LogicOrExprContext(_ctx, _parentState);
		LogicOrExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_logicOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogAndExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(253);
			logicAndExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogOrLogAndExpContext(new LogicOrExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicOrExpr);
					setState(255);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(256);
					((LogOrLogAndExpContext)_localctx).op = match(T__9);
					}
					setState(257);
					logicAndExpr(0);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicAndExprContext extends ParserRuleContext {
		public LogicAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicAndExpr; }
	 
		public LogicAndExprContext() { }
		public void copyFrom(LogicAndExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrExpContext extends LogicAndExprContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public OrExpContext(LogicAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogAndOrExpContext extends LogicAndExprContext {
		public Token op;
		public LogicAndExprContext logicAndExpr() {
			return getRuleContext(LogicAndExprContext.class,0);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public LogAndOrExpContext(LogicAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLogAndOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLogAndOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLogAndOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicAndExprContext logicAndExpr() throws RecognitionException {
		return logicAndExpr(0);
	}

	private LogicAndExprContext logicAndExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicAndExprContext _localctx = new LogicAndExprContext(_ctx, _parentState);
		LogicAndExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_logicAndExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OrExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(264);
			orExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogAndOrExpContext(new LogicAndExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicAndExpr);
					setState(266);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(267);
					((LogAndOrExpContext)_localctx).op = match(T__10);
					}
					setState(268);
					orExpr(0);
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	 
		public OrExprContext() { }
		public void copyFrom(OrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrXorExpContext extends OrExprContext {
		public Token op;
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public XorExprContext xorExpr() {
			return getRuleContext(XorExprContext.class,0);
		}
		public OrXorExpContext(OrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterOrXorExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitOrXorExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitOrXorExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorExpContext extends OrExprContext {
		public XorExprContext xorExpr() {
			return getRuleContext(XorExprContext.class,0);
		}
		public XorExpContext(OrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterXorExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitXorExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitXorExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		return orExpr(0);
	}

	private OrExprContext orExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExprContext _localctx = new OrExprContext(_ctx, _parentState);
		OrExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_orExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new XorExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(275);
			xorExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrXorExpContext(new OrExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_orExpr);
					setState(277);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(278);
					((OrXorExpContext)_localctx).op = match(T__11);
					}
					setState(279);
					xorExpr(0);
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class XorExprContext extends ParserRuleContext {
		public XorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpr; }
	 
		public XorExprContext() { }
		public void copyFrom(XorExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpContext extends XorExprContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public AndExpContext(XorExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorAndExpContext extends XorExprContext {
		public Token op;
		public XorExprContext xorExpr() {
			return getRuleContext(XorExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public XorAndExpContext(XorExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterXorAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitXorAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitXorAndExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorExprContext xorExpr() throws RecognitionException {
		return xorExpr(0);
	}

	private XorExprContext xorExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XorExprContext _localctx = new XorExprContext(_ctx, _parentState);
		XorExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_xorExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(286);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new XorAndExpContext(new XorExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_xorExpr);
					setState(288);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(289);
					((XorAndExpContext)_localctx).op = match(T__12);
					}
					setState(290);
					andExpr(0);
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	 
		public AndExprContext() { }
		public void copyFrom(AndExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndEquExpContext extends AndExprContext {
		public Token op;
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public AndEquExpContext(AndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterAndEquExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitAndEquExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitAndEquExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquExpContext extends AndExprContext {
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public EquExpContext(AndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterEquExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitEquExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitEquExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EquExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(297);
			equalExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndEquExpContext(new AndExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(299);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(300);
					((AndEquExpContext)_localctx).op = match(T__13);
					}
					setState(301);
					equalExpr(0);
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualExprContext extends ParserRuleContext {
		public EqualExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpr; }
	 
		public EqualExprContext() { }
		public void copyFrom(EqualExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EquCompExpContext extends EqualExprContext {
		public Token op;
		public EqualExprContext equalExpr() {
			return getRuleContext(EqualExprContext.class,0);
		}
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public EquCompExpContext(EqualExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterEquCompExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitEquCompExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitEquCompExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExpContext extends EqualExprContext {
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public CompExpContext(EqualExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterCompExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitCompExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitCompExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExprContext equalExpr() throws RecognitionException {
		return equalExpr(0);
	}

	private EqualExprContext equalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualExprContext _localctx = new EqualExprContext(_ctx, _parentState);
		EqualExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_equalExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CompExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(308);
			compExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EquCompExpContext(new EqualExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equalExpr);
					setState(310);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(311);
					((EquCompExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__14 || _la==T__15) ) {
						((EquCompExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					setState(312);
					compExpr(0);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompExprContext extends ParserRuleContext {
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
	 
		public CompExprContext() { }
		public void copyFrom(CompExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftExpContext extends CompExprContext {
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public ShiftExpContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterShiftExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitShiftExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitShiftExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompshiftExpContext extends CompExprContext {
		public Token op;
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public CompshiftExpContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterCompshiftExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitCompshiftExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitCompshiftExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		return compExpr(0);
	}

	private CompExprContext compExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompExprContext _localctx = new CompExprContext(_ctx, _parentState);
		CompExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_compExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(319);
			shiftExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new CompshiftExpContext(new CompExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_compExpr);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(322);
						((CompshiftExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((CompshiftExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						setState(323);
						shiftExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new CompshiftExpContext(new CompExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_compExpr);
						setState(324);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						{
						setState(325);
						((CompshiftExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((CompshiftExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						setState(326);
						shiftExpr(0);
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExprContext extends ParserRuleContext {
		public ShiftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpr; }
	 
		public ShiftExprContext() { }
		public void copyFrom(ShiftExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftAddExpContext extends ShiftExprContext {
		public Token op;
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public ShiftAddExpContext(ShiftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterShiftAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitShiftAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitShiftAddExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpContext extends ShiftExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public AddExpContext(ShiftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExprContext shiftExpr() throws RecognitionException {
		return shiftExpr(0);
	}

	private ShiftExprContext shiftExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExprContext _localctx = new ShiftExprContext(_ctx, _parentState);
		ShiftExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_shiftExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(333);
			addExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftAddExpContext(new ShiftExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_shiftExpr);
					setState(335);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(336);
					((ShiftAddExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__21) ) {
						((ShiftAddExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					setState(337);
					addExpr(0);
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddExprContext extends ParserRuleContext {
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	 
		public AddExprContext() { }
		public void copyFrom(AddExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddMulExpContext extends AddExprContext {
		public Token op;
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public AddMulExpContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterAddMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitAddMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitAddMulExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpContext extends AddExprContext {
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public MulExpContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitMulExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		return addExpr(0);
	}

	private AddExprContext addExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExprContext _localctx = new AddExprContext(_ctx, _parentState);
		AddExprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MulExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(344);
			mulExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddMulExpContext(new AddExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
					setState(346);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(347);
					((AddMulExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__22 || _la==T__23) ) {
						((AddMulExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					setState(348);
					mulExpr(0);
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulExprContext extends ParserRuleContext {
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
	 
		public MulExprContext() { }
		public void copyFrom(MulExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LfUExpContext extends MulExprContext {
		public LeftUnaryExprContext leftUnaryExpr() {
			return getRuleContext(LeftUnaryExprContext.class,0);
		}
		public LfUExpContext(MulExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLfUExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLfUExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLfUExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MullfUExpContext extends MulExprContext {
		public Token op;
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public LeftUnaryExprContext leftUnaryExpr() {
			return getRuleContext(LeftUnaryExprContext.class,0);
		}
		public MullfUExpContext(MulExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterMullfUExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitMullfUExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitMullfUExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		return mulExpr(0);
	}

	private MulExprContext mulExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExprContext _localctx = new MulExprContext(_ctx, _parentState);
		MulExprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_mulExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LfUExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(355);
			leftUnaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MullfUExpContext(new MulExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mulExpr);
					setState(357);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(358);
					((MullfUExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						((MullfUExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					setState(359);
					leftUnaryExpr();
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LeftUnaryExprContext extends ParserRuleContext {
		public LeftUnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftUnaryExpr; }
	 
		public LeftUnaryExprContext() { }
		public void copyFrom(LeftUnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LeftUExpContext extends LeftUnaryExprContext {
		public Token op;
		public LeftUnaryExprContext leftUnaryExpr() {
			return getRuleContext(LeftUnaryExprContext.class,0);
		}
		public LeftUExpContext(LeftUnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLeftUExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLeftUExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLeftUExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpContext extends LeftUnaryExprContext {
		public TerminalNode New() { return getToken(MxStarParser.New, 0); }
		public NewVarContext newVar() {
			return getRuleContext(NewVarContext.class,0);
		}
		public NewExpContext(LeftUnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterNewExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitNewExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitNewExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RtUExpContext extends LeftUnaryExprContext {
		public RightUnaryExprContext rightUnaryExpr() {
			return getRuleContext(RightUnaryExprContext.class,0);
		}
		public RtUExpContext(LeftUnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterRtUExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitRtUExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitRtUExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftUnaryExprContext leftUnaryExpr() throws RecognitionException {
		LeftUnaryExprContext _localctx = new LeftUnaryExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_leftUnaryExpr);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case LogicLiteral:
			case IntLiteral:
			case StringLiteral:
			case NullLiteral:
			case This:
			case Identifier:
				_localctx = new RtUExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				rightUnaryExpr(0);
				}
				break;
			case T__27:
			case T__28:
				_localctx = new LeftUExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(366);
				((LeftUExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
					((LeftUExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(367);
				leftUnaryExpr();
				}
				break;
			case T__29:
			case T__30:
				_localctx = new LeftUExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(368);
				((LeftUExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((LeftUExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(369);
				leftUnaryExpr();
				}
				break;
			case T__22:
			case T__23:
				_localctx = new LeftUExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(370);
				((LeftUExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
					((LeftUExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(371);
				leftUnaryExpr();
				}
				break;
			case New:
				_localctx = new NewExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				match(New);
				setState(373);
				newVar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewVarContext extends ParserRuleContext {
		public NoArrayTypeIdContext noArrayTypeId() {
			return getRuleContext(NoArrayTypeIdContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(MxStarParser.Identifier, 0); }
		public NewVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterNewVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitNewVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitNewVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewVarContext newVar() throws RecognitionException {
		NewVarContext _localctx = new NewVarContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_newVar);
		try {
			int _alt;
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				noArrayTypeId();
				setState(381); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(377);
						match(T__6);
						setState(378);
						expression();
						setState(379);
						match(T__7);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(383); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(385);
						match(T__6);
						setState(386);
						match(T__7);
						}
						} 
					}
					setState(391);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(Identifier);
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(393);
					match(T__4);
					setState(394);
					match(T__5);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightUnaryExprContext extends ParserRuleContext {
		public RightUnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightUnaryExpr; }
	 
		public RightUnaryExprContext() { }
		public void copyFrom(RightUnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PriExpContext extends RightUnaryExprContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PriExpContext(RightUnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterPriExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitPriExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitPriExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightUExpContext extends RightUnaryExprContext {
		public Token op;
		public RightUnaryExprContext rightUnaryExpr() {
			return getRuleContext(RightUnaryExprContext.class,0);
		}
		public RightUExpContext(RightUnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterRightUExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitRightUExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitRightUExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightUnaryExprContext rightUnaryExpr() throws RecognitionException {
		return rightUnaryExpr(0);
	}

	private RightUnaryExprContext rightUnaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RightUnaryExprContext _localctx = new RightUnaryExprContext(_ctx, _parentState);
		RightUnaryExprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_rightUnaryExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PriExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(400);
			primaryExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RightUExpContext(new RightUnaryExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_rightUnaryExpr);
					setState(402);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(403);
					((RightUExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
						((RightUExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	 
		public PrimaryExprContext() { }
		public void copyFrom(PrimaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PriPntExpContext extends PrimaryExprContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public ElementExprContext elementExpr() {
			return getRuleContext(ElementExprContext.class,0);
		}
		public PriPntExpContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterPriPntExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitPriPntExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitPriPntExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EleExpContext extends PrimaryExprContext {
		public ElementExprContext elementExpr() {
			return getRuleContext(ElementExprContext.class,0);
		}
		public EleExpContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterEleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitEleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitEleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriArrExpContext extends PrimaryExprContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PriArrExpContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterPriArrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitPriArrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitPriArrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EleExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(410);
			elementExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new PriPntExpContext(new PrimaryExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(412);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(413);
						match(T__31);
						setState(414);
						elementExpr();
						}
						break;
					case 2:
						{
						_localctx = new PriArrExpContext(new PrimaryExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(415);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(416);
						match(T__6);
						setState(417);
						expression();
						setState(418);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElementExprContext extends ParserRuleContext {
		public ElementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpr; }
	 
		public ElementExprContext() { }
		public void copyFrom(ElementExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarEleExpContext extends ElementExprContext {
		public TerminalNode Identifier() { return getToken(MxStarParser.Identifier, 0); }
		public VarEleExpContext(ElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterVarEleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitVarEleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitVarEleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunEleExpContext extends ElementExprContext {
		public TerminalNode Identifier() { return getToken(MxStarParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunEleExpContext(ElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterFunEleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitFunEleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitFunEleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisEleExpContext extends ElementExprContext {
		public TerminalNode This() { return getToken(MxStarParser.This, 0); }
		public ThisEleExpContext(ElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterThisEleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitThisEleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitThisEleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiterEleExpContext extends ElementExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiterEleExpContext(ElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLiterEleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLiterEleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLiterEleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SonEleExpContext extends ElementExprContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SonEleExpContext(ElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterSonEleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitSonEleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitSonEleExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementExprContext elementExpr() throws RecognitionException {
		ElementExprContext _localctx = new ElementExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elementExpr);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new LiterEleExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				literal();
				}
				break;
			case 2:
				_localctx = new ThisEleExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(This);
				}
				break;
			case 3:
				_localctx = new VarEleExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(Identifier);
				}
				break;
			case 4:
				_localctx = new FunEleExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(Identifier);
				setState(429);
				match(T__4);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << LogicLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << New) | (1L << This) | (1L << Identifier))) != 0)) {
					{
					setState(430);
					expressionList();
					}
				}

				setState(433);
				match(T__5);
				}
				break;
			case 5:
				_localctx = new SonEleExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				match(T__4);
				setState(435);
				expression();
				setState(436);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			expression();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(441);
				match(T__2);
				setState(442);
				expression();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiterContext extends LiteralContext {
		public TerminalNode NullLiteral() { return getToken(MxStarParser.NullLiteral, 0); }
		public NullLiterContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterNullLiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitNullLiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitNullLiter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicLiterContext extends LiteralContext {
		public TerminalNode LogicLiteral() { return getToken(MxStarParser.LogicLiteral, 0); }
		public LogicLiterContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterLogicLiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitLogicLiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitLogicLiter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiterContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(MxStarParser.StringLiteral, 0); }
		public StringLiterContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterStringLiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitStringLiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitStringLiter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiterContext extends LiteralContext {
		public TerminalNode IntLiteral() { return getToken(MxStarParser.IntLiteral, 0); }
		public IntLiterContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).enterIntLiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxStarListener ) ((MxStarListener)listener).exitIntLiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxStarVisitor ) return ((MxStarVisitor<? extends T>)visitor).visitIntLiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LogicLiteral:
				_localctx = new LogicLiterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(LogicLiteral);
				}
				break;
			case IntLiteral:
				_localctx = new IntLiterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(IntLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(StringLiteral);
				}
				break;
			case NullLiteral:
				_localctx = new NullLiterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				match(NullLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return typeId_sempred((TypeIdContext)_localctx, predIndex);
		case 21:
			return logicOrExpr_sempred((LogicOrExprContext)_localctx, predIndex);
		case 22:
			return logicAndExpr_sempred((LogicAndExprContext)_localctx, predIndex);
		case 23:
			return orExpr_sempred((OrExprContext)_localctx, predIndex);
		case 24:
			return xorExpr_sempred((XorExprContext)_localctx, predIndex);
		case 25:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 26:
			return equalExpr_sempred((EqualExprContext)_localctx, predIndex);
		case 27:
			return compExpr_sempred((CompExprContext)_localctx, predIndex);
		case 28:
			return shiftExpr_sempred((ShiftExprContext)_localctx, predIndex);
		case 29:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 30:
			return mulExpr_sempred((MulExprContext)_localctx, predIndex);
		case 33:
			return rightUnaryExpr_sempred((RightUnaryExprContext)_localctx, predIndex);
		case 34:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeId_sempred(TypeIdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicOrExpr_sempred(LogicOrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicAndExpr_sempred(LogicAndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean orExpr_sempred(OrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean xorExpr_sempred(XorExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalExpr_sempred(EqualExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean compExpr_sempred(CompExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpr_sempred(ShiftExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulExpr_sempred(MulExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean rightUnaryExpr_sempred(RightUnaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\4\5\4d"+
		"\n\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\5\3\5\3\5\7\5r\n\5\f\5"+
		"\16\5u\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u0080\n\7\3\7\3\7"+
		"\3\7\5\7\u0085\n\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090"+
		"\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a9\n\f\f\f\16\f\u00ac\13"+
		"\f\3\r\3\r\5\r\u00b0\n\r\3\16\3\16\3\17\3\17\3\17\7\17\u00b7\n\17\f\17"+
		"\16\17\u00ba\13\17\3\20\3\20\3\20\5\20\u00bf\n\20\3\21\3\21\3\21\7\21"+
		"\u00c4\n\21\f\21\16\21\u00c7\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00dd\n\23\3\23\3\23\5\23\u00e1\n\23\3\23\3\23\5\23\u00e5\n\23\3"+
		"\23\3\23\5\23\u00e9\n\23\3\24\3\24\5\24\u00ed\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00f4\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00fd\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0105\n\27\f\27\16\27\u0108\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0110\n\30\f\30\16\30\u0113\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u011b\n\31\f\31\16\31\u011e\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0126\n\32\f\32\16\32\u0129\13"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0131\n\33\f\33\16\33\u0134\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u013c\n\34\f\34\16\34\u013f\13"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u014a\n\35\f\35"+
		"\16\35\u014d\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0155\n\36\f\36"+
		"\16\36\u0158\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0160\n\37\f\37"+
		"\16\37\u0163\13\37\3 \3 \3 \3 \3 \3 \7 \u016b\n \f \16 \u016e\13 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u0179\n!\3\"\3\"\3\"\3\"\3\"\6\"\u0180\n\"\r"+
		"\"\16\"\u0181\3\"\3\"\7\"\u0186\n\"\f\"\16\"\u0189\13\"\3\"\3\"\3\"\5"+
		"\"\u018e\n\"\5\"\u0190\n\"\3#\3#\3#\3#\3#\7#\u0197\n#\f#\16#\u019a\13"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u01a7\n$\f$\16$\u01aa\13$\3%\3%"+
		"\3%\3%\3%\3%\5%\u01b2\n%\3%\3%\3%\3%\3%\5%\u01b9\n%\3&\3&\3&\7&\u01be"+
		"\n&\f&\16&\u01c1\13&\3\'\3\'\3\'\3\'\5\'\u01c7\n\'\3\'\2\17\26,.\60\62"+
		"\64\668:<>DF(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJL\2\13\3\2\')\3\2\21\22\3\2\23\24\3\2\25\26\3\2\27\30\3\2"+
		"\31\32\3\2\33\35\3\2\36\37\3\2 !\2\u01e1\2S\3\2\2\2\4V\3\2\2\2\6Z\3\2"+
		"\2\2\bn\3\2\2\2\nx\3\2\2\2\f\177\3\2\2\2\16\u0089\3\2\2\2\20\u0091\3\2"+
		"\2\2\22\u009c\3\2\2\2\24\u009e\3\2\2\2\26\u00a2\3\2\2\2\30\u00af\3\2\2"+
		"\2\32\u00b1\3\2\2\2\34\u00b3\3\2\2\2\36\u00bb\3\2\2\2 \u00c0\3\2\2\2\""+
		"\u00ca\3\2\2\2$\u00e8\3\2\2\2&\u00f3\3\2\2\2(\u00f5\3\2\2\2*\u00fc\3\2"+
		"\2\2,\u00fe\3\2\2\2.\u0109\3\2\2\2\60\u0114\3\2\2\2\62\u011f\3\2\2\2\64"+
		"\u012a\3\2\2\2\66\u0135\3\2\2\28\u0140\3\2\2\2:\u014e\3\2\2\2<\u0159\3"+
		"\2\2\2>\u0164\3\2\2\2@\u0178\3\2\2\2B\u018f\3\2\2\2D\u0191\3\2\2\2F\u019b"+
		"\3\2\2\2H\u01b8\3\2\2\2J\u01ba\3\2\2\2L\u01c6\3\2\2\2NR\5\4\3\2OR\5\f"+
		"\7\2PR\5\24\13\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3"+
		"\2\2\2T\3\3\2\2\2US\3\2\2\2VW\7\66\2\2WX\78\2\2XY\5\6\4\2Y\5\3\2\2\2Z"+
		"_\7\3\2\2[^\5\b\5\2\\^\5\f\7\2][\3\2\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2"+
		"\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bd\5\n\6\2cb\3\2\2\2cd\3\2\2\2di\3\2\2"+
		"\2eh\5\b\5\2fh\5\f\7\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2jl\3\2\2\2ki\3\2\2\2lm\7\4\2\2m\7\3\2\2\2ns\5\20\t\2op\7\5\2\2pr\78"+
		"\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\6"+
		"\2\2w\t\3\2\2\2xy\78\2\2yz\7\7\2\2z{\7\b\2\2{|\5 \21\2|\13\3\2\2\2}\u0080"+
		"\5\26\f\2~\u0080\7*\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0082\78\2\2\u0082\u0084\7\7\2\2\u0083\u0085\5\16\b\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\b\2\2\u0087"+
		"\u0088\5 \21\2\u0088\r\3\2\2\2\u0089\u008e\5\20\t\2\u008a\u008b\7\5\2"+
		"\2\u008b\u008d\5\20\t\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\17\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0092\5\26\f\2\u0092\u0093\78\2\2\u0093\21\3\2\2\2\u0094\u009d"+
		"\5 \21\2\u0095\u0096\5(\25\2\u0096\u0097\7\6\2\2\u0097\u009d\3\2\2\2\u0098"+
		"\u009d\5\"\22\2\u0099\u009d\5$\23\2\u009a\u009d\5&\24\2\u009b\u009d\7"+
		"\6\2\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0098\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\23\3\2\2"+
		"\2\u009e\u009f\5\26\f\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7\6\2\2\u00a1"+
		"\25\3\2\2\2\u00a2\u00a3\b\f\1\2\u00a3\u00a4\5\30\r\2\u00a4\u00aa\3\2\2"+
		"\2\u00a5\u00a6\f\4\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a9\7\n\2\2\u00a8\u00a5"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\27\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\5\32\16\2\u00ae\u00b0\78\2"+
		"\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00b2"+
		"\t\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b8\5\36\20\2\u00b4\u00b5\7\5\2\2\u00b5"+
		"\u00b7\5\36\20\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\35\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00be\78\2\2\u00bc\u00bd\7\13\2\2\u00bd\u00bf\5(\25\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\37\3\2\2\2\u00c0\u00c5\7\3\2\2\u00c1\u00c4"+
		"\5\22\n\2\u00c2\u00c4\5\24\13\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2"+
		"\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\4\2\2\u00c9!\3\2\2\2\u00ca"+
		"\u00cb\7.\2\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\5(\25\2\u00cd\u00ce\7\b"+
		"\2\2\u00ce\u00d1\5\22\n\2\u00cf\u00d0\7/\2\2\u00d0\u00d2\5\22\n\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2#\3\2\2\2\u00d3\u00d4\7\61\2\2"+
		"\u00d4\u00d5\7\7\2\2\u00d5\u00d6\5(\25\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8"+
		"\5\22\n\2\u00d8\u00e9\3\2\2\2\u00d9\u00da\7\60\2\2\u00da\u00dc\7\7\2\2"+
		"\u00db\u00dd\5(\25\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e0\7\6\2\2\u00df\u00e1\5(\25\2\u00e0\u00df\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\7\6\2\2\u00e3\u00e5\5("+
		"\25\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\7\b\2\2\u00e7\u00e9\5\22\n\2\u00e8\u00d3\3\2\2\2\u00e8\u00d9\3"+
		"\2\2\2\u00e9%\3\2\2\2\u00ea\u00ec\7\64\2\2\u00eb\u00ed\5(\25\2\u00ec\u00eb"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f4\7\6\2\2\u00ef"+
		"\u00f0\7\62\2\2\u00f0\u00f4\7\6\2\2\u00f1\u00f2\7\63\2\2\u00f2\u00f4\7"+
		"\6\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\'\3\2\2\2\u00f5\u00f6\5*\26\2\u00f6)\3\2\2\2\u00f7\u00fd\5,\27\2\u00f8"+
		"\u00f9\5,\27\2\u00f9\u00fa\7\13\2\2\u00fa\u00fb\5*\26\2\u00fb\u00fd\3"+
		"\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd+\3\2\2\2\u00fe\u00ff"+
		"\b\27\1\2\u00ff\u0100\5.\30\2\u0100\u0106\3\2\2\2\u0101\u0102\f\3\2\2"+
		"\u0102\u0103\7\f\2\2\u0103\u0105\5.\30\2\u0104\u0101\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107-\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\b\30\1\2\u010a\u010b\5\60\31\2\u010b\u0111"+
		"\3\2\2\2\u010c\u010d\f\3\2\2\u010d\u010e\7\r\2\2\u010e\u0110\5\60\31\2"+
		"\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112/\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\b\31\1\2\u0115"+
		"\u0116\5\62\32\2\u0116\u011c\3\2\2\2\u0117\u0118\f\3\2\2\u0118\u0119\7"+
		"\16\2\2\u0119\u011b\5\62\32\2\u011a\u0117\3\2\2\2\u011b\u011e\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\61\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0120\b\32\1\2\u0120\u0121\5\64\33\2\u0121\u0127\3\2\2"+
		"\2\u0122\u0123\f\3\2\2\u0123\u0124\7\17\2\2\u0124\u0126\5\64\33\2\u0125"+
		"\u0122\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\63\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\b\33\1\2\u012b\u012c"+
		"\5\66\34\2\u012c\u0132\3\2\2\2\u012d\u012e\f\3\2\2\u012e\u012f\7\20\2"+
		"\2\u012f\u0131\5\66\34\2\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\65\3\2\2\2\u0134\u0132\3\2\2"+
		"\2\u0135\u0136\b\34\1\2\u0136\u0137\58\35\2\u0137\u013d\3\2\2\2\u0138"+
		"\u0139\f\3\2\2\u0139\u013a\t\3\2\2\u013a\u013c\58\35\2\u013b\u0138\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\67\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\b\35\1\2\u0141\u0142\5:\36"+
		"\2\u0142\u014b\3\2\2\2\u0143\u0144\f\4\2\2\u0144\u0145\t\4\2\2\u0145\u014a"+
		"\5:\36\2\u0146\u0147\f\3\2\2\u0147\u0148\t\5\2\2\u0148\u014a\5:\36\2\u0149"+
		"\u0143\3\2\2\2\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c9\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f"+
		"\b\36\1\2\u014f\u0150\5<\37\2\u0150\u0156\3\2\2\2\u0151\u0152\f\3\2\2"+
		"\u0152\u0153\t\6\2\2\u0153\u0155\5<\37\2\u0154\u0151\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157;\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015a\b\37\1\2\u015a\u015b\5> \2\u015b\u0161\3\2"+
		"\2\2\u015c\u015d\f\3\2\2\u015d\u015e\t\7\2\2\u015e\u0160\5> \2\u015f\u015c"+
		"\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"=\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\b \1\2\u0165\u0166\5@!\2\u0166"+
		"\u016c\3\2\2\2\u0167\u0168\f\3\2\2\u0168\u0169\t\b\2\2\u0169\u016b\5@"+
		"!\2\u016a\u0167\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d?\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0179\5D#\2\u0170"+
		"\u0171\t\t\2\2\u0171\u0179\5@!\2\u0172\u0173\t\n\2\2\u0173\u0179\5@!\2"+
		"\u0174\u0175\t\7\2\2\u0175\u0179\5@!\2\u0176\u0177\7\65\2\2\u0177\u0179"+
		"\5B\"\2\u0178\u016f\3\2\2\2\u0178\u0170\3\2\2\2\u0178\u0172\3\2\2\2\u0178"+
		"\u0174\3\2\2\2\u0178\u0176\3\2\2\2\u0179A\3\2\2\2\u017a\u017f\5\30\r\2"+
		"\u017b\u017c\7\t\2\2\u017c\u017d\5(\25\2\u017d\u017e\7\n\2\2\u017e\u0180"+
		"\3\2\2\2\u017f\u017b\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0187\3\2\2\2\u0183\u0184\7\t\2\2\u0184\u0186\7\n"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0190\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018d\78"+
		"\2\2\u018b\u018c\7\7\2\2\u018c\u018e\7\b\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u017a\3\2\2\2\u018f\u018a\3\2"+
		"\2\2\u0190C\3\2\2\2\u0191\u0192\b#\1\2\u0192\u0193\5F$\2\u0193\u0198\3"+
		"\2\2\2\u0194\u0195\f\3\2\2\u0195\u0197\t\t\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199E\3\2\2\2"+
		"\u019a\u0198\3\2\2\2\u019b\u019c\b$\1\2\u019c\u019d\5H%\2\u019d\u01a8"+
		"\3\2\2\2\u019e\u019f\f\4\2\2\u019f\u01a0\7\"\2\2\u01a0\u01a7\5H%\2\u01a1"+
		"\u01a2\f\3\2\2\u01a2\u01a3\7\t\2\2\u01a3\u01a4\5(\25\2\u01a4\u01a5\7\n"+
		"\2\2\u01a5\u01a7\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9G\3\2\2\2"+
		"\u01aa\u01a8\3\2\2\2\u01ab\u01b9\5L\'\2\u01ac\u01b9\7\67\2\2\u01ad\u01b9"+
		"\78\2\2\u01ae\u01af\78\2\2\u01af\u01b1\7\7\2\2\u01b0\u01b2\5J&\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b9\7\b"+
		"\2\2\u01b4\u01b5\7\7\2\2\u01b5\u01b6\5(\25\2\u01b6\u01b7\7\b\2\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01ab\3\2\2\2\u01b8\u01ac\3\2\2\2\u01b8\u01ad\3\2"+
		"\2\2\u01b8\u01ae\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b9I\3\2\2\2\u01ba\u01bf"+
		"\5(\25\2\u01bb\u01bc\7\5\2\2\u01bc\u01be\5(\25\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0K\3\2\2\2"+
		"\u01c1\u01bf\3\2\2\2\u01c2\u01c7\7#\2\2\u01c3\u01c7\7$\2\2\u01c4\u01c7"+
		"\7%\2\2\u01c5\u01c7\7&\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7M\3\2\2\2\63QS]_cgis\177\u0084"+
		"\u008e\u009c\u00aa\u00af\u00b8\u00be\u00c3\u00c5\u00d1\u00dc\u00e0\u00e4"+
		"\u00e8\u00ec\u00f3\u00fc\u0106\u0111\u011c\u0127\u0132\u013d\u0149\u014b"+
		"\u0156\u0161\u016c\u0178\u0181\u0187\u018d\u018f\u0198\u01a6\u01a8\u01b1"+
		"\u01b8\u01bf\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}