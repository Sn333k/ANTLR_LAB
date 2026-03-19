// Generated from /home/sn3k/IdeaProjects/ANTLR_LAB/src/grammar/first.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class firstLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IF_kw=8, DIV=9, 
		MUL=10, SUB=11, ADD=12, NEWLINE=13, WS=14, INT=15, ID=16, COMMENT=17, 
		LINE_COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "IF_kw", "DIV", 
			"MUL", "SUB", "ADD", "NEWLINE", "WS", "INT", "ID", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'else'", "'>'", "'{'", "'}'", "'='", "'if'", "'/'", 
			"'*'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "IF_kw", "DIV", "MUL", 
			"SUB", "ADD", "NEWLINE", "WS", "INT", "ID", "COMMENT", "LINE_COMMENT"
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


	public firstLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "first.g4"; }

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
		"\u0004\u0000\u0012v\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0004\fC\b\f\u000b\f\f\fD\u0001\f\u0001\f\u0001"+
		"\r\u0004\rJ\b\r\u000b\r\f\rK\u0001\r\u0001\r\u0001\u000e\u0004\u000eQ"+
		"\b\u000e\u000b\u000e\f\u000eR\u0001\u000f\u0001\u000f\u0005\u000fW\b\u000f"+
		"\n\u000f\f\u000fZ\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010`\b\u0010\n\u0010\f\u0010c\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011n\b\u0011\n\u0011\f\u0011q\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001a\u0000\u0012\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012\u0001\u0000\u0006\u0002\u0000\n\n\r\r\u0002\u0000\t\t "+
		" \u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000\n\n"+
		"{\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000"+
		"\u0007.\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b2\u0001"+
		"\u0000\u0000\u0000\r4\u0001\u0000\u0000\u0000\u000f6\u0001\u0000\u0000"+
		"\u0000\u00119\u0001\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000\u0015"+
		"=\u0001\u0000\u0000\u0000\u0017?\u0001\u0000\u0000\u0000\u0019B\u0001"+
		"\u0000\u0000\u0000\u001bI\u0001\u0000\u0000\u0000\u001dP\u0001\u0000\u0000"+
		"\u0000\u001fT\u0001\u0000\u0000\u0000![\u0001\u0000\u0000\u0000#i\u0001"+
		"\u0000\u0000\u0000%&\u0005(\u0000\u0000&\u0002\u0001\u0000\u0000\u0000"+
		"\'(\u0005)\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005e\u0000\u0000"+
		"*+\u0005l\u0000\u0000+,\u0005s\u0000\u0000,-\u0005e\u0000\u0000-\u0006"+
		"\u0001\u0000\u0000\u0000./\u0005>\u0000\u0000/\b\u0001\u0000\u0000\u0000"+
		"01\u0005{\u0000\u00001\n\u0001\u0000\u0000\u000023\u0005}\u0000\u0000"+
		"3\f\u0001\u0000\u0000\u000045\u0005=\u0000\u00005\u000e\u0001\u0000\u0000"+
		"\u000067\u0005i\u0000\u000078\u0005f\u0000\u00008\u0010\u0001\u0000\u0000"+
		"\u00009:\u0005/\u0000\u0000:\u0012\u0001\u0000\u0000\u0000;<\u0005*\u0000"+
		"\u0000<\u0014\u0001\u0000\u0000\u0000=>\u0005-\u0000\u0000>\u0016\u0001"+
		"\u0000\u0000\u0000?@\u0005+\u0000\u0000@\u0018\u0001\u0000\u0000\u0000"+
		"AC\u0007\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0006\f\u0000\u0000G\u001a\u0001\u0000\u0000\u0000HJ\u0007"+
		"\u0001\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MN\u0006\r\u0000\u0000N\u001c\u0001\u0000\u0000\u0000OQ\u0007\u0002"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u001e\u0001\u0000\u0000"+
		"\u0000TX\u0007\u0003\u0000\u0000UW\u0007\u0004\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y \u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[\\\u0005/\u0000\u0000\\]\u0005*\u0000\u0000]a\u0001\u0000\u0000\u0000"+
		"^`\t\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000de\u0005*\u0000\u0000ef\u0005/\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gh\u0006\u0010\u0000\u0000h\"\u0001\u0000\u0000"+
		"\u0000ij\u0005/\u0000\u0000jk\u0005/\u0000\u0000ko\u0001\u0000\u0000\u0000"+
		"ln\b\u0005\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rs\u0005\n\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0006\u0011\u0000\u0000u$\u0001\u0000\u0000\u0000\u0007\u0000"+
		"DKRXao\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}