package codigo;

import java.util.Arrays;

public class Principal2 {

    private static String nombres[] = {"Eva", "Zoe", "Juan"};

    public static void main(String[] args) {

        System.out.println(nombres);//mostramos direccion de memoria
        System.out.println(Arrays.toString(nombres));//mostramos contenido del array

        //Arrays.fill(nombres, "Antonio");
        //System.out.println(Arrays.toString(nombres));

        Arrays.sort(nombres);//ordenamos alfabeticamente los nombres
        System.out.println(Arrays.toString(nombres));

        mostrarLongitudes();
        System.out.println(obtenerSumaCaracteres());//obtiene la suma de todos los caracteres de los elementos del array




    }

    public static void mostrarLongitudes() {
        for (int i=0;i<nombres.length;i++) {
            System.out.println(nombres[i].length());
        }
    }

    public static int obtenerSumaCaracteres() {
        int acumulador = 0;
        for (int i=0;i<nombres.length;i++) {
            acumulador += nombres[i].length();
        }
        return acumulador;
    }

}
