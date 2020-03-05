package Test;

public class Cola {
    private int numero;
    private boolean disponible;

    // Metodo sincronizado get
    public synchronized int get (String nombre) throws InterruptedException {
        Consumidor c = new Consumidor();
        // Si no hay numeros espera
        while(!disponible){
            wait();
        }
        // No hay numerops notificamos
            try {
                System.out.println(c.getNumeroCoches());
                Thread.sleep(10000);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
            disponible = false;
            notify();
            System.out.println("      "+nombre+" consume: "+numero);
        return numero;
    }

    // Metodo sincronizado put
    public synchronized void put(int valorPut) throws InterruptedException{
        while (disponible){
            wait();
        }
        numero = valorPut;
        disponible = true;
        notifyAll();
        System.out.println("=> Productor produce "+numero);
    }
}
