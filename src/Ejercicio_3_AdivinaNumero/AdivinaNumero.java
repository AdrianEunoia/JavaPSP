package Ejercicio_3_AdivinaNumero;

public class AdivinaNumero {
    public static void main(String[] args) {
        Arbitro arbitroPasado = new Arbitro(3);
        Jugador jugadorPasado = null;

        for (int i=0;i<3;i++){
            jugadorPasado = new Jugador(i, arbitroPasado);
            jugadorPasado.start();
        }
    }
}
