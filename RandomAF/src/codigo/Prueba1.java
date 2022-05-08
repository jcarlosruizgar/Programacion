package codigo;

import java.io.*;

public class Prueba1 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static RandomAccessFile fichero = null;

    public static void main(String[] args){

        int numero;
        try{
            fichero = new RandomAccessFile("./enteros.dat","rw");
            mostrarFichero();
            System.out.println("Introduce un numero entero:");
            numero = Integer.parseInt(br.readLine());
            fichero.seek(fichero.length());
            fichero.writeInt(numero);
            mostrarFichero();
        }catch (FileNotFoundException fnfe){
            System.out.println("No existe el fichero.");
        }catch (IOException ioe){
            System.out.println("Error en la E/S.");
        }finally{
            try{
                if(fichero != null){
                    fichero.close();
                }
            }catch (IOException ioe){
                System.out.println("Error.");
            }
        }
    }

    public static void mostrarFichero(){
        int n;
        try{
            fichero.seek(0);
            while(true){
                System.out.println(fichero.readInt());
            }
        }catch (EOFException eofe){
            System.out.println("Fin del fichero.");
        }catch (IOException ioe){
            System.out.println("Erroe en la E/S.");
        }
    }

}
