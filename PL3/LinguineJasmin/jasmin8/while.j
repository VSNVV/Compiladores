.class public While ; Define una clase pública llamada While
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "while (i < 10){System.out.println(i);i++;}" ; Carga la constante "while (i < 10){System.out.println(i);i++;}"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante

   ldc 0 ; Carga la constante 0
   ldc 10 ; Carga la constante 10
   istore 0 ; Almacena el valor en la variable local 0
   istore 1 ; Almacena el valor en la variable local 1
   iload 1 ; Carga el valor de la variable local 1
   iload 0 ; Carga el valor de la variable local 0
  
   While: ; Comienzo del bucle
      if_icmple Si ; Salta a Si si el valor de la variable local 1 es menor o igual al valor de la variable local 0
      goto No ; Salta a No

   Si: ; Cuerpo del bucle
      getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
      iload 1 ; Carga el valor de la variable local 1
      invokevirtual java/io/PrintStream/println(I)V ; Imprime el valor de la variable local 1

      iinc 1 1 ; Incrementa el valor de la variable local 1 en 1
      iload 1 ; Carga el valor de la variable local 1
      iload 0 ; Carga el valor de la variable local 0
      goto While ; Salta a While
   
   No: ; Fin del bucle

   return ; Termina la ejecución del método
.end method