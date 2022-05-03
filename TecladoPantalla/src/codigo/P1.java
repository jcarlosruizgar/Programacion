package codigo;

import java.io.IOException;
import java.io.InputStream;

public class P1 {
    private static InputStream stdin = System.in;
    public static void main(String[] args) {
        int n = 0;
        byte[] caracter = new byte[1024];
        try{
            n = stdin.read(caracter);
        }catch(IOException ioe){
            System.out.println("Error en la lectura.");
        }
        for(int i = 0;i<=n;i++)
            System.out.print((char)caracter[i]);
    }
}
