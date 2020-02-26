package Ejercicio_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        // Inicializamos stream reader y buffer
        InputStreamReader inputStreamReader = new InputStreamReader (System.in);
        BufferedReader bufferedReader = new BufferedReader (inputStreamReader);

        // TRY / CATCH Evaluamos introduccion de datos
        String texto;
        try {
            System.out.println ("Introduce un nombre: ");
            texto = bufferedReader.readLine();
            if (texto == "*") { // O lo que sea
                System.out.println("Error");
            }
            else {
                System.out.println ("Nombre: " + texto);
            }
            // Cerramos InputStreamerReader
            inputStreamReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
