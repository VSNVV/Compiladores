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
        LinguineLexer lexer = new LinguineLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguineParser parser = new LinguineParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.programa();

        //Mostramos el arbol
        System.out.println(tree.toStringTree(parser));

        MiVisitor mv = new MiVisitor();
        mv.visit(tree);
    }
}
