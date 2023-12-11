package PL3;

import javax.swing.text.TabableView;

//Visitor específico para calcular las cosas
public class MiVisitor extends LinguineParserBaseVisitor<String>{
    //Atributos de la clase MiVisitor
    private final TablaSimbolos tablaSimbolos;

    public MiVisitor(TablaSimbolos tablaSimbolos){
        this.tablaSimbolos = tablaSimbolos;
    }
    @Override
    public String visitPrograma(LinguineParser.ProgramaContext ctx) {
        return visitInstruccion(ctx.instruccion(0));
    }

    public String visitInstruccion(LinguineParser.InstruccionContext ctx){
        return visitAsignacion(ctx.asignacion());
    }

    @Override
    public String visitAsignacion(LinguineParser.AsignacionContext ctx) {
        String variable = ctx.IDENTIFICADOR().getText();
        String valor = null;
        String codigoJazmin = null;
        //En primer lugar, tenemos que comprobar que hay una variable definida donde almacenar el resultado
        if (!(variable == null) && (ctx.IGUAL().getText() != null)){
            //Verificamos que hay una variable definida, por tanto, podemos seguir
            //Ahora tenemos que ver el valor que tendremos que almacenar en la tabla de símbolos:
            if(!(ctx.expresion() == null)){
                //Se confirma que hay una expresión cuyo valor se nos tiene que retornar aquí, por tanto:
                return visitExpresion(ctx.expresion());


            }
            else if(!ctx.llamadaFuncion().isEmpty()){
                //Se confirma que hay una llamada a una función, por tanto, visitaremos la llamada para ver el resultado
                visitLlamadaFuncion(ctx.llamadaFuncion());
            }
            else if(!(ctx.ENTERO() == null)){
                //Se confirma hay un entero, por tanto, podemos ir a ese entero
                valor = ctx.ENTERO().getText();
            }
            else if(!(ctx.STRING().getText() == null)){
                //Se confirma que hay un string, por tanto, devolveremos el valor del string aqui
                valor = ctx.STRING().getText();
            }
            else{
                //Se confirma que no hay nada detrás del igual, por tanto, avisaremos del error
                System.out.println("[ERROR] --> No hay nada detras del igual");
            }
            //Ahora, tenemos que ver si el valor que tenemos se puede parsear a entero:
            int valorParseado;
            try{
                int test = Integer.parseInt(String.valueOf(valor));
                //Si ha ido bien, podremos guardar el valor parseado
            }catch(Exception e){
                //Verificamos que el valor no se puede parsear, por tanto no guardaremos el resultado en valorParseado
            }
        }
        else{
            System.out.println("[ERROR] --> No hay ningun identificador de variable definido o no esta el =");
        }
        return "hola";
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

        String resultado = "";
        //Ahora, según el operador haremos una cosa u otra:
        if((!(ctx.DIVISION() == null)) && (ctx.STRING().getText() != null)){
            //Se trata de que es una division entre enteros
            resultado = "   ldc " + "\" " + operador1 + "\" \t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   invokevirtual java/lang/String/valueOf(I)Ljava/lang/String;" +
                    "   invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;" +
                    "   astore_0\t;";
        }
        else if(!(ctx.MULTIPLICACION() == null)){
            resultado = "   ldc " + operador1 + "\t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   imul\t\t;\n" +
                    "   istore0\t;";
        }
        else if((!(ctx.SUMA() == null)) && (ctx.STRING().getText() != null)){
            //Se trata de una concatenacion
            resultado = "   ldc " + "\" " + operador1 + "\" \t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   invokevirtual java/lang/String/valueOf(I)Ljava/lang/String;" +
                    "   invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;" +
                    "   astore_0\t;";
        }
        else if((!(ctx.SUMA() == null)) && (ctx.STRING().getText() == null)){
            //Se trata de una suma normal entre enteros:
            resultado = "   ldc " + operador1 + "\t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   iadd\t\t;\n" +
                    "   istore0\t;";
        }
        else if(!(ctx.RESTA() == null)){
            resultado = "   ldc " + operador1 + "\t;\n" +
                    "   ldc " + operador2 + "\t;\n" +
                    "   isub\t\t;\n" +
                    "   istore0\t;";
        }

        return resultado;
    }

    //Método get de la tabla de simbolos
    public TablaSimbolos getTablaSimbolos() {
        return tablaSimbolos;
    }
}
