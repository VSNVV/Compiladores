.class public FuncionSinParametros ; Define una clase pública llamada FuncionSinParametros
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Llamando a miFuncion" ; Carga la constante "Llamando a miFuncion"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante

   invokestatic FuncionSinParametros/miFuncion()V ; Llama a la función miFuncion

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Llamada a miFuncion completada" ; Carga la constante "Llamada a miFuncion completada"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante

   return ; Termina la ejecución del método
.end method

.method public static miFuncion()V ; Define una función que no devuelve ningún valor
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "En miFuncion" ; Carga la constante "En miFuncion"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante

   return ; Termina la ejecución del método
.end method