package Ejercico_Cajero1;

public class Incrementar extends Thread{
    private Contador contador;
    public Incrementar(String nombre, Contador contador){
        super(nombre);
        this.contador = contador;
    }
    @Override
    public void run() {
        for (int i = 0; i<4; i++){
            if (contador.sePuedeSacar()) {
                System.out.println(getName() + " realiza una operación el saldo de establece en: " + contador.getSaldo()+" euros");
                contador.sacarDinero(10);
                System.out.println(getName() + " realiza una operación el saldo de establece en: " + contador.getSaldo()+" euros");
            }else{
                System.out.println("No se pueden realizar más operaciones de retirada");
            }
        }
    }
}