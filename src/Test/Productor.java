package Test;

public class Productor extends Thread {
    // Elementos
    private Cola nuevaCola;

    // Constructor
    public Productor(Cola colaPasada) {
        nuevaCola = colaPasada;
    }

    public void run() {
        for (int i=0;i<5;i++)
            try {
                nuevaCola.put(i);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
    }
}
