// Generated from /home/goncalom/MEOCloud/UA2A/2S/C/P/P2_05fev2020/bloco2/b2_09/questions.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class questionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, STRING=8, ESC=9, 
		INTEGER=10, ID=11, COMMENT=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "STRING", "ESC", 
		"INTEGER", "ID", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'('", "')'", "'{'", "'}'", "':'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "STRING", "ESC", "INTEGER", 
		"ID", "COMMENT", "WS"
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


	public questionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "questions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\t/\n\t\f\t\16\t\62\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\5\n:\n\n\3\13\6\13=\n\13\r\13\16\13>\3\f\6\fB\n\f\r\f\16\fC\3"+
		"\r\3\r\7\rH\n\r\f\r\16\rK\13\r\3\r\3\r\3\r\3\r\3\r\7\rR\n\r\f\r\16\rU"+
		"\13\r\3\r\3\r\5\rY\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\60IS\2\17\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\5\3\2\62;"+
		"\6\2\60\60\62;C\\c|\4\2\13\13\"\"\2g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2"+
		"\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'\3\2\2\2\17)\3"+
		"\2\2\2\21+\3\2\2\2\239\3\2\2\2\25<\3\2\2\2\27A\3\2\2\2\31X\3\2\2\2\33"+
		"\\\3\2\2\2\35\36\7\f\2\2\36\4\3\2\2\2\37 \7*\2\2 \6\3\2\2\2!\"\7+\2\2"+
		"\"\b\3\2\2\2#$\7}\2\2$\n\3\2\2\2%&\7\177\2\2&\f\3\2\2\2\'(\7<\2\2(\16"+
		"\3\2\2\2)*\7=\2\2*\20\3\2\2\2+\60\7$\2\2,/\5\23\n\2-/\13\2\2\2.,\3\2\2"+
		"\2.-\3\2\2\2/\62\3\2\2\2\60\61\3\2\2\2\60.\3\2\2\2\61\63\3\2\2\2\62\60"+
		"\3\2\2\2\63\64\7$\2\2\64\22\3\2\2\2\65\66\7^\2\2\66:\7$\2\2\678\7^\2\2"+
		"8:\7^\2\29\65\3\2\2\29\67\3\2\2\2:\24\3\2\2\2;=\t\2\2\2<;\3\2\2\2=>\3"+
		"\2\2\2><\3\2\2\2>?\3\2\2\2?\26\3\2\2\2@B\t\3\2\2A@\3\2\2\2BC\3\2\2\2C"+
		"A\3\2\2\2CD\3\2\2\2D\30\3\2\2\2EI\7%\2\2FH\13\2\2\2GF\3\2\2\2HK\3\2\2"+
		"\2IJ\3\2\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LY\7\f\2\2MN\7\61\2\2NO\7,\2"+
		"\2OS\3\2\2\2PR\13\2\2\2QP\3\2\2\2RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2TV\3\2"+
		"\2\2US\3\2\2\2VW\7,\2\2WY\7\61\2\2XE\3\2\2\2XM\3\2\2\2YZ\3\2\2\2Z[\b\r"+
		"\2\2[\32\3\2\2\2\\]\t\4\2\2]^\3\2\2\2^_\b\16\2\2_\34\3\2\2\2\13\2.\60"+
		"9>CISX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}