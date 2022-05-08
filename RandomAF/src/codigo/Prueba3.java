package codigo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Prueba3 {

    public static void main(String[] args) {

        File f = new File("./empl_aleat.dat");
        RandomAccessFile raf;
        StringBuffer buffer = null;
        try{
            raf = new RandomAccessFile(f,"rw");
            String[] apellidos = {"MARTIN","SORIA","FERNANDEZ","LUNA","GARCIA","PEREZ","RODRIGUEZ","MARTINEZ"};
            int[] dept = {10,20,30,20,10,40,30,40};
            double[] salario = {850.65, 12035.36, 2156.36, 1500.32, 989.23, 1566.32, 1866.88, 2356.78};
            //escritura de datos
            for (int i = 0; i < apellidos.length; i++) {
                raf.writeInt(i+1);
                buffer = new StringBuffer(apellidos[i]);
                buffer.setLength(10);
                raf.writeChars(buffer.toString());
                raf.writeInt(dept[i]);
                raf.writeDouble(salario[i]);
            }
            //lectura de datos
            raf.seek(0);
            for (int i = 0; i < apellidos.length; i++) {
                System.out.println("Registro numero: "+raf.readInt());
                System.out.print("\tApellido: ");
                for (int j = 0; j < 10; j++) {
                    System.out.print(raf.readChar());
                }
                System.out.println("\n\tDepartamento: "+raf.readInt());
                System.out.println("\tSalario: "+raf.readDouble()+"\n");
            }
            raf.close();
        }catch (IOException ioe){
            System.out.println("Error E/S");
        }

    }

}
