.class public Ifs ; Define una clase pública llamada Ifs
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "if (x < 4) y = 12; else y = 33  x = 2 en este caso" ; Carga la constante "if (x < 4) y = 12; else y = 33  x = 2 en este caso"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante

   ldc 2 ; Carga la constante 2
   istore 0 ; Almacena el valor en la variable local 0
   iload 0 ; Carga el valor de la variable local 0
   ldc 4 ; Carga la constante 4
  
   If1: ; Comienzo de la estructura if
      if_icmple Si ; Salta a Si si el valor de la variable local 0 es menor o igual a 4
      goto No ; Salta a No

   Si: ; Cuerpo del if
      getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
      ldc 12 ; Carga la constante 12
      invokevirtual java/io/PrintStream/println(I)V ; Imprime la constante 12
      goto FIN ; Salta a FIN

   No: ; Cuerpo del else
      getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
      ldc 33 ; Carga la constante 33
      invokevirtual java/io/PrintStream/println(I)V ; Imprime la constante 33
      goto FIN ; Salta a FIN

   FIN: ; Fin de la estructura if
      return ; Termina la ejecución del método
.end method