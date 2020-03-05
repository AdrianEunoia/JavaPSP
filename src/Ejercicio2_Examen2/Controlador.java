package Ejercicio2_Examen2;

public class Controlador {
    public static void main(String[] args) {
        Parking parking = new Parking();
        for (int i = 1; i<16 ;i++){
            Coche nuevoCoche = new Coche((int)Math.random()*10000000,i+"00 AAA",parking);
            nuevoCoche.start();
        }
    }
}