package Ejercicio_2_CajeroInverso;

public class ModificaSaldo {
    public static void main(String[] args) {
        Saldo saldo = new Saldo(100);

        // Lanzar hilo
        HiloSaldo hiloSaldo = null;
        System.out.println("El saldo inicial de la cuenta es de: "+saldo.getSaldo());

        // Creamos hilos
        for (int i=0;i<5; i++){
            // Orden ->   (Saldo nuevoSaldo, String nombre, int movimiento)
            hiloSaldo = new HiloSaldo(saldo,"Hilo numero "+i,(50+i));
            hiloSaldo.start();
        }
        System.out.println("El saldo final de la cuenta sera de: "+saldo.getSaldo());
    }
}
