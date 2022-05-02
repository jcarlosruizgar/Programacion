package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prueba {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            System.out.println("¿Que operacion quiere realizar?\nIntroduzca:");
            System.out.println("1 - Para mostrar el contenido de una ruta.");
            System.out.println("2 - Para eliminar un fichero.");
            System.out.println("3 - Para cambiar el nombre de un fichero.");
            switch (Integer.parseInt(br.readLine())) {
                case 1:
                    mostrarContenido(leerRuta());
                    break;
                case 2:
                    eliminarFichero(leerRuta());
                    break;
                case 3:
                    cambiarNombreFichero(leerRuta());
                    break;
                default:
                    System.out.println("No ha seleccionado una operacion correcta.");
                    break;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Eso no es un numero.");
        } catch (IOException ioe) {
            System.out.println("Error en la entrada de datos.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static File leerRuta() throws IOException{
        System.out.println("Introduza la ruta:");
        return new File(br.readLine());
    }

    public static void mostrarContenido(File archivo) {
        if (archivo.exists()) {
            String[] lista = archivo.list();
            for (String s : lista) {
                System.out.println(s);
            }
        } else {
            System.out.println("Esa ruta no es correcta.");
        }
    }

    public static void eliminarFichero(File archivo) {
        if (archivo.exists() && archivo.isFile()) {
            archivo.delete();
            System.out.println("El fichero ha sido eliminado con exito.");
        } else {
            System.out.println("El fichero no existe.");
        }
    }

    public static void cambiarNombreFichero(File archivo) throws IOException{
        if(archivo.exists() && archivo.isFile()){
            System.out.println("Introduce el nuevo nombre:");
            File archivoNuevo = new File(br.readLine());
            archivo.renameTo(archivoNuevo);
            System.out.println("El fichero ha sido modificado con exito.");
        }
        else{
            System.out.println("El fichero no existe.");
        }
    }
}
