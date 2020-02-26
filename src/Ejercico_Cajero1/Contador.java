package Ejercico_Cajero1;

public class Contador {
    // Elementos
    //private int c = 40; // Inicial para pruebas
    int saldo;
    // Constructor
    public Contador(int s) { this.saldo = s; }
    public void setSaldo(int s) { this.saldo = s; }
    public int getSaldo() { return saldo; }
    // Synchronized sacar
    public synchronized void sacarDinero(int x){
        saldo = saldo - x;
        System.out.println(saldo);
    }
    // Comprobar si se puede sacar
    public boolean sePuedeSacar(){
        return getSaldo()>=0;
    }
}
