.class public FuncionConRetornoEntero ; Define una clase pública llamada FuncionConRetornoEntero
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Llamando a funcionConRetorno" ; Carga la constante "Llamando a funcionConRetorno"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante

   invokestatic FuncionConRetornoEntero/funcionConRetorno()I ; Llama a la función funcionConRetorno
   istore_1 ; Almacena el resultado en la variable local 1

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Resultado: " ; Carga la constante "Resultado: "
   invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V ; Imprime la constante

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   iload_1 ; Carga el valor de la variable local 1
   invokevirtual java/io/PrintStream/println(I)V ; Imprime el valor de la variable local 1

   return ; Termina la ejecución del método
.end method

.method public static funcionConRetorno()I ; Define una función que devuelve un entero
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   ldc 42 ; Carga la constante 42
   ireturn ; Devuelve el valor entero
.end method