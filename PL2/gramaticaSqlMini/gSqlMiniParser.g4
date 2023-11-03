parser grammar gSqlMiniParser;

options{
    tokenVocab = gSqlMiniLexer;
    language = Java;
}
/*
Aclaración sobre los operadores:

* --> Podria no haber nada o haber muchos
+ --> Tiene que haber uno o muchos
 */

consultaSelect : SELECT columnas FROM nombreTabla sentenciaWhere? sentenciaOrderBy?;
columnas: nombreColumna (COMA nombreColumna)*;
nombreColumna: ID;
nombreTabla: ID;
sentenciaWhere: WHERE expresion;
sentenciaOrderBy: ORDER BY nombreColumna metodoOrdenacion;
metodoOrdenacion: ASC | DESC;
expresion: ABREPARENTESIS expresion CIERRAPARENTESIS
         | expresion AND expresion
         | expresion OR expresion
         | nombreColumna IGUALQUE (NUMERO | STRING)
         | nombreColumna (MAYORQUE | MAYORIGUALQUE) NUMERO;