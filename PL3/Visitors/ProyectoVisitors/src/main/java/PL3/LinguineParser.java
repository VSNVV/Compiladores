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
		RULE_condicional = 4, RULE_sentenciaElseIf = 5, RULE_sentenciaThen = 6, 
		RULE_sentenciaElse = 7, RULE_declaracionFuncion = 8, RULE_llamadaFuncion = 9, 
		RULE_match = 10, RULE_sentenciaWhile = 11, RULE_sentenciaFor = 12, RULE_parametros = 13, 
		RULE_show = 14, RULE_expresion = 15, RULE_booleano = 16, RULE_operador = 17, 
		RULE_operando = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "saltoInstruccion", "asignacion", "condicional", 
			"sentenciaElseIf", "sentenciaThen", "sentenciaElse", "declaracionFuncion", 
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34534L) != 0)) {
				{
				{
				setState(38);
				instruccion();
				}
				}
				setState(43);
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
		public TerminalNode PUNTOYCOMA() { return getToken(LinguineParser.PUNTOYCOMA, 0); }
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASINGACION:
				{
				setState(44);
				asignacion();
				}
				break;
			case IF:
				{
				setState(45);
				condicional();
				}
				break;
			case FUNCION:
				{
				setState(46);
				declaracionFuncion();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(47);
				llamadaFuncion();
				}
				break;
			case SHOW:
				{
				setState(48);
				show();
				}
				break;
			case MATCH:
				{
				setState(49);
				match();
				}
				break;
			case WHILE:
				{
				setState(50);
				sentenciaWhile();
				}
				break;
			case FOR:
				{
				setState(51);
				sentenciaFor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(54);
			match(PUNTOYCOMA);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public SentenciaThenContext sentenciaThen() {
			return getRuleContext(SentenciaThenContext.class,0);
		}
		public SentenciaElseIfContext sentenciaElseIf() {
			return getRuleContext(SentenciaElseIfContext.class,0);
		}
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IF);
			setState(68);
			match(ABREPARENTESIS);
			setState(69);
			expresion();
			setState(70);
			match(CIERRAPARENTESIS);
			setState(71);
			sentenciaThen();
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
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(75);
				sentenciaElse();
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
	public static class SentenciaElseIfContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LinguineParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(LinguineParser.IF, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public SentenciaThenContext sentenciaThen() {
			return getRuleContext(SentenciaThenContext.class,0);
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
		enterRule(_localctx, 10, RULE_sentenciaElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ELSE);
			setState(79);
			match(IF);
			setState(80);
			match(ABREPARENTESIS);
			setState(81);
			expresion();
			setState(82);
			match(CIERRAPARENTESIS);
			setState(83);
			sentenciaThen();
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
	public static class SentenciaThenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(LinguineParser.THEN, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<TerminalNode> ABREPARENTESIS() { return getTokens(LinguineParser.ABREPARENTESIS); }
		public TerminalNode ABREPARENTESIS(int i) {
			return getToken(LinguineParser.ABREPARENTESIS, i);
		}
		public List<TerminalNode> CIERRAPARENTESIS() { return getTokens(LinguineParser.CIERRAPARENTESIS); }
		public TerminalNode CIERRAPARENTESIS(int i) {
			return getToken(LinguineParser.CIERRAPARENTESIS, i);
		}
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public SentenciaThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaThen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitSentenciaThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaThenContext sentenciaThen() throws RecognitionException {
		SentenciaThenContext _localctx = new SentenciaThenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentenciaThen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(THEN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABREPARENTESIS) {
				{
				setState(86);
				match(ABREPARENTESIS);
				}
			}

			setState(89);
			instruccion();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CIERRAPARENTESIS) {
				{
				setState(90);
				match(CIERRAPARENTESIS);
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 252837888L) != 0)) {
				{
				{
				setState(93);
				operador();
				setState(94);
				match(ABREPARENTESIS);
				setState(95);
				instruccion();
				setState(96);
				match(CIERRAPARENTESIS);
				}
				}
				setState(102);
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
	public static class SentenciaElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LinguineParser.ELSE, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public SentenciaElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitSentenciaElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaElseContext sentenciaElse() throws RecognitionException {
		SentenciaElseContext _localctx = new SentenciaElseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentenciaElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ELSE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABREPARENTESIS) {
				{
				setState(104);
				match(ABREPARENTESIS);
				}
			}

			setState(107);
			instruccion();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CIERRAPARENTESIS) {
				{
				setState(108);
				match(CIERRAPARENTESIS);
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
			setState(111);
			match(FUNCION);
			setState(112);
			match(IDENTIFICADOR);
			setState(113);
			match(ABREPARENTESIS);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==ENTERO) {
				{
				setState(114);
				parametros();
				}
			}

			setState(117);
			match(CIERRAPARENTESIS);
			setState(118);
			match(FLECHA);
			setState(119);
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
			setState(121);
			match(IDENTIFICADOR);
			setState(122);
			match(ABREPARENTESIS);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==ENTERO) {
				{
				setState(123);
				parametros();
				}
			}

			setState(126);
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
		public TerminalNode WITH() { return getToken(LinguineParser.WITH, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public List<TerminalNode> OR() { return getTokens(LinguineParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LinguineParser.OR, i);
		}
		public List<TerminalNode> FLECHA() { return getTokens(LinguineParser.FLECHA); }
		public TerminalNode FLECHA(int i) {
			return getToken(LinguineParser.FLECHA, i);
		}
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(LinguineParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(LinguineParser.DEFAULT, i);
		}
		public List<TerminalNode> INTRO() { return getTokens(LinguineParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(LinguineParser.INTRO, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(MATCH);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case ENTERO:
				{
				setState(129);
				expresion();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(130);
				llamadaFuncion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			match(WITH);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OR:
				case INTRO:
					{
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INTRO) {
						{
						setState(134);
						match(INTRO);
						}
					}

					setState(137);
					match(OR);
					setState(140);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
					case ENTERO:
						{
						setState(138);
						operando();
						}
						break;
					case DEFAULT:
						{
						setState(139);
						match(DEFAULT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case FLECHA:
					{
					setState(142);
					match(FLECHA);
					setState(143);
					expresion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589955072L) != 0) );
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
			setState(148);
			match(WHILE);
			setState(149);
			match(ABREPARENTESIS);
			setState(150);
			expresion();
			setState(151);
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
			setState(153);
			match(FOR);
			setState(154);
			match(ABREPARENTESIS);
			setState(155);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(157);
				operando();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(158);
					match(COMA);
					setState(159);
					operando();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(165);
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
			setState(168);
			match(SHOW);
			setState(169);
			match(ABREPARENTESIS);
			setState(170);
			instruccion();
			setState(171);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ENTERO);
				setState(174);
				match(DIVISION);
				setState(175);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(ENTERO);
				setState(177);
				match(MULTIPLICACION);
				setState(178);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(STRING);
				setState(180);
				match(MULTIPLICACION);
				setState(181);
				match(ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(ENTERO);
				setState(183);
				match(SUMA);
				setState(184);
				match(ENTERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(ENTERO);
				setState(186);
				match(RESTA);
				setState(187);
				match(ENTERO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(STRING);
				setState(189);
				match(SUMA);
				setState(190);
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
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	 
		public BooleanoContext() { }
		public void copyFrom(BooleanoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenorIgualQueContext extends BooleanoContext {
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public TerminalNode MENORIGUALQUE() { return getToken(LinguineParser.MENORIGUALQUE, 0); }
		public MenorIgualQueContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitMenorIgualQue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualQueContext extends BooleanoContext {
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public TerminalNode IGUALQUE() { return getToken(LinguineParser.IGUALQUE, 0); }
		public IgualQueContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitIgualQue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends BooleanoContext {
		public TerminalNode TRUE() { return getToken(LinguineParser.TRUE, 0); }
		public TrueContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualQueStringContext extends BooleanoContext {
		public List<TerminalNode> STRING() { return getTokens(LinguineParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LinguineParser.STRING, i);
		}
		public TerminalNode IGUALQUE() { return getToken(LinguineParser.IGUALQUE, 0); }
		public IgualQueStringContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitIgualQueString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MayorQueContext extends BooleanoContext {
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public TerminalNode MAYORQUE() { return getToken(LinguineParser.MAYORQUE, 0); }
		public MayorQueContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitMayorQue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends BooleanoContext {
		public TerminalNode FALSE() { return getToken(LinguineParser.FALSE, 0); }
		public FalseContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MayorIgualQueContext extends BooleanoContext {
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public TerminalNode MAYORIGUALQUE() { return getToken(LinguineParser.MAYORIGUALQUE, 0); }
		public MayorIgualQueContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitMayorIgualQue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenorQueContext extends BooleanoContext {
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public TerminalNode MENORQUE() { return getToken(LinguineParser.MENORQUE, 0); }
		public MenorQueContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitMenorQue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleano);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new MayorQueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ENTERO);
				setState(194);
				match(MAYORQUE);
				setState(195);
				match(ENTERO);
				}
				break;
			case 2:
				_localctx = new MayorIgualQueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(ENTERO);
				setState(197);
				match(MAYORIGUALQUE);
				setState(198);
				match(ENTERO);
				}
				break;
			case 3:
				_localctx = new MenorIgualQueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(ENTERO);
				setState(200);
				match(MENORIGUALQUE);
				setState(201);
				match(ENTERO);
				}
				break;
			case 4:
				_localctx = new MenorQueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(ENTERO);
				setState(203);
				match(MENORQUE);
				setState(204);
				match(ENTERO);
				}
				break;
			case 5:
				_localctx = new IgualQueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(ENTERO);
				setState(206);
				match(IGUALQUE);
				setState(207);
				match(ENTERO);
				}
				break;
			case 6:
				_localctx = new IgualQueStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				match(STRING);
				setState(209);
				match(IGUALQUE);
				setState(210);
				match(STRING);
				}
				break;
			case 7:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				match(TRUE);
				}
				break;
			case 8:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
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
			setState(215);
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
			setState(217);
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
		"\u0004\u0001\"\u00dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004"+
		"\u0001\u0004\u0003\u0004M\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006X\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006c\b"+
		"\u0006\n\u0006\f\u0006f\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007j\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007n\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bt\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0003\t}\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0084\b\n\u0001\n\u0001\n\u0003\n\u0088\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u008d\b\n\u0001\n\u0001\n\u0004\n\u0091\b\n\u000b\n\f\n\u0092"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00a1\b\r\n\r\f\r\u00a4"+
		"\t\r\u0001\r\u0003\r\u00a7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c0\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00d6\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0002\u0003\u0000\u0011"+
		"\u0011\u0014\u0014\u0018\u001b\u0002\u0000\r\r\u001e\u001e\u00ef\u0000"+
		")\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u00048\u0001"+
		"\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000"+
		"\u0000\nN\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000eg\u0001"+
		"\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000"+
		"\u0000\u0014\u0080\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000\u0000"+
		"\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u00a6\u0001\u0000\u0000"+
		"\u0000\u001c\u00a8\u0001\u0000\u0000\u0000\u001e\u00bf\u0001\u0000\u0000"+
		"\u0000 \u00d5\u0001\u0000\u0000\u0000\"\u00d7\u0001\u0000\u0000\u0000"+
		"$\u00d9\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000"+
		"\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*\u0001\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,5\u0003\u0006\u0003\u0000-5\u0003\b\u0004\u0000.5\u0003\u0010\b"+
		"\u0000/5\u0003\u0012\t\u000005\u0003\u001c\u000e\u000015\u0003\u0014\n"+
		"\u000025\u0003\u0016\u000b\u000035\u0003\u0018\f\u00004,\u0001\u0000\u0000"+
		"\u00004-\u0001\u0000\u0000\u00004.\u0001\u0000\u0000\u00004/\u0001\u0000"+
		"\u0000\u000040\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"67\u0005 \u0000\u00007\u0003\u0001\u0000\u0000\u000089\u0005!\u0000\u0000"+
		"9\u0005\u0001\u0000\u0000\u0000:;\u0005\u0001\u0000\u0000;<\u0005\u000f"+
		"\u0000\u0000<A\u0005\u0010\u0000\u0000=B\u0003\u001e\u000f\u0000>B\u0003"+
		"\u0012\t\u0000?B\u0005\u001e\u0000\u0000@B\u0005\r\u0000\u0000A=\u0001"+
		"\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CD\u0005\u0002"+
		"\u0000\u0000DE\u0005\u001c\u0000\u0000EF\u0003\u001e\u000f\u0000FG\u0005"+
		"\u001d\u0000\u0000GI\u0003\f\u0006\u0000HJ\u0003\n\u0005\u0000IH\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000"+
		"KM\u0003\u000e\u0007\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\t\u0001\u0000\u0000\u0000NO\u0005\u0004\u0000\u0000OP\u0005\u0002"+
		"\u0000\u0000PQ\u0005\u001c\u0000\u0000QR\u0003\u001e\u000f\u0000RS\u0005"+
		"\u001d\u0000\u0000ST\u0003\f\u0006\u0000T\u000b\u0001\u0000\u0000\u0000"+
		"UW\u0005\u0003\u0000\u0000VX\u0005\u001c\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0003\u0002"+
		"\u0001\u0000Z\\\u0005\u001d\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\d\u0001\u0000\u0000\u0000]^\u0003\"\u0011\u0000^_"+
		"\u0005\u001c\u0000\u0000_`\u0003\u0002\u0001\u0000`a\u0005\u001d\u0000"+
		"\u0000ac\u0001\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000cf\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\r\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0005\u0004\u0000\u0000"+
		"hj\u0005\u001c\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000km\u0003\u0002\u0001\u0000ln\u0005\u001d"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000f"+
		"\u0001\u0000\u0000\u0000op\u0005\u0005\u0000\u0000pq\u0005\u000f\u0000"+
		"\u0000qs\u0005\u001c\u0000\u0000rt\u0003\u001a\r\u0000sr\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u001d"+
		"\u0000\u0000vw\u0005\f\u0000\u0000wx\u0003\u0002\u0001\u0000x\u0011\u0001"+
		"\u0000\u0000\u0000yz\u0005\u000f\u0000\u0000z|\u0005\u001c\u0000\u0000"+
		"{}\u0003\u001a\r\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u007f\u0005\u001d\u0000\u0000\u007f\u0013"+
		"\u0001\u0000\u0000\u0000\u0080\u0083\u0005\u0007\u0000\u0000\u0081\u0084"+
		"\u0003\u001e\u000f\u0000\u0082\u0084\u0003\u0012\t\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0090\u0005\b\u0000\u0000\u0086\u0088\u0005!"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008c\u0005\u000e"+
		"\u0000\u0000\u008a\u008d\u0003$\u0012\u0000\u008b\u008d\u0005\u000b\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0091\u0001\u0000\u0000\u0000\u008e\u008f\u0005\f\u0000\u0000"+
		"\u008f\u0091\u0003\u001e\u000f\u0000\u0090\u0087\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0015\u0001\u0000\u0000\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095"+
		"\u0096\u0005\u001c\u0000\u0000\u0096\u0097\u0003\u001e\u000f\u0000\u0097"+
		"\u0098\u0005\u001d\u0000\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\t\u0000\u0000\u009a\u009b\u0005\u001c\u0000\u0000\u009b\u009c"+
		"\u0005\u001d\u0000\u0000\u009c\u0019\u0001\u0000\u0000\u0000\u009d\u00a2"+
		"\u0003$\u0012\u0000\u009e\u009f\u0005\u001f\u0000\u0000\u009f\u00a1\u0003"+
		"$\u0012\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a7\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a7\u0003\u001e\u000f\u0000\u00a6\u009d\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u001b\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0005\u0006\u0000\u0000\u00a9\u00aa\u0005\u001c"+
		"\u0000\u0000\u00aa\u00ab\u0003\u0002\u0001\u0000\u00ab\u00ac\u0005\u001d"+
		"\u0000\u0000\u00ac\u001d\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u001e"+
		"\u0000\u0000\u00ae\u00af\u0005\u001b\u0000\u0000\u00af\u00c0\u0005\u001e"+
		"\u0000\u0000\u00b0\u00b1\u0005\u001e\u0000\u0000\u00b1\u00b2\u0005\u001a"+
		"\u0000\u0000\u00b2\u00c0\u0005\u001e\u0000\u0000\u00b3\u00b4\u0005\r\u0000"+
		"\u0000\u00b4\u00b5\u0005\u001a\u0000\u0000\u00b5\u00c0\u0005\u001e\u0000"+
		"\u0000\u00b6\u00b7\u0005\u001e\u0000\u0000\u00b7\u00b8\u0005\u0018\u0000"+
		"\u0000\u00b8\u00c0\u0005\u001e\u0000\u0000\u00b9\u00ba\u0005\u001e\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0019\u0000\u0000\u00bb\u00c0\u0005\u001e\u0000"+
		"\u0000\u00bc\u00bd\u0005\r\u0000\u0000\u00bd\u00be\u0005\u0018\u0000\u0000"+
		"\u00be\u00c0\u0005\u001e\u0000\u0000\u00bf\u00ad\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b0\u0001\u0000\u0000\u0000\u00bf\u00b3\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b6\u0001\u0000\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bc\u0001\u0000\u0000\u0000\u00c0\u001f\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005\u001e\u0000\u0000\u00c2\u00c3\u0005\u0011\u0000\u0000"+
		"\u00c3\u00d6\u0005\u001e\u0000\u0000\u00c4\u00c5\u0005\u001e\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0013\u0000\u0000\u00c6\u00d6\u0005\u001e\u0000\u0000"+
		"\u00c7\u00c8\u0005\u001e\u0000\u0000\u00c8\u00c9\u0005\u0014\u0000\u0000"+
		"\u00c9\u00d6\u0005\u001e\u0000\u0000\u00ca\u00cb\u0005\u001e\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0012\u0000\u0000\u00cc\u00d6\u0005\u001e\u0000\u0000"+
		"\u00cd\u00ce\u0005\u001e\u0000\u0000\u00ce\u00cf\u0005\u0015\u0000\u0000"+
		"\u00cf\u00d6\u0005\u001e\u0000\u0000\u00d0\u00d1\u0005\r\u0000\u0000\u00d1"+
		"\u00d2\u0005\u0015\u0000\u0000\u00d2\u00d6\u0005\r\u0000\u0000\u00d3\u00d6"+
		"\u0005\u0016\u0000\u0000\u00d4\u00d6\u0005\u0017\u0000\u0000\u00d5\u00c1"+
		"\u0001\u0000\u0000\u0000\u00d5\u00c4\u0001\u0000\u0000\u0000\u00d5\u00c7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d5\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6!\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0007\u0000\u0000\u0000\u00d8#\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0007\u0001\u0000\u0000\u00da%\u0001\u0000\u0000"+
		"\u0000\u0015)4AILW[dims|\u0083\u0087\u008c\u0090\u0092\u00a2\u00a6\u00bf"+
		"\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}