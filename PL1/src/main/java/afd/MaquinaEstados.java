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

    //Método para comprobar si el estado actual es final
    public boolean isFinal(){
        return getAFD().isFinal(getEstadoActual());
    }

    //Método para comprobar si una cadena es válida
    public boolean compruebaCadena(String cadena){
        this.inicializa(); //Reseteamos para comprobar la cadena
        boolean resultado = false;
        try{
            for(int pos = 0; pos < cadena.length(); pos++){
                char caracter = cadena.charAt(pos);
                this.acepta(caracter);
                if(this.isFinal()){
                    resultado = true;
                }
            }
        }
        catch(Exception e){
            resultado = false;
        }
        return resultado;
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
        return AFD;
    }

    public void setAFD(AutomataFinitoDeterminista AFD) {
        this.AFD = AFD;
    }
}
