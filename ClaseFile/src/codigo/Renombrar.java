package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Renombrar {

    //static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        /*String ruta = "";
        System.out.println("Introduzca la ruta para renombrar el fichero:");
        try {
            ruta = br.readLine();
        } catch (IOException ioe) {
            System.out.println("Error en la entrada de datos.");
        }*/
        File archivo = new File(args[0]);
        if(archivo.exists() && archivo.isFile()){
            /*
            System.out.println("Introduzca el nuevo nombre del fichero:");
            String nombre = "";
            try{
                nombre = br.readLine();
            }catch (IOException ioe){
                System.out.println("Error en la entrada de datos.");
            }*/
            File archivoNuevo = new File(args[1]);
            archivo.renameTo(archivoNuevo);
            System.out.println("El fichero ha sido modificado con exito.");
        }
        else{
            System.out.println("El fichero no existe.");
        }

    }

}
