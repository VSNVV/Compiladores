package PL3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

// Este fichero va a ser el ejecutable
public class Testear{
    public static void main(String[] args) {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
//        InputStream is = System.in;
//        if (inputFile != null) {
//            is = new FileInputStream(inputFile);
//        }
        //CharStream input = CharStreams.fromString("let x = 5;"); //Funciona
        //CharStream input = CharStreams.fromString("let x = 2 + 3"); //Funciona
        //CharStream input = CharStreams.fromString("let x = \"hola\" + 4;"); //Funciona
        //CharStream input = CharStreams.fromString("let x = 5;\r\nif (x > 2) then let y = 1 else let y = 0;"); //Funciona
        //CharStream input = CharStreams.fromString("let x = 1;\r\nmatch x with\r\n| 1 -> \"One\"\r\n| 2 -> \"Two\"\r\n| ? -> \"Other\";"); //Funciona
        CharStream input = CharStreams.fromString("let x = 0;\r\nwhile (x < 10) {\r\nshow(x);\r\nlet x = x + 1;\r\n};");
        LinguineLexer lexer = new LinguineLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguineParser parser = new LinguineParser(tokens);
        parser.setBuildParseTree(true);

        LinguineParser.ProgramaContext tree = parser.programa();
        TablaSimbolos tb = new TablaSimbolos();
        GeneradorEtiquetas ge = new GeneradorEtiquetas();
        MiVisitor nv = new MiVisitor(tb, ge);
        Object resultado = nv.visitPrograma(tree);
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
                    + "\n\n--------======[TABLA DE SIMBOLOS]======--------\n"
            );
            nv.getTablaSimbolos().imprimeTabla();
        }
        else{
            System.out.println("El codigo Jamsin no se ha generado porque ha habido un error semantico");
        }
    }
}
