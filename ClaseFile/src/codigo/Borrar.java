package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Borrar {

    //

    public static void main(String[] args) {
        /*
        String ruta = "";
        System.out.println("Introduzca la ruta para borrar el fichero:");
        try {
            ruta = br.readLine();
        } catch (IOException ioe) {
            System.out.println("Error en la entrada de datos.");
        }*/
        File archivo = new File(args[0]);
        if(archivo.exists() && archivo.isFile()){
            archivo.delete();
            System.out.println("El fichero ha sido eliminado con exito.");
        }
        else{
            System.out.println("El fichero no existe.");
        }

    }

}
