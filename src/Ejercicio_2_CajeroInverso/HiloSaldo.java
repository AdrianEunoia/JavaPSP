package Ejercicio_2_CajeroInverso;

public class HiloSaldo extends Thread {
    private Saldo nuevoSaldo;
    String nombre;
    int movimiento;
    // Constructor
    public HiloSaldo(Saldo nuevoSaldo, String nombre, int movimiento) {
        this.nuevoSaldo = nuevoSaldo;
        this.nombre = nombre;
        this.movimiento = movimiento;
    }
    // Lets go
    public void run(){
        nuevoSaldo.añadirSaldo(nombre, movimiento);
    }
}
