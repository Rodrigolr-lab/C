// Generated from /home/goncalom/MEOCloud/UA2A/2S/C/P/P2_05fev2020/bloco2/b2_08/CalFrac.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalFracLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, NUM=15, ID=16, NEWLINE=17, 
		WS=18, ONELINECOMMENT=19, MULTILINECOMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "STRING", "ESCAPE", "NUM", "ID", "NEWLINE", 
		"WS", "ONELINECOMMENT", "MULTILINECOMMENT"
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


	public CalFracLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalFrac.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\7\17X\n\17\f\17\16\17[\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\5\20c\n\20\3\21\6\21f\n\21\r\21\16\21g\3\22\6\22k\n\22\r\22\16\22"+
		"l\3\23\5\23p\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7"+
		"\25|\n\25\f\25\16\25\177\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0087"+
		"\n\26\f\26\16\26\u008a\13\26\3\26\3\26\3\26\3\26\3\26\5Y}\u0088\2\27\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\2!\21#\22%\23\'\24)\25+\26\3\2\5\3\2\62;\4\2C\\c|\4\2\13\13\"\"\2\u0096"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\62\3\2\2"+
		"\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3\2\2"+
		"\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33O\3\2\2\2\35T\3\2\2\2\37b\3\2"+
		"\2\2!e\3\2\2\2#j\3\2\2\2%o\3\2\2\2\'s\3\2\2\2)w\3\2\2\2+\u0082\3\2\2\2"+
		"-.\7=\2\2.\4\3\2\2\2/\60\7/\2\2\60\61\7@\2\2\61\6\3\2\2\2\62\63\7r\2\2"+
		"\63\64\7t\2\2\64\65\7k\2\2\65\66\7p\2\2\66\67\7v\2\2\67\b\3\2\2\289\7"+
		"*\2\29\n\3\2\2\2:;\7+\2\2;\f\3\2\2\2<=\7`\2\2=\16\3\2\2\2>?\7/\2\2?\20"+
		"\3\2\2\2@A\7\61\2\2A\22\3\2\2\2BC\7-\2\2C\24\3\2\2\2DE\7,\2\2E\26\3\2"+
		"\2\2FG\7<\2\2G\30\3\2\2\2HI\7t\2\2IJ\7g\2\2JK\7f\2\2KL\7w\2\2LM\7e\2\2"+
		"MN\7g\2\2N\32\3\2\2\2OP\7t\2\2PQ\7g\2\2QR\7c\2\2RS\7f\2\2S\34\3\2\2\2"+
		"TY\7$\2\2UX\13\2\2\2VX\5\37\20\2WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2YZ\3\2\2"+
		"\2YW\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7$\2\2]\36\3\2\2\2^_\7^\2\2_c\7$"+
		"\2\2`a\7^\2\2ac\7^\2\2b^\3\2\2\2b`\3\2\2\2c \3\2\2\2df\t\2\2\2ed\3\2\2"+
		"\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\"\3\2\2\2ik\t\3\2\2ji\3\2\2\2kl\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2m$\3\2\2\2np\7\17\2\2on\3\2\2\2op\3\2\2\2pq\3"+
		"\2\2\2qr\7\f\2\2r&\3\2\2\2st\t\4\2\2tu\3\2\2\2uv\b\24\2\2v(\3\2\2\2wx"+
		"\7\61\2\2xy\7\61\2\2y}\3\2\2\2z|\13\2\2\2{z\3\2\2\2|\177\3\2\2\2}~\3\2"+
		"\2\2}{\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\f\2\2\u0081*"+
		"\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084\7,\2\2\u0084\u0088\3\2\2\2\u0085"+
		"\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7,\2\2\u008c\u008d\7\61\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\26"+
		"\2\2\u008f,\3\2\2\2\13\2WYbglo}\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}