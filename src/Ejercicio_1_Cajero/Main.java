package Ejercicio_1_Cajero;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(40);

        SacarDinero hilo1 = new SacarDinero("Ana",cuenta);
        SacarDinero hilo2 = new SacarDinero("Juan",cuenta);

        hilo1.start();
        hilo2.start();
    }
}
