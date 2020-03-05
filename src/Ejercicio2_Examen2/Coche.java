package Ejercicio2_Examen2;

public class Coche extends Thread{
    Parking nuevoParking;
    int tiempoAparcado;
    // Cons
    public Coche(int tiempoAparcado, String matriculaPasada,Parking parking) {
        super(matriculaPasada);
        this.tiempoAparcado = tiempoAparcado;
        this.nuevoParking = parking;
    }
    // G&S
    public void setTiempoAparcado(int tiempoAparcado) {
        this.tiempoAparcado = tiempoAparcado;
    }
    public void setNuevoParking(Parking nuevoParking) {
        this.nuevoParking = nuevoParking;
    }
    public int getTiempoAparcado() {
        return tiempoAparcado;
    }
    public String getMatricula() {
        return getName();
    }

    @Override
    public void run() {
        while(true){
            // Contador plaza disponible
            int sitioPasado = nuevoParking.getPlazaDisponible();
            if (sitioPasado > 0){
                nuevoParking.ocuparPlaza(this,sitioPasado);
                try {
                    Thread.sleep(tiempoAparcado);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                nuevoParking.liberaPlaza(this);
                stop();
            }
        }
    }
}