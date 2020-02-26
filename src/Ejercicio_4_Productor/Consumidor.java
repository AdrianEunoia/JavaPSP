package Ejercicio_4_Productor;

public class Consumidor extends Thread {
    // Elementos
    private Cola nuevaCola;
    // Constructor
    public Consumidor(Cola colaPasada) {
        nuevaCola = colaPasada;
    }
    public void run() {
        for (int i=0;i<5;i++)
            try {
                nuevaCola.get();
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
    }
}
