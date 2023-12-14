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

condicional: IF ABREPARENTESIS booleano CIERRAPARENTESIS bloqueThen sentenciaElseIf? bloqueElse;

bloqueThen: THEN (instruccion|expresion);

bloqueElse: ELSE (instruccion|expresion);

sentenciaElseIf: ELSE IF ABREPARENTESIS expresion CIERRAPARENTESIS bloqueThen;

declaracionFuncion: FUNCION IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS FLECHA instruccion;

llamadaFuncion: IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS;

match: MATCH IDENTIFICADOR WITH OR ENTERO FLECHA STRING OR ENTERO FLECHA STRING OR DEFAULT FLECHA STRING;

sentenciaWhile: WHILE ABREPARENTESIS booleano CIERRAPARENTESIS;

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