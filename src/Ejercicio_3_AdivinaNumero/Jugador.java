package Ejercicio_3_AdivinaNumero;

public class Jugador extends Thread {
    // Elementos
    Arbitro nuevoArbitro;
    int juega;
    // Constructor
    Jugador (int turno, Arbitro arbitroPasado){
        this.nuevoArbitro = arbitroPasado;
        this.juega = turno;
    }
    public void run(){
        int numero_jugar;

        while (!nuevoArbitro.esFinalizado()){
            if(nuevoArbitro.getTurno() == juega){
                numero_jugar = 1+(int)(10*Math.random());
                System.out.println("El jugador "+juega+" juega el numero "+numero_jugar);
                nuevoArbitro.jugada(juega,numero_jugar);
            }
        }
    }

}
