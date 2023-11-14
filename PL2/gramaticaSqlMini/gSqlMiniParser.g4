parser grammar gSqlMiniParser;

options{
    tokenVocab = gSqlMiniLexer;
    language = Java;
}

programa: (consultaSelect)*;

consultaSelect : SELECT (columnas|count) FROM nombreTabla joinStatement? sentenciaWhere? sentenciaOrderBy?;


columnas: nombreColumna  (COMA nombreColumna )*;

nombreColumna: ID|nombreTabla (PUNTO nombreColumna);

nombreTabla: ID;

sentenciaWhere: WHERE expresion;

sentenciaOrderBy: ORDER BY nombreColumna  metodoOrdenacion;

metodoOrdenacion: ASC | DESC;

count: COUNT ABREPARENTESIS nombreColumna  CIERRAPARENTESIS;

joinStatement:  JOIN nombreTabla ON nombreColumna  IGUALQUE nombreColumna ;

expresion: ABREPARENTESIS expresion CIERRAPARENTESIS
         | expresion AND expresion
         | expresion OR expresion
         | nombreColumna  IGUALQUE (NUMERO | STRING)
         | nombreColumna  (MAYORQUE | MAYORIGUALQUE) NUMERO;
