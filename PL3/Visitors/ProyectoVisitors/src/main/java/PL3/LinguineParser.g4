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

asignacion: ASIGNACION IDENTIFICADOR IGUAL (expresion | (ENTERO | FLOAT) | STRING);

condicional: IF ABREPARENTESIS booleano CIERRAPARENTESIS bloqueThen bloqueElse;

bloqueThen: THEN (instruccion|expresion);

bloqueElse: ELSE (instruccion|expresion);

copiaCadena: COPY ABREPARENTESIS IDENTIFICADOR COMA ENTERO COMA ENTERO CIERRAPARENTESIS;

concatenarCadenas: CONCAT ABREPARENTESIS IDENTIFICADOR COMA IDENTIFICADOR CIERRAPARENTESIS;

extraerCadena: EXTRACT ABREPARENTESIS IDENTIFICADOR COMA ENTERO COMA ENTERO CIERRAPARENTESIS;

arrayDeNumeros: ABRECORCHETE (ENTERO|FLOAT) (COMA (ENTERO|FLOAT))* CIERRACORCHETE;

declaracionFuncion: FUNCION IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS FLECHA instruccion;

llamadaFuncion: IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS;

match: MATCH IDENTIFICADOR WITH ORMATCH ENTERO FLECHA STRING ORMATCH ENTERO FLECHA STRING ORMATCH DEFAULT FLECHA STRING;

sentenciaWhile: WHILE (booleano? ABREPARENTESIS booleano CIERRAPARENTESIS)+ bloqueInstrucciones;

sentenciaFor: FOR ABREPARENTESIS asignacion PUNTOYCOMA booleano PUNTOYCOMA asignacion CIERRAPARENTESIS bloqueInstrucciones;

bloqueInstrucciones: ABRELLAVE (instruccion PUNTOYCOMA)* CIERRALLAVE;

parametros: (operando (COMA operando)*
            | expresion);


show: SHOW ABREPARENTESIS expresion CIERRAPARENTESIS;

expresion: (ENTERO|FLOAT) DIVISION (ENTERO|FLOAT)
         | (ENTERO|FLOAT) MULTIPLICACION (ENTERO|FLOAT)
         | STRING MULTIPLICACION (ENTERO|FLOAT)
         | (ENTERO|FLOAT) SUMA (ENTERO|FLOAT)
         | (ENTERO|FLOAT) RESTA (ENTERO|FLOAT)
         | STRING SUMA (ENTERO|FLOAT)
         | (ENTERO|FLOAT)
         | IDENTIFICADOR
         | IDENTIFICADOR SUMA (ENTERO|FLOAT)
         | IDENTIFICADOR RESTA (ENTERO|FLOAT)
         | IDENTIFICADOR COMA IDENTIFICADOR
         | STRING
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