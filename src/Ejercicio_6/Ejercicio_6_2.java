package Ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6_2 {
    public static void main(String[] args) {
        int num1,num2;
        // Var scanner
        Scanner sc = new Scanner(System.in);

        // Recogemos primer numero
        System.out.println("Introduce el primer número:");
        num1 = sc.nextInt();
        // Recogemos segundo numero
        System.out.println("Introduce el segundo número:");
        num2 = sc.nextInt();

        // Var con suma
        int resultado = num1+num2;

        // Printeamos resultado
        System.out.println("El resultado es: " + resultado);
    }
}
