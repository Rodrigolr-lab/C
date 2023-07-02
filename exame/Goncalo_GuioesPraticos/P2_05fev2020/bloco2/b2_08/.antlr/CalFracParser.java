// Generated from /home/goncalom/MEOCloud/UA2A/2S/C/P/P2_05fev2020/bloco2/b2_08/CalFrac.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalFracParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, NUM=15, ID=16, NEWLINE=17, 
		WS=18, ONELINECOMMENT=19, MULTILINECOMMENT=20;
	public static final int
		RULE_main = 0, RULE_comando = 1, RULE_atribuicao = 2, RULE_instrucao = 3, 
		RULE_expr = 4;
	public static final String[] ruleNames = {
		"main", "comando", "atribuicao", "instrucao", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'->'", "'print'", "'('", "')'", "'^'", "'-'", "'/'", "'+'", 
		"'*'", "':'", "'reduce'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "STRING", "NUM", "ID", "NEWLINE", "WS", "ONELINECOMMENT", 
		"MULTILINECOMMENT"
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
	public String getGrammarFileName() { return "CalFrac.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalFracParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CalFracParser.EOF, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << NUM) | (1L << ID) | (1L << NEWLINE) | (1L << ONELINECOMMENT))) != 0)) {
				{
				{
				setState(10);
				comando();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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

	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode ONELINECOMMENT() { return getToken(CalFracParser.ONELINECOMMENT, 0); }
		public TerminalNode NEWLINE() { return getToken(CalFracParser.NEWLINE, 0); }
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				setState(20);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__6:
				case T__11:
				case T__12:
				case NUM:
				case ID:
					{
					setState(18);
					atribuicao();
					}
					break;
				case T__2:
					{
					setState(19);
					instrucao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(22);
				match(T__0);
				}
			}

			setState(26);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==ONELINECOMMENT) ) {
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(CalFracParser.ID, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			expr(0);
			setState(29);
			match(T__1);
			setState(30);
			match(ID);
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

	public static class InstrucaoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__2);
			setState(33);
			expr(0);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprFracContext extends ExprContext {
		public List<TerminalNode> NUM() { return getTokens(CalFracParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(CalFracParser.NUM, i);
		}
		public ExprFracContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPowContext extends ExprContext {
		public Token neg;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CalFracParser.NUM, 0); }
		public ExprPowContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParentesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(CalFracParser.NUM, 0); }
		public ExprNumContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprReadContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CalFracParser.STRING, 0); }
		public ExprReadContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSumSubMultContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprSumSubMultContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNegativeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNegativeContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprReduceContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprReduceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(CalFracParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPowContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(36);
				match(T__3);
				setState(37);
				expr(0);
				setState(38);
				match(T__4);
				setState(39);
				match(T__5);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(40);
					((ExprPowContext)_localctx).neg = match(T__6);
					}
				}

				setState(43);
				match(NUM);
				}
				break;
			case 2:
				{
				_localctx = new ExprParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(T__3);
				setState(46);
				expr(0);
				setState(47);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ExprNegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(T__6);
				setState(50);
				expr(7);
				}
				break;
			case 4:
				{
				_localctx = new ExprFracContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(NUM);
				setState(52);
				match(T__7);
				setState(53);
				match(NUM);
				}
				break;
			case 5:
				{
				_localctx = new ExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(NUM);
				}
				break;
			case 6:
				{
				_localctx = new ExprReduceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(T__11);
				setState(56);
				expr(3);
				}
				break;
			case 7:
				{
				_localctx = new ExprReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(T__12);
				setState(58);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprSumSubMultContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(62);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(63);
					((ExprSumSubMultContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
						((ExprSumSubMultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(64);
					expr(6);
					}
					} 
				}
				setState(69);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\3"+
		"\3\3\5\3\27\n\3\3\3\3\3\5\3\33\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6,\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\6\7\6D\n\6\f\6\16"+
		"\6G\13\6\3\6\2\3\n\7\2\4\6\b\n\2\4\4\2\23\23\25\25\4\2\t\t\13\r\2O\2\17"+
		"\3\2\2\2\4\32\3\2\2\2\6\36\3\2\2\2\b\"\3\2\2\2\n>\3\2\2\2\f\16\5\4\3\2"+
		"\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21"+
		"\17\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\27\5\6\4\2\25\27\5\b\5\2\26"+
		"\24\3\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\31\7\3\2\2\31\33\3\2\2\2\32"+
		"\26\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\t\2\2\2\35\5\3\2\2\2\36"+
		"\37\5\n\6\2\37 \7\4\2\2 !\7\22\2\2!\7\3\2\2\2\"#\7\5\2\2#$\5\n\6\2$\t"+
		"\3\2\2\2%&\b\6\1\2&\'\7\6\2\2\'(\5\n\6\2()\7\7\2\2)+\7\b\2\2*,\7\t\2\2"+
		"+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\21\2\2.?\3\2\2\2/\60\7\6\2\2\60\61"+
		"\5\n\6\2\61\62\7\7\2\2\62?\3\2\2\2\63\64\7\t\2\2\64?\5\n\6\t\65\66\7\21"+
		"\2\2\66\67\7\n\2\2\67?\7\21\2\28?\7\21\2\29:\7\16\2\2:?\5\n\6\5;<\7\17"+
		"\2\2<?\7\20\2\2=?\7\22\2\2>%\3\2\2\2>/\3\2\2\2>\63\3\2\2\2>\65\3\2\2\2"+
		">8\3\2\2\2>9\3\2\2\2>;\3\2\2\2>=\3\2\2\2?E\3\2\2\2@A\f\7\2\2AB\t\3\2\2"+
		"BD\5\n\6\bC@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GE\3\2\2"+
		"\2\b\17\26\32+>E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}