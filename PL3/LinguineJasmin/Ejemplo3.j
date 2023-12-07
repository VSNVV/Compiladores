.class Ejemplo
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit locals 2
    .limit stack  2

    ; Supongamos que x ya está en la variable local 0

    iload_0        ; Cargamos el valor de x en la pila
    iconst_2       ; Cargamos el numero 2 en la pila
    if_icmpgt mayor_que_dos ; Compara x con 2 y salta a la etiqueta mayor_que_dos en caso de que x > 2

    ; Código para el caso en que x <= 2
    iconst_0       ; Carga el numero 0 en la pila
    istore_1       ; Almacena el numero 0 en la variable local 1 (que es y)
    goto fin       ; Salta a la etiqueta Fin

mayor_que_dos:
    ; Codigo si se cumple que x > 2
    iconst_1       ; Carga el numero 1 en la pila
    istore_1       ; Almacena el numero 1 en la variable local 1 (que es y)

fin:
    ; Se sigue ejecutando el resto de nuestro programa

    return
.end method
