package PL3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

// Este fichero va a ser el ejecutable
public class Testear{
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
//        InputStream is = System.in;
//        if (inputFile != null) {
//            is = new FileInputStream(inputFile);
//        }
        CharStream input = CharStreams.fromString("if not(2<3 || 3<2) then 34 else 53;");
        LinguineLexer lexer = new LinguineLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguineParser parser = new LinguineParser(tokens);
        parser.setBuildParseTree(true);

        LinguineParser.ProgramaContext tree = parser.programa();
        MiVisitor nv = new MiVisitor();
        Object resultado = nv.visitPrograma(tree);
        System.out.println("El resultado del arbol es: " + resultado);
    }
}
