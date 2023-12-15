package PL3;

//Visitor específico para calcular las cosas
public class MiVisitor extends LinguineParserBaseVisitor<Object>{
    //Atributos de la clase MiVisitor
    private final TablaSimbolos tablaSimbolos;
    private final GeneradorEtiquetas generadorEtiquetas;

    private boolean hayError = false;

    public MiVisitor(TablaSimbolos tablaSimbolos, GeneradorEtiquetas generadorEtiquetas){
        this.tablaSimbolos = tablaSimbolos;
        this.generadorEtiquetas = generadorEtiquetas;
    }
    @Override
    public Object visitPrograma(LinguineParser.ProgramaContext ctx) {
        String codigoJasmin = "";
        for(int i = 0; i < ctx.instruccion().size(); i++){
             codigoJasmin = codigoJasmin + visit(ctx.instruccion(i));
        }

        return codigoJasmin;
    }

    public Object visitInstruccion(LinguineParser.InstruccionContext ctx){
        //Una instruccion puede ser muchas cosas, por tanto, tenemos que ver a cuál corresponde
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpresion(LinguineParser.ExpresionContext ctx) {
        //Tenemos que ver si la expresión tiene un operador aritmético detrás
        if(ctx.operadorAritmetico() != null){
            //Verificamos que tiene un operador, por tanto, tendremos que hacerla
            double resultadoNumerico = 0;
            if(ctx.numero().size() == 2){
                double numero1 = Double.parseDouble(ctx.numero(0).getText());
                double numero2 = Double.parseDouble(ctx.numero(1).getText());
                //Se verifica que es una operación entre dos números
                switch (ctx.operadorAritmetico().getText()) {
                    case "+" -> resultadoNumerico = numero1 + numero2;
                    case "-" -> resultadoNumerico = numero1 - numero2;
                    case "*" -> resultadoNumerico = numero1 * numero2;
                    case "/" -> resultadoNumerico = numero1 / numero2;
                }
                //Una vez que tengamos el resultado, si lo podemos convertir a entero, lo pasaremos a entero
                if(resultadoNumerico % 1 == 0){
                    //Podemos comprobar que se puede pasar a entero, ya que tiene como decimal 0
                    Integer numEntero = (int) resultadoNumerico;
                    return numEntero;
                }
                else{
                    //No es un número entero, por tanto, devolvemos el número decimal
                    Double numeroDecimal = resultadoNumerico;
                    return numeroDecimal;
                }
            }
            else if(ctx.STRING() != null){
                //Se verifica que hay un string
                String string = ctx.STRING().getText();
                //No podemos operar un string con un numero decimal
                if(visitNumero(ctx.numero(0)) instanceof Double){
                    //No se puede operar un string con un número decimal
                    setHayError(true);
                    System.out.println("[ERROR] --> No se puede hacer una operacion de un string con un numero decimal");
                    return null;
                }
                else{
                    switch (ctx.operadorAritmetico().getText()) {
                        case "+" -> {
                            return "\"" + string.substring(1, string.length() - 1) + visitNumero(ctx.numero(0)) + "\"";
                        }
                        case "-" -> {
                            //No se puede restar un string
                            System.out.println("[ERROR] --> No se puede restar un string");
                            setHayError(true);
                            return null;
                        }
                        case "*" -> {
                            //No se puede multiplicar un string
                            System.out.println("[ERROR] --> No se puede multiplicar un string");
                            setHayError(true);
                            return null;
                        }
                        case "/" -> {
                            //No se puede dividir un string
                            System.out.println("[ERROR] --> No se puede dividir un string");
                            setHayError(true);
                            return null;
                        }
                    }
                }
            }
        }
        else{
            //Verificamos que solo tiene un numero o un string
            if(ctx.numero(0) != null){
                return visitNumero(ctx.numero(0));
            }
            else if(ctx.STRING() != null){
                return ctx.STRING().getText();
            }
            else{
                return ctx.IDENTIFICADOR(0);
            }
        }
        return null;
    }

    @Override
    public Object visitAsignacion(LinguineParser.AsignacionContext ctx) {
        //Si se hace una asignación, es para simplemente guardar un símbolo dentro de la tabla de símbolos
        String nombreVariable = ctx.IDENTIFICADOR().getText();
        String tipoAlmacenamiento = "";
        String codigoJasmin = "";
        Object valor = visitExpresion(ctx.expresion());
        //Una vez que tenemos el nombre y el valor de la variable, tenemos que ver el tipo
        if(valor instanceof Integer){
            //Se trata de un entero
            getTablaSimbolos().anadirSimbolo(nombreVariable, valor, "entero");
            tipoAlmacenamiento = "istore_";
        }
        else if(valor instanceof Double){
            //Se trata de un numero decimal
            getTablaSimbolos().anadirSimbolo(nombreVariable, valor, "double");
            tipoAlmacenamiento = "fstore_";
        }
        else if(valor instanceof String){
            //Se trata de un string
            getTablaSimbolos().anadirSimbolo(nombreVariable, valor, "string");
            tipoAlmacenamiento = "astore_";
        }

        codigoJasmin = "   ldc " + valor + "\n" +
                "   " + tipoAlmacenamiento + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + "\n\n";

        return codigoJasmin;
    }

    @Override
    public Object visitNumero(LinguineParser.NumeroContext ctx) {
        //El objetivo de esto es ver si un número es decimal o no
        if(ctx.ENTERO() != null){
            //Verificamos que es un entero
            return Integer.parseInt(ctx.ENTERO().getText());
        }
        else{
            //Verificamos que el número es decimal
            return Double.parseDouble(ctx.FLOAT().getText());
        }
    }

    @Override
    public Object visitCondicional(LinguineParser.CondicionalContext ctx) {
        //En primer lugar, tenemos que cargar la variable de la variable
        //Obtenemos el valor de la variable en la tabla de simbolos
        String nombreVariable = ctx.booleano().IDENTIFICADOR().getText();
        String tipo = getTablaSimbolos().getTabla().get(nombreVariable).getTipo();
        int registro = getTablaSimbolos().getTabla().get(nombreVariable).getRegistro();
        String codigoJasmin = "";

        //Primero comprobaremos errores semánticos
        if(tipo.equals("entero") && ctx.booleano().MAYORQUE() != null && ctx.booleano().ENTERO() != null){
            int constante = Integer.parseInt(ctx.booleano().ENTERO().getText());
            //Estamos comparando si un entero es menor que otro

            codigoJasmin =  "   iload_" + registro + ";\n" +
                    "   iconst_" + constante + "\n" +
                    "   if_icmple elseLabel" + getGeneradorEtiquetas().getEtiquetasElseLabelGeneradas() +  ";\n\n" +

            //Ahora tenemos que ver el then del condicional
                    "   " + visitBloqueThen(ctx.bloqueThen()) +
                    "   goto endLabel" + getGeneradorEtiquetas().getEtiquetasEndLabelGeneradas() + ";\n\n" +
            //Ahora tenemos que ver el else del condicional;
                    visitBloqueElse(ctx.bloqueElse()) + "\n" +
                    getGeneradorEtiquetas().generaEtiquetaEndLabel() + ":\n\n";
        }
        return codigoJasmin;
    }

    @Override
    public Object visitBooleano(LinguineParser.BooleanoContext ctx) {
        //En primer lugar, tenemos que ver que la expresion booleana está completa
        if(ctx.IDENTIFICADOR() == null){
            //Se verifica que no hay una expresion booleana
            System.out.println("[ERROR] --> Falta una variable o identificador en la expresion booleana");
            setHayError(true);
            return "";
        }
        else if((ctx.MAYORQUE() != null) && (ctx.MENORQUE() != null) && (ctx.MAYORIGUALQUE() != null) && (ctx.MENORIGUALQUE() == null) && ctx.IGUALQUE() != null){
            System.out.println("[ERROR] --> No hay un operador en la expresion booleana");
            setHayError(true);
            return "";
        }
        else if(ctx.ENTERO() == null){
            System.out.println("[ERROR] --> No hay un entero en la expresion booleana");
            setHayError(true);
            return "";
        }
        return "";
    }

    @Override
    public Object visitBloqueThen(LinguineParser.BloqueThenContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Object visitBloqueElse(LinguineParser.BloqueElseContext ctx) {
        return getGeneradorEtiquetas().generaEtiquetaElse() + ":\n" + visitChildren(ctx);
    }

    @Override
    public Object visitMatch(LinguineParser.MatchContext ctx) {
        String nombreVariable = ctx.IDENTIFICADOR().getText();
        int registroVariable = getTablaSimbolos().getTabla().get(nombreVariable).getRegistro();
        Object valorVariable = getTablaSimbolos().getTabla().get(nombreVariable).getValor();
        String codigoJasmin = "";

        codigoJasmin = "   ldc " + valorVariable + "\n" +
                "   invokestatic Codigo/match(I)Ljava/lang/String;\n" +
                "   astore_" + registroVariable + "\n" +
                ".method public static match(I)Ljava/lang/String;\n" +
                "   .limit stack 2\n" +
                "   .limit stack 1\n" +
                "   iload_" + registroVariable + "\n" +
                "   iconst_" + ctx.ENTERO(0).getText() + "\n" +
                "   if_icmpne M" + getGeneradorEtiquetas().getEtiquetasMatchGeneradas() + "\n" +
                "   ldc " + ctx.STRING(0) + "\n" +
                "   areturn\n" +
                getGeneradorEtiquetas().generaEtiquetaMatch() + ":\n" +
                "   iload_" + registroVariable + "\n" +
                "   iconst_" + ctx.ENTERO(1).getText() + "\n" +
                "   if_icmpne M" + getGeneradorEtiquetas().getEtiquetasMatchGeneradas() + "\n" +
                "   ldc " + ctx.STRING(1) + "\n" +
                "   areturn\n" +
                getGeneradorEtiquetas().generaEtiquetaMatch() + ":\n" +
                "   iload_" + registroVariable + "\n" +
                "   iconst_" + ctx.DEFAULT().getText() + "\n" +
                "   if_icmpne M" + getGeneradorEtiquetas().getEtiquetasMatchGeneradas() + "\n" +
                "   ldc " + ctx.STRING(2) + "\n" +
                "   areturn\n" +
                ".end method\n\n";

        return codigoJasmin;
    }

    @Override
    public Object visitSentenciaWhile(LinguineParser.SentenciaWhileContext ctx) {
        String codigoJasmin = "";

        String nombreVariable = ctx.booleano(0).IDENTIFICADOR().getText();
        int registro = getTablaSimbolos().getTabla().get(nombreVariable).getRegistro();
        //Añadimos a la tabla de simbolos la constan

        codigoJasmin = "   iload_" + registro + "\n" +
                "   ldc " + ctx.booleano(0).ENTERO() + "\n" +
                "   istore_" + getTablaSimbolos().numTotalSimbolos() + "\n" +
                "   iload_" + getTablaSimbolos().numTotalSimbolos() + "\n\n" +
                "While:\n" +
                "   if_icmple Si\n" +
                "   goto No\n\n" +
                "Si:\n" +
                visitBloqueInstrucciones(ctx.bloqueInstrucciones()) +
                "   goto While\n\n" +
                "No:\n\n";


        return codigoJasmin;
    }

    @Override
    public Object visitBloqueInstrucciones(LinguineParser.BloqueInstruccionesContext ctx) {
        String codigoJasmin = "";

        for(int i = 0; i < ctx.instruccion().size(); i++){
            codigoJasmin = codigoJasmin + visit(ctx.instruccion(i));
        }

        return codigoJasmin;
    }

    @Override
    public Object visitShow(LinguineParser.ShowContext ctx) {
        String codigoJasmin = "";
        String nombreVariable = ctx.expresion().IDENTIFICADOR(0).getText();
        String tipoVariable = getTablaSimbolos().getTabla().get(nombreVariable).getTipo();
        int registro = getTablaSimbolos().getTabla().get(nombreVariable).getRegistro();
        String tipoCarga = switch (tipoVariable) {
            case "entero" -> "iload_";
            case "string" -> "aload_";
            case "double" -> "fload_";
            default -> "";
        };

        codigoJasmin = "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                "  " + tipoCarga + registro + "\n" +
                "   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n\n";
        return codigoJasmin;
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

    public GeneradorEtiquetas getGeneradorEtiquetas() {
        return generadorEtiquetas;
    }
}
