package Ejercicio2_Examen2;

public class Parking {
    // 10 Primeros coches, 10 plazas ocupadas
    Coche[] plazasOcupadas = new Coche[10];

    public void ocuparPlaza(Coche coche,int posicion){
        plazasOcupadas[posicion] = coche;
        System.out.println(coche.getMatricula()+" aparca en la plaza -> "+posicion);
    }
    public void liberaPlaza(Coche coche){
        for (int i =0;i<plazasOcupadas.length;i++){
            if (plazasOcupadas[i]!=null)
                if (plazasOcupadas[i].getMatricula().equals(coche.getMatricula())){
                    plazasOcupadas[i]=null;
                }
        }
    }
    public synchronized int getPlazaDisponible(){
        int plazaLocal = 0;
        for (int i = 0;i<plazasOcupadas.length;i++){
            if (plazasOcupadas[i]==null){
                plazaLocal = i;
            }
        }
        return plazaLocal;
    }
}