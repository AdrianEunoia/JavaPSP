package EjercicioExamen;

public class Aspersor extends Thread {
    Controladora controladora;
    int vueltaAspersor;
    // Constructor
    public Aspersor(int turno, Controladora controladoraPasada){
        controladora = controladoraPasada;
        this.vueltaAspersor = turno;
    }
    // Start thread
    @Override
    public void run() {
            controladora.controlarAspersor(vueltaAspersor);
    }
}