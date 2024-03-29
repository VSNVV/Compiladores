// Generated from gLinguineLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gLinguineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASINGACION=1, IF=2, THEN=3, ELSE=4, FUNCION=5, SHOW=6, MATCH=7, WITH=8, 
		DEFAULT=9, FLECHA=10, COMILLAS=11, OR=12, IDENTIFICADOR=13, IGUALQUE=14, 
		MAYORQUE=15, MENORIGUALQUE=16, SUMA=17, RESTA=18, MULTIPLICACION=19, DIVISION=20, 
		ABREPARENTESIS=21, CIERRAPARENTESIS=22, ENTERO=23, COMA=24, PUNTOYCOMA=25, 
		INTRO=26, ESPACIO=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASINGACION", "IF", "THEN", "ELSE", "FUNCION", "SHOW", "MATCH", "WITH", 
			"DEFAULT", "FLECHA", "COMILLAS", "OR", "IDENTIFICADOR", "IGUALQUE", "MAYORQUE", 
			"MENORIGUALQUE", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "ABREPARENTESIS", 
			"CIERRAPARENTESIS", "ENTERO", "COMA", "PUNTOYCOMA", "INTRO", "ESPACIO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'if'", "'then'", "'else'", "'fun'", "'show'", "'match'", 
			"'with'", "'?'", "'->'", "'\"'", "'|'", null, "'='", "'>'", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'('", "')'", null, "','", "';'", "'\\r\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASINGACION", "IF", "THEN", "ELSE", "FUNCION", "SHOW", "MATCH", 
			"WITH", "DEFAULT", "FLECHA", "COMILLAS", "OR", "IDENTIFICADOR", "IGUALQUE", 
			"MAYORQUE", "MENORIGUALQUE", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
			"ABREPARENTESIS", "CIERRAPARENTESIS", "ENTERO", "COMA", "PUNTOYCOMA", 
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


	public gLinguineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gLinguineLexer.g4"; }

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
		"\u0004\u0000\u001b\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0004\fg\b\f\u000b\f\f\fh\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0004"+
		"\u0016\u007f\b\u0016\u000b\u0016\f\u0016\u0080\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0004\u001a\u008d\b\u001a\u000b\u001a\f\u001a"+
		"\u008e\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r "+
		" \u0094\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00017\u0001\u0000"+
		"\u0000\u0000\u0003;\u0001\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000"+
		"\u0007C\u0001\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000\u000bL\u0001"+
		"\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000fW\u0001\u0000\u0000"+
		"\u0000\u0011\\\u0001\u0000\u0000\u0000\u0013^\u0001\u0000\u0000\u0000"+
		"\u0015a\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019f"+
		"\u0001\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001dl\u0001\u0000"+
		"\u0000\u0000\u001fn\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000\u0000"+
		"#s\u0001\u0000\u0000\u0000%u\u0001\u0000\u0000\u0000\'w\u0001\u0000\u0000"+
		"\u0000)y\u0001\u0000\u0000\u0000+{\u0001\u0000\u0000\u0000-~\u0001\u0000"+
		"\u0000\u0000/\u0082\u0001\u0000\u0000\u00001\u0084\u0001\u0000\u0000\u0000"+
		"3\u0086\u0001\u0000\u0000\u00005\u008c\u0001\u0000\u0000\u000078\u0005"+
		"l\u0000\u000089\u0005e\u0000\u00009:\u0005t\u0000\u0000:\u0002\u0001\u0000"+
		"\u0000\u0000;<\u0005i\u0000\u0000<=\u0005f\u0000\u0000=\u0004\u0001\u0000"+
		"\u0000\u0000>?\u0005t\u0000\u0000?@\u0005h\u0000\u0000@A\u0005e\u0000"+
		"\u0000AB\u0005n\u0000\u0000B\u0006\u0001\u0000\u0000\u0000CD\u0005e\u0000"+
		"\u0000DE\u0005l\u0000\u0000EF\u0005s\u0000\u0000FG\u0005e\u0000\u0000"+
		"G\b\u0001\u0000\u0000\u0000HI\u0005f\u0000\u0000IJ\u0005u\u0000\u0000"+
		"JK\u0005n\u0000\u0000K\n\u0001\u0000\u0000\u0000LM\u0005s\u0000\u0000"+
		"MN\u0005h\u0000\u0000NO\u0005o\u0000\u0000OP\u0005w\u0000\u0000P\f\u0001"+
		"\u0000\u0000\u0000QR\u0005m\u0000\u0000RS\u0005a\u0000\u0000ST\u0005t"+
		"\u0000\u0000TU\u0005c\u0000\u0000UV\u0005h\u0000\u0000V\u000e\u0001\u0000"+
		"\u0000\u0000WX\u0005w\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005t\u0000"+
		"\u0000Z[\u0005h\u0000\u0000[\u0010\u0001\u0000\u0000\u0000\\]\u0005?\u0000"+
		"\u0000]\u0012\u0001\u0000\u0000\u0000^_\u0005-\u0000\u0000_`\u0005>\u0000"+
		"\u0000`\u0014\u0001\u0000\u0000\u0000ab\u0005\"\u0000\u0000b\u0016\u0001"+
		"\u0000\u0000\u0000cd\u0005|\u0000\u0000d\u0018\u0001\u0000\u0000\u0000"+
		"eg\u0007\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u001a\u0001"+
		"\u0000\u0000\u0000jk\u0005=\u0000\u0000k\u001c\u0001\u0000\u0000\u0000"+
		"lm\u0005>\u0000\u0000m\u001e\u0001\u0000\u0000\u0000no\u0005<\u0000\u0000"+
		"op\u0005=\u0000\u0000p \u0001\u0000\u0000\u0000qr\u0005+\u0000\u0000r"+
		"\"\u0001\u0000\u0000\u0000st\u0005-\u0000\u0000t$\u0001\u0000\u0000\u0000"+
		"uv\u0005*\u0000\u0000v&\u0001\u0000\u0000\u0000wx\u0005/\u0000\u0000x"+
		"(\u0001\u0000\u0000\u0000yz\u0005(\u0000\u0000z*\u0001\u0000\u0000\u0000"+
		"{|\u0005)\u0000\u0000|,\u0001\u0000\u0000\u0000}\u007f\u0007\u0001\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081.\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005,\u0000\u0000\u00830\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005;\u0000\u0000\u00852\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\r\u0000\u0000\u0087\u0088\u0005\n\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0006\u0019\u0000\u0000\u008a4\u0001"+
		"\u0000\u0000\u0000\u008b\u008d\u0007\u0002\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0006\u001a\u0000\u0000\u00916\u0001\u0000"+
		"\u0000\u0000\u0004\u0000h\u0080\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}