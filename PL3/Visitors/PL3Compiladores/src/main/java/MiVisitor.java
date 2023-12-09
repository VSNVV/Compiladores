//Visitor específico para calcular las cosas
public class MiVisitor extends LinguineParserBaseVisitor<String>{

    public String visitPrograma(LinguineParser.ProgramaContext ctx) {
        return visitChildren(ctx);
    }

}
