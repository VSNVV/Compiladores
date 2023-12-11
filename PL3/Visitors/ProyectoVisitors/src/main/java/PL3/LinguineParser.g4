parser grammar LinguineParser;

options{
    tokenVocab = LinguineLexer;
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

asignacion: ASINGACION IDENTIFICADOR IGUAL (expresion | llamadaFuncion);

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

string: COMILLAS IDENTIFICADOR COMILLAS;

show: SHOW ABREPARENTESIS instruccion CIERRAPARENTESIS;

expresion: ENTERO DIVISION ENTERO           #DivisionEnteros
         | ENTERO MULTIPLICACION ENTERO     #MultEnteros
         | ENTERO SUMA ENTERO               #SumEnteros
         | ENTERO RESTA ENTERO              #RestaEnteros
         | string MULTIPLICACION ENTERO     #MultString
         | string SUMA ENTERO               #ConcatString
         ;

booleano: ENTERO MAYORQUE ENTERO
        | ENTERO MENORIGUALQUE ENTERO
        | ENTERO MENORQUE ENTERO
        | ENTERO IGUALQUE ENTERO
        | string IGUALQUE string
        ;

operador: SUMA | RESTA | MULTIPLICACION | DIVISION | MAYORQUE | MENORIGUALQUE;

operando: string | ENTERO;