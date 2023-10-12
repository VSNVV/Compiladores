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
        List<Integer> listaEstadosAfd1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)); //El autómata tiene 5 estados
        //El AFD1 solo tiene un estado final que es el estado 4
        List<Integer> listaEstadosFinalesAfd1 = new ArrayList<>(Collections.singletonList(5));
        //Ahora crearemos las características del segundo AFD

        //El alfabeto del AFD2 tiene a, b, c, d
        String alfabetoAfd2 = "abcd";
        //El AFD2 tiene 6 estados
        List<Integer> listaEstadosAfd2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5)); //El autómata tiene 5 estados
        //El AFD2 tiene 2 estados finales, que son el 4 y el 5
        List<Integer> listaEstadosFinalesAfd2 = new ArrayList<>(Arrays.asList(4, 5));

        //Una vez que tenemos las características creadas de cada autómata, los creamos
        //Creamos el AFD1
        AutomataFinitoDeterminista afd1 = new AutomataFinitoDeterminista(alfabetoAfd1, listaEstadosAfd1, listaEstadosFinalesAfd1);
        //Creamos el AFD2
        AutomataFinitoDeterminista afd2 = new AutomataFinitoDeterminista(alfabetoAfd2, listaEstadosAfd2, listaEstadosFinalesAfd2);

        //Ahora rellenaremos la matriz de estados de ambos autómatas según la ER que maneja cada uno (visible en la memoria)

        //Matriz de AFD1
        afd1.cargarMatriz(0, 'a', 2); //Estado 0 + a --> Estado 2
        afd1.cargarMatriz(0, 'c', 0); //Estado 0 + c --> Estado 0
        afd1.cargarMatriz(1, 'b', 3); //Estado 1 + b --> Estado 3
        afd1.cargarMatriz(2, 'a', 2); //Estado 2 + a --> Estado 2
        afd1.cargarMatriz(2, 'b', 3); //Estado 2 + b --> Estado 3
        afd1.cargarMatriz(2, 'c', 0); //Estado 2 + c --> Estado 0
        afd1.cargarMatriz(3, 'a', 1); //Estado 3 + a --> Estado 1
        afd1.cargarMatriz(3, 'b', 4); //Estado 3 + b --> Estado 4

        //Matriz de AFD2
        afd2.cargarMatriz(0, 'c', 1); //Estado 0 + c --> Estado 1
        afd2.cargarMatriz(1, 'c', 1); //Estado 1 + c --> Estado 1
        afd2.cargarMatriz(1, 'd', 3); //Estado 1 + d --> Estado 3
        afd2.cargarMatriz(2, 'd', 4); //Estado 2 + d --> Estado 4
        afd2.cargarMatriz(3, 'a', 5); //Estado 3 + a --> Estado 5
        afd2.cargarMatriz(3, 'b', 2); //Estado 3 + b --> Estado 2
        afd2.cargarMatriz(5, 'a', 5); //Estado 5 + a --> Estado 5
        afd2.cargarMatriz(5, 'b', 2); //Estado 5 + b --> Estado 2

        //Una vez creadas las matrices de estados de ambos autómatas, los asignamos a sus respectivas máquinas de estados
        MaquinaEstados me1 = new MaquinaEstados(afd1); //Creamos la máquina de estados del autómata AFD1
        MaquinaEstados me2 = new MaquinaEstados(afd2); //Creamos la máquina de estados del autómata AFD2

        boolean corriendo = true;
        Scanner entrada = new Scanner(System.in);
        MaquinaEstados me;
        while(corriendo){
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
                System.out.println("Eleccion no valida, debes introducir 1 o 2<");
            }


        }

    }
}
