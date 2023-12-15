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
		ASIGNACION=1, IF=2, THEN=3, ELSE=4, FUNCION=5, SHOW=6, MATCH=7, ORMATCH=8, 
		WITH=9, FOR=10, WHILE=11, DEFAULT=12, FLECHA=13, STRING=14, COPY=15, CONCAT=16, 
		EXTRACT=17, AND=18, OR=19, NOT=20, XOR=21, NAND=22, ENTERO=23, FLOAT=24, 
		IDENTIFICADOR=25, ABRECORCHETE=26, CIERRACORCHETE=27, ABRELLAVE=28, CIERRALLAVE=29, 
		IGUAL=30, MAYORQUE=31, MENORQUE=32, MAYORIGUALQUE=33, MENORIGUALQUE=34, 
		IGUALQUE=35, TRUE=36, FALSE=37, SUMA=38, RESTA=39, MULTIPLICACION=40, 
		DIVISION=41, ABREPARENTESIS=42, CIERRAPARENTESIS=43, COMA=44, PUNTOYCOMA=45, 
		INTRO=46, ESPACIO=47;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_saltoInstruccion = 2, RULE_asignacion = 3, 
		RULE_condicional = 4, RULE_bloqueThen = 5, RULE_bloqueElse = 6, RULE_copiaCadena = 7, 
		RULE_concatenarCadenas = 8, RULE_extraerCadena = 9, RULE_arrayDeNumeros = 10, 
		RULE_declaracionFuncion = 11, RULE_llamadaFuncion = 12, RULE_match = 13, 
		RULE_sentenciaWhile = 14, RULE_sentenciaFor = 15, RULE_bloqueInstrucciones = 16, 
		RULE_parametros = 17, RULE_show = 18, RULE_expresion = 19, RULE_booleano = 20, 
		RULE_operadorAritmetico = 21, RULE_operando = 22, RULE_numero = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "saltoInstruccion", "asignacion", "condicional", 
			"bloqueThen", "bloqueElse", "copiaCadena", "concatenarCadenas", "extraerCadena", 
			"arrayDeNumeros", "declaracionFuncion", "llamadaFuncion", "match", "sentenciaWhile", 
			"sentenciaFor", "bloqueInstrucciones", "parametros", "show", "expresion", 
			"booleano", "operadorAritmetico", "operando", "numero"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'if'", "'then'", "'else'", "'fun'", "'show'", "'match'", 
			"'|'", "'with'", "'for'", "'while'", "'?'", "'->'", null, "'copy'", "'concat'", 
			"'extract'", null, null, null, null, null, null, null, null, "'['", "']'", 
			"'{'", "'}'", "'='", "'>'", "'<'", "'>='", "'<='", "'=='", "'true'", 
			"'false'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "','", "';'", "'\\r\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASIGNACION", "IF", "THEN", "ELSE", "FUNCION", "SHOW", "MATCH", 
			"ORMATCH", "WITH", "FOR", "WHILE", "DEFAULT", "FLECHA", "STRING", "COPY", 
			"CONCAT", "EXTRACT", "AND", "OR", "NOT", "XOR", "NAND", "ENTERO", "FLOAT", 
			"IDENTIFICADOR", "ABRECORCHETE", "CIERRACORCHETE", "ABRELLAVE", "CIERRALLAVE", 
			"IGUAL", "MAYORQUE", "MENORQUE", "MAYORIGUALQUE", "MENORIGUALQUE", "IGUALQUE", 
			"TRUE", "FALSE", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "ABREPARENTESIS", 
			"CIERRAPARENTESIS", "COMA", "PUNTOYCOMA", "INTRO", "ESPACIO"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33557734L) != 0)) {
				{
				{
				setState(48);
				instruccion();
				setState(49);
				match(PUNTOYCOMA);
				}
				}
				setState(55);
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNACION:
				{
				setState(56);
				asignacion();
				}
				break;
			case IF:
				{
				setState(57);
				condicional();
				}
				break;
			case FUNCION:
				{
				setState(58);
				declaracionFuncion();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(59);
				llamadaFuncion();
				}
				break;
			case SHOW:
				{
				setState(60);
				show();
				}
				break;
			case MATCH:
				{
				setState(61);
				match();
				}
				break;
			case WHILE:
				{
				setState(62);
				sentenciaWhile();
				}
				break;
			case FOR:
				{
				setState(63);
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
			setState(66);
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
		public TerminalNode ASIGNACION() { return getToken(LinguineParser.ASIGNACION, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LinguineParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(LinguineParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public TerminalNode ENTERO() { return getToken(LinguineParser.ENTERO, 0); }
		public TerminalNode FLOAT() { return getToken(LinguineParser.FLOAT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ASIGNACION);
			setState(69);
			match(IDENTIFICADOR);
			setState(70);
			match(IGUAL);
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(71);
				expresion();
				}
				break;
			case 2:
				{
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==ENTERO || _la==FLOAT) ) {
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
				setState(73);
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
			setState(76);
			match(IF);
			setState(77);
			match(ABREPARENTESIS);
			setState(78);
			booleano();
			setState(79);
			match(CIERRAPARENTESIS);
			setState(80);
			bloqueThen();
			setState(81);
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
			setState(83);
			match(THEN);
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(84);
				instruccion();
				}
				break;
			case 2:
				{
				setState(85);
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
			setState(88);
			match(ELSE);
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(89);
				instruccion();
				}
				break;
			case 2:
				{
				setState(90);
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
	public static class CopiaCadenaContext extends ParserRuleContext {
		public TerminalNode COPY() { return getToken(LinguineParser.COPY, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LinguineParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> COMA() { return getTokens(LinguineParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LinguineParser.COMA, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public CopiaCadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copiaCadena; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitCopiaCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopiaCadenaContext copiaCadena() throws RecognitionException {
		CopiaCadenaContext _localctx = new CopiaCadenaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_copiaCadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(COPY);
			setState(94);
			match(ABREPARENTESIS);
			setState(95);
			match(IDENTIFICADOR);
			setState(96);
			match(COMA);
			setState(97);
			match(ENTERO);
			setState(98);
			match(COMA);
			setState(99);
			match(ENTERO);
			setState(100);
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
	public static class ConcatenarCadenasContext extends ParserRuleContext {
		public TerminalNode CONCAT() { return getToken(LinguineParser.CONCAT, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(LinguineParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(LinguineParser.IDENTIFICADOR, i);
		}
		public TerminalNode COMA() { return getToken(LinguineParser.COMA, 0); }
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public ConcatenarCadenasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenarCadenas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitConcatenarCadenas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenarCadenasContext concatenarCadenas() throws RecognitionException {
		ConcatenarCadenasContext _localctx = new ConcatenarCadenasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_concatenarCadenas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(CONCAT);
			setState(103);
			match(ABREPARENTESIS);
			setState(104);
			match(IDENTIFICADOR);
			setState(105);
			match(COMA);
			setState(106);
			match(IDENTIFICADOR);
			setState(107);
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
	public static class ExtraerCadenaContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(LinguineParser.EXTRACT, 0); }
		public TerminalNode ABREPARENTESIS() { return getToken(LinguineParser.ABREPARENTESIS, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LinguineParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> COMA() { return getTokens(LinguineParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LinguineParser.COMA, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public ExtraerCadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraerCadena; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitExtraerCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraerCadenaContext extraerCadena() throws RecognitionException {
		ExtraerCadenaContext _localctx = new ExtraerCadenaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_extraerCadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(EXTRACT);
			setState(110);
			match(ABREPARENTESIS);
			setState(111);
			match(IDENTIFICADOR);
			setState(112);
			match(COMA);
			setState(113);
			match(ENTERO);
			setState(114);
			match(COMA);
			setState(115);
			match(ENTERO);
			setState(116);
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
	public static class ArrayDeNumerosContext extends ParserRuleContext {
		public TerminalNode ABRECORCHETE() { return getToken(LinguineParser.ABRECORCHETE, 0); }
		public TerminalNode CIERRACORCHETE() { return getToken(LinguineParser.CIERRACORCHETE, 0); }
		public List<TerminalNode> ENTERO() { return getTokens(LinguineParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(LinguineParser.ENTERO, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(LinguineParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(LinguineParser.FLOAT, i);
		}
		public List<TerminalNode> COMA() { return getTokens(LinguineParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(LinguineParser.COMA, i);
		}
		public ArrayDeNumerosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeNumeros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitArrayDeNumeros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeNumerosContext arrayDeNumeros() throws RecognitionException {
		ArrayDeNumerosContext _localctx = new ArrayDeNumerosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayDeNumeros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ABRECORCHETE);
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(120);
				match(COMA);
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==ENTERO || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(CIERRACORCHETE);
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
		enterRule(_localctx, 22, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(FUNCION);
			setState(130);
			match(IDENTIFICADOR);
			setState(131);
			match(ABREPARENTESIS);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58736640L) != 0)) {
				{
				setState(132);
				parametros();
				}
			}

			setState(135);
			match(CIERRAPARENTESIS);
			setState(136);
			match(FLECHA);
			setState(137);
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
		enterRule(_localctx, 24, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IDENTIFICADOR);
			setState(140);
			match(ABREPARENTESIS);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58736640L) != 0)) {
				{
				setState(141);
				parametros();
				}
			}

			setState(144);
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
		public List<TerminalNode> ORMATCH() { return getTokens(LinguineParser.ORMATCH); }
		public TerminalNode ORMATCH(int i) {
			return getToken(LinguineParser.ORMATCH, i);
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
		enterRule(_localctx, 26, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(MATCH);
			setState(147);
			match(IDENTIFICADOR);
			setState(148);
			match(WITH);
			setState(149);
			match(ORMATCH);
			setState(150);
			match(ENTERO);
			setState(151);
			match(FLECHA);
			setState(152);
			match(STRING);
			setState(153);
			match(ORMATCH);
			setState(154);
			match(ENTERO);
			setState(155);
			match(FLECHA);
			setState(156);
			match(STRING);
			setState(157);
			match(ORMATCH);
			setState(158);
			match(DEFAULT);
			setState(159);
			match(FLECHA);
			setState(160);
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
		public BloqueInstruccionesContext bloqueInstrucciones() {
			return getRuleContext(BloqueInstruccionesContext.class,0);
		}
		public List<TerminalNode> ABREPARENTESIS() { return getTokens(LinguineParser.ABREPARENTESIS); }
		public TerminalNode ABREPARENTESIS(int i) {
			return getToken(LinguineParser.ABREPARENTESIS, i);
		}
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<TerminalNode> CIERRAPARENTESIS() { return getTokens(LinguineParser.CIERRAPARENTESIS); }
		public TerminalNode CIERRAPARENTESIS(int i) {
			return getToken(LinguineParser.CIERRAPARENTESIS, i);
		}
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
		enterRule(_localctx, 28, RULE_sentenciaWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WHILE);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 206191984640L) != 0)) {
					{
					setState(163);
					booleano();
					}
				}

				setState(166);
				match(ABREPARENTESIS);
				setState(167);
				booleano();
				setState(168);
				match(CIERRAPARENTESIS);
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4604238495744L) != 0) );
			setState(174);
			bloqueInstrucciones();
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
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> PUNTOYCOMA() { return getTokens(LinguineParser.PUNTOYCOMA); }
		public TerminalNode PUNTOYCOMA(int i) {
			return getToken(LinguineParser.PUNTOYCOMA, i);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public TerminalNode CIERRAPARENTESIS() { return getToken(LinguineParser.CIERRAPARENTESIS, 0); }
		public BloqueInstruccionesContext bloqueInstrucciones() {
			return getRuleContext(BloqueInstruccionesContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_sentenciaFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(FOR);
			setState(177);
			match(ABREPARENTESIS);
			setState(178);
			asignacion();
			setState(179);
			match(PUNTOYCOMA);
			setState(180);
			booleano();
			setState(181);
			match(PUNTOYCOMA);
			setState(182);
			asignacion();
			setState(183);
			match(CIERRAPARENTESIS);
			setState(184);
			bloqueInstrucciones();
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
	public static class BloqueInstruccionesContext extends ParserRuleContext {
		public TerminalNode ABRELLAVE() { return getToken(LinguineParser.ABRELLAVE, 0); }
		public TerminalNode CIERRALLAVE() { return getToken(LinguineParser.CIERRALLAVE, 0); }
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
		public BloqueInstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueInstrucciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitBloqueInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueInstruccionesContext bloqueInstrucciones() throws RecognitionException {
		BloqueInstruccionesContext _localctx = new BloqueInstruccionesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bloqueInstrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ABRELLAVE);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33557734L) != 0)) {
				{
				{
				setState(187);
				instruccion();
				setState(188);
				match(PUNTOYCOMA);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(CIERRALLAVE);
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
		enterRule(_localctx, 34, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(197);
				operando();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(198);
					match(COMA);
					setState(199);
					operando();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(205);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
		enterRule(_localctx, 36, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(SHOW);
			setState(209);
			match(ABREPARENTESIS);
			setState(210);
			expresion();
			setState(211);
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public OperadorAritmeticoContext operadorAritmetico() {
			return getRuleContext(OperadorAritmeticoContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(LinguineParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(LinguineParser.IDENTIFICADOR, i);
		}
		public TerminalNode COMA() { return getToken(LinguineParser.COMA, 0); }
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
		enterRule(_localctx, 38, RULE_expresion);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				numero();
				setState(214);
				operadorAritmetico();
				setState(215);
				numero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(STRING);
				setState(218);
				operadorAritmetico();
				setState(219);
				numero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(IDENTIFICADOR);
				setState(222);
				operadorAritmetico();
				setState(223);
				numero();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(IDENTIFICADOR);
				setState(226);
				match(COMA);
				setState(227);
				match(IDENTIFICADOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				numero();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				match(IDENTIFICADOR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				match(STRING);
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
		enterRule(_localctx, 40, RULE_booleano);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(IDENTIFICADOR);
				setState(234);
				match(MAYORQUE);
				setState(235);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(IDENTIFICADOR);
				setState(237);
				match(MAYORIGUALQUE);
				setState(238);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(IDENTIFICADOR);
				setState(240);
				match(MENORIGUALQUE);
				setState(241);
				match(ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(IDENTIFICADOR);
				setState(243);
				match(MENORQUE);
				setState(244);
				match(ENTERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(IDENTIFICADOR);
				setState(246);
				match(IGUALQUE);
				setState(247);
				match(ENTERO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(IDENTIFICADOR);
				setState(249);
				match(IGUALQUE);
				setState(250);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
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
	public static class OperadorAritmeticoContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(LinguineParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(LinguineParser.RESTA, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(LinguineParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(LinguineParser.DIVISION, 0); }
		public OperadorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAritmetico; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitOperadorAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorAritmeticoContext operadorAritmetico() throws RecognitionException {
		OperadorAritmeticoContext _localctx = new OperadorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operadorAritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(LinguineParser.ENTERO, 0); }
		public TerminalNode FLOAT() { return getToken(LinguineParser.FLOAT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==FLOAT) ) {
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
		"\u0004\u0001/\u0106\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"K\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"W\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n{\b\n\n\n\f"+
		"\n~\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0086\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u008f\b\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a5\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u00ab\b\u000e\u000b\u000e\f\u000e\u00ac\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00bf\b\u0010\n\u0010\f\u0010\u00c2"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00c9\b\u0011\n\u0011\f\u0011\u00cc\t\u0011\u0001\u0011\u0003\u0011"+
		"\u00cf\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00e8\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00fe\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0003\u0001"+
		"\u0000\u0017\u0018\u0001\u0000&)\u0002\u0000\u000e\u000e\u0017\u0017\u010e"+
		"\u00005\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000\u0004B"+
		"\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bL\u0001\u0000"+
		"\u0000\u0000\nS\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e"+
		"]\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012m\u0001"+
		"\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000\u0016\u0081\u0001\u0000"+
		"\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000\u001a\u0092\u0001\u0000"+
		"\u0000\u0000\u001c\u00a2\u0001\u0000\u0000\u0000\u001e\u00b0\u0001\u0000"+
		"\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00ce\u0001\u0000\u0000"+
		"\u0000$\u00d0\u0001\u0000\u0000\u0000&\u00e7\u0001\u0000\u0000\u0000("+
		"\u00fd\u0001\u0000\u0000\u0000*\u00ff\u0001\u0000\u0000\u0000,\u0101\u0001"+
		"\u0000\u0000\u0000.\u0103\u0001\u0000\u0000\u000001\u0003\u0002\u0001"+
		"\u000012\u0005-\u0000\u000024\u0001\u0000\u0000\u000030\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\u0001\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"8A\u0003\u0006\u0003\u00009A\u0003\b\u0004\u0000:A\u0003\u0016\u000b\u0000"+
		";A\u0003\u0018\f\u0000<A\u0003$\u0012\u0000=A\u0003\u001a\r\u0000>A\u0003"+
		"\u001c\u000e\u0000?A\u0003\u001e\u000f\u0000@8\u0001\u0000\u0000\u0000"+
		"@9\u0001\u0000\u0000\u0000@:\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000"+
		"\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0003\u0001\u0000\u0000\u0000"+
		"BC\u0005.\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0001\u0000"+
		"\u0000EF\u0005\u0019\u0000\u0000FJ\u0005\u001e\u0000\u0000GK\u0003&\u0013"+
		"\u0000HK\u0007\u0000\u0000\u0000IK\u0005\u000e\u0000\u0000JG\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0007"+
		"\u0001\u0000\u0000\u0000LM\u0005\u0002\u0000\u0000MN\u0005*\u0000\u0000"+
		"NO\u0003(\u0014\u0000OP\u0005+\u0000\u0000PQ\u0003\n\u0005\u0000QR\u0003"+
		"\f\u0006\u0000R\t\u0001\u0000\u0000\u0000SV\u0005\u0003\u0000\u0000TW"+
		"\u0003\u0002\u0001\u0000UW\u0003&\u0013\u0000VT\u0001\u0000\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000W\u000b\u0001\u0000\u0000\u0000X[\u0005\u0004"+
		"\u0000\u0000Y\\\u0003\u0002\u0001\u0000Z\\\u0003&\u0013\u0000[Y\u0001"+
		"\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\r\u0001\u0000\u0000\u0000"+
		"]^\u0005\u000f\u0000\u0000^_\u0005*\u0000\u0000_`\u0005\u0019\u0000\u0000"+
		"`a\u0005,\u0000\u0000ab\u0005\u0017\u0000\u0000bc\u0005,\u0000\u0000c"+
		"d\u0005\u0017\u0000\u0000de\u0005+\u0000\u0000e\u000f\u0001\u0000\u0000"+
		"\u0000fg\u0005\u0010\u0000\u0000gh\u0005*\u0000\u0000hi\u0005\u0019\u0000"+
		"\u0000ij\u0005,\u0000\u0000jk\u0005\u0019\u0000\u0000kl\u0005+\u0000\u0000"+
		"l\u0011\u0001\u0000\u0000\u0000mn\u0005\u0011\u0000\u0000no\u0005*\u0000"+
		"\u0000op\u0005\u0019\u0000\u0000pq\u0005,\u0000\u0000qr\u0005\u0017\u0000"+
		"\u0000rs\u0005,\u0000\u0000st\u0005\u0017\u0000\u0000tu\u0005+\u0000\u0000"+
		"u\u0013\u0001\u0000\u0000\u0000vw\u0005\u001a\u0000\u0000w|\u0007\u0000"+
		"\u0000\u0000xy\u0005,\u0000\u0000y{\u0007\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u001b\u0000\u0000\u0080\u0015\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005\u0005\u0000\u0000\u0082\u0083\u0005\u0019\u0000"+
		"\u0000\u0083\u0085\u0005*\u0000\u0000\u0084\u0086\u0003\"\u0011\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005+\u0000\u0000\u0088"+
		"\u0089\u0005\r\u0000\u0000\u0089\u008a\u0003\u0002\u0001\u0000\u008a\u0017"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0019\u0000\u0000\u008c\u008e"+
		"\u0005*\u0000\u0000\u008d\u008f\u0003\"\u0011\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005+\u0000\u0000\u0091\u0019\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u0094\u0005\u0019"+
		"\u0000\u0000\u0094\u0095\u0005\t\u0000\u0000\u0095\u0096\u0005\b\u0000"+
		"\u0000\u0096\u0097\u0005\u0017\u0000\u0000\u0097\u0098\u0005\r\u0000\u0000"+
		"\u0098\u0099\u0005\u000e\u0000\u0000\u0099\u009a\u0005\b\u0000\u0000\u009a"+
		"\u009b\u0005\u0017\u0000\u0000\u009b\u009c\u0005\r\u0000\u0000\u009c\u009d"+
		"\u0005\u000e\u0000\u0000\u009d\u009e\u0005\b\u0000\u0000\u009e\u009f\u0005"+
		"\f\u0000\u0000\u009f\u00a0\u0005\r\u0000\u0000\u00a0\u00a1\u0005\u000e"+
		"\u0000\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2\u00aa\u0005\u000b"+
		"\u0000\u0000\u00a3\u00a5\u0003(\u0014\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005*\u0000\u0000\u00a7\u00a8\u0003(\u0014\u0000\u00a8"+
		"\u00a9\u0005+\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a4"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0003 \u0010\u0000\u00af\u001d\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005\n\u0000\u0000\u00b1\u00b2\u0005*"+
		"\u0000\u0000\u00b2\u00b3\u0003\u0006\u0003\u0000\u00b3\u00b4\u0005-\u0000"+
		"\u0000\u00b4\u00b5\u0003(\u0014\u0000\u00b5\u00b6\u0005-\u0000\u0000\u00b6"+
		"\u00b7\u0003\u0006\u0003\u0000\u00b7\u00b8\u0005+\u0000\u0000\u00b8\u00b9"+
		"\u0003 \u0010\u0000\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba\u00c0\u0005"+
		"\u001c\u0000\u0000\u00bb\u00bc\u0003\u0002\u0001\u0000\u00bc\u00bd\u0005"+
		"-\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u001d"+
		"\u0000\u0000\u00c4!\u0001\u0000\u0000\u0000\u00c5\u00ca\u0003,\u0016\u0000"+
		"\u00c6\u00c7\u0005,\u0000\u0000\u00c7\u00c9\u0003,\u0016\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cf"+
		"\u0003&\u0013\u0000\u00ce\u00c5\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf#\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0006"+
		"\u0000\u0000\u00d1\u00d2\u0005*\u0000\u0000\u00d2\u00d3\u0003&\u0013\u0000"+
		"\u00d3\u00d4\u0005+\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0003.\u0017\u0000\u00d6\u00d7\u0003*\u0015\u0000\u00d7\u00d8\u0003."+
		"\u0017\u0000\u00d8\u00e8\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000e"+
		"\u0000\u0000\u00da\u00db\u0003*\u0015\u0000\u00db\u00dc\u0003.\u0017\u0000"+
		"\u00dc\u00e8\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0019\u0000\u0000"+
		"\u00de\u00df\u0003*\u0015\u0000\u00df\u00e0\u0003.\u0017\u0000\u00e0\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0019\u0000\u0000\u00e2\u00e3"+
		"\u0005,\u0000\u0000\u00e3\u00e8\u0005\u0019\u0000\u0000\u00e4\u00e8\u0003"+
		".\u0017\u0000\u00e5\u00e8\u0005\u0019\u0000\u0000\u00e6\u00e8\u0005\u000e"+
		"\u0000\u0000\u00e7\u00d5\u0001\u0000\u0000\u0000\u00e7\u00d9\u0001\u0000"+
		"\u0000\u0000\u00e7\u00dd\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\'\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0019\u0000\u0000\u00ea\u00eb\u0005\u001f\u0000"+
		"\u0000\u00eb\u00fe\u0005\u0017\u0000\u0000\u00ec\u00ed\u0005\u0019\u0000"+
		"\u0000\u00ed\u00ee\u0005!\u0000\u0000\u00ee\u00fe\u0005\u0017\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0019\u0000\u0000\u00f0\u00f1\u0005\"\u0000\u0000\u00f1"+
		"\u00fe\u0005\u0017\u0000\u0000\u00f2\u00f3\u0005\u0019\u0000\u0000\u00f3"+
		"\u00f4\u0005 \u0000\u0000\u00f4\u00fe\u0005\u0017\u0000\u0000\u00f5\u00f6"+
		"\u0005\u0019\u0000\u0000\u00f6\u00f7\u0005#\u0000\u0000\u00f7\u00fe\u0005"+
		"\u0017\u0000\u0000\u00f8\u00f9\u0005\u0019\u0000\u0000\u00f9\u00fa\u0005"+
		"#\u0000\u0000\u00fa\u00fe\u0005\u000e\u0000\u0000\u00fb\u00fe\u0005$\u0000"+
		"\u0000\u00fc\u00fe\u0005%\u0000\u0000\u00fd\u00e9\u0001\u0000\u0000\u0000"+
		"\u00fd\u00ec\u0001\u0000\u0000\u0000\u00fd\u00ef\u0001\u0000\u0000\u0000"+
		"\u00fd\u00f2\u0001\u0000\u0000\u0000\u00fd\u00f5\u0001\u0000\u0000\u0000"+
		"\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe)\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0007\u0001\u0000\u0000\u0100+\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0007\u0002\u0000\u0000\u0102-\u0001\u0000\u0000\u0000\u0103\u0104\u0007"+
		"\u0000\u0000\u0000\u0104/\u0001\u0000\u0000\u0000\u000f5@JV[|\u0085\u008e"+
		"\u00a4\u00ac\u00c0\u00ca\u00ce\u00e7\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}