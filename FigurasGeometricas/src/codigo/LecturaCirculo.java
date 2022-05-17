package codigo;

import java.io.*;

public class LecturaCirculo {

    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String cadena = null;
        int delA;
        int delB;
        int longitud = 0;
        int x;
        int y;
        int radio;
        final char DELIMITADOR = '#';
        boolean salir = false;
        try {
            fr = new FileReader("./circulos.txt");
            br = new BufferedReader(fr);

            while (!salir) {
                cadena = br.readLine();//cadena con los datos
                String cadenaAuxiliar = cadena;//copia de la cadena
                if (cadena == null) cadenaAuxiliar = "";//evita excepcion
                else longitud = cadenaAuxiliar.length();//hasta donde llega el 3º dato
                delB = cadenaAuxiliar.lastIndexOf(DELIMITADOR);//hasta donde llega le 2º dato
                cadenaAuxiliar = cadenaAuxiliar.substring(0, delB);//se quita el ultimo delimitador
                delA = cadenaAuxiliar.lastIndexOf(DELIMITADOR);//hasta donde llega el 1º dato
                x = Integer.parseInt(cadena.substring(0, delA));//se guarda el 1º dato
                y = Integer.parseInt(cadena.substring(delA + 1, delB));//se guarda el 2º dato
                radio = Integer.parseInt(cadena.substring(delB + 1, longitud));//se guarda el 3º dato
                System.out.println(new Circulo(x, y, radio));
                System.out.println(cadenaAuxiliar);
            }
        } catch (StringIndexOutOfBoundsException sioobe) {
            salir = true;
        } catch (EOFException eofException) {
            System.out.println("Error, fin de fichero.");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, fichero no encontrado.");
        } catch (IOException ioe) {
            System.out.println("Error, fallo de E/S.");
        }

    }

}
