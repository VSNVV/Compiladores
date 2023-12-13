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
        CharStream input = CharStreams.fromString("let x = 'hola' + 4;");
        LinguineLexer lexer = new LinguineLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguineParser parser = new LinguineParser(tokens);
        parser.setBuildParseTree(true);

        LinguineParser.ProgramaContext tree = parser.programa();
        TablaSimbolos tb = new TablaSimbolos();
        MiVisitor nv = new MiVisitor(tb);
        String resultado = nv.visitPrograma(tree);
        //Si no hay error, se muestra el código Jasmin
        if(!nv.getHayError()){
            System.out.println("El código jazmin generado es el siguiente:\n\n");


            System.out.println(".class public Codigo" + "\n"
                    + ".super java/lang/Object" + "\n" + "\n"
                    + ".method public static main([Ljava/lang/String;)V" + "\n"
                    + "   .limit stack 100" + "\n"
                    + "   .limit locals 100" + "\n" + "\n"

                    + resultado
                    + "  return" + "\n"
                    + ".end method" + "\n"
            );
        }
        else{
            System.out.println("El codigo Jamsin no se ha generado porque ha habido un error de compilacion");
        }
    }
}
