import java.io.FileWriter;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ListenerSQL extends gSqlMiniParserBaseListener{

    gSqlMiniParser parser;

    private int depth = 0;
    public ListenerSQL(gSqlMiniParser parser) {
        this.parser = parser;
    }


    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        String ruleName = parser.getRuleNames()[ctx.getRuleIndex()];
        String indentation = "      ".repeat(depth);
        String salida = indentation + ruleName + " ->";
        System.out.println(salida);
        escribirAST(salida);
        depth++;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        depth--;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        String indentation = "      ".repeat(depth);
        String salida = indentation + node.getText();
        System.out.println(salida);
        escribirAST(salida);
    }
    public void escribirAST(String rule)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            String ruta = "C:\\ANTLR\\gramaticas\\ArbolSQL.txt";
            fichero = new FileWriter(ruta,true);
            //pw = new PrintWriter(fichero);

            fichero.write(rule + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
