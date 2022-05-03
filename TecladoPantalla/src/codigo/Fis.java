package codigo;

import java.io.FileInputStream;
import java.io.IOException;

public class Fis {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("./TecladoPantalla/src/codigo/Fis.java");
            int x = 0;
            while(x!=-1){
                x=fis.read();
                System.out.print((char)x);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }



    }
}
