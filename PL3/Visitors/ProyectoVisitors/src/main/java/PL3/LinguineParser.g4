parser grammar LinguineParser;

options{
    tokenVocab = LinguineLexer;
    language = Java;
}

programa: (instruccion PUNTOYCOMA)*;

instruccion: asignacion
            | condicional
            | declaracionFuncion
            | llamadaFuncion
            | show
            | match
            | sentenciaWhile
            | sentenciaFor
            | STRING
            ;

saltoInstruccion: INTRO;

asignacion: ASINGACION IDENTIFICADOR IGUAL (expresion | llamadaFuncion | ENTERO | STRING);

condicional: IF ABREPARENTESIS expresion CIERRAPARENTESIS sentenciaThen sentenciaElseIf? sentenciaElse?;

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

booleano: ENTERO MAYORQUE ENTERO            # MayorQue
        | ENTERO MAYORIGUALQUE ENTERO       # MayorIgualQue
        | ENTERO MENORIGUALQUE ENTERO       # MenorIgualQue
        | ENTERO MENORQUE ENTERO            # MenorQue
        | ENTERO IGUALQUE ENTERO            # IgualQue
        | STRING IGUALQUE STRING            # IgualQueString
        | TRUE                              # True
        | FALSE                             # False
        ;

operador: SUMA | RESTA | MULTIPLICACION | DIVISION | MAYORQUE | MENORIGUALQUE;

operando: STRING | ENTERO;