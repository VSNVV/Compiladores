.class public BucleFor ; Define una clase pública llamada BucleFor
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "  for(i=0;0<=6;i++)" ; Carga la constante "  for(i=0;0<=6;i++)"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante

   ; Inicialización de la variable de control del bucle (i)
   iconst_0 ; Carga la constante 0
   istore_1 ; Almacena el valor en la variable local 1

   ; Comienzo del bucle
   ForLoop:
      
      iload_1 ; Carga el valor de la variable local 1
      ldc 6 ; Carga la constante 6
      if_icmpge EndLoop ; Salta a EndLoop si el valor de la variable local 1 es mayor o igual a 6

      ; Cuerpo del bucle
      ; Imprimir el valor de i
      getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
      iload_1 ; Carga el valor de la variable local 1
      invokevirtual java/io/PrintStream/println(I)V ; Imprime el valor de la variable local 1

      ; Incrementar i
      iinc 1 1 ; Incrementa el valor de la variable local 1 en 1

      ; Volver al comienzo del bucle (ForLoop)
      goto ForLoop ; Salta a ForLoop

   ; Fin del bucle
   EndLoop:
      return ; Termina la ejecución del método
.end method