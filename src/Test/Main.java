package Test;

public class Main {
    public static void main(String[] args) {
        Cola nuevaCola = new Cola();
        Productor nuevoProductor = new Productor(nuevaCola);
        Consumidor nuevoConsumidor1 = new Consumidor("Coche 1",nuevaCola);
        Consumidor nuevoConsumidor2 = new Consumidor("Coche 2",nuevaCola);
        Consumidor nuevoConsumidor3 = new Consumidor("Coche 3",nuevaCola);
        Consumidor nuevoConsumidor4 = new Consumidor("Coche 4",nuevaCola);
        Consumidor nuevoConsumidor5 = new Consumidor("Coche 5",nuevaCola);
        Consumidor nuevoConsumidor6 = new Consumidor("Coche 6",nuevaCola);
        Consumidor nuevoConsumidor7 = new Consumidor("Coche 7",nuevaCola);
        Consumidor nuevoConsumidor8 = new Consumidor("Coche 8",nuevaCola);
        Consumidor nuevoConsumidor9 = new Consumidor("Coche 9",nuevaCola);
        Consumidor nuevoConsumidor10 = new Consumidor("Coche 10",nuevaCola);
        Consumidor nuevoConsumidor11 = new Consumidor("Coche 11",nuevaCola);
        Consumidor nuevoConsumidor12 = new Consumidor("Coche 12",nuevaCola);
        Consumidor nuevoConsumidor13 = new Consumidor("Coche 13",nuevaCola);
        Consumidor nuevoConsumidor14 = new Consumidor("Coche 14",nuevaCola);
        Consumidor nuevoConsumidor15 = new Consumidor("Coche 15",nuevaCola);
        Consumidor c = new Consumidor();
        // Iniciamos hilos, los 10 primeros coches aparcan
        nuevoProductor.start();
        nuevoConsumidor1.start();
        nuevoConsumidor2.start();
        nuevoConsumidor3.start();
        nuevoConsumidor4.start();
        nuevoConsumidor5.start();
        nuevoConsumidor6.start();
        nuevoConsumidor7.start();
        nuevoConsumidor8.start();
        nuevoConsumidor9.start();
        nuevoConsumidor10.start();
        c.setNumeroCoches(10);
        if(c.getNumeroCoches() <= 1) {
            nuevoConsumidor12.start();
        }
        // Fin
    }
}
