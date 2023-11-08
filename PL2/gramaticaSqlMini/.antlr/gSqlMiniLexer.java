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
		SELECT=1, FROM=2, WHERE=3, ORDER=4, BY=5, ASC=6, DESC=7, MAYORQUE=8, MAYORIGUALQUE=9, 
		IGUALQUE=10, ABREPARENTESIS=11, CIERRAPARENTESIS=12, NUMERO=13, STRING=14, 
		COMA=15, AND=16, OR=17, ID=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "ORDER", "BY", "ASC", "DESC", "MAYORQUE", 
			"MAYORIGUALQUE", "IGUALQUE", "ABREPARENTESIS", "CIERRAPARENTESIS", "NUMERO", 
			"STRING", "COMA", "AND", "OR", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'FROM'", "'WHERE'", "'ORDER'", "'BY'", "'ASC'", "'DESC'", 
			"'>'", "'>='", "'='", "'('", "')'", null, null, "','", "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "ORDER", "BY", "ASC", "DESC", "MAYORQUE", 
			"MAYORIGUALQUE", "IGUALQUE", "ABREPARENTESIS", "CIERRAPARENTESIS", "NUMERO", 
			"STRING", "COMA", "AND", "OR", "ID", "WS"
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
		"\u0004\u0000\u0013\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0004"+
		"\fX\b\f\u000b\f\f\fY\u0001\f\u0001\f\u0004\f^\b\f\u000b\f\f\f_\u0003\f"+
		"b\b\f\u0001\r\u0001\r\u0005\rf\b\r\n\r\f\ri\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011w\b\u0011\u000b"+
		"\u0011\f\u0011x\u0001\u0011\u0003\u0011|\b\u0011\u0001\u0012\u0004\u0012"+
		"\u007f\b\u0012\u000b\u0012\f\u0012\u0080\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0004"+
		"\u0001\u000009\u0001\u0000\'\'\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u008a"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000"+
		"\u00053\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t?\u0001"+
		"\u0000\u0000\u0000\u000bB\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000"+
		"\u0000\u000fK\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013"+
		"P\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017T\u0001"+
		"\u0000\u0000\u0000\u0019W\u0001\u0000\u0000\u0000\u001bc\u0001\u0000\u0000"+
		"\u0000\u001dl\u0001\u0000\u0000\u0000\u001fn\u0001\u0000\u0000\u0000!"+
		"r\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000\u0000%~\u0001\u0000\u0000"+
		"\u0000\'(\u0005S\u0000\u0000()\u0005E\u0000\u0000)*\u0005L\u0000\u0000"+
		"*+\u0005E\u0000\u0000+,\u0005C\u0000\u0000,-\u0005T\u0000\u0000-\u0002"+
		"\u0001\u0000\u0000\u0000./\u0005F\u0000\u0000/0\u0005R\u0000\u000001\u0005"+
		"O\u0000\u000012\u0005M\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005"+
		"W\u0000\u000045\u0005H\u0000\u000056\u0005E\u0000\u000067\u0005R\u0000"+
		"\u000078\u0005E\u0000\u00008\u0006\u0001\u0000\u0000\u00009:\u0005O\u0000"+
		"\u0000:;\u0005R\u0000\u0000;<\u0005D\u0000\u0000<=\u0005E\u0000\u0000"+
		"=>\u0005R\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005B\u0000\u0000"+
		"@A\u0005Y\u0000\u0000A\n\u0001\u0000\u0000\u0000BC\u0005A\u0000\u0000"+
		"CD\u0005S\u0000\u0000DE\u0005C\u0000\u0000E\f\u0001\u0000\u0000\u0000"+
		"FG\u0005D\u0000\u0000GH\u0005E\u0000\u0000HI\u0005S\u0000\u0000IJ\u0005"+
		"C\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005>\u0000\u0000L\u0010"+
		"\u0001\u0000\u0000\u0000MN\u0005>\u0000\u0000NO\u0005=\u0000\u0000O\u0012"+
		"\u0001\u0000\u0000\u0000PQ\u0005=\u0000\u0000Q\u0014\u0001\u0000\u0000"+
		"\u0000RS\u0005(\u0000\u0000S\u0016\u0001\u0000\u0000\u0000TU\u0005)\u0000"+
		"\u0000U\u0018\u0001\u0000\u0000\u0000VX\u0007\u0000\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Za\u0001\u0000\u0000\u0000[]\u0005.\u0000\u0000"+
		"\\^\u0007\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000a[\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u001a"+
		"\u0001\u0000\u0000\u0000cg\u0005\'\u0000\u0000df\b\u0001\u0000\u0000e"+
		"d\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000jk\u0005\'\u0000\u0000k\u001c\u0001\u0000\u0000\u0000lm\u0005"+
		",\u0000\u0000m\u001e\u0001\u0000\u0000\u0000no\u0005A\u0000\u0000op\u0005"+
		"N\u0000\u0000pq\u0005D\u0000\u0000q \u0001\u0000\u0000\u0000rs\u0005O"+
		"\u0000\u0000st\u0005R\u0000\u0000t\"\u0001\u0000\u0000\u0000uw\u0007\u0002"+
		"\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"z|\u0005*\u0000\u0000{v\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|$\u0001\u0000\u0000\u0000}\u007f\u0007\u0003\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0006\u0012\u0000\u0000\u0083&\u0001\u0000\u0000\u0000"+
		"\b\u0000Y_agx{\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}