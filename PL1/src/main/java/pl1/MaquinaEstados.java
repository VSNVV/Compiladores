package pl1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaquinaEstados {
    //Atributos de la clase MaquinaEstados
    private Integer estadoActual = 0;
    private AutomataFinitoDeterminista afd;

    //Métodos de la clase MaquinaEstados

    //Método constructor
    public MaquinaEstados(AutomataFinitoDeterminista afd){
        this.afd = afd;
    }

    //Método para inicializar la máquina de estados
    public void inicializa(){
        //Cogemos el estado inicial a partir del autómata finito no determinista
        setEstadoActual(getAFD().getEstadoInicial());
    }

    //Método para aceptar carcateres
    public void acepta(char caracter){
        int estadoTemporal = getAFD().getSiguientePaso(getEstadoActual(), caracter);
        setEstadoActual(getAFD().getSiguientePaso(getEstadoActual(), caracter));
        setEstadoActual(estadoTemporal);
    }

    //Método para comprobar si el estado actual es final
    public boolean isFinal(){
        return getAFD().isFinal(getEstadoActual());
    }

    //Método para comprobar si una cadena es válida
    public boolean compruebaCadena(String cadena){
        this.inicializa(); //Reseteamos la máquina de estados al estado inicial de su autómata para empezar donde corresponde
        for(int pos = 0; pos < cadena.length(); pos++){
            char carcater = cadena.charAt(pos); //Cogemos el carácter que corresponda según la iteración
            try{
                this.acepta(carcater); //Pasamos del estado actual al siguiente
            }catch(Exception e){
                return false;
            }
            //Tenemos que comprobar si el estado en el que estamos es final
            if(isFinal()){
                //En caso de que sí lo sea, la cadena ya será válida
                return true;
            }
        }
        //Si ha recorrido el for sin estar en ningún estado final, la cadena será inválida
        return false;
    }

    //Método para generar cadenas válidas
    public void generaCadenasValidas(){
        int numCadenasValidas = 0;
        Random numAleatorio = new Random();
        List<String> listaCadenas = new ArrayList<>();
        StringBuilder alfabeto = new StringBuilder(); //Alfabeto a usar

        for(int pos = 0; pos < getAFD().getAlfabeto().size(); pos++){
            //Dependiendo del autómata el alfabeto será uno u otro
            alfabeto.append(getAFD().getAlfabeto().get(pos));
        }
        while(numCadenasValidas < 100){
            this.inicializa(); //Reseteamos la máquina de estados al estado inicial del autómata
            int longitudMaxCadena = numAleatorio.nextInt(1, 11);
            StringBuilder cadena = new StringBuilder(); //Cadena a analizar
            for(int i = 0; i < longitudMaxCadena; i++){
                int indiceAleatorio = numAleatorio.nextInt(0, alfabeto.length()); //Generamos un número aleatorio entre el 0 y la longitud del alfabeto
                char caracter = alfabeto.charAt(indiceAleatorio);
                cadena.append(caracter);
            }
            if(!listaCadenas.contains(cadena.toString()) && compruebaCadena(cadena.toString())){
                //Se verifica que la cadena no está en la lista de cadenas válidas y que es válida
                listaCadenas.add(cadena.toString());
                System.out.println(cadena);
                numCadenasValidas++;
            }
        }
    }

    //Métodos get y set

    public Integer getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Integer estadoActual) {
        this.estadoActual = estadoActual;
    }

    public AutomataFinitoDeterminista getAFD() {
        return afd;
    }

    public void setAFD(AutomataFinitoDeterminista AFD) {
        this.afd = AFD;
    }
}
