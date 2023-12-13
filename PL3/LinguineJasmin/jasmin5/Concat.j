.class public Concatenador ; Define una clase pública llamada Concatenador
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Concatenacion: " ; Carga la constante "Concatenacion: "
   invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V ; Imprime la constante

   ldc 42 ; Carga la constante 42
   invokestatic java/lang/String/valueOf(I)Ljava/lang/String; ; Convierte el número a cadena
   astore_1 ; Almacena la cadena resultante en la variable local 1

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   aload_1 ; Carga la cadena almacenada en la variable local 1
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la cadena

   return ; Termina la ejecución del método
.end method