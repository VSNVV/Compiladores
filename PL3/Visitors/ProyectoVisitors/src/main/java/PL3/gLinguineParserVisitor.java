package PL3;// Generated from gLinguineParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gLinguineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gLinguineParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gLinguineParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asig}
	 * labeled alternative in {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(gLinguineParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(gLinguineParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecFuncion}
	 * labeled alternative in {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFuncion(gLinguineParser.DecFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LlamFuncion}
	 * labeled alternative in {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamFuncion(gLinguineParser.LlamFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(gLinguineParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(gLinguineParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr}
	 * labeled alternative in {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(gLinguineParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Oper}
	 * labeled alternative in {@link gLinguineParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(gLinguineParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#saltoInstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaltoInstruccion(gLinguineParser.SaltoInstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(gLinguineParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(gLinguineParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#sentenciaElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElseIf(gLinguineParser.SentenciaElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#sentenciaThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaThen(gLinguineParser.SentenciaThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#sentenciaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElse(gLinguineParser.SentenciaElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(gLinguineParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(gLinguineParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(gLinguineParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(gLinguineParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(gLinguineParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(gLinguineParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(gLinguineParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(gLinguineParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gLinguineParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(gLinguineParser.OperandoContext ctx);
}