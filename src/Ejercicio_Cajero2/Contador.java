package Ejercicio_Cajero2;

public class Contador {
    // Elementos
    private int c = 0;
    // Constructor
    public Contador(int c) {
        this.c = c;
    }
    public int getContador(){
        return c;
    }
    public void setContador (int i){
        c = i;
    }
    public void incrementa(){
        c++;
    }
}
