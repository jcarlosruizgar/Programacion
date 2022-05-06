package codigo;

import java.io.*;
import java.util.Random;

public class DOS {

    public static void main(String[] args) {
        File f=new File("C:/1/1.txt"); Random r=new Random();
        double d=18.76353;
        try{
            FileOutputStream fis=new FileOutputStream(f);
            DataOutputStream dos=new DataOutputStream(fis);
            for (int i=0;i<234;i++){ //Se repite 233 veces
                dos.writeDouble(r.nextDouble());//Nº aleatorio
            }
            dos.close();
        }
        catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }
        catch(IOException e){
            System.out.println("Error al escribir");
        }
    }
}
