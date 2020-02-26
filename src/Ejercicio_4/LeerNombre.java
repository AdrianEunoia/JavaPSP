package Ejercicio_4;

import java.io.*;

public class LeerNombre {
    public static void main (String[] args) throws IOException {

        // Inicializamos stream reader y buffer
        InputStreamReader inputStreamReader = new InputStreamReader (System.in);
        BufferedReader bufferedReader = new BufferedReader (inputStreamReader);

        // TRY / CATCH para ver que obtiene lo buffereado
        String texto;
        try {
            System.out.println ("Introduce un nombre: ");
            texto = bufferedReader.readLine();
            System.out.println ("Nombre: " + texto);
            inputStreamReader.close();
        } catch (Exception e) {
            System.exit(1);
        }
    }
}

