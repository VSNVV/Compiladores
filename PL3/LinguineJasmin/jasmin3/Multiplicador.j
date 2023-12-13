.class public Multiplicador ; Define una clase pública llamada Multiplicador
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc 3 ; Carga la constante 3
   ldc 2 ; Carga la constante 2
   imul ; Multiplica las dos constantes
   ldc 5 ; Carga la constante 5
   imul ; Multiplica el resultado anterior por la constante 5
   invokevirtual java/io/PrintStream/println(I)V ; Imprime el resultado de la multiplicación

   return ; Termina la ejecución del método

.end method