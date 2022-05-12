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
            recuperarVideojuegos();
            registrarVideojuegos();
            for(Videojuego v:listadoVideojuegos){
                System.out.println(v.getNombre());
            }


        }catch (Exception e){
            e.printStackTrace();
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

    public static void registrarVideojuegos() throws IOException{
        System.out.println("Introduzca el nombre del videojuego:");
        String nombre = br.readLine();
        //System.out.println("Introduzca la fecha de lanzamiento:");
        //LocalDate fecha = LocalDate.parse(br.readLine());
        listadoVideojuegos.add(new Videojuego(nombre));
        try{
            fos = new FileOutputStream("./videojuegos.dat");
            salida = new ObjectOutputStream(fos);
            salida.writeObject(listadoVideojuegos);
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (EOFException eofe){
            eofe.printStackTrace();
        }
        catch (IOException ioe){
            System.out.println("Error de E/S.");
        }
    }

    public static void recuperarVideojuegos(){
        try{
            fis = new FileInputStream("./videojuegos.dat");
            entrada = new ObjectInputStream(fis);
            listadoVideojuegos = (ArrayList<Videojuego>) entrada.readObject();
            entrada.close();
        }catch (ClassNotFoundException cnfe){
            System.out.println("Error, clase no encontrada.");
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (EOFException eofe){
            eofe.printStackTrace();
        }
        catch (IOException ioe){
            System.out.println("Error de E/S.");
        }
    }

}
