package Ejercicio_1_Cajero;

public class Cuenta {
    // Elementos
    int saldo;
    // Constructor
    public Cuenta(int saldo) {
        this.saldo = saldo;
    }
    // Getter & Setter
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    // Metodos sumar y restar
    void restar (int cantidad){
        saldo -= cantidad;
    }
    void sumar (int cantidad){
        saldo += cantidad;
    }
    synchronized void retirarDinero (int cantidad, String nombre){
        // Si hay dinero que sacar
        if (getSaldo() >= cantidad){
            System.out.println(nombre+ ": Va a retirar dinero. Saldo actual: "+getSaldo());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
            restar(cantidad);
            System.out.println(nombre+" va a retirar "+cantidad+" el saldo que deja es de "+getSaldo());
        }else{
            System.out.println(nombre+" ha intentado retirar saldo pero no hay suficiente, el saldo es de "+getSaldo());
        }if (getSaldo() < 0) {
            System.out.println("El saldo es negativo");
        }
    }
}
