package codigo;

import java.time.LocalDate;

public class Principal {

    private static LocalDate fechaActual = LocalDate.now();
    private static String nombre;
    private static int intentos = 3;

    private static Palabra[] palabras2 = new Palabra[3];

    String prueba = "gilipollas";
    char[] prueba2 = prueba.length();
    boolean[] prueba3 = prueba.length();

    palabras2[0] = new Palabra(prueba,prueba2,prueba3);

    public static void main(String[] args) {

    }


}
