package Ejercicio1_Examen2;

import com.sun.media.jfxmediaimpl.HostUtils;

public class Cola {
    private int numero;
    private boolean disponible;

    // Metodo sincronizado get
    public synchronized int get (String nombre) throws InterruptedException {
        // Si no hay numeros espera
        while(!disponible){
            wait();
        }
        // No hay numerops notificamos
        disponible = false;
        notifyAll();
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
