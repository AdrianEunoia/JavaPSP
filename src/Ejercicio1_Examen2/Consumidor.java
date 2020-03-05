package Ejercicio1_Examen2;

public class Consumidor extends Thread {
    // Elementos
    private Cola nuevaCola;
    private String nombrePasado;
    // Constructor
    public Consumidor(String nombrePasado, Cola colaPasada) {
        super(nombrePasado);
        nuevaCola = colaPasada;
    }
    public void run() {
        for (int i=0;i<5;i++)
            try {
                nuevaCola.get(getName());
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
    }
}
