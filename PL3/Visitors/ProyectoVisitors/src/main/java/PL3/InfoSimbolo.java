package PL3;

import com.sun.jdi.PrimitiveType;
import com.sun.jdi.Type;

public class InfoSimbolo {
    //Atributos de la clase InfoSimbolo
    private Object valor;
    private String tipo;
    private Integer registro;

    //Métodos de la clase InfoSimbolo

    //Método constructor
    public InfoSimbolo(Object valor, String tipo, int registro){
        this.valor = valor;
        this.tipo = tipo;
        this.registro = registro;
    }

    //Métodos get y set
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
}
