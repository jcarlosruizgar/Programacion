package codigo;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static FileOutputStream fos =  null;
    private static ObjectOutputStream salida = null;
    private static FileInputStream fis = null;
    private static ObjectInputStream entrada = null;
    private static ArrayList<Videojuego> listadoVideojuegos = new ArrayList<Videojuego>();

    public static void main(String[] args) {
        try{
            //guardado de objetos
            fos = new FileOutputStream("./videojuegos.obj");
            salida = new ObjectOutputStream(fos);
            //carga de objetos
            fis = new FileInputStream("./videojuegos.obj");
            entrada = new ObjectInputStream(fis);
            registrarVideojuego();
            System.out.println(recuperarVideojuego().getNombre());


        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (ClassNotFoundException cnfe){
            System.out.println("Clase no encontrada.");
        }catch (IOException ioe){
            System.out.println("Error de E/S.");
        }finally{
            try{
                if(fos != null){
                    fos.close();
                }
                if(salida != null){
                    salida.close();
                }
                if(fis != null){
                    fis.close();
                }
                if(entrada != null){
                    entrada.close();
                }
            }catch (IOException ioe){
                System.out.println("Error de E/S.");
            }
        }

    }

    public static void registrarVideojuego() throws IOException{
        System.out.println("Introduzca el nombre del videojuego:");
        String nombre = br.readLine();
        System.out.println("Introduzca la fecha de lanzamiento:");
        LocalDate fecha = LocalDate.parse(br.readLine());
        listadoVideojuegos.add(new Videojuego(nombre,fecha));
        salida.writeObject(listadoVideojuegos);
    }

    public static Videojuego recuperarVideojuego() throws IOException, ClassNotFoundException {
        return (Videojuego) entrada.readObject();
    }

}
