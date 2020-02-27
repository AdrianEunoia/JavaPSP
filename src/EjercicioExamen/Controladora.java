package EjercicioExamen;

public class Controladora {
    // Elementos
    boolean estado1=false;
    boolean estado2=false;
    boolean estado3=false;
    boolean estado4=false;
    boolean estado5=false;

    // Random Humedad
    public int generarHumedad(){
        return  (int)(Math.random()*100+1);
    }

    // Getter con estado -> Controlar estado aspersor al pasar vuelta
    public boolean getEstados(int aspersor){
        boolean estadoDevuelto=false;
        if (aspersor == 1){
            estadoDevuelto =  estado1;
        }
        if (aspersor == 2){
            estadoDevuelto =  estado2;
        }
        if (aspersor == 3){
            estadoDevuelto =  estado3;
        }
        if (aspersor == 4){
            estadoDevuelto =  estado4;
        }
        if (aspersor == 5){
            estadoDevuelto =  estado5;
        }
        return estadoDevuelto;
    }

    // Metodo control aspersor
    public synchronized void controlarAspersor(int aspersorPasado){
        int contadorHoras = 1;
        do{
                // Controla la hora desde aquí, es decir, si entra en orden el primero emite la hora, 24 veces.
                // El problema es que no puedo pasar el orden debido al notiffy();
                // En orden se emitiría correctamente, es rudo pero funciona.
                if (aspersorPasado==1){
                    System.out.println("CONTROL DE HORA "+contadorHoras);
                }
                System.out.println("  Se está controlando el aspersor: "+aspersorPasado);
                int humedad= generarHumedad();
                if (getEstados(aspersorPasado) && humedad<40){
                    System.out.println("   ##   El Aspersor: "+aspersorPasado+" tiene "+humedad+"% de humedad");
                    System.out.println("   ##   El Aspersor: "+aspersorPasado+" sigue regando");
                }else if (getEstados(aspersorPasado) && humedad>40){
                    System.out.println("   ##   El Aspersor: "+aspersorPasado+" tiene "+humedad+"% de humedad");
                    System.out.println("   ##   El Aspersor: "+aspersorPasado+" se apaga");
                }else if (!getEstados(aspersorPasado) && humedad<40){
                    System.out.println("   ##   El Aspersor: "+aspersorPasado+" tiene "+humedad+"% de humedad");
                    System.out.println("   ##   El Aspersor: "+aspersorPasado+" se enciende");
                }else{
                    System.out.println("   ##   El Aspersor: "+aspersorPasado+" tiene "+humedad+"% de humedad");
                    System.out.println("   ##   El Aspersor: "+aspersorPasado+" sigue apagado");
                }
                contadorHoras++;
            }while (contadorHoras<25);
    }
}