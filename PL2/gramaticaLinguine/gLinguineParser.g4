parser grammar gLinguineParser;

options{
    tokenVocab = gLinguineLexer;
    language = Java;
}

programa: instruccion (saltoInstruccion+ instruccion)* saltoInstruccion*;

instruccion: asignacion
            | condicional
            | declaracionFuncion
            | llamadaFuncion
            | show
            | INTRO
            | expresion;

saltoInstruccion: INTRO;

asignacion: ASINGACION IDENTIFICADOR IGUALQUE instruccion PUNTOYCOMA;

condicional: IF ABREPARENTESIS instruccion MAYORQUE instruccion CIERRAPARENTESIS THEN asignacion ELSE asignacion;

declaracionFuncion: FUNCION IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS RETORNO expresion PUNTOYCOMA;

llamadaFuncion: IDENTIFICADOR ABREPARENTESIS parametros? CIERRAPARENTESIS;

parametros: IDENTIFICADOR (COMA IDENTIFICADOR)*
            | ENTERO (COMA ENTERO)*;

show: SHOW ABREPARENTESIS instruccion CIERRAPARENTESIS PUNTOYCOMA;

expresion: operando (SUMA operando)*;

operando: IDENTIFICADOR | ENTERO;