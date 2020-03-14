package Ejercicio1_Examen3;

public class ModificaSaldo extends Thread {
    private Cuenta cuenta;
    String nombre;
    int tipoOperacion;
    int cantidadOperacion;

    // Constructor
    public ModificaSaldo(String nombre, int tipoOperacion, int cantidadOperacion, Cuenta cuenta){
        super(nombre);
        this.tipoOperacion = tipoOperacion;
        this.cantidadOperacion = cantidadOperacion;
        this.cuenta = cuenta;
    }

    public void run(){
        for (int i=1; i<=20;i++){
                cuenta.operarDinero(tipoOperacion,cantidadOperacion, getName());
            try {
                sleep(10);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }



}
