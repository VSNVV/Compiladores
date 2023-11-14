public class LinguineSymbolsListener extends LinguineParserBaseListener {

    // Sobrescribe el método enterAssignment para procesar las sentencias de asignación.
    @Override
    public void enterAssignment(LinguineParser.AssignmentContext ctx) {
        // Obtiene el texto de la sentencia de asignación y elimina la palabra "let".
        String rawText = ctx.getText().replaceAll("let", "");
        try {
            // Divide el texto en dos partes: la variable y su valor, usando el signo "=" como separador.
            String variable = rawText.split("=")[0].trim();  // Utiliza trim() para eliminar espacios al principio y al final.
            String value = rawText.split("=")[1].trim();
            
            // Imprime la variable en azul y su valor en verde en la consola.
            System.out.println("\u001B[34m" + variable 
                + "\u001B[0m" + " -> " + "\u001B[32m" 
                + value + "\u001B[0m");
        } catch (Exception e) {
            // Maneja la excepción si ocurre algún problema durante el procesamiento.
            e.printStackTrace();
        }
    }
}
