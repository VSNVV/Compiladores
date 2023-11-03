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

consulta: SELECT+ atributo*;

consultaFrom: FROM;

expresion: (atributo) | (atributo SEPARADOR atributo);

atributo: CARACTER+;