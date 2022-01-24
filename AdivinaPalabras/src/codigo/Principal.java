/*
@author Juan Carlos Ruiz Garcia
@date 24/01/2022
@description juego de adivinar la palabra
 */
package codigo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;

public class Principal {

    private static LocalDate fechaActual = LocalDate.now();
    private static String nombre;
    private static int intentos = 3;
    private static Palabra[] arrayPalabras = new Palabra[3];
    private static String nombreJugador;

    public static void main(String[] args) {

        //palabras para inicializar el array de palabras
        String palabraA = ("CODIGO");
        String palabraB = ("TRAZA");
        String palabraC = ("ALGORITMO");

        //arrays de caracteres para inicializar el array de palabras
        char[] letrasA = palabraA.toCharArray();
        char[] letrasB = palabraB.toCharArray();
        char[] letrasC = palabraC.toCharArray();

        //array de boolenaos para inicializar el array de palabras
        boolean[] posicionesA = iniciarPosiciones(letrasA);
        boolean[] posicionesB = iniciarPosiciones(letrasB);
        boolean[] posicionesC = iniciarPosiciones(letrasC);

        //inicializar y crear las 3 palabras en el array
        Palabra[] arrayPalabras = new Palabra[3];
        arrayPalabras[0] = new Palabra(palabraA,letrasA,posicionesA);
        arrayPalabras[1] = new Palabra(palabraB,letrasB,posicionesB);
        arrayPalabras[2] = new Palabra(palabraC,letrasC,posicionesC);

        //para leer el nombre del jugador
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Juego Adivina la palabra versión 1.0");
        System.out.println("Introduzca su nombre:");
        try{
            nombreJugador = br.readLine();
        }
        catch(Exception e){
            System.out.println("Error");
        }

        //inicializar partida
        Partida miPartida = new Partida(fechaActual,nombreJugador,intentos,arrayPalabras);

        //ejecucion
        miPartida.pintarMenu();
    }

    //recibe una array de caracteres y devuelve un array de boleanos con las posiciones que se van a mostrar en true
    public static boolean[] iniciarPosiciones(char[] listaLetras){
        int letrasMostradas = listaLetras.length/2;
        boolean[] booleanosRetornar = new boolean[listaLetras.length];
        Arrays.fill(booleanosRetornar,false);
        int contador = 0;
        do {
            int numeroAleatorio = (int)Math.floor(Math.random()*listaLetras.length);
            if(booleanosRetornar[numeroAleatorio] == true);
            else{
                booleanosRetornar[numeroAleatorio]=true;
                contador++;
            }
        }
        while(contador<letrasMostradas);
        return booleanosRetornar;
    }


}