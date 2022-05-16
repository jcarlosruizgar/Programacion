package codigo;

import java.io.*;
import java.util.ArrayList;

public class Principal {

    private static FileOutputStream fos = null;
    private static ObjectOutputStream salida = null;
    private static FileInputStream fis = null;
    private static ObjectInputStream entrada = null;
    private static ArrayList<Rectangulo> listaRectangulos = new ArrayList<Rectangulo>();
    private static final File RUTA = new File("./rectangulos.dat");
    private static final File RUTA_INFORME = new File("./rectangulos.txt");
    private static FileWriter fw = null;

    public static void main(String[] args) {

        try{
            escribirRectangulo();
            leerRectangulo();
            mostrarRectangulos();
            crearInforme();
        }
        finally {
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
                if(fw != null){
                    fw.close();
                }
            }catch (IOException ioe){
                System.out.println("Error E/S");
            }
        }
    }

    public static void escribirRectangulo(){
        try{
            fos = new FileOutputStream(RUTA);
            salida = new ObjectOutputStream(fos);
            listaRectangulos.add(new Rectangulo(12,6,"azul"));
            listaRectangulos.add(new Rectangulo(new Punto(4,2),60,25,"morado"));
            salida.writeObject(listaRectangulos);
            fos.close();
            salida.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (EOFException eofe){
            System.out.println("Fin de fichero.");
        }catch (IOException ioe){
            System.out.println("Error E/S");
        }
    }

    public static void leerRectangulo(){
        try{
            fis = new FileInputStream(RUTA);
            entrada = new ObjectInputStream(fis);
            listaRectangulos = (ArrayList<Rectangulo>)entrada.readObject();
            fis.close();
            entrada.close();
        }catch(EOFException eofe){
            System.out.println("Fin de fichero.");
        }catch (ClassNotFoundException cnfe){
            System.out.println("Clase no encontrada.");
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (IOException ioe){
            System.out.println("Error E/S.");
        }
    }

    public static void mostrarRectangulos(){
        for(Rectangulo r:listaRectangulos){
            System.out.println(r);
        }
    }

    public static void crearInforme(){
        int contador = 1;
        try{
            fw = new FileWriter(RUTA_INFORME);
            for(Rectangulo r:listaRectangulos){
                fw.write("Rectangulo nº"+contador+":\n");
                fw.write(r.toString()+"\n\n");
                contador++;
            }
            fw.close();
        }catch (IOException ioe){
            System.out.println("Error E/S.");
        }
    }
}
