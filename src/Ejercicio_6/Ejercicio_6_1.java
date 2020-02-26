package Ejercicio_6;
import java.io.*;

public class Ejercicio_6_1 {
    public static void main(String[] args) {

        // Ubicacion File
        File file = new File("C:/Users/Adri/Desktop/PSP/JavaPSP/Ejercicio_7/Recesvinto.txt");
        //Cadena de texto
        String content = "Hola Recesvinto";

        // TRY / CATCH Lectura archivo, sino existe lo creará
        try (FileOutputStream fop = new FileOutputStream(file)) {
            if (!file.exists()) {
                file.createNewFile();
            }
            // Contenido en bytes
            byte[] contentInBytes = content.getBytes();
            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Fin lectura");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
