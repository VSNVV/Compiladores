.class public Oper ; Define una clase pública llamada Oper
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Comparador de numeros" ; Carga la constante "Comparador de numeros"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante
   
   ldc 5 ; Carga la constante 5
   ldc 7 ; Carga la constante 7

   Comparador: ; Comienzo de la estructura if     
      if_icmpeq  Verdadero ; Salta a Verdadero si las dos constantes son iguales
      goto Falso ; Salta a Falso

   Verdadero: ; Cuerpo del if
      getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
      ldc "True" ; Carga la constante "True"
      invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante "True"
      goto Fin ; Salta a Fin   

   Falso: ; Cuerpo del else
      getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
      ldc "False" ; Carga la constante "False"
      invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante "False"

   Fin: ; Fin de la estructura if  
      return ; Termina la ejecución del método
.end method