package afd;

public class MaquinaEstados {
    //Atributos de la clase MaquinaEstados
    private Integer estadoActual = 0;
    private AutomataFinitoDeterminista AFD;

    //Métodos de la clase MaquinaEstados

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

    public boolean isFinal(){
        return getAFD().isFinal(getEstadoActual());
    }

    public boolean compruebaCadena(String cadena){
        try{
            this.acepta();

        }
        catch(){}
    }


    //Métodos get y set

    public Integer getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Integer estadoActual) {
        this.estadoActual = estadoActual;
    }

    public AutomataFinitoDeterminista getAFD() {
        return AFD;
    }

    public void setAFD(AutomataFinitoDeterminista AFD) {
        this.AFD = AFD;
    }
}
