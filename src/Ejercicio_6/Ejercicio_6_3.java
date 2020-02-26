package Ejercicio_6;

import java.io.File;
import java.io.InputStream;

public class Ejercicio_6_3 {
    public static void main(String[] args) {

        //Ruta del proyecto
        File file = new File ("/Users/Adri/Desktop/PSP/JavaPSP/bin/Ejercicio_6");

        //Ruta de la clase a ejecutar
        String clase="Ejercicio_6.Ejercicio_6_2";
        ProcessBuilder processBuilder;

        // TRY / CATCH Lanzar proceso
        try {
            // Recogemos clase y la lanmzamos
            processBuilder = new ProcessBuilder("java", clase);

            // Se establece el directorio donde se encuentra el ejecutable
            processBuilder.directory(file);

            // Lanzamos proceso
            Process process = processBuilder.start();

            // Invocamos inputstream
            InputStream is = process.getInputStream();
            int content;

            while ((content = is.read()) != -1)
                System.out.print((char)content);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
