.class public ParamFunction ; Define una clase pública llamada ParamFunction
.super java/lang/Object ; Hereda de la clase Object de Java

.method public static main([Ljava/lang/String;)V ; Define el método principal
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 100 ; Limita el número de variables locales a 100

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Llamando a funcionConParametro" ; Carga la constante "Llamando a funcionConParametro"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; Imprime la constante

   ldc 7 ; Carga la constante 7 (Parámetro: puedes cambiar este valor)
   invokestatic ParamFunction/funcionConParametro(I)I ; Llama a la función funcionConParametro con el parámetro
   istore_1 ; Almacena el resultado en la variable local 1

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   ldc "Resultado: " ; Carga la constante "Resultado: "
   invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V ; Imprime la constante

   getstatic java/lang/System/out Ljava/io/PrintStream; ; Obtiene la salida estándar
   iload_1 ; Carga el valor de la variable local 1
   invokevirtual java/io/PrintStream/println(I)V ; Imprime el valor almacenado

   return ; Termina la ejecución del método
.end method

.method public static funcionConParametro(I)I ; Define una función pública estática llamada funcionConParametro que toma un entero como parámetro y devuelve un entero
   .limit stack 100 ; Limita el tamaño de la pila a 100
   .limit locals 1 ; Limita el número de variables locales a 1

   iload_0 ; Carga el valor del parámetro en la pila (Cargar el parámetro en la pila)
   ldc 5 ; Carga la constante 5 (Puedes reemplazar esto con cualquier valor entero)
   imul ; Multiplica el valor del parámetro por 5
   ireturn ; Devuelve el resultado de la multiplicación
.end method