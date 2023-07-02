// Generated from /home/goncalom/MEOCloud/UA2A/2S/C/P/P2_05fev2020/bloco2/b2_10A_AcoesAtributos/SetCalculator.g4 by ANTLR 4.7.1

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SetCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, STRING=12, INT=13, VARNAME=14, WS=15, COMMENT=16;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_expr = 2, RULE_assign = 3, RULE_set = 4, 
		RULE_setWord = 5;
	public static final String[] ruleNames = {
		"prog", "main", "expr", "assign", "set", "setWord"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'('", "')'", "'\\'", "'&'", "'+'", "'='", "'{'", "','", 
		"'}'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"STRING", "INT", "VARNAME", "WS", "COMMENT"
	};
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
	public String getGrammarFileName() { return "SetCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, MySet<String>> vars = new HashMap<>();

	public SetCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SetCalculatorParser.EOF, 0); }
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << VARNAME))) != 0)) {
					{
					setState(12);
					main();
					}
				}

				setState(15);
				match(T__0);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
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

	public static class MainContext extends ParserRuleContext {
		public ExprContext e;
		public AssignContext a;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				((MainContext)_localctx).e = expr(0);
				 System.out.println(String.format("result: %s", ((MainContext)_localctx).e.s)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				((MainContext)_localctx).a = assign();
				 System.out.println(String.format("result: %s", ((MainContext)_localctx).a.s)); 
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

	public static class ExprContext extends ParserRuleContext {
		public MySet<String> s;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.s = ctx.s;
		}
	}
	public static class ExprVarnameOpContext extends ExprContext {
		public Token VARNAME;
		public TerminalNode VARNAME() { return getToken(SetCalculatorParser.VARNAME, 0); }
		public ExprVarnameOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprInterseptionContext extends ExprContext {
		public ExprContext s1;
		public ExprContext s2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprInterseptionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprUnionContext extends ExprContext {
		public ExprContext s1;
		public ExprContext s2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprUnionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprDifferenceContext extends ExprContext {
		public ExprContext s1;
		public ExprContext s2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprDifferenceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSetParentesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSetParentesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSetContext extends ExprContext {
		public SetContext se;
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ExprSetContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new ExprSetParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(32);
				match(T__1);
				setState(33);
				((ExprSetParentesisContext)_localctx).e = expr(0);
				setState(34);
				match(T__2);
				 ((ExprSetParentesisContext)_localctx).s =  ((ExprSetParentesisContext)_localctx).e.s; 
				}
				break;
			case VARNAME:
				{
				_localctx = new ExprVarnameOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				((ExprVarnameOpContext)_localctx).VARNAME = match(VARNAME);

				        ((ExprVarnameOpContext)_localctx).s =  vars.get((((ExprVarnameOpContext)_localctx).VARNAME!=null?((ExprVarnameOpContext)_localctx).VARNAME.getText():null));
				        if (_localctx.s==null){
				            System.err.println(String.format("ERROR! Variable %s is being used before having been created!", (((ExprVarnameOpContext)_localctx).VARNAME!=null?((ExprVarnameOpContext)_localctx).VARNAME.getText():null)));
				            System.exit(0);
				        }
				    
				}
				break;
			case T__7:
				{
				_localctx = new ExprSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				((ExprSetContext)_localctx).se = set();
				 ((ExprSetContext)_localctx).s =  ((ExprSetContext)_localctx).se.s; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDifferenceContext(new ExprContext(_parentctx, _parentState));
						((ExprDifferenceContext)_localctx).s1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(45);
						match(T__3);
						setState(46);
						((ExprDifferenceContext)_localctx).s2 = expr(6);
						 
						                  ((ExprDifferenceContext)_localctx).s =  MySet.<String>difference(((ExprDifferenceContext)_localctx).s1.s, ((ExprDifferenceContext)_localctx).s2.s);
						              
						}
						break;
					case 2:
						{
						_localctx = new ExprInterseptionContext(new ExprContext(_parentctx, _parentState));
						((ExprInterseptionContext)_localctx).s1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(49);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(50);
						match(T__4);
						setState(51);
						((ExprInterseptionContext)_localctx).s2 = expr(5);
						 
						                  ((ExprInterseptionContext)_localctx).s =  MySet.<String>intersept(((ExprInterseptionContext)_localctx).s1.s, ((ExprInterseptionContext)_localctx).s2.s);
						              
						}
						break;
					case 3:
						{
						_localctx = new ExprUnionContext(new ExprContext(_parentctx, _parentState));
						((ExprUnionContext)_localctx).s1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(55);
						match(T__5);
						setState(56);
						((ExprUnionContext)_localctx).s2 = expr(4);
						 
						                  ((ExprUnionContext)_localctx).s =  MySet.<String>union(((ExprUnionContext)_localctx).s1.s, ((ExprUnionContext)_localctx).s2.s);
						              
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class AssignContext extends ParserRuleContext {
		public MySet<String> s;
		public Token VARNAME;
		public SetContext se;
		public TerminalNode VARNAME() { return getToken(SetCalculatorParser.VARNAME, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((AssignContext)_localctx).VARNAME = match(VARNAME);
			setState(65);
			match(T__6);
			setState(66);
			((AssignContext)_localctx).se = set();

			        ((AssignContext)_localctx).s =  ((AssignContext)_localctx).se.s; 
			        vars.put((((AssignContext)_localctx).VARNAME!=null?((AssignContext)_localctx).VARNAME.getText():null), _localctx.s); 
			    
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

	public static class SetContext extends ParserRuleContext {
		public MySet<String> s;
		public List<SetWordContext> setWord() {
			return getRuleContexts(SetWordContext.class);
		}
		public SetWordContext setWord(int i) {
			return getRuleContext(SetWordContext.class,i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_set);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__7);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					setWord();
					setState(71);
					match(T__8);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__10) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(78);
				setWord();
				}
			}

			setState(81);
			match(T__9);
			 
			        ((SetContext)_localctx).s =  new MySet<String>();
			        for (SetWordContext el:_localctx.setWord()) {
			            _localctx.s.add(el.getText());    
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

	public static class SetWordContext extends ParserRuleContext {
		public String str;
		public TerminalNode STRING() { return getToken(SetCalculatorParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SetCalculatorParser.INT, 0); }
		public SetWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setWord; }
	}

	public final SetWordContext setWord() throws RecognitionException {
		SetWordContext _localctx = new SetWordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setWord);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(STRING);
				}
				break;
			case T__5:
			case T__10:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==T__10) {
					{
					setState(85);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(88);
				match(INT);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\5\2\20\n\2\3\2\7\2\23\n\2\f\2\16"+
		"\2\26\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\5\6R\n\6\3\6\3\6\3\6\3\7"+
		"\3\7\5\7Y\n\7\3\7\5\7\\\n\7\3\7\2\3\6\b\2\4\6\b\n\f\2\3\4\2\b\b\r\r\2"+
		"c\2\24\3\2\2\2\4\37\3\2\2\2\6,\3\2\2\2\bB\3\2\2\2\nG\3\2\2\2\f[\3\2\2"+
		"\2\16\20\5\4\3\2\17\16\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\23\7\3\2"+
		"\2\22\17\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2"+
		"\2\26\24\3\2\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32\5\6\4\2\32\33\b\3\1"+
		"\2\33 \3\2\2\2\34\35\5\b\5\2\35\36\b\3\1\2\36 \3\2\2\2\37\31\3\2\2\2\37"+
		"\34\3\2\2\2 \5\3\2\2\2!\"\b\4\1\2\"#\7\4\2\2#$\5\6\4\2$%\7\5\2\2%&\b\4"+
		"\1\2&-\3\2\2\2\'(\7\20\2\2(-\b\4\1\2)*\5\n\6\2*+\b\4\1\2+-\3\2\2\2,!\3"+
		"\2\2\2,\'\3\2\2\2,)\3\2\2\2-?\3\2\2\2./\f\7\2\2/\60\7\6\2\2\60\61\5\6"+
		"\4\b\61\62\b\4\1\2\62>\3\2\2\2\63\64\f\6\2\2\64\65\7\7\2\2\65\66\5\6\4"+
		"\7\66\67\b\4\1\2\67>\3\2\2\289\f\5\2\29:\7\b\2\2:;\5\6\4\6;<\b\4\1\2<"+
		">\3\2\2\2=.\3\2\2\2=\63\3\2\2\2=8\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2"+
		"\2@\7\3\2\2\2A?\3\2\2\2BC\7\20\2\2CD\7\t\2\2DE\5\n\6\2EF\b\5\1\2F\t\3"+
		"\2\2\2GM\7\n\2\2HI\5\f\7\2IJ\7\13\2\2JL\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK"+
		"\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\5\f\7\2QP\3\2\2\2QR\3\2\2\2R"+
		"S\3\2\2\2ST\7\f\2\2TU\b\6\1\2U\13\3\2\2\2V\\\7\16\2\2WY\t\2\2\2XW\3\2"+
		"\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\7\17\2\2[V\3\2\2\2[X\3\2\2\2\\\r\3\2\2\2\f"+
		"\17\24\37,=?MQX[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}