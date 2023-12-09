package PL3;
// Generated from LinguineLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LinguineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASINGACION=1, IF=2, THEN=3, ELSE=4, FUNCION=5, SHOW=6, MATCH=7, WITH=8, 
		FOR=9, WHILE=10, DEFAULT=11, FLECHA=12, COMILLAS=13, OR=14, IDENTIFICADOR=15, 
		IGUALQUE=16, MAYORQUE=17, MENORIGUALQUE=18, SUMA=19, RESTA=20, MULTIPLICACION=21, 
		DIVISION=22, ABREPARENTESIS=23, CIERRAPARENTESIS=24, ENTERO=25, COMA=26, 
		PUNTOYCOMA=27, INTRO=28, ESPACIO=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASINGACION", "IF", "THEN", "ELSE", "FUNCION", "SHOW", "MATCH", "WITH", 
			"FOR", "WHILE", "DEFAULT", "FLECHA", "COMILLAS", "OR", "IDENTIFICADOR", 
			"IGUALQUE", "MAYORQUE", "MENORIGUALQUE", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "ABREPARENTESIS", "CIERRAPARENTESIS", "ENTERO", "COMA", "PUNTOYCOMA", 
			"INTRO", "ESPACIO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'if'", "'then'", "'else'", "'fun'", "'show'", "'match'", 
			"'with'", "'for'", "'while'", "'?'", "'->'", "'\"'", "'|'", null, "'='", 
			"'>'", "'<='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", null, "','", 
			"';'", "'\\r\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASINGACION", "IF", "THEN", "ELSE", "FUNCION", "SHOW", "MATCH", 
			"WITH", "FOR", "WHILE", "DEFAULT", "FLECHA", "COMILLAS", "OR", "IDENTIFICADOR", 
			"IGUALQUE", "MAYORQUE", "MENORIGUALQUE", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "ABREPARENTESIS", "CIERRAPARENTESIS", "ENTERO", "COMA", "PUNTOYCOMA", 
			"INTRO", "ESPACIO"
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


	public LinguineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LinguineLexer.g4"; }

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
		"\u0004\u0000\u001d\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0004\u000eu\b\u000e\u000b\u000e\f\u000ev\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0004\u0018\u008d\b\u0018\u000b\u0018\f\u0018\u008e\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u009b\b\u001c\u000b"+
		"\u001c\f\u001c\u009c\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d\u0001\u0000\u0003\u0002\u0000AZaz"+
		"\u0001\u000009\u0003\u0000\t\n\r\r  \u00a2\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0001;\u0001\u0000\u0000\u0000\u0003?\u0001\u0000\u0000\u0000\u0005B"+
		"\u0001\u0000\u0000\u0000\u0007G\u0001\u0000\u0000\u0000\tL\u0001\u0000"+
		"\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rU\u0001\u0000\u0000\u0000"+
		"\u000f[\u0001\u0000\u0000\u0000\u0011`\u0001\u0000\u0000\u0000\u0013d"+
		"\u0001\u0000\u0000\u0000\u0015j\u0001\u0000\u0000\u0000\u0017l\u0001\u0000"+
		"\u0000\u0000\u0019o\u0001\u0000\u0000\u0000\u001bq\u0001\u0000\u0000\u0000"+
		"\u001dt\u0001\u0000\u0000\u0000\u001fx\u0001\u0000\u0000\u0000!z\u0001"+
		"\u0000\u0000\u0000#|\u0001\u0000\u0000\u0000%\u007f\u0001\u0000\u0000"+
		"\u0000\'\u0081\u0001\u0000\u0000\u0000)\u0083\u0001\u0000\u0000\u0000"+
		"+\u0085\u0001\u0000\u0000\u0000-\u0087\u0001\u0000\u0000\u0000/\u0089"+
		"\u0001\u0000\u0000\u00001\u008c\u0001\u0000\u0000\u00003\u0090\u0001\u0000"+
		"\u0000\u00005\u0092\u0001\u0000\u0000\u00007\u0094\u0001\u0000\u0000\u0000"+
		"9\u009a\u0001\u0000\u0000\u0000;<\u0005l\u0000\u0000<=\u0005e\u0000\u0000"+
		"=>\u0005t\u0000\u0000>\u0002\u0001\u0000\u0000\u0000?@\u0005i\u0000\u0000"+
		"@A\u0005f\u0000\u0000A\u0004\u0001\u0000\u0000\u0000BC\u0005t\u0000\u0000"+
		"CD\u0005h\u0000\u0000DE\u0005e\u0000\u0000EF\u0005n\u0000\u0000F\u0006"+
		"\u0001\u0000\u0000\u0000GH\u0005e\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005"+
		"s\u0000\u0000JK\u0005e\u0000\u0000K\b\u0001\u0000\u0000\u0000LM\u0005"+
		"f\u0000\u0000MN\u0005u\u0000\u0000NO\u0005n\u0000\u0000O\n\u0001\u0000"+
		"\u0000\u0000PQ\u0005s\u0000\u0000QR\u0005h\u0000\u0000RS\u0005o\u0000"+
		"\u0000ST\u0005w\u0000\u0000T\f\u0001\u0000\u0000\u0000UV\u0005m\u0000"+
		"\u0000VW\u0005a\u0000\u0000WX\u0005t\u0000\u0000XY\u0005c\u0000\u0000"+
		"YZ\u0005h\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005w\u0000\u0000"+
		"\\]\u0005i\u0000\u0000]^\u0005t\u0000\u0000^_\u0005h\u0000\u0000_\u0010"+
		"\u0001\u0000\u0000\u0000`a\u0005f\u0000\u0000ab\u0005o\u0000\u0000bc\u0005"+
		"r\u0000\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005w\u0000\u0000ef\u0005"+
		"h\u0000\u0000fg\u0005i\u0000\u0000gh\u0005l\u0000\u0000hi\u0005e\u0000"+
		"\u0000i\u0014\u0001\u0000\u0000\u0000jk\u0005?\u0000\u0000k\u0016\u0001"+
		"\u0000\u0000\u0000lm\u0005-\u0000\u0000mn\u0005>\u0000\u0000n\u0018\u0001"+
		"\u0000\u0000\u0000op\u0005\"\u0000\u0000p\u001a\u0001\u0000\u0000\u0000"+
		"qr\u0005|\u0000\u0000r\u001c\u0001\u0000\u0000\u0000su\u0007\u0000\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u001e\u0001\u0000\u0000\u0000"+
		"xy\u0005=\u0000\u0000y \u0001\u0000\u0000\u0000z{\u0005>\u0000\u0000{"+
		"\"\u0001\u0000\u0000\u0000|}\u0005<\u0000\u0000}~\u0005=\u0000\u0000~"+
		"$\u0001\u0000\u0000\u0000\u007f\u0080\u0005+\u0000\u0000\u0080&\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005-\u0000\u0000\u0082(\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005*\u0000\u0000\u0084*\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005/\u0000\u0000\u0086,\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"(\u0000\u0000\u0088.\u0001\u0000\u0000\u0000\u0089\u008a\u0005)\u0000"+
		"\u0000\u008a0\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0001\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f2\u0001\u0000\u0000\u0000\u0090\u0091\u0005,\u0000\u0000\u00914"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005;\u0000\u0000\u00936\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\r\u0000\u0000\u0095\u0096\u0005\n\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0006\u001b\u0000"+
		"\u0000\u00988\u0001\u0000\u0000\u0000\u0099\u009b\u0007\u0002\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u001c\u0000\u0000"+
		"\u009f:\u0001\u0000\u0000\u0000\u0004\u0000v\u008e\u009c\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}