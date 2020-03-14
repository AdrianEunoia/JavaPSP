package Ejercicio1_Examen3;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta((int)Math.random()*500,500);

        int opera1 = (Math.random() <= 0.5) ? 0 : 1;
        ModificaSaldo hilo1 = new ModificaSaldo("Ana",opera1,(int)Math.random()*500,cuenta);
        int opera2 = (Math.random() <= 0.5) ? 0 : 1;
        ModificaSaldo hilo2 = new ModificaSaldo("Juan",opera2,(int)Math.random()*500,cuenta);
        int opera3 = (Math.random() <= 0.5) ? 0 : 1;
        ModificaSaldo hilo3 = new ModificaSaldo("Fernando",opera3,(int)Math.random()*500,cuenta);
        int opera4 = (Math.random() <= 0.5) ? 0 : 1;
        ModificaSaldo hilo4 = new ModificaSaldo("Elvira",opera4,(int)Math.random()*500,cuenta);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
