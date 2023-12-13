package PL3;

import javax.swing.text.TabableView;

//Visitor específico para calcular las cosas
public class MiVisitor extends LinguineParserBaseVisitor<String>{
    //Atributos de la clase MiVisitor
    private final TablaSimbolos tablaSimbolos;

    private String resultado = "";

    private boolean hayError = false;

    public MiVisitor(TablaSimbolos tablaSimbolos){
        this.tablaSimbolos = tablaSimbolos;
    }
    @Override
    public String visitPrograma(LinguineParser.ProgramaContext ctx) {
        //Antes de nada, tenemos que comprobar que todas las instrucciones tienen un punto y coma
        for(int i = 0; i < ctx.instruccion().size(); i++){
            if(ctx.PUNTOYCOMA(i) == null){
                //Se verifica que falta un punto y coma, por tanto no se puede seguir
                System.out.println("[ERROR] --> Le falta un punto y coma (;) a una instruccion");
                setHayError(true);
                return null;
            }
        }
        //Llegados aqui, verficiamos que estan todos los ;, por tanto podemos visitar las instrucciones
        for(int i = 0; i < ctx.instruccion().size(); i++){
            visitInstruccion(ctx.instruccion(i));
        }
        //Cuando hayamos visitado todas las instrucciones, devolveremos el codigo Jazmin
        return getResultado();
    }

    public String visitInstruccion(LinguineParser.InstruccionContext ctx){
        //Una instruccion puede ser muchas cosas, por tanto tenemos que ver a cual corresponde
        if(ctx.asignacion() != null){
            //Se verifica que es una asignacion
            visitAsignacion(ctx.asignacion());
        }
        else if(ctx.condicional() != null){
            //Se verifica que es una asignacion
            visitCondicional(ctx.condicional());
        }


        return null;
    }

    @Override
    public String visitAsignacion(LinguineParser.AsignacionContext ctx) {
        String variable = ctx.IDENTIFICADOR().getText();
        //En primer lugar, tenemos que comprobar que hay una variable definida donde almacenar el resultado
        if (!(variable == null) && (ctx.IGUAL().getText() != null)){
            //Verificamos que hay una variable definida, por tanto, podemos seguir
            //Ahora tenemos que ver el valor que tendremos que almacenar en la tabla de símbolos:
            if(!(ctx.expresion() == null)){
                //Se confirma que hay una expresión cuyo valor se nos tiene que retornar aquí, por tanto:
                visitExpresion(ctx.expresion());
                //Una vez redactado el codigo Jasmin, almacenamos el simbolo en la tabla de simbolos
                getTablaSimbolos().anadirSimbolo(variable, getTablaSimbolos().numTotalSimbolos());
            }
            else if(!ctx.llamadaFuncion().isEmpty()){
                //Se confirma que hay una llamada a una función, por tanto, visitaremos la llamada para ver el resultado
                visitLlamadaFuncion(ctx.llamadaFuncion());
            }
            else if(!(ctx.ENTERO() == null)){
                //Se confirma hay un entero, por tanto, podemos ir a ese entero
                resultado = "   ldc " + ctx.ENTERO().getText() + "\t;\n" +
                        "   istore_" + getTablaSimbolos().numTotalSimbolos() + "\t;\n\n";
                //Una vez redactado el codigo Jasmin, almacenamos el simbolo en la tabla de simbolos
                getTablaSimbolos().anadirSimbolo(variable, getTablaSimbolos().numTotalSimbolos());
            }
            else if(!(ctx.STRING().getText() == null)){
                //Se confirma que hay un string
                resultado = "   ldc " + ctx.ENTERO().getText() + "\t;\n" +
                        "   astore_" + getTablaSimbolos().numTotalSimbolos() + "\t;\n\n";
                //Una vez redactado el codigo Jasmin, almacenamos el simbolo en la tabla de simbolos
                getTablaSimbolos().anadirSimbolo(variable, getTablaSimbolos().numTotalSimbolos());
            }
            else{
                //Se confirma que no hay nada detrás del igual, por tanto, avisaremos del error
                System.out.println("[ERROR] --> No hay nada detras del igual");
                setHayError(true);
                return null;
            }
        }
        else{
            System.out.println("[ERROR] --> No hay ningun identificador de variable definido o no esta el =");
            setHayError(true);
            return null;
        }
        return null;
    }

