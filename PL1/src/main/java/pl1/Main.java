package pl1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean corriendo = true; //Booleano que indica si el programa esta en ejecución o no
        Scanner entrada = new Scanner(System.in);
        Gestor gestor = new Gestor();
        while(corriendo){
            try{
                //En primer lugar, tenemos que elegir autómata:
                System.out.print("""
                        \t\t--------------------=[ELECCION DE AUTOMATA]=--------------------
                        \t1. Automata 1
                        \t2. Automata 2
                        \t3. Salir del programa

                        Introduce el numero del automata a elegir:\s""");
                String automata = entrada.nextLine();
                if(Integer.parseInt(automata) == 3)
                    break;
                MaquinaEstados me = gestor.eleccionMaquinaEstados(Integer.parseInt(automata));
                System.out.println("\n\n");
                //Una vez que hayamos elegido autómata, tenemos que elegir una operación a realizar:
                System.out.print("""
                        \t\t--------------------=[OPERACION A REALIZAR]=--------------------
                        \t1. Validar cadena
                        \t2. Generar cadenas validas
                        \t3. Salir del programa

                        Introduce la operación a realizar:\s""");
                String operacion = entrada.nextLine();
                if(Integer.parseInt(operacion) == 1){
                    //Se verifica que se ha elegido la opción de validar cadena
                    System.out.print("\n\nIntroduce la cadena a comprobar: ");
                    String cadena = entrada.nextLine();
                    if(me.compruebaCadena(cadena)){
                        System.out.println("La cadena es valida\n");
                    }
                    else{
                        System.out.println("La cadena no es valida\n");
                    }
                }
                else if(Integer.parseInt(operacion) == 2){
                    //Se verifica que se ha elegido la opción de generar cadenas válidas
                    me.generaCadenasValidas();
                }
                else if(Integer.parseInt(operacion) == 3){
                    //Se verifica que se desea salir del programa
                    corriendo = false;
                }
            }catch(Exception e){
                System.out.println("Eleccion erronea, volviendo a empezar...");
                //e.printStackTrace();
            }
        }
        System.out.println("Saliendo...");
    }
}
