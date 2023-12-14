package PL3;

public class GeneradorEtiquetas {
    //Atributos de la clase GeneradorEtiquetas
    private int etiquetasElseLabelGeneradas = 0;

    private int etiquetasEndLabelGeneradas = 0;

    private int etiquetasMatchGeneradas = 0;

    //Métodos de la clase GeneradorEtiquetas

    //Constructor
    public GeneradorEtiquetas() {

    }

    //Método para generar una etiqueta para un else
    public String generaEtiquetaElse() {
        String etiqueta = "elseLabel" + getEtiquetasElseLabelGeneradas();
        setEtiquetasElseLabelGeneradas(getEtiquetasElseLabelGeneradas() + 1);

        return etiqueta;
    }

    //Método para generar una etiqueta de fin de bucle
    public String generaEtiquetaEndLabel(){
        String etiqueta = "endLabel" + getEtiquetasEndLabelGeneradas();
        setEtiquetasEndLabelGeneradas(getEtiquetasEndLabelGeneradas() + 1);

        return etiqueta;
    }

    public String generaEtiquetaMatch(){
        String etiqueta = "M" + getEtiquetasMatchGeneradas();
        setEtiquetasMatchGeneradas(getEtiquetasMatchGeneradas() + 1);

        return etiqueta;
    }

    //Métodos get y set


    public int getEtiquetasElseLabelGeneradas() {
        return etiquetasElseLabelGeneradas;
    }

    public void setEtiquetasElseLabelGeneradas(int etiquetasElseLabelGeneradas) {
        this.etiquetasElseLabelGeneradas = etiquetasElseLabelGeneradas;
    }

    public int getEtiquetasEndLabelGeneradas() {
        return etiquetasEndLabelGeneradas;
    }

    public void setEtiquetasEndLabelGeneradas(int etiquetasEndLabelGeneradas) {
        this.etiquetasEndLabelGeneradas = etiquetasEndLabelGeneradas;
    }

    public int getEtiquetasMatchGeneradas() {
        return etiquetasMatchGeneradas;
    }

    public void setEtiquetasMatchGeneradas(int etiquetasMatchGeneradas) {
        this.etiquetasMatchGeneradas = etiquetasMatchGeneradas;
    }
}