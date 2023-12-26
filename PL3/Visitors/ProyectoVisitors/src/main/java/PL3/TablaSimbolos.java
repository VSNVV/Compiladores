package PL3;

import java.lang.reflect.Type;
import java.util.HashMap;

public class TablaSimbolos {
    //Atributos de la clase TablaSimbolos
    private final HashMap<String, InfoSimbolo> tabla;

    //Métodos de la clase TablaSimbolos

    //Constructor
    public TablaSimbolos() {
        // Inicializar el mapa de símbolos aquí
        this.tabla = new HashMap<>();
    }

    //Metodo para anadir simbolos a la tabla
    public void anadirSimbolo(String simbolo, Object valor, String tipo) {
        //Primero debemos comprobar si el simbolo ya está registrado en la tabla
        if(getTabla().get(simbolo) != null){
            //El simbolo existe, por tanto, lo tenemos que actualizar
            actualizarSimbolo(simbolo, valor, tipo);
        }
        else{
            getTabla().put(simbolo, new InfoSimbolo(valor, tipo, numTotalSimbolos()));
        }
    }

    //Método para borrar un símbolo
    public void borrarSimbolo(String simbolo){
        getTabla().remove(simbolo);
    }

    //Método para actualizar la información de un símbolo
    public void actualizarSimbolo(String simbolo, Object valor, String tipo){
        getTabla().get(simbolo).setValor(valor);
        getTabla().get(simbolo).setTipo(tipo);
    }


    public int numTotalSimbolos(){
        return getTabla().size();
    }

    public void imprimeTabla(){
        getTabla().forEach((clave, valor) ->
                System.out.println("Nombre: " + clave + "\tValor: " + valor.getValor() +
                        "\tTipo: " + valor.getTipo() + "\tRegistro: " + valor.getRegistro()));
    }

    //Método Get
    public HashMap<String, InfoSimbolo> getTabla() {
        return this.tabla;
    }
}