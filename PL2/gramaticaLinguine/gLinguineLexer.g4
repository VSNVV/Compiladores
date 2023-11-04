lexer grammar gLinguineLexer;

ASINGACION: 'let';
IF: 'if';
THEN: 'then';
ELSE: 'else';
FUNCION: 'fun';
SHOW: 'show';
RETORNO: '->';
IDENTIFICADOR: [a-zA-Z]+;
IGUALQUE: '=';
MAYORQUE: '>';
SUMA: '+';
ABREPARENTESIS: '(';
CIERRAPARENTESIS: ')';
ENTERO: [0-9]+;
COMA: ',';
PUNTOYCOMA: ';';
INTRO: '\r\n';

ESPACIO: [ \t\r\n]+ -> skip; //Ignoramos los espacios en blanco