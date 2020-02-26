package Ejercico_Cajero1;

public class Lanzador {
    public static void main(String[] args) {
        Contador contador = new Contador(40);
        // Hilos, entran y salen 2
        Incrementar hiloPepe =  new Incrementar("Pepe", contador);
        Incrementar hiloAna =  new Incrementar("Ana", contador);
        hiloPepe.start();
        hiloAna.start();
    }
}
