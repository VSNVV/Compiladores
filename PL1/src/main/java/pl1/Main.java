package pl1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //En primer lugar, creamos cada uno de los AFDs para posteriormente ponerlos en sus correspondientes
        //máquinas de estados
        //AFD1 --> (c|a)*ab+b   AFD2 --> c+da*(bd|a)

        //El alfabeto del AFD1 tiene a, b y c
        String alfabetoAfd1 = "abc";
        //El AFD1 tiene 5 estados
        List<Integer> listaEstadosAfd1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6)); //El autómata tiene 5 estados
        //El AFD1 solo tiene un estado final que es el estado 4
        List<Integer> listaEstadosFinalesAfd1 = new ArrayList<>(Collections.singletonList(5));
        //Ahora crearemos las características del segundo AFD

        //El alfabeto del AFD2 tiene a, b, c, d
        String alfabetoAfd2 = "abcd";
        //El AFD2 tiene 6 estados
        List<Integer> listaEstadosAfd2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6)); //El autómata tiene 5 estados
        //El AFD2 tiene 2 estados finales, que son el 4 y el 5
        List<Integer> listaEstadosFinalesAfd2 = new ArrayList<>(Arrays.asList(5, 6));

        //Una vez que tenemos las características creadas de cada autómata, los creamos
        //Creamos el AFD1
        AutomataFinitoDeterminista afd1 = new AutomataFinitoDeterminista(alfabetoAfd1, listaEstadosAfd1, listaEstadosFinalesAfd1);
        //Creamos el AFD2
        AutomataFinitoDeterminista afd2 = new AutomataFinitoDeterminista(alfabetoAfd2, listaEstadosAfd2, listaEstadosFinalesAfd2);

        //Ahora rellenaremos la matriz de estados de ambos autómatas según la ER que maneja cada uno (visible en la memoria)

        //Matriz del AFD1
        afd1.cargarMatriz(0, 'c', 2); //Estado 0 + c --> Estado 2
        afd1.cargarMatriz(1, 'a', 1); //Estado 1 + a --> Estado 1
        afd1.cargarMatriz(1, 'b', 3); //Estado 1 + b --> Estado 3
        afd1.cargarMatriz(1, 'c', 2); //Estado 1 + c --> Estado 2
        afd1.cargarMatriz(2, 'a', 1); //Estado 2 + a --> Estado 1
        afd1.cargarMatriz(2, 'c', 2); //Estado 2 + c --> Estado 2
        afd1.cargarMatriz(3, 'a', 4); //Estado 3 + 3 --> Estado 4
        afd1.cargarMatriz(3, 'b', 5); //Estado 3 + b --> Estado 5
        afd1.cargarMatriz(4, 'b', 6); //Estado 4 + b --> Estado 6
        afd1.cargarMatriz(6, 'a', 4); //Estado 6 + a --> Estado 4
        afd1.cargarMatriz(6, 'b', 5); //Estado 6 + b --> Estado 5

        //Matriz del AFD2
        afd2.cargarMatriz(0, 'c', 1); //Estado 0 + c --> Estado 1
        afd2.cargarMatriz(1, 'c', 3); //Estado 1 + c --> Estado 3
        afd2.cargarMatriz(1, 'd', 2); //Estado 1 + d --> Estado 2
        afd2.cargarMatriz(2, 'a', 5); //Estado 2 + a --> Estado 5
        afd2.cargarMatriz(2, 'b', 4); //Estado 2 + b --> Estado 4
        afd2.cargarMatriz(3, 'c', 3); //Estado 3 + c --> Estado 3
        afd2.cargarMatriz(3, 'd', 2); //Estado 3 + d --> Estado 2
        afd2.cargarMatriz(4, 'd', 6); //Estado 4 + d --> Estado 6
        afd2.cargarMatriz(5, 'a', 5); //Estado 5 + a --> Estado 5
        afd2.cargarMatriz(5, 'b', 4); //Estado 5 + b --> Estado 4


        //Una vez creadas las matrices de estados de ambos autómatas, los asignamos a sus respectivas máquinas de estados
        MaquinaEstados me1 = new MaquinaEstados(afd1); //Creamos la máquina de estados del autómata AFD1
        MaquinaEstados me2 = new MaquinaEstados(afd2); //Creamos la máquina de estados del autómata AFD2

        boolean corriendo = true;
        Scanner entrada = new Scanner(System.in);
        me1.generaCadenasValidas();
        /*
        while(corriendo){
            MaquinaEstados me;
            System.out.print("\t\t--------------=[PL1 Compiladores]=--------------\n" +
                    "\t¿Que automata desea elegir? (1 o 2)");
            String automata = entrada.nextLine();
            if(automata.equalsIgnoreCase("1")){
                //Verificamos que se ha elegido el autómata AFD1
                me = me1;
            }
            else if(automata.equalsIgnoreCase("2")){
                me = me2;
            }
            else{
                System.out.println("Eleccion no valida, debes introducir 1 o 2");
            }
            System.out.print("\t\t--------------=[PL1 Compiladores]=--------------\n" +
                    "\t1. Validar cadena\n" +
                    "\t2. Generar cadenas validas\n" +
                    "\t3. Salir" +
                    "\n" +
                    "Introduce una opcion: ");
            String eleccion = entrada.nextLine();
            if(eleccion.equalsIgnoreCase("1")){
                //Se verifica que se quiere validar una cadena
                System.out.print("\n\nIntroduce la cadena a validar: ");
                String cadena = entrada.nextLine();
                if(automata.equalsIgnoreCase("1")){
                    if(me1.compruebaCadena(cadena)){
                        System.out.println("La cadena es valida");
                    }
                    else{
                        System.out.println("La cadena no es valida");
                    }
                }
                else{
                    if(me2.compruebaCadena(cadena)){
                        System.out.println("La cadena es valida");
                    }
                    else{
                        System.out.println("La cadena no es valida");
                    }
                }
            }
            else if(eleccion.equalsIgnoreCase("2")){
                //Se verifica que se quiere generan cadenas válidas

            }
        }*/
    }
}
