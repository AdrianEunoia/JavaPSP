package EjercicioExamen;

public class Main {
    public static void main(String[] args) {
        Controladora centralita = new Controladora();
        Aspersor aspersorPasado = null;
        // Bucle generar 6 hilos
        for (int i=1;i<6;i++){
            aspersorPasado = new Aspersor(i, centralita);
            aspersorPasado.start();
        }
    }
}