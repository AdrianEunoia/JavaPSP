package Ejercicio_Cajero2;

import Ejercicio_Cajero2.Contador;
import Ejercicio_Cajero2.Incrementar;

public class Lanzador {

    public static void main(String[] args) {
        Contador contador = new Contador(0);
        Incrementar incrementar = null;

        for (int i=0; i < 5; i++){
            incrementar = new Incrementar("Hilo "+i, contador);
            incrementar.start();
        }
    }
}
