/*
ENUNCIADO: Mostrar los valores de un arrays
FECHA: 19/11/21
AUTOR: Juan Carlos Ruiz García
COMENTARIOS:
*/
package codigo;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincipalBR2 {


    private static double notas[] = new double [5];

    //private final static int TAM = 3;
    //private static double notas[TAM];
    //private static double notas[] = new double[TAM];

    public static void main(String[] args) {
        //cargarDatosLineales();
        //cargarDatosAleatorios();
        try {
            //cargarDatosInteractivosScanner();
            cargarDatosInterativosBuffered();
        }
        catch (NumberFormatException nfe) {
            System.out.println("Eso no es un valor valido.");
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }
        mostrarDatos();
        mostrarSumaNotas();
        System.out.println("La media es: " + mediaNotas());
        System.out.println("El número menor es: " + numeroMenor());
        System.out.println("El número mayor es: " + numeroMayor());
        System.out.println(busquedaSecuencialFor(2));
        System.out.println(busquedaSecuencialWhile(2));
    }

    public static void cargarDatosLineales() {//0,1,2,3,.....
        for(int i=0; i<notas.length; i++) {
            notas[i] = i;
        }
    }

    public static void cargarDatosAleatorios() {//usando math
        for(int i=0; i<notas.length; i++) {
            notas[i] = Math.floor(Math.random()*11);
        }
    }

    public static void cargarDatosInteractivosScanner() throws InputMismatchException {
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i<notas.length; i++) {
            System.out.println("Introduza la " + (i+1) + "º nota:");
            notas[i] = teclado.nextDouble();
        }
        teclado.close();
    }

    public static void cargarDatosInterativosBuffered() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<notas.length; i++) {
            System.out.println("Introduzca la " + (i+1) + "º nota:");
            notas[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void mostrarDatos() {
        for(int i=0; i<notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
    }

    public static void mostrarSumaNotas() {
        double suma = 0;
        for(int i=0; i<notas.length; i++) {
            suma += notas[i];
        }
        System.out.println("\nLa suma de las notas es: " + suma);
    }

    public static double mediaNotas() {//calcula la media del array
        double sumaMedia = 0;
        for(int i=0; i<notas.length; i++) {
            sumaMedia += notas[i];
        }
        return sumaMedia / notas.length;
    }

    public static double numeroMenor() {//devuelve el numero mas pequeño del array
        double numeroMenor = notas[0];
        for(int i=0; i<notas.length; i++) {
            if (notas[i] < numeroMenor) {
                numeroMenor = notas[i];
            }
        }
        return numeroMenor;
    }

    public static double numeroMayor() {//devuelve el numero mas grande del array
        double numeroMayor = notas[0];
        for(int i=0; i<notas.length; i++) {
            if (notas[i] > numeroMayor) {
                numeroMayor = notas[i];
            }
        }
        return numeroMayor;
    }

    public static int busquedaSecuencialFor(int a) {//devuelve la posicion de un numero
        int posicion = -1;//suponemos que no existe
        for(int i=0; i<notas.length; i++) {
            if (notas[i] == a) {
                posicion = i;
                i = notas.length;//para evitar mas lecturas del array
            }
        }
        return posicion;
    }

    public static int busquedaSecuencialWhile(int a) {//devuelve la posicion de un numero
        int posicion = -1;//suponemos que no existe
        int i = 0;
        //boolean salir = false;//variable bandera
        while (i<notas.length && posicion == -1) {//condicion compuesta para salir del bucle, tmb vale con !salir
            if(notas[i] == a) {
                posicion = i;
                //salir = true;//para salir del bucle
            }
            i++;
        }
        return posicion;
    }
}
