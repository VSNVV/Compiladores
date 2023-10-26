package pl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gestor {
    //Atributos de la clase Gestor
    private MaquinaEstados me1;
    private MaquinaEstados me2;

    //Métodos de la clase Gestor

    //Constructor
    public Gestor(){
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

        //UNa vez creados los autómatas, creamos las matrices de estado de cada uno:

        //Matriz del AFD1
        afd1.cargarMatriz(0, 'a', 1); //Estado 0 + a --> Estado 1
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

        //Como los autómatas ya están completos, podemos crear las máquinas de estado:
        this.me1 = new MaquinaEstados(afd1);
        this.me2 = new MaquinaEstados(afd2);
    }

    //Método para elegir Máquina de Estado
    public MaquinaEstados eleccionMaquinaEstados(int eleccion){
        if(eleccion == 1){
            return this.me1;
        }
        else if(eleccion == 2){
            return this.me2;
        }
        return null;
    }

}
