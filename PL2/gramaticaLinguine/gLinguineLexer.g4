lexer grammar gLinguineLexer;

ASINGACION: 'let';
IF: 'if';
THEN: 'then';
ELSE: 'else';
FUNCION: 'fun';
SHOW: 'show';
MATCH: 'match';
WITH: 'with';
DEFAULT: '?';
FLECHA: '->';
OR: '|';
IDENTIFICADOR: [a-zA-Z]+;
IGUALQUE: '=';
MAYORQUE: '>';
MENORIGUALQUE: '<=';
SUMA: '+';
RESTA: '-';
MULTIPLICACION: '*';
DIVISION: '/';
ABREPARENTESIS: '(';
CIERRAPARENTESIS: ')';
ENTERO: [0-9]+;
COMA: ',';
PUNTOYCOMA: ';';
INTRO: '\r\n';
ESPACIO: [ \t\r\n]+ -> skip; //Ignoramos los espacios en blanco