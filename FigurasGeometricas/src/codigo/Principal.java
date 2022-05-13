package codigo;

import java.io.*;

public class Principal {

    private static FileOutputStream fos = null;
    private static ObjectOutputStream salida = null;
    private static FileInputStream fis = null;
    private static ObjectInputStream entrada = null;
    private static final File RUTA = new File("./rectangulos.dat");

    public static void main(String[] args) {

        try{
            leerRectangulo();
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
            }catch (IOException ioe){
                System.out.println("Error E/S");
            }
        }
    }

    public static void escribirRectangulo(){
        try{
            fos = new FileOutputStream(RUTA);
            salida = new ObjectOutputStream(fos);
            Rectangulo r1 = new Rectangulo(12,6,"azul");
            salida.writeObject(r1);
            Punto p1 = new Punto(4,2);
            Rectangulo r2 = new Rectangulo(p1,60,25,"morado");
            salida.writeObject(r2);
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
            Rectangulo rr1 = (Rectangulo) entrada.readObject();
            System.out.println(rr1);
            Rectangulo rr2 = (Rectangulo) entrada.readObject();
            System.out.println(rr2);
            fis.close();
            entrada.close();
        }catch (ClassNotFoundException cnfe){
            System.out.println("Clase no encontrada.");
        }catch (FileNotFoundException fnfe){
            System.out.println("Fichero no encontrado.");
        }catch (IOException ioe){
            System.out.println("Error E/S.");
        }
    }
}
