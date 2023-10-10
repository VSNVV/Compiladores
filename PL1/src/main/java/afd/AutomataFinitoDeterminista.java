package afd;

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
    public AutomataFinitoDeterminista(){
        this.alfabeto = new ArrayList<>();
        this.estados = new ArrayList<>();
        this.estadosFinales = new ArrayList<>();
        this.estadoInicial = 0;
        this.matriz = new HashMap<>();
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
        for (int estado : listaEstados) {
            getEstados().add(estado);
        }
    }

    //Método para establecer el estado inicial
    public void estableceEstadoInicial(int estadoInicial){
        //Indica el estado inicial por el que empieza el Autómata
        setEstadoInicial(estadoInicial);
    }

    //Método para establecer los estados finales
    public void estableceEstadosFinales(int estado){
        getEstadosFinales().add(estado); //Añade el estado a la lista de estados finales
    }

    //Método para inicializar la matriz
    public void inicializaMatriz(){
        int estado;
        //Tendremos que recorrer el arraylist de estados y meterlos todos
        for(int index = 0; index < getEstados().size(); index++){
            estado = getEstados().get(index);
            getMatriz().put(estado, new HashMap<Character, Integer>()); //Añadimos con put
        }
    }

    //Añadimos el estado en la posición que corresponde
    public void cargarMatriz(int index, char caracter, int estado){
        getMatriz().get(index).put(caracter, estado);
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
        return alfabeto;
    }

    public List<Integer> getEstados() {
        return estados;
    }

    public void setEstados(List<Integer> estados) {
        this.estados = estados;
    }

    public List<Integer> getEstadosFinales() {
        return estadosFinales;
    }

    public void setEstadosFinales(List<Integer> estadosFinales) {
        this.estadosFinales = estadosFinales;
    }

    public Integer getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(Integer estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public HashMap<Integer, HashMap<Character, Integer>> getMatriz() {
        return matriz;
    }

    public void setMatriz(HashMap<Integer, HashMap<Character, Integer>> matriz) {
        this.matriz = matriz;
    }
}
