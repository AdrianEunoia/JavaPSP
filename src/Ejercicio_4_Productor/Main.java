package Ejercicio_4_Productor;

import Ejercicio_Cajero2.Contador;

public class Main {
    public static void main(String[] args) {
        Cola nuevaCola = new Cola();
        Productor nuevoProductor = new Productor(nuevaCola);
        Consumidor nuevoConsumidor = new Consumidor(nuevaCola);
        // Iniciamos hilos
        nuevoProductor.start();
        nuevoConsumidor.start();
        // Fin
    }
}
