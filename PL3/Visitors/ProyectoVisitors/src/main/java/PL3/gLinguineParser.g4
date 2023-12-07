parser grammar gLinguineParser;

options{
    tokenVocab = gLinguineLexer;
    language = Java;
}

programa: (instruccion PUNTOYCOMA)*;

instruccion: asignacion                 # Asig
            | condicional               # Cond
            | declaracionFuncion        # DecFuncion
            | llamadaFuncion            # LlamFuncion
            | show                      # Print
            | match                     # Switch
            | sentenciaWhile            # While
            | sentenciaFor              # For
            | expresion                 # Expr
            | operando                  # Oper
            ;

saltoInstruccion: INTRO;

asignacion: ASINGACION IDENTIFICADOR IGUALQUE (expresion | condicional | match | llamadaFuncion);

condicional: IF ABREPARENTESIS expresion CIERRAPARENTESIS sentenciaThen sentenciaElseIf sentenciaElse?;

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

string: COMILLAS IDENTIFICADOR COMILLAS;

show: SHOW ABREPARENTESIS instruccion CIERRAPARENTESIS;

expresion: (operando | llamadaFuncion | string) (operador (operando | llamadaFuncion))*;

operador: SUMA | RESTA | MULTIPLICACION | DIVISION | MAYORQUE | MENORIGUALQUE;

operando: IDENTIFICADOR | ENTERO;