    @Override
    public String visitExpresion(LinguineParser.ExpresionContext ctx) {
        //Tenemos que comprobar que operacion tenemos que ver:
        String operador1;
        String operador2;
        int numEnteros = ctx.ENTERO().size();
        if(numEnteros == 1){
            //Verificamos que solo hay un numero:
            operador1 = ctx.STRING().getText();
            operador2 = ctx.ENTERO(0).getText();
        }
        else{
            //Verificamos que ambos son enteros
            operador1 = ctx.ENTERO(0).getText();
            operador2 = ctx.ENTERO(1).getText();
        }

        //Ahora, según el operador haremos una cosa u otra:
        if((!(ctx.DIVISION() == null))){
            //Se trata de que es una division entre enteros
            resultado = getResultado() + "   ldc " + "\" " + operador1 + "\" \t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   invokevirtual java/lang/String/valueOf(I)Ljava/lang/String;" +
                    "   invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;" +
                    "   idiv\t;" +
                    "   astore_" + getTablaSimbolos().numTotalSimbolos() + "\t;\n\n";
        }
        else if(!(ctx.MULTIPLICACION() == null)){
            resultado = getResultado() + "   ldc " + operador1 + "\t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   imul\t\t;\n" +
                    "   istore_" + getTablaSimbolos().numTotalSimbolos() + "\t;\n\n";
        }
        else if((!(ctx.SUMA() == null)) && (ctx.STRING() != null)){
            //Se trata de una concatenacion
            resultado = getResultado() + "   ldc " + operador1 + "\t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   invokevirtual java/lang/String/valueOf(I)Ljava/lang/String;" +
                    "   invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;" +
                    "   astore_" + getTablaSimbolos().numTotalSimbolos() + "\t;\n\n";
        }
        else if((!(ctx.SUMA() == null)) && (ctx.STRING() == null)){
            //Se trata de una suma normal entre enteros:
            resultado = getResultado() + "   ldc " + operador1 + "\t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   iadd\t\t;\n" +
                    "   istore_" + getTablaSimbolos().numTotalSimbolos() + "\t;\n\n";
        }
        else if(!(ctx.RESTA() == null)){
            resultado = getResultado() + "   ldc " + operador1 + "\t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   isub\t\t;\n" +
                    "   istore_" + getTablaSimbolos().numTotalSimbolos() + "\t;\n\n";
        }

        return "";
    }

    @Override
    public String visitCondicional(LinguineParser.CondicionalContext ctx) {
        //TODO VISITOR DE UN CONDICIONAL, LO TENGO QUE HACER PERO CUANDO LLEGUE A CASA
        //En primer lugar, tenemos que comprobar que la expresión está bien escrita
        if(ctx.ABREPARENTESIS() == null){
            //Se verifica que falta un ( en el if
            System.out.println("[ERROR] --> Falta un ( en el if");
            setHayError(true);
            return null;
        }
        else if(ctx.booleano() == null){
            //Se verifica que falta un
            System.out.println("[ERROR] --> Error en la expresion booleana del if");
            setHayError(true);
            return null;
        }
        else if(ctx.CIERRAPARENTESIS() == null){

        }





        return null;
    }

    //Método get de la tabla de simbolos
    public TablaSimbolos getTablaSimbolos() {
        return tablaSimbolos;
    }

    public boolean getHayError() {
        return this.hayError;
    }

    public void setHayError(boolean hayError){
        this.hayError = hayError;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
