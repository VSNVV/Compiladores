lexer grammar gSqlMiniLexer;

//Aquí pondremos los simbolos terminales que tiene nuestro SqlMini

SELECT: 'SELECT' -> pushMode(CONSULTA_SELECT_MODE);
EXPRESION: [a-zA-Z]+;
FROM: 'FROM';
WHERE: 'WHERE';
ORDERBY: 'ORDER BY';
ASC: 'ASC';
DESC: 'DESC';
AND: 'AND';
OR: 'OR';
OPERADOR: '>'|'<'|'>='|'<='|'=';
CARACTER: .+?;
SEPARADOR: ',';
ESPACIO: ' ' -> skip;
APERTURAEXPRESION: '(';
CIERREEXPRESION: ')';

INTRO: '\r\n'; //En windows se indican asi los saltos de linea

//MODOS

mode CONSULTA_SELECT_MODE;

mode CONSULTA_FROM_MODE;

mode CONSULTA_WHERE_MODE;
