import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class AnalizadorLinguine {

    //Método de entrada por defecto
    
    public static void main(String[] args) throws Exception{

        //Inicializamos la entrada de datos
        String inputFile=null;
        if (args.length>0) inputFile=args[0];

        //inicializamos los streams de datos
        InputStream is = System.in;
        if (inputFile!=null) is = new FileInputStream(inputFile); 

        //Inicializo ANTLR con el fichero
         ANTLRInputStream input = new ANTLRInputStream (is);

        //conectamos con el lexer
        gLinguineLexer lexer = new gLinguineLexer(input);

        //Inicializamos el canal de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //preparamos el parser
        gLinguineParser parser = new gLinguineParser(tokens);

        //generar arbol a partir del axioma de la gramatica
        ParseTree tree = parser.programa();

        //Mostrar el arbol por consola:
        System.out.println(tree.toStringTree(parser));

        //Recorrer el arbol:
        //1-Inicializar un recorredor
        //2- Inicializar mi escuchador
        //3 Recorrer el arbol

        //1
        ParseTreeWalker walker = new ParseTreeWalker();
        //2
        ListenerLinguine escuchador = new ListenerLinguine(parser);
        //
        walker.walk(escuchador,tree);

    }
}