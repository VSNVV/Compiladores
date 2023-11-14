// Generated from c:/Users/david/OneDrive - Universidad de Alcala/Mi unidad/UNI/Cuarto/Compiladores/LAB/Compiladores/PL2/gramaticaSqlMini/gSqlMiniParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gSqlMiniParser}.
 */
public interface gSqlMiniParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gSqlMiniParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gSqlMiniParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#consultaSelect}.
	 * @param ctx the parse tree
	 */
	void enterConsultaSelect(gSqlMiniParser.ConsultaSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#consultaSelect}.
	 * @param ctx the parse tree
	 */
	void exitConsultaSelect(gSqlMiniParser.ConsultaSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#columnas}.
	 * @param ctx the parse tree
	 */
	void enterColumnas(gSqlMiniParser.ColumnasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#columnas}.
	 * @param ctx the parse tree
	 */
	void exitColumnas(gSqlMiniParser.ColumnasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#nombreColumna}.
	 * @param ctx the parse tree
	 */
	void enterNombreColumna(gSqlMiniParser.NombreColumnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#nombreColumna}.
	 * @param ctx the parse tree
	 */
	void exitNombreColumna(gSqlMiniParser.NombreColumnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#nombreTabla}.
	 * @param ctx the parse tree
	 */
	void enterNombreTabla(gSqlMiniParser.NombreTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#nombreTabla}.
	 * @param ctx the parse tree
	 */
	void exitNombreTabla(gSqlMiniParser.NombreTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#sentenciaWhere}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaWhere(gSqlMiniParser.SentenciaWhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#sentenciaWhere}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaWhere(gSqlMiniParser.SentenciaWhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#sentenciaOrderBy}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaOrderBy(gSqlMiniParser.SentenciaOrderByContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#sentenciaOrderBy}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaOrderBy(gSqlMiniParser.SentenciaOrderByContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#metodoOrdenacion}.
	 * @param ctx the parse tree
	 */
	void enterMetodoOrdenacion(gSqlMiniParser.MetodoOrdenacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#metodoOrdenacion}.
	 * @param ctx the parse tree
	 */
	void exitMetodoOrdenacion(gSqlMiniParser.MetodoOrdenacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(gSqlMiniParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(gSqlMiniParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(gSqlMiniParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(gSqlMiniParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link gSqlMiniParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(gSqlMiniParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gSqlMiniParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(gSqlMiniParser.ExpresionContext ctx);
}