package Ejercicio_PruebasDesesperacion;

import com.sun.media.jfxmediaimpl.HostUtils;

public class Controlador {
    private int numero;
    private boolean disponible;

    // Metodo sincronizado put
    public synchronized void put(int valorPut) throws InterruptedException{
        int flag = 0;
        while (flag<0){
            wait();
            flag++;
        }
        numero = valorPut;
        disponible = false;
        notifyAll();
        System.out.println("Se produce "+numero);
    }
}
