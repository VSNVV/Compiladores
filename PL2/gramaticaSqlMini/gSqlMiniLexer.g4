lexer grammar gSqlMiniLexer;

//Aquí pondremos los simbolos terminales que tiene nuestro SqlMini

SELECT: 'SELECT' | 'select';
EXPRESION: [a-zA-Z]+;
FROM: 'FROM' | 'from';
WHERE: 'WHERE' | 'where';
CARACTER: .+?;
SEPARADOR: ',';
APERTURAEXPRESION: '(';
CIERREEXPRESION: ')';

INTRO: '\r\n'; //En windows se indican asi los saltos de linea