package codigo;

import java.io.*;
import java.time.LocalDate;

public class Principal {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static FileOutputStream fos =  null;
    private static ObjectOutputStream salida = null;
    private static FileInputStream fis = null;
    private static ObjectInputStream entrada = null;

    public static void main(String[] args) {
        try{
            fos = new FileOutputStream("./videojuegos.obj");
            salida = new ObjectOutputStream(fos);
            fis = new FileInputStream("./videojuegos.obj");
            entrada = new ObjectInputStream(fis);



        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
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
        Videojuego v = new Videojuego(nombre,fecha);
        salida.writeObject(v);
    }

}
