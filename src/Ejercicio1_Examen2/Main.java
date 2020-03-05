package Ejercicio1_Examen2;

import Ejercicio_Cajero2.Contador;

public class Main {
    public static void main(String[] args) {
        Cola nuevaCola = new Cola();
        Productor nuevoProductor = new Productor(nuevaCola);
        Consumidor nuevoConsumidor = new Consumidor("CLIENTE_1",nuevaCola);
        Consumidor nuevoConsumidor2 = new Consumidor("CLIENTE_2",nuevaCola);
        // Iniciamos hilos
        nuevoProductor.start();
        nuevoConsumidor.start();
        nuevoConsumidor2.start();
        // Fin
    }
}
