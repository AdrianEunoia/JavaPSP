package Ejercicio_6;
import java.io.*;

public class EjemploLectura {
    public static void main(String[] args) {

        // Generar file y su ubicacion file
        File file = new File("C:/Users/Adri/Desktop/PSP/JavaPSP/Ejercicio_7/Recesvinto.txt");

        // TRY / CATCH Lectura archivo
        try (FileInputStream fis = new FileInputStream(file)) {
            //Archivo en bytes
            System.out.println("Bytes totales: "+ fis.available());

            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
