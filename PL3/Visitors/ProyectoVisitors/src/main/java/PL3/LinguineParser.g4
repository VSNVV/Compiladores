parser grammar LinguineParser;

options{
    tokenVocab = LinguineLexer;
    language = Java;
}

programa: (instruccion PUNTOYCOMA)*;

instruccion: (asignacion
            | condicional
            | declaracionFuncion
            | llamadaFuncion
            | show
            | match
            | sentenciaWhile
            | sentenciaFor)
            ;

saltoInstruccion: INTRO;

asignacion: ASINGACION IDENTIFICADOR IGUAL (expresion | llamadaFuncion | ENTERO | STRING);

condicional: IF ABREPARENTESIS booleano CIERRAPARENTESIS sentenciaThen sentenciaElseIf? sentenciaElse;

sentenciaElseIf: ELSE IF ABREPARENTESIS expresion CIERRAPARENTESIS sentenciaThen;

sentenciaThen: THEN ABREPARENTESIS? instruccion CIERRAPARENTESIS? (operador ABREPARENTESIS instruccion CIERRAPARENTESIS)*;

sentenciaElse: ELSE ABREPARENTESIS? instruccion CIERRAPARENTESIS?;

declaracionFuncion: FUNCION IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS FLECHA instruccion;

llamadaFuncion: IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS;

match: MATCH (expresion | llamadaFuncion) WITH (INTRO? OR (operando | DEFAULT) | FLECHA expresion)+;

sentenciaWhile: WHILE ABREPARENTESIS expresion CIERRAPARENTESIS;

sentenciaFor: FOR ABREPARENTESIS CIERRAPARENTESIS;

parametros: (operando (COMA operando)*
            | expresion);


show: SHOW ABREPARENTESIS instruccion CIERRAPARENTESIS;

expresion: ENTERO DIVISION ENTERO
         | ENTERO MULTIPLICACION ENTERO
         | STRING MULTIPLICACION ENTERO
         | ENTERO SUMA ENTERO
         | ENTERO RESTA ENTERO
         | STRING SUMA ENTERO
         ;

booleano: IDENTIFICADOR MAYORQUE ENTERO
        | IDENTIFICADOR MAYORIGUALQUE ENTERO
        | IDENTIFICADOR MENORIGUALQUE ENTERO
        | IDENTIFICADOR MENORQUE ENTERO
        | IDENTIFICADOR IGUALQUE ENTERO
        | IDENTIFICADOR IGUALQUE STRING
        | TRUE
        | FALSE
        ;

operador: SUMA | RESTA | MULTIPLICACION | DIVISION | MAYORQUE | MENORIGUALQUE;

operando: STRING | ENTERO;