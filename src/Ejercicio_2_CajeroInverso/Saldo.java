package Ejercicio_2_CajeroInverso;

public class Saldo {
    // Elementos
    int saldo, movimiento;
    // Constructor
    Saldo (int saldo_total){
        this.saldo = saldo_total;
    }
    // Obtener saldo
    public int getSaldo(){
        try{
            Thread.sleep((int) Math.random()*1000+1);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        return saldo;
    }
    // Establecer saldo
    public void setSaldo(int n){
        try {
            Thread.sleep((int) Math.random()*1000+1);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        movimiento = n;
    }
    // Aumentar saldo
    synchronized public void añadirSaldo(String nombre, int movimiento){
        System.out.println("INGRESO EN LA CUENTA");
        System.out.println("La cuenta tiene: "+saldo+" y "+nombre+" va a ingresar "+movimiento);
        saldo += movimiento;
        System.out.println("El total en la cuenta despues del ingreso es de: "+saldo);
    }
}
