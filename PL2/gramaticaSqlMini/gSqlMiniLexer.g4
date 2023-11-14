lexer grammar gSqlMiniLexer;

//Aquí pondremos los simbolos terminales que tiene nuestro SqlMini

SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
ORDER: 'ORDER';
BY: 'BY';
ASC: 'ASC';
DESC: 'DESC';
COUNT: 'COUNT';
JOIN: 'JOIN';
ON: 'ON';
PUNTO: '.';
MAYORQUE: '>';
MAYORIGUALQUE: '>=';
IGUALQUE: '=';
ABREPARENTESIS: '(';
CIERRAPARENTESIS: ')';
NUMERO: [0-9]+ ('.' [0-9]+)?; //Ahora tambien evaluamos los numeros decimales
STRING: '\'' ~'\''* '\'';
COMA: ',';
AND: 'AND';
OR: 'OR';
ID: ([a-zA-Z]+) | '*'; // Identificadores (en este caso, nombres de columnas o tablas)
WS: [ \t\r\n]+ -> skip; // Ignorar espacios en blanco