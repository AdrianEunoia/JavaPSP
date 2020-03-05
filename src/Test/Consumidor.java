package Test;

public class Consumidor extends Thread {
    // Elementos
    private Cola nuevaCola;
    private String nombrePasado;
    private int numeroCoches;

    public Consumidor() {

    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    // Constructor
    public Consumidor(String nombrePasado, Cola colaPasada) {
        super(nombrePasado);
        nuevaCola = colaPasada;
        this.numeroCoches = numeroCoches;
    }
    public void run() {
        for (int i = 0; i < 10; i++)
            try {
                nuevaCola.get(getName());
                setNumeroCoches(1);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
    }
}
