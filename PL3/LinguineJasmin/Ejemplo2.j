.class Ejemplo
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit locals 1
    .limit stack  2

    ldc 2          ; Carga el numero 2 en la pila
    ldc 3          ; Carga el numero 3 en la pila
    iadd           ; Hace la suma de 2 y 3, y el resultado lo almacena en la pila
    istore_0       ; Almacena el resultado de la suma en la variable local 0 (que es x)

    return
.end method
