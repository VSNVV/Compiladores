.class public MultiParamFunction ; Define una clase pública llamada MultiParamFunction
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Llamando a funcionConMultiplesParametros" ; Carga la constante "Llamando a funcionConMultiplesParametros"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante

   ldc 7 ; Carga la constante 7 (Primer parámetro)
   ldc 5 ; Carga la constante 5 (Segundo parámetro)
   invokestatic MultiParamFunction/funcionConMultiplesParametros(II)I ; Llama a la función funcionConMultiplesParametros con los parámetros
   istore_1 ; Almacena el resultado en la variable local 1

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Resultado: " ; Carga la constante "Resultado: "
   invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V ; Imprime la constante

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   iload_1 ; Carga el valor de la variable local 1
   invokevirtual java/io/PrintStream/println(I)V ; Imprime el valor almacenado

   return ; Termina la ejecución del método
.end method

.method public static funcionConMultiplesParametros(II)I ; Define una función pública estática llamada funcionConMultiplesParametros que toma dos enteros como parámetros y devuelve un entero
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 2 ; Limita el número de variables locales a 2

   iload_0 ; Carga el valor del primer parámetro en la pila
   iload_1 ; Carga el valor del segundo parámetro en la pila
   iadd ; Suma los valores de los parámetros
   ireturn ; Devuelve el resultado de la suma
.end method