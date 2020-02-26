package Ejercicio_1_Cajero;

public class SacarDinero extends Thread {
    private Cuenta cuenta;
    String nombre;

    public SacarDinero(String nombre, Cuenta cuenta){
        super(nombre);
        this.cuenta = cuenta;
    }
    public void run(){
        for (int i=1; i<=4;i++){
            cuenta.retirarDinero(10, getName());
            try {
                sleep(10);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
