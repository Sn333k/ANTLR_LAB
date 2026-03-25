// Generated from /home/student/IdeaProjects/ANTLR_LAB/src/grammar/first.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class firstParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, IF_kw=9, 
		WHILE=10, DIV=11, MUL=12, SUB=13, ADD=14, GT=15, LT=16, GE=17, LE=18, 
		EQ=19, NE=20, AND=21, OR=22, NOT=23, NEWLINE=24, WS=25, INT=26, ID=27, 
		COMMENT=28, LINE_COMMENT=29;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_block = 2, RULE_expr = 3, RULE_paramList = 4, 
		RULE_argList = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "block", "expr", "paramList", "argList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'else'", "'->'", "'{'", "'}'", "'='", "','", "'if'", 
			"'while'", "'/'", "'*'", "'-'", "'+'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "IF_kw", "WHILE", 
			"DIV", "MUL", "SUB", "ADD", "GT", "LT", "GE", "LE", "EQ", "NE", "AND", 
			"OR", "NOT", "NEWLINE", "WS", "INT", "ID", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "first.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public firstParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(firstParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 209716754L) != 0)) {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Print_statContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterPrint_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitPrint_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitPrint_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expr_statContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterExpr_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitExpr_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitExpr_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class While_statContext extends StatContext {
		public ExprContext cond;
		public BlockContext body;
		public TerminalNode WHILE() { return getToken(firstParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_statContext extends StatContext {
		public ExprContext cond;
		public BlockContext then;
		public BlockContext else_;
		public TerminalNode IF_kw() { return getToken(firstParser.IF_kw, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefContext extends StatContext {
		public TerminalNode ID() { return getToken(firstParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new If_statContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(IF_kw);
				setState(21);
				match(T__0);
				setState(22);
				((If_statContext)_localctx).cond = expr(0);
				setState(23);
				match(T__1);
				setState(24);
				((If_statContext)_localctx).then = block();
				setState(27);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(25);
					match(T__2);
					setState(26);
					((If_statContext)_localctx).else_ = block();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new While_statContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(WHILE);
				setState(30);
				match(T__0);
				setState(31);
				((While_statContext)_localctx).cond = expr(0);
				setState(32);
				match(T__1);
				setState(33);
				((While_statContext)_localctx).body = block();
				}
				break;
			case 3:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(ID);
				setState(36);
				match(T__0);
				setState(37);
				paramList();
				setState(38);
				match(T__1);
				setState(39);
				block();
				}
				break;
			case 4:
				_localctx = new Expr_statContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				expr(0);
				}
				break;
			case 5:
				_localctx = new Print_statContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				match(T__3);
				setState(43);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Block_singleContext extends BlockContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Block_singleContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterBlock_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitBlock_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitBlock_single(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Block_realContext extends BlockContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Block_realContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterBlock_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitBlock_real(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitBlock_real(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case IF_kw:
			case WHILE:
			case NOT:
			case INT:
			case ID:
				_localctx = new Block_singleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				stat();
				}
				break;
			case T__4:
				_localctx = new Block_realContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(T__4);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 209716786L) != 0)) {
					{
					{
					setState(48);
					block();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Int_tokContext extends ExprContext {
		public TerminalNode INT() { return getToken(firstParser.INT, 0); }
		public Int_tokContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterInt_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitInt_tok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitInt_tok(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotOpContext extends ExprContext {
		public TerminalNode NOT() { return getToken(firstParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterNotOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitNotOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitNotOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExprContext {
		public TerminalNode ID() { return getToken(firstParser.ID, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParsContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitPars(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOpContext extends ExprContext {
		public ExprContext l;
		public Token op;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(firstParser.AND, 0); }
		public TerminalNode OR() { return getToken(firstParser.OR, 0); }
		public LogicOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitLogicOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(firstParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelOpContext extends ExprContext {
		public ExprContext l;
		public Token op;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(firstParser.GT, 0); }
		public TerminalNode LT() { return getToken(firstParser.LT, 0); }
		public TerminalNode GE() { return getToken(firstParser.GE, 0); }
		public TerminalNode LE() { return getToken(firstParser.LE, 0); }
		public TerminalNode EQ() { return getToken(firstParser.EQ, 0); }
		public TerminalNode NE() { return getToken(firstParser.NE, 0); }
		public RelOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpContext extends ExprContext {
		public ExprContext l;
		public Token op;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(firstParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(firstParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(firstParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(firstParser.SUB, 0); }
		public BinOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(firstParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NotOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				match(NOT);
				setState(59);
				expr(6);
				}
				break;
			case 2:
				{
				_localctx = new Int_tokContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(ID);
				setState(62);
				match(T__0);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 209715202L) != 0)) {
					{
					setState(63);
					argList();
					}
				}

				setState(66);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ParsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(T__0);
				setState(69);
				expr(0);
				setState(70);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(ID);
				setState(73);
				match(T__6);
				setState(74);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						((BinOpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(78);
						((BinOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
							((BinOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						((BinOpContext)_localctx).r = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						((BinOpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(81);
						((BinOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
							((BinOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						((BinOpContext)_localctx).r = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new RelOpContext(new ExprContext(_parentctx, _parentState));
						((RelOpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(84);
						((RelOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
							((RelOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						((RelOpContext)_localctx).r = expr(9);
						}
						break;
					case 4:
						{
						_localctx = new LogicOpContext(new ExprContext(_parentctx, _parentState));
						((LogicOpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(87);
						((LogicOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						((LogicOpContext)_localctx).r = expr(8);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(firstParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(firstParser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ID);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(95);
				match(T__7);
				setState(96);
				match(ID);
				}
				}
				setState(101);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstListener ) ((firstListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstVisitor ) return ((firstVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			expr(0);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(103);
				match(T__7);
				setState(104);
				expr(0);
				}
				}
				setState(109);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001do\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001-\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u00022\b\u0002\n\u0002\f\u00025\t\u0002"+
		"\u0001\u0002\u0003\u00028\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003A\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"Z\b\u0003\n\u0003\f\u0003]\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004b\b\u0004\n\u0004\f\u0004e\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005j\b\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0005"+
		"\u0000\u0001\u0006\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0004\u0001"+
		"\u0000\u000b\f\u0001\u0000\r\u000e\u0001\u0000\u000f\u0014\u0001\u0000"+
		"\u0015\u0016|\u0000\u000f\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000"+
		"\u0000\u00047\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\b"+
		"^\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002"+
		"\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0005\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0005\t\u0000\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016"+
		"\u0017\u0003\u0006\u0003\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018"+
		"\u001b\u0003\u0004\u0002\u0000\u0019\u001a\u0005\u0003\u0000\u0000\u001a"+
		"\u001c\u0003\u0004\u0002\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c-\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005\n\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0003"+
		"\u0006\u0003\u0000 !\u0005\u0002\u0000\u0000!\"\u0003\u0004\u0002\u0000"+
		"\"-\u0001\u0000\u0000\u0000#$\u0005\u001b\u0000\u0000$%\u0005\u0001\u0000"+
		"\u0000%&\u0003\b\u0004\u0000&\'\u0005\u0002\u0000\u0000\'(\u0003\u0004"+
		"\u0002\u0000(-\u0001\u0000\u0000\u0000)-\u0003\u0006\u0003\u0000*+\u0005"+
		"\u0004\u0000\u0000+-\u0003\u0006\u0003\u0000,\u0014\u0001\u0000\u0000"+
		"\u0000,\u001d\u0001\u0000\u0000\u0000,#\u0001\u0000\u0000\u0000,)\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-\u0003\u0001\u0000\u0000"+
		"\u0000.8\u0003\u0002\u0001\u0000/3\u0005\u0005\u0000\u000002\u0003\u0004"+
		"\u0002\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000068\u0005\u0006\u0000\u00007.\u0001\u0000\u0000"+
		"\u00007/\u0001\u0000\u0000\u00008\u0005\u0001\u0000\u0000\u00009:\u0006"+
		"\u0003\uffff\uffff\u0000:;\u0005\u0017\u0000\u0000;L\u0003\u0006\u0003"+
		"\u0006<L\u0005\u001a\u0000\u0000=>\u0005\u001b\u0000\u0000>@\u0005\u0001"+
		"\u0000\u0000?A\u0003\n\u0005\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BL\u0005\u0002\u0000\u0000CL\u0005"+
		"\u001b\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0003\u0006\u0003\u0000"+
		"FG\u0005\u0002\u0000\u0000GL\u0001\u0000\u0000\u0000HI\u0005\u001b\u0000"+
		"\u0000IJ\u0005\u0007\u0000\u0000JL\u0003\u0006\u0003\u0001K9\u0001\u0000"+
		"\u0000\u0000K<\u0001\u0000\u0000\u0000K=\u0001\u0000\u0000\u0000KC\u0001"+
		"\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000"+
		"L[\u0001\u0000\u0000\u0000MN\n\n\u0000\u0000NO\u0007\u0000\u0000\u0000"+
		"OZ\u0003\u0006\u0003\u000bPQ\n\t\u0000\u0000QR\u0007\u0001\u0000\u0000"+
		"RZ\u0003\u0006\u0003\nST\n\b\u0000\u0000TU\u0007\u0002\u0000\u0000UZ\u0003"+
		"\u0006\u0003\tVW\n\u0007\u0000\u0000WX\u0007\u0003\u0000\u0000XZ\u0003"+
		"\u0006\u0003\bYM\u0001\u0000\u0000\u0000YP\u0001\u0000\u0000\u0000YS\u0001"+
		"\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0007\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^c\u0005\u001b\u0000\u0000_`\u0005"+
		"\b\u0000\u0000`b\u0005\u001b\u0000\u0000a_\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"d\t\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fk\u0003\u0006\u0003"+
		"\u0000gh\u0005\b\u0000\u0000hj\u0003\u0006\u0003\u0000ig\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000l\u000b\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"\u000b\u000f\u001b,37@KY[ck";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}