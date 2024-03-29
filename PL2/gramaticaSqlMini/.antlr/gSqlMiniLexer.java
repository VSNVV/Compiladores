// Generated from c:/Users/david/OneDrive - Universidad de Alcala/Mi unidad/UNI/Cuarto/Compiladores/LAB/Compiladores/PL2/gramaticaSqlMini/gSqlMiniLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gSqlMiniLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, ORDER=4, BY=5, ASC=6, DESC=7, COUNT=8, JOIN=9, 
		ON=10, PUNTO=11, MAYORQUE=12, MAYORIGUALQUE=13, IGUALQUE=14, ABREPARENTESIS=15, 
		CIERRAPARENTESIS=16, NUMERO=17, STRING=18, COMA=19, AND=20, OR=21, ID=22, 
		WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "ORDER", "BY", "ASC", "DESC", "COUNT", "JOIN", 
			"ON", "PUNTO", "MAYORQUE", "MAYORIGUALQUE", "IGUALQUE", "ABREPARENTESIS", 
			"CIERRAPARENTESIS", "NUMERO", "STRING", "COMA", "AND", "OR", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'FROM'", "'WHERE'", "'ORDER'", "'BY'", "'ASC'", "'DESC'", 
			"'COUNT'", "'JOIN'", "'ON'", "'.'", "'>'", "'>='", "'='", "'('", "')'", 
			null, null, "','", "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "ORDER", "BY", "ASC", "DESC", "COUNT", 
			"JOIN", "ON", "PUNTO", "MAYORQUE", "MAYORIGUALQUE", "IGUALQUE", "ABREPARENTESIS", 
			"CIERRAPARENTESIS", "NUMERO", "STRING", "COMA", "AND", "OR", "ID", "WS"
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


	public gSqlMiniLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gSqlMiniLexer.g4"; }

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
		"\u0004\u0000\u0017\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010p\b\u0010\u000b"+
		"\u0010\f\u0010q\u0001\u0010\u0001\u0010\u0004\u0010v\b\u0010\u000b\u0010"+
		"\f\u0010w\u0003\u0010z\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011~\b"+
		"\u0011\n\u0011\f\u0011\u0081\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u008f\b\u0015\u000b\u0015"+
		"\f\u0015\u0090\u0001\u0015\u0003\u0015\u0094\b\u0015\u0001\u0016\u0004"+
		"\u0016\u0097\b\u0016\u000b\u0016\f\u0016\u0098\u0001\u0016\u0001\u0016"+
		"\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017\u0001\u0000\u0004\u0001\u000009\u0001\u0000\'\'\u0002\u0000"+
		"AZaz\u0003\u0000\t\n\r\r  \u00a2\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00036\u0001\u0000"+
		"\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007A\u0001\u0000\u0000\u0000"+
		"\tG\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\rN\u0001\u0000"+
		"\u0000\u0000\u000fS\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000"+
		"\u0013^\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017c"+
		"\u0001\u0000\u0000\u0000\u0019e\u0001\u0000\u0000\u0000\u001bh\u0001\u0000"+
		"\u0000\u0000\u001dj\u0001\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000"+
		"!o\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000\u0000%\u0084\u0001\u0000"+
		"\u0000\u0000\'\u0086\u0001\u0000\u0000\u0000)\u008a\u0001\u0000\u0000"+
		"\u0000+\u0093\u0001\u0000\u0000\u0000-\u0096\u0001\u0000\u0000\u0000/"+
		"0\u0005S\u0000\u000001\u0005E\u0000\u000012\u0005L\u0000\u000023\u0005"+
		"E\u0000\u000034\u0005C\u0000\u000045\u0005T\u0000\u00005\u0002\u0001\u0000"+
		"\u0000\u000067\u0005F\u0000\u000078\u0005R\u0000\u000089\u0005O\u0000"+
		"\u00009:\u0005M\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005W\u0000"+
		"\u0000<=\u0005H\u0000\u0000=>\u0005E\u0000\u0000>?\u0005R\u0000\u0000"+
		"?@\u0005E\u0000\u0000@\u0006\u0001\u0000\u0000\u0000AB\u0005O\u0000\u0000"+
		"BC\u0005R\u0000\u0000CD\u0005D\u0000\u0000DE\u0005E\u0000\u0000EF\u0005"+
		"R\u0000\u0000F\b\u0001\u0000\u0000\u0000GH\u0005B\u0000\u0000HI\u0005"+
		"Y\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0005A\u0000\u0000KL\u0005"+
		"S\u0000\u0000LM\u0005C\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0005"+
		"D\u0000\u0000OP\u0005E\u0000\u0000PQ\u0005S\u0000\u0000QR\u0005C\u0000"+
		"\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005C\u0000\u0000TU\u0005O\u0000"+
		"\u0000UV\u0005U\u0000\u0000VW\u0005N\u0000\u0000WX\u0005T\u0000\u0000"+
		"X\u0010\u0001\u0000\u0000\u0000YZ\u0005J\u0000\u0000Z[\u0005O\u0000\u0000"+
		"[\\\u0005I\u0000\u0000\\]\u0005N\u0000\u0000]\u0012\u0001\u0000\u0000"+
		"\u0000^_\u0005O\u0000\u0000_`\u0005N\u0000\u0000`\u0014\u0001\u0000\u0000"+
		"\u0000ab\u0005.\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005>\u0000"+
		"\u0000d\u0018\u0001\u0000\u0000\u0000ef\u0005>\u0000\u0000fg\u0005=\u0000"+
		"\u0000g\u001a\u0001\u0000\u0000\u0000hi\u0005=\u0000\u0000i\u001c\u0001"+
		"\u0000\u0000\u0000jk\u0005(\u0000\u0000k\u001e\u0001\u0000\u0000\u0000"+
		"lm\u0005)\u0000\u0000m \u0001\u0000\u0000\u0000np\u0007\u0000\u0000\u0000"+
		"on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000ry\u0001\u0000\u0000\u0000su\u0005.\u0000"+
		"\u0000tv\u0007\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001"+
		"\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z\"\u0001\u0000\u0000\u0000{\u007f\u0005\'\u0000\u0000|~\b\u0001\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005\'\u0000\u0000\u0083$\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		",\u0000\u0000\u0085&\u0001\u0000\u0000\u0000\u0086\u0087\u0005A\u0000"+
		"\u0000\u0087\u0088\u0005N\u0000\u0000\u0088\u0089\u0005D\u0000\u0000\u0089"+
		"(\u0001\u0000\u0000\u0000\u008a\u008b\u0005O\u0000\u0000\u008b\u008c\u0005"+
		"R\u0000\u0000\u008c*\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0002\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0094\u0005*\u0000\u0000"+
		"\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094,\u0001\u0000\u0000\u0000\u0095\u0097\u0007\u0003\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0006\u0016\u0000\u0000\u009b"+
		".\u0001\u0000\u0000\u0000\b\u0000qwy\u007f\u0090\u0093\u0098\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}