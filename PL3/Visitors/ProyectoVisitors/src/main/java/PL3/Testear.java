package PL3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

// Este fichero va a ser el ejecutable
public class Testear{
    public static void main (String[] args) throws Exception{
        String inputFile = null;
        if(args.length > 0){
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null){
            is = new FileInputStream(inputFile);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);
        gLinguineLexer lexer = new gLinguineLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gLinguineParser parser = new gLinguineParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.programa();

        //Mostramos el arbol
        System.out.println(tree.toStringTree(parser));

        MiVisitor nv = new MiVisitor();
        nv.visit(tree);

    }
}
