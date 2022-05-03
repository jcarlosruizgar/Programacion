package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        String texto="";
        try{
           texto = br.readLine();
        }catch (IOException ioe){
            System.out.println("Error de E/S.");
        }
        System.out.println(texto);
    }
}
