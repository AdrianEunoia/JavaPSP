package Ejercicio_PruebasDesesperacion;

public class Main {
    public static void main(String[] args) {
        Controlador nuevoControlador = new Controlador();
        Productor nuevoProductor = new Productor(nuevoControlador);
        // Iniciamos hilos
        nuevoProductor.start();
        // Fin
    }
}
