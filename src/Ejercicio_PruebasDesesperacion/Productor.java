package Ejercicio_PruebasDesesperacion;

import java.util.Collections;

public class Productor extends Thread {
    // Elementos
    private Controlador nuevoControlador;
    // Constructor
    public Productor(Controlador controladorPasado) {
        nuevoControlador = controladorPasado;
    }

    public void run() {
        for (int i=0;i<5;i++)
            try {
                nuevoControlador.put(i);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
    }
}
