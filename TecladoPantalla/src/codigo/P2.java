package codigo;

import java.io.IOException;
import java.io.InputStreamReader;

public class P2 {
    private static InputStreamReader stdin = new InputStreamReader(System.in);
    public static void main(String[] args) {
        char caracter[] = new char[1024];
        int numero = -1;
        try{
            numero = stdin.read(caracter);
        }catch (IOException ioe){
            System.out.println("Error en la lectura.");
        }
        for (int i = 0; i < numero; i++) {
            System.out.print(caracter[i]);
        }
    }
}
