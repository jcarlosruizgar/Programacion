import java.util.Scanner;
public class Dni {

    public static void main(String[] args) {
        final int RESTO = 23;
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca los 8 números de su DNI para conocer la letra:");
        int numero = consola.nextInt();
        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resultado = numero % RESTO;
        System.out.println("Su DNI es " + numero + "-" + letras[resultado]);
        consola.close();
    }
}
