package PL3;

import java.util.HashMap;

public class TablaSimbolos {
    //Atributos de la clase TablaSimbolos
    private final HashMap<String, String> tabla;

    //Métodos de la clase TablaSimbolos

    //Constructor
    public TablaSimbolos() {
        // Inicializar el mapa de símbolos aquí
        this.tabla = new HashMap <String, String>();
    }

    //Metodo para anadir simbolos a la tabla
    public void anadirSimbolo(String simbolo, String valor) {
        getTabla().put(simbolo, valor);
    }

    //Metodo para obtener el valor de un simbolo determinado
    public String getSymbolValue(String simbolo) {
        return getTabla().get(simbolo);
    }

    //Metodo para actualizar el valor de un simbolo determinado
    public void updateSymbolValue(String simbolo, String nuevoValor) {
        getTabla().remove(simbolo);
        getTabla().put(simbolo, nuevoValor);
    }

    //Método Get
    public HashMap<String, String> getTabla() {
        return this.tabla;
    }
}

