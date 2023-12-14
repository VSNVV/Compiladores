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
             codigoJasmin = codigoJasmin + visit(ctx.instruccion(i));;
        }

        return codigoJasmin;
    }

    public Object visitInstruccion(LinguineParser.InstruccionContext ctx){
        //Una instruccion puede ser muchas cosas, por tanto tenemos que ver a cual corresponde
        return visitChildren(ctx);
    }



    @Override
    public Object visitAsignacion(LinguineParser.AsignacionContext ctx) {
        //Si se hace una asignación, es para simplemente guardar un símbolo dentro de la tabla de símbolos
        String nombreVariable = ctx.IDENTIFICADOR().getText();
        String codigoJasmin = "";
        //Tenemos que comprobar el valor de la variable y su tipo
        if(ctx.ENTERO() != null){
            //La asignacion tiene un entero dentro
            Object valor = ctx.ENTERO().getText();
            String tipo = "entero";
            //Anadimos el simbolo a la tabla de simbolos
            getTablaSimbolos().anadirSimbolo(nombreVariable, valor, tipo);
            //Una vez que tenemos ya el simbolo metido en la tabla de simbolos, generamos el codigo Jasmin
            codigoJasmin = "   ldc " + ctx.ENTERO().getText() + ";\n" +
                    "   istore_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n\n";
        }
        else if(ctx.STRING() != null){
            //La asignacion tiene un string dentro
            Object valor = ctx.STRING().getText();
            String tipo = "string";
            //Anadimos el simbolo a la tabla de simbolos
            getTablaSimbolos().anadirSimbolo(nombreVariable, valor, tipo);
            //Una vez que tenemos ya el simbolo metido en la tabla de simbolos, generamos el codigo Jasmin
            codigoJasmin = "   ldc " + ctx.STRING().getText() + ";\n" +
                    "   astore_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n\n";
        }
        else if(ctx.expresion() != null){
            //Tenemos una expresion dentro
            if(ctx.expresion().DIVISION() != null && ctx.expresion().STRING() == null){
                //Division entre numeros enteros
                Object valor = Integer.parseInt(ctx.expresion().ENTERO(0).getText()) / Integer.parseInt(ctx.expresion().ENTERO(1).getText());
                String tipo = "entero";
                //Anadimos a la tabla de simbolos
                getTablaSimbolos().anadirSimbolo(nombreVariable, valor, tipo);
                codigoJasmin = "   ldc " + ctx.expresion().ENTERO(0) + ";\n" +
                        "   ldc " + ctx.expresion().ENTERO(1) + ";\n" +
                        "   idiv;\n" +
                        "   istore_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n" +
                        "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                        "   iload_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n" +
                        "   invokevirtual java/io/PrintStream/println(I)V\n\n";
            }
            else if(ctx.expresion().DIVISION() != null && ctx.expresion().STRING() != null){
                //Division de un string
                //TODO POSIBLE MEJORA PARA LA PARTE INTERMEDIA, DIVIDIR CORTANDO EL STRING EN X NUMERO DE CARACTERES
                System.out.println("[ERROR] --> No se puede dividir un string");
                setHayError(true);
            }
            else if(ctx.expresion().MULTIPLICACION() != null && ctx.expresion().STRING() == null){
                //Multiplicacion entre numeros enteros
                Object valor = Integer.parseInt(ctx.expresion().ENTERO(0).getText()) * Integer.parseInt(ctx.expresion().ENTERO(1).getText());
                String tipo = "entero";
                //Anadimos a la tabla de simbolos
                getTablaSimbolos().anadirSimbolo(nombreVariable, valor, tipo);
                codigoJasmin = "   ldc " + ctx.expresion().ENTERO(0) + ";\n" +
                        "   ldc " + ctx.expresion().ENTERO(1) + ";\n" +
                        "   imul;\n" +
                        "   istore_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n" +
                        "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                        "   iload_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n" +
                        "   invokevirtual java/io/PrintStream/println(I)V\n\n";
            }
            else if(ctx.expresion().MULTIPLICACION() != null && ctx.expresion().STRING() != null){
                //Multiplicacion de un string TODO posible mejora
                System.out.println("[ERROR] --> No se puede multiplicar un string");
                setHayError(true);
            }
            else if(ctx.expresion().SUMA() != null && ctx.expresion().STRING() == null){
                //Suma de dos numeros enteros
                Object valor = Integer.parseInt(ctx.expresion().ENTERO(0).getText()) + Integer.parseInt(ctx.expresion().ENTERO(1).getText());
                String tipo = "entero";
                //Anadimos a la tabla de simbolos
                getTablaSimbolos().anadirSimbolo(nombreVariable, valor, tipo);
                codigoJasmin = "   ldc " + ctx.expresion().ENTERO(0) + ";\n" +
                        "   ldc " + ctx.expresion().ENTERO(1) + ";\n" +
                        "   iadd;\n" +
                        "   istore_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n" +
                        "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                        "   iload_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n" +
                        "   invokevirtual java/io/PrintStream/println(I)V\n\n";
            }
            else if(ctx.expresion().SUMA() != null && ctx.expresion().STRING() != null){
                //Suma de un string (concatenacion) TODO posible mejora para la parte intermedia
                System.out.println("[ERROR] --> No se puede sumar un string"); // De momento, esta mejora es facil
                setHayError(true);
            }
            else if(ctx.expresion().RESTA() != null && ctx.expresion().STRING() == null){
                //Resta de dos numeros enteros
                Object valor = Integer.parseInt(ctx.expresion().ENTERO(0).getText()) - Integer.parseInt(ctx.expresion().ENTERO(1).getText());
                String tipo = "entero";
                //Anadimos a la tabla de simbolos
                getTablaSimbolos().anadirSimbolo(nombreVariable, valor, tipo);
                codigoJasmin = "   ldc " + ctx.expresion().ENTERO(0) + ";\n" +
                        "   ldc " + ctx.expresion().ENTERO(1) + ";\n" +
                        "   isub;\n" +
                        "   istore_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n" +
                        "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                        "   iload_" + getTablaSimbolos().getTabla().get(nombreVariable).getRegistro() + ";\n" +
                        "   invokevirtual java/io/PrintStream/println(I)V\n\n";
            }
            else if(ctx.expresion().RESTA() != null && ctx.expresion().STRING() != null){
                //Resta de un string, lo cual no tiene sentido
                System.out.println("[ERROR] --> No se puede restar un string");
                setHayError(true);
            }
        }
        return codigoJasmin;
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
                "   if_icmpne M" + getGeneradorEtiquetas().getEtiquetasMatchGeneradas() +
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
                "   if_icmpne M" + getGeneradorEtiquetas().getEtiquetasMatchGeneradas() +
                "   ldc " + ctx.STRING(2) + "\n" +
                "   areturn\n" +
                ".end method\n\n";


        return codigoJasmin;
    }

    @Override
    public Object visitShow(LinguineParser.ShowContext ctx) {
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

    public GeneradorEtiquetas getGeneradorEtiquetas() {
        return generadorEtiquetas;
    }
}
