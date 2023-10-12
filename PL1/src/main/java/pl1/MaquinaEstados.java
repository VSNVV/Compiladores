package pl1;

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
        if(getEstadoActual() != null){
            setEstadoActual(estadoTemporal);
        }
        else{
            throw new RuntimeException();
        }
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
            int estadoSiguiente = getAFD().getSiguientePaso(getEstadoActual(), carcater); //Pasamos del estado actual al siguiente
            setEstadoActual(estadoSiguiente); //Estamos en el estado siguiente
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
        this.inicializa(); //Reseteamos la máquina de estados al estado inicial del autómata

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
