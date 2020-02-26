package Ejercicio_3_AdivinaNumero;

import java.util.Random;

public class Arbitro {
    int numeroJugadores;
    int turno;
    int numeroAdivinar;
    boolean terminado = false;

    Arbitro(int numero){
        // Inicializacion de numero de jugadores
        this.numeroJugadores = numero;
        // Inicializacion de numero a adivinar
        Random numeroAleatorio = new Random();
        numeroAdivinar = numeroAleatorio.nextInt(10)+1;
        System.out.println("El numero a adivinar es: "+numeroAdivinar);
        // Inicializacion de turno
        this.turno = 0;
    }
    // Metodo que devuelve el turno
    public int getTurno(){
        return this.turno;
    }
    // Metodo que devuelve que el juego
    public boolean esFinalizado(){
        return terminado;
    }
    // Metodo que controla la jugada de cada jugador
    public synchronized void jugada(int jugadorPasado, int numero){
        if(numero == numeroAdivinar){
            System.out.println("Gana el jugador "+jugadorPasado+" Ha adivinida el numero"+numeroAdivinar);
            terminado = true;
        }else{
            if(jugadorPasado == (numeroJugadores-1)){
                System.out.println("Le toca al jugador "+0);
                this.turno = 0;
            }else{
                System.out.println("Le toca al jugador "+(this.turno+1));
                this.turno += 1;
            }
        }
    }
}
