package PL3;

//Visitor específico para calcular las cosas
public class MiVisitor extends LinguineParserBaseVisitor<String>{

    @Override
    public String visitPrograma(LinguineParser.ProgramaContext ctx) {
        return visit(ctx.instruccion(0));
    }

    @Override
    public String visitAsig(LinguineParser.AsigContext ctx) {
        return super.visit(ctx.asignacion());
    }

    @Override
    public String visitAsignacion(LinguineParser.AsignacionContext ctx) {
        return visit(ctx.expresion());
    }

    @Override
    public String visitExpresion(LinguineParser.ExpresionContext ctx) {
        return visit(ctx.operando(0));
    }

    @Override
    public String visitOperando(LinguineParser.OperandoContext ctx) {
        return ctx.IDENTIFICADOR().toString();
    }
}
