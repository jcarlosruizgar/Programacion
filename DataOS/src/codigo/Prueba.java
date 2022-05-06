package codigo;

import java.io.*;

public class Prueba {
    public static void main(String[] args) {
        File f=new File("C:/1/1.txt");
        boolean finArchivo=false;//Para provocar bucle infinito
        try{
            FileInputStream fis=new FileInputStream(f);
            DataInputStream dis=new DataInputStream(fis);
            double d;
            while (!finArchivo){
                d=dis.readDouble();
                System.out.println(d);
            }
            dis.close();
        }
        catch(EOFException e){
            finArchivo=true;
        }
        catch(FileNotFoundException e){
            System.out.println("No se encontr el archivo");
        }
        catch(IOException e){
            System.out.println("Error al leer");
        }
    }
}
