package Ejercicio_3_AdivinaNumero;

public class Jugador extends Thread {
    // Elementos
    Arbitro arbitro;
    int juega;
    // Constructor
    Jugador (int turno, Arbitro arbitroPasado){
        this.arbitro = arbitroPasado;
        this.juega = turno;
    }
    public void run(){
        int numero_jugar;

        while (!arbitro.esFinalizado()){
            if(arbitro.getTurno() == juega){
                numero_jugar = 1+(int)(10*Math.random());
                System.out.println("El jugador "+juega+" juega el numero "+numero_jugar);
                arbitro.jugada(juega,numero_jugar);
            }
        }
    }

}
