package Ejercicio_Cajero2;

public class Incrementar extends Thread {
    private Contador ic;

    public Incrementar (String n, Contador c){
        super(n);
        ic = c;
    }

    public void run (){
        synchronized (ic) {
            for (int i=0; i<5000; i++){
                ic.incrementa();
            }
            System.out.println(getName()+" El contador vale: "+ic.getContador());
        }
    }
}
