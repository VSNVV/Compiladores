package pl1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AutomataFinitoDeterminista {
    //Atributos de la clase AutomataFinitoDeterminista
    private final List<Character> alfabeto; //Lista de elementos
    private List<Integer> estados; //Los estados serán representados mediante enteros
    private List<Integer> estadosFinales; //Almacena los estados finales
    private Integer estadoInicial; //Almacena el estado inicial
    private HashMap<Integer, HashMap<Character, Integer>> matriz; //Matriz de estados

    //Métodos de la clase AutomataFinitoDeterminista

    //Constructor
    public AutomataFinitoDeterminista(String alfabeto, List<Integer> listaEstados, List<Integer> listaEstadosFinales){
        this.alfabeto = new ArrayList<>();
        this.estadoInicial = 0;
        this.cargaAlfabeto(alfabeto);
        this.cargaEstados(listaEstados);
        this.cargaEstadosFinales(listaEstadosFinales);
        this.inicializaMatriz();
    }

    //Método para cargar el alfabeto
    public void cargaAlfabeto(String alfabeto){
        //Añade el alfabeto a la lista de alfabeto recorriendo la cadena posición a posición
        for(int pos = 0; pos < alfabeto.length(); pos++){
            getAlfabeto().add(alfabeto.charAt(pos));
        }
    }

    //Método para cargar los estados
    public void cargaEstados(List<Integer> listaEstados){
        //Recorre la listaEstados y los añade a la del Autómata
        this.estados = listaEstados;
    }

    //Método para establecer los estados finales
    public void cargaEstadosFinales(List<Integer> listaEstadosFinales){
        this.estadosFinales = listaEstadosFinales;
    }

    //Método para inicializar la matriz
    public void inicializaMatriz(){
        //Creamos para cada estado su matriz y posteriormente rellenaremos ese segundo hashmap
        for(int estado : getEstados()){
            getMatriz().put(estado, new HashMap<Character, Integer>());
        }
    }

    //Añadimos el estado en la posición que corresponde
    public void cargarMatriz(int estado, char caracter, int estadoSiguiente){
        getMatriz().get(estado).put(caracter, estadoSiguiente);
    }

    //Método para ver el siguiente paso
    public Integer getSiguientePaso(int estado, char caracter){
        return getMatriz().get(estado).get(caracter);
    }

    //Método para ver si el estado es final
    public boolean isFinal(int estado){
        return getEstadosFinales().contains(estado);
    }

    //Métodos get y set
    public List<Character> getAlfabeto() {
        return this.alfabeto;
    }

    public List<Integer> getEstados() {
        return this.estados;
    }

    public List<Integer> getEstadosFinales() {
        return this.estadosFinales;
    }

    public Integer getEstadoInicial() {
        return this.estadoInicial;
    }

    public HashMap<Integer, HashMap<Character, Integer>> getMatriz() {
        return this.matriz;
    }
}
