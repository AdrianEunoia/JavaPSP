package Ejercicio_4;

import java.io.*;

public class LanzarNombre {
    public static void main(String[] args) throws IOException {

        //Creamos objeto File al directorio donde esta LeerNombre
        File directorio = new File("/Users/Adri/Desktop/PSP/JavaPSP/bin/Ejercicio_4");

        // Decidimos el proceso a ejecutar
        ProcessBuilder processBuilder = new ProcessBuilder("java", "LeerNombre");

        // Directorio donde se lanzará
        processBuilder.directory(directorio);

        // Printeamos directorio elegido
        System.out.printf("El directorio será: %s\n",processBuilder.directory());

        // Lanzamos proceso
        Process process = processBuilder.start();

        // TRY / CATCH para la lectura de la salidad (while)
        try {
            InputStream is = process.getInputStream();
            int c;
            while ((c = is.read()) != -1)
                System.out.print((char) c);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TRY / CATH para comprobar que se obtiene si 0 o 1.
        int valorSalida;
        try {
            valorSalida = process.waitFor();
            System.out.println("Salida: " + valorSalida);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}