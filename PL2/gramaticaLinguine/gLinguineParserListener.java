// Generated from gLinguineParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gLinguineParser}.
 */
public interface gLinguineParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gLinguineParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gLinguineParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(gLinguineParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(gLinguineParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#saltoInstruccion}.
	 * @param ctx the parse tree
	 */
	void enterSaltoInstruccion(gLinguineParser.SaltoInstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#saltoInstruccion}.
	 * @param ctx the parse tree
	 */
	void exitSaltoInstruccion(gLinguineParser.SaltoInstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(gLinguineParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(gLinguineParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(gLinguineParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(gLinguineParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#sentenciaElseIf}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaElseIf(gLinguineParser.SentenciaElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#sentenciaElseIf}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaElseIf(gLinguineParser.SentenciaElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#sentenciaThen}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaThen(gLinguineParser.SentenciaThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#sentenciaThen}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaThen(gLinguineParser.SentenciaThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#sentenciaElse}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaElse(gLinguineParser.SentenciaElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#sentenciaElse}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaElse(gLinguineParser.SentenciaElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(gLinguineParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(gLinguineParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(gLinguineParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(gLinguineParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(gLinguineParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(gLinguineParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(gLinguineParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(gLinguineParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(gLinguineParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(gLinguineParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(gLinguineParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(gLinguineParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(gLinguineParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(gLinguineParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(gLinguineParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(gLinguineParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gLinguineParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(gLinguineParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gLinguineParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(gLinguineParser.OperandoContext ctx);
}