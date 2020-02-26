package Ejercicio_5;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Generamos un file en la ubicación que queramos
        File directorio = new File("/Users/Adri/Desktop/PSP/JavaPSP/bin/Ejercicio_5");

        // El proceso será Ejercicio_5
        ProcessBuilder processBuilder = new ProcessBuilder("java", "Ejercicio_5");

        //Se establece el directorio donde se encuentra el ejecutable
        processBuilder.directory(directorio);

        // Printeamos directorio elegido
        System.out.printf("Directorio de trabajo: %s\n",processBuilder.directory());

        // Lanzamos proceso
        Process process = processBuilder.start();

        // Generamos una variable en la que almacenaremos un booleano que evalua el fallo del proceso
        int errorCode = process.waitFor();
        System.out.println("¿Error al ejecutar el programa? " + (errorCode == 0 ? "No" : "Sí"));
    }
}
