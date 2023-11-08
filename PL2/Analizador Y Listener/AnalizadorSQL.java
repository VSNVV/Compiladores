import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//import java.io.FileInputStream;
//import java.io.InputStream;

public class AnalizadorSQL {

    //Método de entrada por defecto
    
    public static void main(String[] args) throws Exception{

        CharStream input;
        if (args.length > 0) {
            // Si se proporciona un argumento en la línea de comandos, usarlo como entrada
            input = CharStreams.fromString(args[0]);
        } else {
            // Si no se proporciona un argumento, leer desde la entrada estándar
            input = CharStreams.fromStream(System.in);
        }


        //conectamos con el lexer
        gSqlMiniLexer lexer = new gSqlMiniLexer(input);

        //Inicializamos el canal de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //preparamos el parser
        gSqlMiniParser parser = new gSqlMiniParser(tokens);

        //generar arbol a partir del axioma de la gramatica
        ParseTree tree = parser.programa();

        //Mostrar el arbol por consola:
        //System.out.println(tree.toStringTree(parser));

        //Recorrer el arbol:
        //1-Inicializar un recorredor
        //2- Inicializar mi escuchador
        //3 Recorrer el arbol

        //1
        ParseTreeWalker walker = new ParseTreeWalker();
        //2
        ListenerSQL escuchador = new ListenerSQL(parser);
        //
        walker.walk(escuchador,tree);

    }
}