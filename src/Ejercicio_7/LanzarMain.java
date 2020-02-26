package Ejercicio_7;

import java.io.File;
import java.io.InputStream;

public class LanzarMain {
    public static void main(String[] args) {
        // Ruta donde generar File
        File fileGenerar = new File ("/Users/Adri/Desktop/PSP/JavaPSP/bin/Ejercicio_7/");

        //Ruta de la clase a ejecutar
        String claseLanzar = "Ejercicio_7.Main";
        ProcessBuilder processBuilder;


        // TRY / CATCH para invocar la clase
        try {
            // Indicamos que clase deberá lanzar
            processBuilder = new ProcessBuilder("java", claseLanzar);

            // Indicamos el lugar del File
            processBuilder.directory(fileGenerar);

            // Lanzamos el proceso
            Process process = processBuilder.start();

            // Invocamos inputstream
            InputStream inputStream = process.getInputStream();
            int c;

            while ((c = inputStream.read()) != -1)
                System.out.print((char)c);
            // Cerramos inputstream
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
