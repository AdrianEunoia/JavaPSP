package Ejercicio1_Examen3;

public class Cuenta {
    // Elementos
    int saldo;
    int saldoMaximo;
    // Constructor
    public Cuenta(int saldo, int saldoMaximo) {
        this.saldo = saldo;
        this.saldoMaximo = saldoMaximo;
    }
    // Getter & Setter
    public int getSaldo() { return saldo; }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldoMaximo() { return saldoMaximo; }
    public void setSaldoMaximo(int saldoMaximo) { this.saldoMaximo = saldoMaximo; }
    // Metodos sumar y restar
    void restar (int cantidad){
        saldo -= cantidad;
    }
    void sumar (int cantidad){
        saldo += cantidad;
    }
    // Metodo retirar


    synchronized void operarDinero (int tipoOperacion, int cantidad, String nombre) {
        if (tipoOperacion == 0) {
            // Si hay dinero que sacar
            if (getSaldo() >= cantidad) {
                System.out.println(nombre + ": Va a retirar dinero. Saldo actual: " + getSaldo());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                restar(cantidad);
                System.out.println(nombre + " va a retirar " + cantidad + " el saldo que deja es de " + getSaldo());
            } else {
                System.out.println(nombre + " ha intentado retirar saldo pero no hay suficiente, el saldo es de " + getSaldo());
            }
            if (getSaldo() < 0) {
                System.out.println("El saldo es negativo");
            }
        } else if (tipoOperacion == 1) {
            // Si hay dinero que sacar
            if (getSaldoMaximo() < 500) {
                System.out.println(nombre + ": Va a ingresar dinero. Saldo actual: " + getSaldo());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                sumar(cantidad);
                System.out.println(nombre + " va a ingresar " + cantidad + " el saldo que deja es de " + getSaldo());
            } else {
                System.out.println(nombre + " ha intentado ingresar saldo pero hay demasiado dinero, el saldo es de " + getSaldo());
            }
            if (getSaldoMaximo() > 500) {
                System.out.println("El saldo es demasiado");
            }
        } try {
            wait();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
