package PL3;
// Generated from LinguineParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LinguineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASINGACION=1, IF=2, THEN=3, ELSE=4, FUNCION=5, SHOW=6, MATCH=7, WITH=8, 
		FOR=9, WHILE=10, DEFAULT=11, FLECHA=12, STRING=13, OR=14, IDENTIFICADOR=15, 
		IGUAL=16, MAYORQUE=17, MENORQUE=18, MAYORIGUALQUE=19, MENORIGUALQUE=20, 
		IGUALQUE=21, TRUE=22, FALSE=23, SUMA=24, RESTA=25, MULTIPLICACION=26, 
		DIVISION=27, ABREPARENTESIS=28, CIERRAPARENTESIS=29, ENTERO=30, COMA=31, 
		PUNTOYCOMA=32, INTRO=33, ESPACIO=34;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_saltoInstruccion = 2, RULE_asignacion = 3, 
		RULE_condicional = 4, RULE_bloqueThen = 5, RULE_bloqueElse = 6, RULE_sentenciaElseIf = 7, 
		RULE_declaracionFuncion = 8, RULE_llamadaFuncion = 9, RULE_match = 10, 
		RULE_sentenciaWhile = 11, RULE_sentenciaFor = 12, RULE_parametros = 13, 
		RULE_show = 14, RULE_expresion = 15, RULE_booleano = 16, RULE_operador = 17, 
		RULE_operando = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "saltoInstruccion", "asignacion", "condicional", 
			"bloqueThen", "bloqueElse", "sentenciaElseIf", "declaracionFuncion", 
			"llamadaFuncion", "match", "sentenciaWhile", "sentenciaFor", "parametros", 
			"show", "expresion", "booleano", "operador", "operando"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'if'", "'then'", "'else'", "'fun'", "'show'", "'match'", 
			"'with'", "'for'", "'while'", "'?'", "'->'", null, "'|'", null, "'='", 
			"'>'", "'<'", "'>='", "'<='", "'=='", "'true'", "'false'", "'+'", "'-'", 
			"'*'", "'/'", "'('", "')'", null, "','", "';'", "'\\r\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASINGACION", "IF", "THEN", "ELSE", "FUNCION", "SHOW", "MATCH", 
			"WITH", "FOR", "WHILE", "DEFAULT", "FLECHA", "STRING", "OR", "IDENTIFICADOR", 
			"IGUAL", "MAYORQUE", "MENORQUE", "MAYORIGUALQUE", "MENORIGUALQUE", "IGUALQUE", 
			"TRUE", "FALSE", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "ABREPARENTESIS", 
			"CIERRAPARENTESIS", "ENTERO", "COMA", "PUNTOYCOMA", "INTRO", "ESPACIO"
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
	public String getGrammarFileName() { return "LinguineParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<TerminalNode> PUNTOYCOMA() { return getTokens(LinguineParser.PUNTOYCOMA); }
		public TerminalNode PUNTOYCOMA(int i) {
			return getToken(LinguineParser.PUNTOYCOMA, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34534L) != 0)) {
				{
				{
				setState(38);
				instruccion();
				setState(39);
				match(PUNTOYCOMA);
				}
				}
				setState(45);
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
	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public SentenciaWhileContext sentenciaWhile() {
			return getRuleContext(SentenciaWhileContext.class,0);
		}
		public SentenciaForContext sentenciaFor() {
			return getRuleContext(SentenciaForContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASINGACION:
				{
				setState(46);
				asignacion();
				}
				break;
			case IF:
				{
				setState(47);
				condicional();
				}
				break;
			case FUNCION:
				{
				setState(48);
				declaracionFuncion();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(49);
				llamadaFuncion();
				}
				break;
			case SHOW:
				{
				setState(50);
				show();
				}
				break;
			case MATCH:
				{
				setState(51);
				match();
				}
				break;
			case WHILE:
				{
				setState(52);
				sentenciaWhile();
				}
				break;
			case FOR:
				{
				setState(53);
				sentenciaFor();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SaltoInstruccionContext extends ParserRuleContext {
		public TerminalNode INTRO() { return getToken(LinguineParser.INTRO, 0); }
		public SaltoInstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saltoInstruccion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitSaltoInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaltoInstruccionContext saltoInstruccion() throws RecognitionException {
		SaltoInstruccionContext _localctx = new SaltoInstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_saltoInstruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(INTRO);
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ASINGACION() { return getToken(LinguineParser.ASINGACION, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LinguineParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(LinguineParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(LinguineParser.ENTERO, 0); }
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ASINGACION);
			setState(59);
			match(IDENTIFICADOR);
			setState(60);
			match(IGUAL);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(61);
				expresion();
				}
				break;
			case 2:
				{
				setState(62);
				llamadaFuncion();
				}
				break;
			case 3:
				{
				setState(63);
				match(ENTERO);
				}
				break;
			case 4:
				{
				setState(64);
				match(STRING);
				}
				break;
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
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LinguineParser.IF, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public BloqueThenContext bloqueThen() {
			return getRuleContext(BloqueThenContext.class,0);
		}
		public BloqueElseContext bloqueElse() {
			return getRuleContext(BloqueElseContext.class,0);
		}
		public SentenciaElseIfContext sentenciaElseIf() {
			return getRuleContext(SentenciaElseIfContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IF);
			setState(68);
			match(ABREPARENTESIS);
			setState(69);
			booleano();
			setState(70);
			match(CIERRAPARENTESIS);
			setState(71);
			bloqueThen();
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(72);
				sentenciaElseIf();
				}
				break;
			}
			setState(75);
			bloqueElse();
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
	public static class BloqueThenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(LinguineParser.THEN, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueThen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitBloqueThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueThenContext bloqueThen() throws RecognitionException {
		BloqueThenContext _localctx = new BloqueThenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloqueThen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(THEN);
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASINGACION:
			case IF:
			case FUNCION:
			case SHOW:
			case MATCH:
			case FOR:
			case WHILE:
			case IDENTIFICADOR:
				{
				setState(78);
				instruccion();
				}
				break;
			case STRING:
			case ENTERO:
				{
				setState(79);
				expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class BloqueElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LinguineParser.ELSE, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitBloqueElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueElseContext bloqueElse() throws RecognitionException {
		BloqueElseContext _localctx = new BloqueElseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloqueElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ELSE);
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASINGACION:
			case IF:
			case FUNCION:
			case SHOW:
			case MATCH:
			case FOR:
			case WHILE:
			case IDENTIFICADOR:
				{
				setState(83);
				instruccion();
				}
				break;
			case STRING:
			case ENTERO:
				{
				setState(84);
				expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SentenciaElseIfContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LinguineParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(LinguineParser.IF, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public BloqueThenContext bloqueThen() {
			return getRuleContext(BloqueThenContext.class,0);
		}
		public SentenciaElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaElseIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitSentenciaElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaElseIfContext sentenciaElseIf() throws RecognitionException {
		SentenciaElseIfContext _localctx = new SentenciaElseIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentenciaElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ELSE);
			setState(88);
			match(IF);
			setState(89);
			match(ABREPARENTESIS);
			setState(90);
			expresion();
			setState(91);
			match(CIERRAPARENTESIS);
			setState(92);
			bloqueThen();
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
	public static class DeclaracionFuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(LinguineParser.FUNCION, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LinguineParser.IDENTIFICADOR, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public TerminalNode FLECHA() { return getToken(LinguineParser.FLECHA, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public DeclaracionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitDeclaracionFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionFuncionContext declaracionFuncion() throws RecognitionException {
		DeclaracionFuncionContext _localctx = new DeclaracionFuncionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(FUNCION);
			setState(95);
			match(IDENTIFICADOR);
			setState(96);
			match(ABREPARENTESIS);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==ENTERO) {
				{
				setState(97);
				parametros();
				}
			}

			setState(100);
			match(CIERRAPARENTESIS);
			setState(101);
			match(FLECHA);
			setState(102);
			instruccion();
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
	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LinguineParser.IDENTIFICADOR, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFICADOR);
			setState(105);
			match(ABREPARENTESIS);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==ENTERO) {
				{
				setState(106);
				parametros();
				}
			}

			setState(109);
			match(CIERRAPARENTESIS);
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
	public static class MatchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(LinguineParser.MATCH, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LinguineParser.IDENTIFICADOR, 0); }
		public TerminalNode WITH() { return getToken(LinguineParser.WITH, 0); }
		public List<TerminalNode> OR() { return getTokens(LinguineParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LinguineParser.OR, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public List<TerminalNode> FLECHA() { return getTokens(LinguineParser.FLECHA); }
		public TerminalNode FLECHA(int i) {
			return getToken(LinguineParser.FLECHA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(LinguineParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LinguineParser.STRING, i);
		}
		public TerminalNode DEFAULT() { return getToken(LinguineParser.DEFAULT, 0); }
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(MATCH);
			setState(112);
			match(IDENTIFICADOR);
			setState(113);
			match(WITH);
			setState(114);
			match(OR);
			setState(115);
			match(ENTERO);
			setState(116);
			match(FLECHA);
			setState(117);
			match(STRING);
			setState(118);
			match(OR);
			setState(119);
			match(ENTERO);
			setState(120);
			match(FLECHA);
			setState(121);
			match(STRING);
			setState(122);
			match(OR);
			setState(123);
			match(DEFAULT);
			setState(124);
			match(FLECHA);
			setState(125);
			match(STRING);
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
	public static class SentenciaWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LinguineParser.WHILE, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public SentenciaWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaWhile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitSentenciaWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaWhileContext sentenciaWhile() throws RecognitionException {
		SentenciaWhileContext _localctx = new SentenciaWhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentenciaWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(WHILE);
			setState(128);
			match(ABREPARENTESIS);
			setState(129);
			booleano();
			setState(130);
			match(CIERRAPARENTESIS);
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
	public static class SentenciaForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LinguineParser.FOR, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public SentenciaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaFor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitSentenciaFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaForContext sentenciaFor() throws RecognitionException {
		SentenciaForContext _localctx = new SentenciaForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentenciaFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(FOR);
			setState(133);
			match(ABREPARENTESIS);
			setState(134);
			match(CIERRAPARENTESIS);
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(LinguineParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LinguineParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(136);
				operando();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(137);
					match(COMA);
					setState(138);
					operando();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(144);
				expresion();
				}
				break;
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
	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(LinguineParser.SHOW, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SHOW);
			setState(148);
			match(ABREPARENTESIS);
			setState(149);
			instruccion();
			setState(150);
			match(CIERRAPARENTESIS);
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
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public TerminalNode DIVISION() { return getToken(LinguineParser.DIVISION, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(LinguineParser.MULTIPLICACION, 0); }
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public TerminalNode SUMA() { return getToken(LinguineParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(LinguineParser.RESTA, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expresion);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(ENTERO);
				setState(153);
				match(DIVISION);
				setState(154);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ENTERO);
				setState(156);
				match(MULTIPLICACION);
				setState(157);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(STRING);
				setState(159);
				match(MULTIPLICACION);
				setState(160);
				match(ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(ENTERO);
				setState(162);
				match(SUMA);
				setState(163);
				match(ENTERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(ENTERO);
				setState(165);
				match(RESTA);
				setState(166);
				match(ENTERO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(STRING);
				setState(168);
				match(SUMA);
				setState(169);
				match(ENTERO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LinguineParser.IDENTIFICADOR, 0); }
		public TerminalNode MAYORQUE() { return getToken(LinguineParser.MAYORQUE, 0); }
		public TerminalNode ENTERO() { return getToken(LinguineParser.ENTERO, 0); }
		public TerminalNode MAYORIGUALQUE() { return getToken(LinguineParser.MAYORIGUALQUE, 0); }
		public TerminalNode MENORIGUALQUE() { return getToken(LinguineParser.MENORIGUALQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(LinguineParser.MENORQUE, 0); }
		public TerminalNode IGUALQUE() { return getToken(LinguineParser.IGUALQUE, 0); }
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(LinguineParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LinguineParser.FALSE, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleano);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(IDENTIFICADOR);
				setState(173);
				match(MAYORQUE);
				setState(174);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(IDENTIFICADOR);
				setState(176);
				match(MAYORIGUALQUE);
				setState(177);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(IDENTIFICADOR);
				setState(179);
				match(MENORIGUALQUE);
				setState(180);
				match(ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(IDENTIFICADOR);
				setState(182);
				match(MENORQUE);
				setState(183);
				match(ENTERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(IDENTIFICADOR);
				setState(185);
				match(IGUALQUE);
				setState(186);
				match(ENTERO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				match(IDENTIFICADOR);
				setState(188);
				match(IGUALQUE);
				setState(189);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				match(FALSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(LinguineParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(LinguineParser.RESTA, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(LinguineParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(LinguineParser.DIVISION, 0); }
		public TerminalNode MAYORQUE() { return getToken(LinguineParser.MAYORQUE, 0); }
		public TerminalNode MENORIGUALQUE() { return getToken(LinguineParser.MENORIGUALQUE, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 252837888L) != 0)) ) {
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
	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public TerminalNode ENTERO() { return getToken(LinguineParser.ENTERO, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitOperando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ENTERO) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\"\u00c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"Q\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\tl\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u008c\b\r\n\r\f\r\u008f\t\r\u0001\r\u0003\r"+
		"\u0092\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00ab\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c1\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000"+
		"\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$\u0000\u0002\u0003\u0000\u0011\u0011\u0014\u0014"+
		"\u0018\u001b\u0002\u0000\r\r\u001e\u001e\u00d1\u0000+\u0001\u0000\u0000"+
		"\u0000\u00026\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006"+
		":\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000"+
		"\u0000\fR\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000\u0010"+
		"^\u0001\u0000\u0000\u0000\u0012h\u0001\u0000\u0000\u0000\u0014o\u0001"+
		"\u0000\u0000\u0000\u0016\u007f\u0001\u0000\u0000\u0000\u0018\u0084\u0001"+
		"\u0000\u0000\u0000\u001a\u0091\u0001\u0000\u0000\u0000\u001c\u0093\u0001"+
		"\u0000\u0000\u0000\u001e\u00aa\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000"+
		"\u0000\u0000\"\u00c2\u0001\u0000\u0000\u0000$\u00c4\u0001\u0000\u0000"+
		"\u0000&\'\u0003\u0002\u0001\u0000\'(\u0005 \u0000\u0000(*\u0001\u0000"+
		"\u0000\u0000)&\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0001\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000.7\u0003\u0006\u0003\u0000/7\u0003\b\u0004"+
		"\u000007\u0003\u0010\b\u000017\u0003\u0012\t\u000027\u0003\u001c\u000e"+
		"\u000037\u0003\u0014\n\u000047\u0003\u0016\u000b\u000057\u0003\u0018\f"+
		"\u00006.\u0001\u0000\u0000\u00006/\u0001\u0000\u0000\u000060\u0001\u0000"+
		"\u0000\u000061\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u000063\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"7\u0003\u0001\u0000\u0000\u000089\u0005!\u0000\u00009\u0005\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0001\u0000\u0000;<\u0005\u000f\u0000\u0000<A\u0005"+
		"\u0010\u0000\u0000=B\u0003\u001e\u000f\u0000>B\u0003\u0012\t\u0000?B\u0005"+
		"\u001e\u0000\u0000@B\u0005\r\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"B\u0007\u0001\u0000\u0000\u0000CD\u0005\u0002\u0000\u0000DE\u0005\u001c"+
		"\u0000\u0000EF\u0003 \u0010\u0000FG\u0005\u001d\u0000\u0000GI\u0003\n"+
		"\u0005\u0000HJ\u0003\u000e\u0007\u0000IH\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0003\f\u0006\u0000L\t"+
		"\u0001\u0000\u0000\u0000MP\u0005\u0003\u0000\u0000NQ\u0003\u0002\u0001"+
		"\u0000OQ\u0003\u001e\u000f\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\u000b\u0001\u0000\u0000\u0000RU\u0005\u0004\u0000\u0000"+
		"SV\u0003\u0002\u0001\u0000TV\u0003\u001e\u000f\u0000US\u0001\u0000\u0000"+
		"\u0000UT\u0001\u0000\u0000\u0000V\r\u0001\u0000\u0000\u0000WX\u0005\u0004"+
		"\u0000\u0000XY\u0005\u0002\u0000\u0000YZ\u0005\u001c\u0000\u0000Z[\u0003"+
		"\u001e\u000f\u0000[\\\u0005\u001d\u0000\u0000\\]\u0003\n\u0005\u0000]"+
		"\u000f\u0001\u0000\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0005\u000f"+
		"\u0000\u0000`b\u0005\u001c\u0000\u0000ac\u0003\u001a\r\u0000ba\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005"+
		"\u001d\u0000\u0000ef\u0005\f\u0000\u0000fg\u0003\u0002\u0001\u0000g\u0011"+
		"\u0001\u0000\u0000\u0000hi\u0005\u000f\u0000\u0000ik\u0005\u001c\u0000"+
		"\u0000jl\u0003\u001a\r\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0005\u001d\u0000\u0000n\u0013\u0001"+
		"\u0000\u0000\u0000op\u0005\u0007\u0000\u0000pq\u0005\u000f\u0000\u0000"+
		"qr\u0005\b\u0000\u0000rs\u0005\u000e\u0000\u0000st\u0005\u001e\u0000\u0000"+
		"tu\u0005\f\u0000\u0000uv\u0005\r\u0000\u0000vw\u0005\u000e\u0000\u0000"+
		"wx\u0005\u001e\u0000\u0000xy\u0005\f\u0000\u0000yz\u0005\r\u0000\u0000"+
		"z{\u0005\u000e\u0000\u0000{|\u0005\u000b\u0000\u0000|}\u0005\f\u0000\u0000"+
		"}~\u0005\r\u0000\u0000~\u0015\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"\n\u0000\u0000\u0080\u0081\u0005\u001c\u0000\u0000\u0081\u0082\u0003 "+
		"\u0010\u0000\u0082\u0083\u0005\u001d\u0000\u0000\u0083\u0017\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005\t\u0000\u0000\u0085\u0086\u0005\u001c\u0000"+
		"\u0000\u0086\u0087\u0005\u001d\u0000\u0000\u0087\u0019\u0001\u0000\u0000"+
		"\u0000\u0088\u008d\u0003$\u0012\u0000\u0089\u008a\u0005\u001f\u0000\u0000"+
		"\u008a\u008c\u0003$\u0012\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u0092\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0003\u001e\u000f\u0000\u0091"+
		"\u0088\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u001b\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0006\u0000\u0000\u0094"+
		"\u0095\u0005\u001c\u0000\u0000\u0095\u0096\u0003\u0002\u0001\u0000\u0096"+
		"\u0097\u0005\u001d\u0000\u0000\u0097\u001d\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\u001e\u0000\u0000\u0099\u009a\u0005\u001b\u0000\u0000\u009a"+
		"\u00ab\u0005\u001e\u0000\u0000\u009b\u009c\u0005\u001e\u0000\u0000\u009c"+
		"\u009d\u0005\u001a\u0000\u0000\u009d\u00ab\u0005\u001e\u0000\u0000\u009e"+
		"\u009f\u0005\r\u0000\u0000\u009f\u00a0\u0005\u001a\u0000\u0000\u00a0\u00ab"+
		"\u0005\u001e\u0000\u0000\u00a1\u00a2\u0005\u001e\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0018\u0000\u0000\u00a3\u00ab\u0005\u001e\u0000\u0000\u00a4\u00a5"+
		"\u0005\u001e\u0000\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6\u00ab"+
		"\u0005\u001e\u0000\u0000\u00a7\u00a8\u0005\r\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0018\u0000\u0000\u00a9\u00ab\u0005\u001e\u0000\u0000\u00aa\u0098\u0001"+
		"\u0000\u0000\u0000\u00aa\u009b\u0001\u0000\u0000\u0000\u00aa\u009e\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a1\u0001\u0000\u0000\u0000\u00aa\u00a4\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00ab\u001f\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u000f\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0011\u0000\u0000\u00ae\u00c1\u0005\u001e\u0000\u0000\u00af\u00b0\u0005"+
		"\u000f\u0000\u0000\u00b0\u00b1\u0005\u0013\u0000\u0000\u00b1\u00c1\u0005"+
		"\u001e\u0000\u0000\u00b2\u00b3\u0005\u000f\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0014\u0000\u0000\u00b4\u00c1\u0005\u001e\u0000\u0000\u00b5\u00b6\u0005"+
		"\u000f\u0000\u0000\u00b6\u00b7\u0005\u0012\u0000\u0000\u00b7\u00c1\u0005"+
		"\u001e\u0000\u0000\u00b8\u00b9\u0005\u000f\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0015\u0000\u0000\u00ba\u00c1\u0005\u001e\u0000\u0000\u00bb\u00bc\u0005"+
		"\u000f\u0000\u0000\u00bc\u00bd\u0005\u0015\u0000\u0000\u00bd\u00c1\u0005"+
		"\r\u0000\u0000\u00be\u00c1\u0005\u0016\u0000\u0000\u00bf\u00c1\u0005\u0017"+
		"\u0000\u0000\u00c0\u00ac\u0001\u0000\u0000\u0000\u00c0\u00af\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b2\u0001\u0000\u0000\u0000\u00c0\u00b5\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2\u00c3\u0007\u0000\u0000"+
		"\u0000\u00c3#\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007\u0001\u0000\u0000"+
		"\u00c5%\u0001\u0000\u0000\u0000\f+6AIPUbk\u008d\u0091\u00aa\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}