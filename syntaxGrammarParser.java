// Generated from syntaxGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class syntaxGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LPAREN=3, RPAREN=4, LBRACE=5, RBRACE=6, WHILE=7, FOR=8, 
		DO=9, EQUALS=10, NOTEQUALS=11, AND=12, OR=13, LT=14, LTE=15, GT=16, GTE=17, 
		SEMI=18, INT=19, FLOAT=20, CHAR=21, DOUBLE=22, DIGIT=23, TRUE=24, FALSE=25, 
		BODY=26, SIGN=27, ID=28, WS=29, COMMENT=30, LINE_COMMENT=31;
	public static final int
		RULE_expression = 0, RULE_var = 1, RULE_atom = 2, RULE_check = 3, RULE_whileLoop = 4, 
		RULE_doWhileLoop = 5, RULE_forLoop = 6, RULE_bool = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "var", "atom", "check", "whileLoop", "doWhileLoop", "forLoop", 
			"bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'='", "'('", "')'", "'{'", "'}'", "'while'", "'for'", "'do'", 
			"'=='", "'!='", "'&&'", "'||'", "'<'", "'<='", "'>'", "'>='", "';'", 
			"'int'", "'float'", "'char'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "WHILE", "FOR", 
			"DO", "EQUALS", "NOTEQUALS", "AND", "OR", "LT", "LTE", "GT", "GTE", "SEMI", 
			"INT", "FLOAT", "CHAR", "DOUBLE", "DIGIT", "TRUE", "FALSE", "BODY", "SIGN", 
			"ID", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "syntaxGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public syntaxGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode ID() { return getToken(syntaxGrammarParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(syntaxGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(syntaxGrammarParser.OR, 0); }
		public TerminalNode EQUALS() { return getToken(syntaxGrammarParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(syntaxGrammarParser.NOTEQUALS, 0); }
		public TerminalNode LT() { return getToken(syntaxGrammarParser.LT, 0); }
		public TerminalNode LTE() { return getToken(syntaxGrammarParser.LTE, 0); }
		public TerminalNode GT() { return getToken(syntaxGrammarParser.GT, 0); }
		public TerminalNode GTE() { return getToken(syntaxGrammarParser.GTE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case TRUE:
			case FALSE:
				{
				setState(17);
				atom();
				}
				break;
			case ID:
				{
				setState(18);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(21);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(22);
						match(AND);
						setState(23);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(24);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(25);
						match(OR);
						setState(26);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(27);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(28);
						match(EQUALS);
						setState(29);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(30);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(31);
						match(NOTEQUALS);
						setState(32);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(33);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(34);
						match(LT);
						setState(35);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(36);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(37);
						match(LTE);
						setState(38);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(39);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(40);
						match(GT);
						setState(41);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(42);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(43);
						match(GTE);
						setState(44);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(syntaxGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(syntaxGrammarParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(syntaxGrammarParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(syntaxGrammarParser.DOUBLE, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << DOUBLE))) != 0)) ) {
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(syntaxGrammarParser.DIGIT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(DIGIT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				bool();
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

	public static class CheckContext extends ParserRuleContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).exitCheck(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_check);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				whileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				forLoop();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				doWhileLoop();
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(syntaxGrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(syntaxGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(syntaxGrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(syntaxGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(syntaxGrammarParser.RBRACE, 0); }
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(WHILE);
			setState(62);
			match(LPAREN);
			setState(63);
			expression(0);
			setState(64);
			match(RPAREN);
			setState(65);
			match(LBRACE);
			setState(66);
			match(RBRACE);
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

	public static class DoWhileLoopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(syntaxGrammarParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(syntaxGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(syntaxGrammarParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(syntaxGrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(syntaxGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(syntaxGrammarParser.RPAREN, 0); }
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).exitDoWhileLoop(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(DO);
			setState(69);
			match(LBRACE);
			setState(70);
			match(RBRACE);
			setState(71);
			match(WHILE);
			setState(72);
			match(LPAREN);
			setState(73);
			expression(0);
			setState(74);
			match(RPAREN);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(syntaxGrammarParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(syntaxGrammarParser.LPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(syntaxGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(syntaxGrammarParser.ID, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(syntaxGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(syntaxGrammarParser.DIGIT, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(syntaxGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(syntaxGrammarParser.SEMI, i);
		}
		public TerminalNode SIGN() { return getToken(syntaxGrammarParser.SIGN, 0); }
		public TerminalNode RPAREN() { return getToken(syntaxGrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(syntaxGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(syntaxGrammarParser.RBRACE, 0); }
		public TerminalNode LT() { return getToken(syntaxGrammarParser.LT, 0); }
		public TerminalNode LTE() { return getToken(syntaxGrammarParser.LTE, 0); }
		public TerminalNode GT() { return getToken(syntaxGrammarParser.GT, 0); }
		public TerminalNode GTE() { return getToken(syntaxGrammarParser.GTE, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(FOR);
			setState(77);
			match(LPAREN);
			setState(78);
			match(ID);
			setState(79);
			match(T__0);
			setState(80);
			match(T__1);
			setState(81);
			match(T__0);
			setState(82);
			match(DIGIT);
			setState(83);
			match(SEMI);
			setState(84);
			match(T__0);
			setState(85);
			match(ID);
			setState(86);
			match(T__0);
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(88);
			match(T__0);
			setState(89);
			match(DIGIT);
			setState(90);
			match(SEMI);
			setState(91);
			match(T__0);
			setState(92);
			match(ID);
			setState(93);
			match(T__0);
			setState(94);
			match(T__1);
			setState(95);
			match(T__0);
			setState(96);
			match(ID);
			setState(97);
			match(T__0);
			setState(98);
			match(SIGN);
			setState(99);
			match(T__0);
			setState(100);
			match(DIGIT);
			setState(101);
			match(RPAREN);
			setState(102);
			match(LBRACE);
			setState(103);
			match(RBRACE);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(syntaxGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(syntaxGrammarParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof syntaxGrammarListener ) ((syntaxGrammarListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!n\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\5\2\26\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13\2\3\3\3\3\3\4\3"+
		"\4\5\49\n\4\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\2\3\2\n\2\4\6\b\n\f\16\20\2\5\3\2\25\30\3\2\20\23\3\2\32\33"+
		"\2q\2\25\3\2\2\2\4\64\3\2\2\2\68\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fF\3\2"+
		"\2\2\16N\3\2\2\2\20k\3\2\2\2\22\23\b\2\1\2\23\26\5\6\4\2\24\26\7\36\2"+
		"\2\25\22\3\2\2\2\25\24\3\2\2\2\26\61\3\2\2\2\27\30\f\n\2\2\30\31\7\16"+
		"\2\2\31\60\5\2\2\13\32\33\f\t\2\2\33\34\7\17\2\2\34\60\5\2\2\n\35\36\f"+
		"\b\2\2\36\37\7\f\2\2\37\60\5\2\2\t !\f\7\2\2!\"\7\r\2\2\"\60\5\2\2\b#"+
		"$\f\6\2\2$%\7\20\2\2%\60\5\2\2\7&\'\f\5\2\2\'(\7\21\2\2(\60\5\2\2\6)*"+
		"\f\4\2\2*+\7\22\2\2+\60\5\2\2\5,-\f\3\2\2-.\7\23\2\2.\60\5\2\2\4/\27\3"+
		"\2\2\2/\32\3\2\2\2/\35\3\2\2\2/ \3\2\2\2/#\3\2\2\2/&\3\2\2\2/)\3\2\2\2"+
		"/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61"+
		"\3\2\2\2\64\65\t\2\2\2\65\5\3\2\2\2\669\7\31\2\2\679\5\20\t\28\66\3\2"+
		"\2\28\67\3\2\2\29\7\3\2\2\2:>\5\n\6\2;>\5\16\b\2<>\5\f\7\2=:\3\2\2\2="+
		";\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?@\7\t\2\2@A\7\5\2\2AB\5\2\2\2BC\7\6\2\2"+
		"CD\7\7\2\2DE\7\b\2\2E\13\3\2\2\2FG\7\13\2\2GH\7\7\2\2HI\7\b\2\2IJ\7\t"+
		"\2\2JK\7\5\2\2KL\5\2\2\2LM\7\6\2\2M\r\3\2\2\2NO\7\n\2\2OP\7\5\2\2PQ\7"+
		"\36\2\2QR\7\3\2\2RS\7\4\2\2ST\7\3\2\2TU\7\31\2\2UV\7\24\2\2VW\7\3\2\2"+
		"WX\7\36\2\2XY\7\3\2\2YZ\t\3\2\2Z[\7\3\2\2[\\\7\31\2\2\\]\7\24\2\2]^\7"+
		"\3\2\2^_\7\36\2\2_`\7\3\2\2`a\7\4\2\2ab\7\3\2\2bc\7\36\2\2cd\7\3\2\2d"+
		"e\7\35\2\2ef\7\3\2\2fg\7\31\2\2gh\7\6\2\2hi\7\7\2\2ij\7\b\2\2j\17\3\2"+
		"\2\2kl\t\4\2\2l\21\3\2\2\2\7\25/\618=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}