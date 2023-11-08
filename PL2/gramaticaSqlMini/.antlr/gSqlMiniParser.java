// Generated from c:/Users/david/OneDrive - Universidad de Alcala/Mi unidad/UNI/Cuarto/Compiladores/LAB/Compiladores/PL2/gramaticaSqlMini/gSqlMiniParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gSqlMiniParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, ORDER=4, BY=5, ASC=6, DESC=7, MAYORQUE=8, MAYORIGUALQUE=9, 
		IGUALQUE=10, ABREPARENTESIS=11, CIERRAPARENTESIS=12, NUMERO=13, STRING=14, 
		COMA=15, AND=16, OR=17, ID=18, WS=19;
	public static final int
		RULE_programa = 0, RULE_consultaSelect = 1, RULE_columnas = 2, RULE_nombreColumna = 3, 
		RULE_nombreTabla = 4, RULE_sentenciaWhere = 5, RULE_sentenciaOrderBy = 6, 
		RULE_metodoOrdenacion = 7, RULE_expresion = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "consultaSelect", "columnas", "nombreColumna", "nombreTabla", 
			"sentenciaWhere", "sentenciaOrderBy", "metodoOrdenacion", "expresion"
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

	@Override
	public String getGrammarFileName() { return "gSqlMiniParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gSqlMiniParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<ConsultaSelectContext> consultaSelect() {
			return getRuleContexts(ConsultaSelectContext.class);
		}
		public ConsultaSelectContext consultaSelect(int i) {
			return getRuleContext(ConsultaSelectContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(18);
				consultaSelect();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsultaSelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(gSqlMiniParser.SELECT, 0); }
		public ColumnasContext columnas() {
			return getRuleContext(ColumnasContext.class,0);
		}
		public TerminalNode FROM() { return getToken(gSqlMiniParser.FROM, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public SentenciaWhereContext sentenciaWhere() {
			return getRuleContext(SentenciaWhereContext.class,0);
		}
		public SentenciaOrderByContext sentenciaOrderBy() {
			return getRuleContext(SentenciaOrderByContext.class,0);
		}
		public ConsultaSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consultaSelect; }
	}

	public final ConsultaSelectContext consultaSelect() throws RecognitionException {
		ConsultaSelectContext _localctx = new ConsultaSelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_consultaSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(SELECT);
			setState(25);
			columnas();
			setState(26);
			match(FROM);
			setState(27);
			nombreTabla();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(28);
				sentenciaWhere();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(31);
				sentenciaOrderBy();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnasContext extends ParserRuleContext {
		public List<NombreColumnaContext> nombreColumna() {
			return getRuleContexts(NombreColumnaContext.class);
		}
		public NombreColumnaContext nombreColumna(int i) {
			return getRuleContext(NombreColumnaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(gSqlMiniParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(gSqlMiniParser.COMA, i);
		}
		public ColumnasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnas; }
	}

	public final ColumnasContext columnas() throws RecognitionException {
		ColumnasContext _localctx = new ColumnasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_columnas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			nombreColumna();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(35);
				match(COMA);
				setState(36);
				nombreColumna();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NombreColumnaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gSqlMiniParser.ID, 0); }
		public NombreColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreColumna; }
	}

	public final NombreColumnaContext nombreColumna() throws RecognitionException {
		NombreColumnaContext _localctx = new NombreColumnaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nombreColumna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NombreTablaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gSqlMiniParser.ID, 0); }
		public NombreTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreTabla; }
	}

	public final NombreTablaContext nombreTabla() throws RecognitionException {
		NombreTablaContext _localctx = new NombreTablaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nombreTabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaWhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(gSqlMiniParser.WHERE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SentenciaWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaWhere; }
	}

	public final SentenciaWhereContext sentenciaWhere() throws RecognitionException {
		SentenciaWhereContext _localctx = new SentenciaWhereContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentenciaWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(WHERE);
			setState(47);
			expresion(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaOrderByContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(gSqlMiniParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(gSqlMiniParser.BY, 0); }
		public NombreColumnaContext nombreColumna() {
			return getRuleContext(NombreColumnaContext.class,0);
		}
		public MetodoOrdenacionContext metodoOrdenacion() {
			return getRuleContext(MetodoOrdenacionContext.class,0);
		}
		public SentenciaOrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaOrderBy; }
	}

	public final SentenciaOrderByContext sentenciaOrderBy() throws RecognitionException {
		SentenciaOrderByContext _localctx = new SentenciaOrderByContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentenciaOrderBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ORDER);
			setState(50);
			match(BY);
			setState(51);
			nombreColumna();
			setState(52);
			metodoOrdenacion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MetodoOrdenacionContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(gSqlMiniParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(gSqlMiniParser.DESC, 0); }
		public MetodoOrdenacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoOrdenacion; }
	}

	public final MetodoOrdenacionContext metodoOrdenacion() throws RecognitionException {
		MetodoOrdenacionContext _localctx = new MetodoOrdenacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_metodoOrdenacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode ABREPARENTESIS() { return getToken(gSqlMiniParser.ABREPARENTESIS, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(gSqlMiniParser.CIERRAPARENTESIS, 0); }
		public NombreColumnaContext nombreColumna() {
			return getRuleContext(NombreColumnaContext.class,0);
		}
		public TerminalNode IGUALQUE() { return getToken(gSqlMiniParser.IGUALQUE, 0); }
		public TerminalNode NUMERO() { return getToken(gSqlMiniParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(gSqlMiniParser.STRING, 0); }
		public TerminalNode MAYORQUE() { return getToken(gSqlMiniParser.MAYORQUE, 0); }
		public TerminalNode MAYORIGUALQUE() { return getToken(gSqlMiniParser.MAYORIGUALQUE, 0); }
		public TerminalNode AND() { return getToken(gSqlMiniParser.AND, 0); }
		public TerminalNode OR() { return getToken(gSqlMiniParser.OR, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(57);
				match(ABREPARENTESIS);
				setState(58);
				expresion(0);
				setState(59);
				match(CIERRAPARENTESIS);
				}
				break;
			case 2:
				{
				setState(61);
				nombreColumna();
				setState(62);
				match(IGUALQUE);
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(65);
				nombreColumna();
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==MAYORQUE || _la==MAYORIGUALQUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				match(NUMERO);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(71);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(72);
						match(AND);
						setState(73);
						expresion(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(74);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(75);
						match(OR);
						setState(76);
						expresion(4);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 8:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013S\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001e\b\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bF\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bN\b\b\n\b\f\bQ\t\b\u0001"+
		"\b\u0000\u0001\u0010\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0003\u0001\u0000\u0006\u0007\u0001\u0000\r\u000e\u0001\u0000\b\tQ\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004"+
		"\"\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b,\u0001\u0000"+
		"\u0000\u0000\n.\u0001\u0000\u0000\u0000\f1\u0001\u0000\u0000\u0000\u000e"+
		"6\u0001\u0000\u0000\u0000\u0010E\u0001\u0000\u0000\u0000\u0012\u0014\u0003"+
		"\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a\u0003"+
		"\u0004\u0002\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b\u001d\u0003"+
		"\b\u0004\u0000\u001c\u001e\u0003\n\u0005\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000"+
		"\u0000\u001f!\u0003\f\u0006\u0000 \u001f\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"\'\u0003\u0006\u0003"+
		"\u0000#$\u0005\u000f\u0000\u0000$&\u0003\u0006\u0003\u0000%#\u0001\u0000"+
		"\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000*+\u0005\u0012\u0000\u0000+\u0007\u0001\u0000\u0000\u0000,-\u0005"+
		"\u0012\u0000\u0000-\t\u0001\u0000\u0000\u0000./\u0005\u0003\u0000\u0000"+
		"/0\u0003\u0010\b\u00000\u000b\u0001\u0000\u0000\u000012\u0005\u0004\u0000"+
		"\u000023\u0005\u0005\u0000\u000034\u0003\u0006\u0003\u000045\u0003\u000e"+
		"\u0007\u00005\r\u0001\u0000\u0000\u000067\u0007\u0000\u0000\u00007\u000f"+
		"\u0001\u0000\u0000\u000089\u0006\b\uffff\uffff\u00009:\u0005\u000b\u0000"+
		"\u0000:;\u0003\u0010\b\u0000;<\u0005\f\u0000\u0000<F\u0001\u0000\u0000"+
		"\u0000=>\u0003\u0006\u0003\u0000>?\u0005\n\u0000\u0000?@\u0007\u0001\u0000"+
		"\u0000@F\u0001\u0000\u0000\u0000AB\u0003\u0006\u0003\u0000BC\u0007\u0002"+
		"\u0000\u0000CD\u0005\r\u0000\u0000DF\u0001\u0000\u0000\u0000E8\u0001\u0000"+
		"\u0000\u0000E=\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000FO\u0001"+
		"\u0000\u0000\u0000GH\n\u0004\u0000\u0000HI\u0005\u0010\u0000\u0000IN\u0003"+
		"\u0010\b\u0005JK\n\u0003\u0000\u0000KL\u0005\u0011\u0000\u0000LN\u0003"+
		"\u0010\b\u0004MG\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"P\u0011\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000\u0007\u0015"+
		"\u001d \'EMO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}