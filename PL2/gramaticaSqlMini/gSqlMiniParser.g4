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

fichero: ((consulta) | (INTRO))*;

consulta: SELECT+ expresion*;

consultaFrom: FROM tabla;

consultaWhere: WHERE;

expresion: (EXPRESION) | (EXPRESION SEPARADOR EXPRESION);

tabla: EXPRESION;

texto: CARACTER+;