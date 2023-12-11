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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42726L) != 0)) {
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
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASINGACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				condicional();
				}
				break;
			case FUNCION:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				declaracionFuncion();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				llamadaFuncion();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				show();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				sentenciaWhile();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				sentenciaFor();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 9);
				{
				setState(54);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(57);
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
			setState(59);
			match(ASINGACION);
			setState(60);
			match(IDENTIFICADOR);
			setState(61);
			match(IGUAL);
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(62);
				expresion();
				}
				break;
			case 2:
				{
				setState(63);
				llamadaFuncion();
				}
				break;
			case 3:
				{
				setState(64);
				match(ENTERO);
				}
				break;
			case 4:
				{
				setState(65);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IF);
			setState(69);
			match(ABREPARENTESIS);
			setState(70);
			expresion();
			setState(71);
			match(CIERRAPARENTESIS);
			setState(72);
			sentenciaThen();
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(73);
				sentenciaElseIf();
				}
				break;
			}
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(76);
				sentenciaElse();
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
			setState(79);
			match(ELSE);
			setState(80);
			match(IF);
			setState(81);
			match(ABREPARENTESIS);
			setState(82);
			expresion();
			setState(83);
			match(CIERRAPARENTESIS);
			setState(84);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(THEN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABREPARENTESIS) {
				{
				setState(87);
				match(ABREPARENTESIS);
				}
			}

			setState(90);
			instruccion();
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(91);
				match(CIERRAPARENTESIS);
				}
				break;
			}
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					operador();
					setState(95);
					match(ABREPARENTESIS);
					setState(96);
					instruccion();
					setState(97);
					match(CIERRAPARENTESIS);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(104);
			match(ELSE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABREPARENTESIS) {
				{
				setState(105);
				match(ABREPARENTESIS);
				}
			}

			setState(108);
			instruccion();
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(109);
				match(CIERRAPARENTESIS);
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
			setState(112);
			match(FUNCION);
			setState(113);
			match(IDENTIFICADOR);
			setState(114);
			match(ABREPARENTESIS);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==ENTERO) {
				{
				setState(115);
				parametros();
				}
			}

			setState(118);
			match(CIERRAPARENTESIS);
			setState(119);
			match(FLECHA);
			setState(120);
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
			setState(122);
			match(IDENTIFICADOR);
			setState(123);
			match(ABREPARENTESIS);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==ENTERO) {
				{
				setState(124);
				parametros();
				}
			}

			setState(127);
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
			setState(129);
			match(MATCH);
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case ENTERO:
				{
				setState(130);
				expresion();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(131);
				llamadaFuncion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
			match(WITH);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OR:
				case INTRO:
					{
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INTRO) {
						{
						setState(135);
						match(INTRO);
						}
					}

					setState(138);
					match(OR);
					setState(141);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
					case ENTERO:
						{
						setState(139);
						operando();
						}
						break;
					case DEFAULT:
						{
						setState(140);
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
					setState(143);
					match(FLECHA);
					setState(144);
					expresion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(147); 
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
			setState(149);
			match(WHILE);
			setState(150);
			match(ABREPARENTESIS);
			setState(151);
			expresion();
			setState(152);
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
			setState(154);
			match(FOR);
			setState(155);
			match(ABREPARENTESIS);
			setState(156);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(158);
				operando();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(159);
					match(COMA);
					setState(160);
					operando();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(166);
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
			setState(169);
			match(SHOW);
			setState(170);
			match(ABREPARENTESIS);
			setState(171);
			instruccion();
			setState(172);
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(ENTERO);
				setState(175);
				match(DIVISION);
				setState(176);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(ENTERO);
				setState(178);
				match(MULTIPLICACION);
				setState(179);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(STRING);
				setState(181);
				match(MULTIPLICACION);
				setState(182);
				match(ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(ENTERO);
				setState(184);
				match(SUMA);
				setState(185);
				match(ENTERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(ENTERO);
				setState(187);
				match(RESTA);
				setState(188);
				match(ENTERO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(STRING);
				setState(190);
				match(SUMA);
				setState(191);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new MayorQueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(ENTERO);
				setState(195);
				match(MAYORQUE);
				setState(196);
				match(ENTERO);
				}
				break;
			case 2:
				_localctx = new MayorIgualQueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(ENTERO);
				setState(198);
				match(MAYORIGUALQUE);
				setState(199);
				match(ENTERO);
				}
				break;
			case 3:
				_localctx = new MenorIgualQueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(ENTERO);
				setState(201);
				match(MENORIGUALQUE);
				setState(202);
				match(ENTERO);
				}
				break;
			case 4:
				_localctx = new MenorQueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(ENTERO);
				setState(204);
				match(MENORQUE);
				setState(205);
				match(ENTERO);
				}
				break;
			case 5:
				_localctx = new IgualQueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(ENTERO);
				setState(207);
				match(IGUALQUE);
				setState(208);
				match(ENTERO);
				}
				break;
			case 6:
				_localctx = new IgualQueStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				match(STRING);
				setState(210);
				match(IGUALQUE);
				setState(211);
				match(STRING);
				}
				break;
			case 7:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				match(TRUE);
				}
				break;
			case 8:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(213);
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
			setState(216);
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
			setState(218);
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
		"\u0004\u0001\"\u00dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"K\b\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006Y\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006]\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"d\b\u0006\n\u0006\f\u0006g\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"k\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007o\b\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\bu\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0003\t~\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u0085\b\n\u0001\n\u0001\n\u0003\n\u0089\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u008e\b\n\u0001\n\u0001\n\u0004\n\u0092\b\n\u000b\n\f\n\u0093"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00a2\b\r\n\r\f\r\u00a5"+
		"\t\r\u0001\r\u0003\r\u00a8\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c1\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00d7\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0002\u0003\u0000\u0011"+
		"\u0011\u0014\u0014\u0018\u001b\u0002\u0000\r\r\u001e\u001e\u00f1\u0000"+
		"+\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u00049\u0001"+
		"\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000"+
		"\u0000\nO\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000eh\u0001"+
		"\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000"+
		"\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000"+
		"\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a\u00a7\u0001\u0000\u0000"+
		"\u0000\u001c\u00a9\u0001\u0000\u0000\u0000\u001e\u00c0\u0001\u0000\u0000"+
		"\u0000 \u00d6\u0001\u0000\u0000\u0000\"\u00d8\u0001\u0000\u0000\u0000"+
		"$\u00da\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0005 \u0000"+
		"\u0000(*\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000*-\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0001"+
		"\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.8\u0003\u0006\u0003"+
		"\u0000/8\u0003\b\u0004\u000008\u0003\u0010\b\u000018\u0003\u0012\t\u0000"+
		"28\u0003\u001c\u000e\u000038\u0003\u0014\n\u000048\u0003\u0016\u000b\u0000"+
		"58\u0003\u0018\f\u000068\u0005\r\u0000\u00007.\u0001\u0000\u0000\u0000"+
		"7/\u0001\u0000\u0000\u000070\u0001\u0000\u0000\u000071\u0001\u0000\u0000"+
		"\u000072\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u000074\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u0003"+
		"\u0001\u0000\u0000\u00009:\u0005!\u0000\u0000:\u0005\u0001\u0000\u0000"+
		"\u0000;<\u0005\u0001\u0000\u0000<=\u0005\u000f\u0000\u0000=B\u0005\u0010"+
		"\u0000\u0000>C\u0003\u001e\u000f\u0000?C\u0003\u0012\t\u0000@C\u0005\u001e"+
		"\u0000\u0000AC\u0005\r\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0007"+
		"\u0001\u0000\u0000\u0000DE\u0005\u0002\u0000\u0000EF\u0005\u001c\u0000"+
		"\u0000FG\u0003\u001e\u000f\u0000GH\u0005\u001d\u0000\u0000HJ\u0003\f\u0006"+
		"\u0000IK\u0003\n\u0005\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KM\u0001\u0000\u0000\u0000LN\u0003\u000e\u0007\u0000ML\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0004\u0000\u0000PQ\u0005\u0002\u0000\u0000QR\u0005\u001c\u0000\u0000"+
		"RS\u0003\u001e\u000f\u0000ST\u0005\u001d\u0000\u0000TU\u0003\f\u0006\u0000"+
		"U\u000b\u0001\u0000\u0000\u0000VX\u0005\u0003\u0000\u0000WY\u0005\u001c"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\\\u0003\u0002\u0001\u0000[]\u0005\u001d\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]e\u0001\u0000\u0000"+
		"\u0000^_\u0003\"\u0011\u0000_`\u0005\u001c\u0000\u0000`a\u0003\u0002\u0001"+
		"\u0000ab\u0005\u001d\u0000\u0000bd\u0001\u0000\u0000\u0000c^\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hj\u0005\u0004\u0000\u0000ik\u0005\u001c\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0003\u0002"+
		"\u0001\u0000mo\u0005\u001d\u0000\u0000nm\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000o\u000f\u0001\u0000\u0000\u0000pq\u0005\u0005\u0000"+
		"\u0000qr\u0005\u000f\u0000\u0000rt\u0005\u001c\u0000\u0000su\u0003\u001a"+
		"\r\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vw\u0005\u001d\u0000\u0000wx\u0005\f\u0000\u0000xy\u0003\u0002"+
		"\u0001\u0000y\u0011\u0001\u0000\u0000\u0000z{\u0005\u000f\u0000\u0000"+
		"{}\u0005\u001c\u0000\u0000|~\u0003\u001a\r\u0000}|\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u001d\u0000\u0000\u0080\u0013\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0005\u0007\u0000\u0000\u0082\u0085\u0003\u001e\u000f\u0000\u0083\u0085"+
		"\u0003\u0012\t\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0091\u0005"+
		"\b\u0000\u0000\u0087\u0089\u0005!\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0005\u000e\u0000\u0000\u008b\u008e\u0003$\u0012"+
		"\u0000\u008c\u008e\u0005\u000b\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0092\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0092\u0003\u001e\u000f\u0000"+
		"\u0091\u0088\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0015\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\n\u0000\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097"+
		"\u0098\u0003\u001e\u000f\u0000\u0098\u0099\u0005\u001d\u0000\u0000\u0099"+
		"\u0017\u0001\u0000\u0000\u0000\u009a\u009b\u0005\t\u0000\u0000\u009b\u009c"+
		"\u0005\u001c\u0000\u0000\u009c\u009d\u0005\u001d\u0000\u0000\u009d\u0019"+
		"\u0001\u0000\u0000\u0000\u009e\u00a3\u0003$\u0012\u0000\u009f\u00a0\u0005"+
		"\u001f\u0000\u0000\u00a0\u00a2\u0003$\u0012\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003\u001e"+
		"\u000f\u0000\u00a7\u009e\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0006"+
		"\u0000\u0000\u00aa\u00ab\u0005\u001c\u0000\u0000\u00ab\u00ac\u0003\u0002"+
		"\u0001\u0000\u00ac\u00ad\u0005\u001d\u0000\u0000\u00ad\u001d\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\u001e\u0000\u0000\u00af\u00b0\u0005\u001b"+
		"\u0000\u0000\u00b0\u00c1\u0005\u001e\u0000\u0000\u00b1\u00b2\u0005\u001e"+
		"\u0000\u0000\u00b2\u00b3\u0005\u001a\u0000\u0000\u00b3\u00c1\u0005\u001e"+
		"\u0000\u0000\u00b4\u00b5\u0005\r\u0000\u0000\u00b5\u00b6\u0005\u001a\u0000"+
		"\u0000\u00b6\u00c1\u0005\u001e\u0000\u0000\u00b7\u00b8\u0005\u001e\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0018\u0000\u0000\u00b9\u00c1\u0005\u001e\u0000"+
		"\u0000\u00ba\u00bb\u0005\u001e\u0000\u0000\u00bb\u00bc\u0005\u0019\u0000"+
		"\u0000\u00bc\u00c1\u0005\u001e\u0000\u0000\u00bd\u00be\u0005\r\u0000\u0000"+
		"\u00be\u00bf\u0005\u0018\u0000\u0000\u00bf\u00c1\u0005\u001e\u0000\u0000"+
		"\u00c0\u00ae\u0001\u0000\u0000\u0000\u00c0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00c0\u00b4\u0001\u0000\u0000\u0000\u00c0\u00b7\u0001\u0000\u0000\u0000"+
		"\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c1\u001f\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u001e\u0000\u0000"+
		"\u00c3\u00c4\u0005\u0011\u0000\u0000\u00c4\u00d7\u0005\u001e\u0000\u0000"+
		"\u00c5\u00c6\u0005\u001e\u0000\u0000\u00c6\u00c7\u0005\u0013\u0000\u0000"+
		"\u00c7\u00d7\u0005\u001e\u0000\u0000\u00c8\u00c9\u0005\u001e\u0000\u0000"+
		"\u00c9\u00ca\u0005\u0014\u0000\u0000\u00ca\u00d7\u0005\u001e\u0000\u0000"+
		"\u00cb\u00cc\u0005\u001e\u0000\u0000\u00cc\u00cd\u0005\u0012\u0000\u0000"+
		"\u00cd\u00d7\u0005\u001e\u0000\u0000\u00ce\u00cf\u0005\u001e\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0015\u0000\u0000\u00d0\u00d7\u0005\u001e\u0000\u0000"+
		"\u00d1\u00d2\u0005\r\u0000\u0000\u00d2\u00d3\u0005\u0015\u0000\u0000\u00d3"+
		"\u00d7\u0005\r\u0000\u0000\u00d4\u00d7\u0005\u0016\u0000\u0000\u00d5\u00d7"+
		"\u0005\u0017\u0000\u0000\u00d6\u00c2\u0001\u0000\u0000\u0000\u00d6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00d6\u00c8\u0001\u0000\u0000\u0000\u00d6\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d6\u00ce\u0001\u0000\u0000\u0000\u00d6\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7!\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007"+
		"\u0000\u0000\u0000\u00d9#\u0001\u0000\u0000\u0000\u00da\u00db\u0007\u0001"+
		"\u0000\u0000\u00db%\u0001\u0000\u0000\u0000\u0015+7BJMX\\ejnt}\u0084\u0088"+
		"\u008d\u0091\u0093\u00a3\u00a7\u00c0\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}