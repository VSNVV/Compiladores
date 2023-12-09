package PL3;

//Visitor específico para calcular las cosas
public class MiVisitor extends LinguineParserBaseVisitor<String>{

    @Override
    public String visitPrograma(LinguineParser.ProgramaContext ctx) {
        System.out.println("Testeando visitor");
        return super.visitPrograma(ctx);
    }
}
