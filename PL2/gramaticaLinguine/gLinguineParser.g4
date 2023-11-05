parser grammar gLinguineParser;

options{
    tokenVocab = gLinguineLexer;
    language = Java;
}

programa: (instruccion PUNTOYCOMA saltoInstruccion?)*;

instruccion: asignacion
            | condicional
            | declaracionFuncion
            | llamadaFuncion
            | show
            | match
            | expresion
            | operando;

saltoInstruccion: INTRO;

asignacion: ASINGACION IDENTIFICADOR IGUALQUE instruccion;

condicional: IF ABREPARENTESIS expresion CIERRAPARENTESIS THEN ABREPARENTESIS? instruccion CIERRAPARENTESIS? (operador ABREPARENTESIS instruccion CIERRAPARENTESIS)* ELSE ABREPARENTESIS? instruccion CIERRAPARENTESIS?;

declaracionFuncion: FUNCION IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS FLECHA instruccion;

llamadaFuncion: IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS;

match: MATCH expresion WITH (INTRO? OR (operando | DEFAULT) | FLECHA expresion)+;

parametros: (operando (COMA operando)*
            | expresion);

show: SHOW ABREPARENTESIS instruccion CIERRAPARENTESIS;

expresion: (operando | llamadaFuncion) (operador (operando | llamadaFuncion))*;

operador: SUMA | RESTA | MULTIPLICACION | DIVISION | MAYORQUE | MENORIGUALQUE;

operando: IDENTIFICADOR | ENTERO;