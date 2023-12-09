package PL3;
// Generated from LinguineParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguineParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguineParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LinguineParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asig}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(LinguineParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(LinguineParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecFuncion}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFuncion(LinguineParser.DecFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LlamFuncion}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamFuncion(LinguineParser.LlamFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LinguineParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(LinguineParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LinguineParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LinguineParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LinguineParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Oper}
	 * labeled alternative in {@link LinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(LinguineParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#saltoInstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaltoInstruccion(LinguineParser.SaltoInstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LinguineParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(LinguineParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#sentenciaElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElseIf(LinguineParser.SentenciaElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#sentenciaThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaThen(LinguineParser.SentenciaThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#sentenciaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElse(LinguineParser.SentenciaElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(LinguineParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(LinguineParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(LinguineParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#sentenciaWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaWhile(LinguineParser.SentenciaWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#sentenciaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaFor(LinguineParser.SentenciaForContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LinguineParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LinguineParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(LinguineParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(LinguineParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(LinguineParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(LinguineParser.OperandoContext ctx);
}