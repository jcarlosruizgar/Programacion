/*
@author Juan Carlos Ruiz Garcia
@date 24/01/2022
@description juego de adivinar la palabra
 */
package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;

public class Principal {

    private static boolean repetirJuego = false;
    private static int eleccion = 0;
    private static int tamano = 3;//cantidad de palabras, modificar si se hace para aceptar mas
    private static String[] arrayString;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int intentos = 3;

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        //String nombreJugador = "";

        //para leer el nombre del jugador
        System.out.println("Juego Adivina la palabra versión 1.0");
        /*try {
            boolean entradaIncorrecta = true;
            while (entradaIncorrecta) {
                System.out.println("Introduzca su nombre:");
                try {
                    nombreJugador = br.readLine();
                    Double decimal = Double.parseDouble(nombreJugador);
                    System.out.println("Solo letras.");
                } catch (NumberFormatException nfe) {
                    entradaIncorrecta = false;
                }
            }
        } catch (IOException exception) {
            System.out.println("Dato introducido no valido.");
        }*/
        arrayString = new String[] {"CODIGO","TRAZA","ALGORITMO"};
        //pedirPalabras();

        do {//bucle do while que controla la repeticion del programa


            char[] letrasA = arrayString[0].toCharArray();
            char[] letrasB = arrayString[1].toCharArray();
            char[] letrasC = arrayString[2].toCharArray();

            //array de boolenaos para inicializar el array de palabras
            boolean[] posicionesA = iniciarPosiciones(letrasA);
            boolean[] posicionesB = iniciarPosiciones(letrasB);
            boolean[] posicionesC = iniciarPosiciones(letrasC);

            //inicializar y crear las 3 palabras en el array
            Palabra[] arrayPalabras = new Palabra[tamano];
            arrayPalabras[0] = new Palabra(arrayString[0], letrasA, posicionesA);
            arrayPalabras[1] = new Palabra(arrayString[1], letrasB, posicionesB);
            arrayPalabras[2] = new Palabra(arrayString[2], letrasC, posicionesC);

            Partida miPartida = new Partida(fechaActual, intentos, arrayPalabras);//inicializar partida

            miPartida.pintarMenu();//ejecucion de la partida
            if (eleccion != -1) {//si se ha elegido salir del programa, no ejecutara esta parte
                do {//bucle do while para controlar que solo se seleccione 1 o 2
                    try {
                        if (eleccion != 1 && eleccion != 2) {
                            System.out.println("¿Quieres jugar con otra palabra?\n1-Si.\n2-No.");//jugar con otra palabra elegida aleatoriamente
                            eleccion = Integer.parseInt(br.readLine());
                        }
                    } catch (NumberFormatException nfe) {
                        System.out.println("Eso no es un número.");
                    } catch (IOException ioe) {
                        System.out.println("Dato introducido no valido.");
                    }
                    if (eleccion == 2) {//si se quiere salir del juego
                        repetirJuego = true;
                        miPartida.setTerminarJuego(true);
                    }
                }
                while (eleccion != 1 && eleccion != 2);
            }
            eleccion = 0;//reiniciar eleccion para asegurar que pregunta si se quiere repetir
        }
        while (!repetirJuego);
        System.out.println("Cerrando el programa.");
    }

    //recibe una array de caracteres y devuelve un array de boleanos con las posiciones que se van a mostrar en true
    public static boolean[] iniciarPosiciones(char[] listaLetras) {
        int letrasMostradas = listaLetras.length / 2;
        boolean[] booleanosRetornar = new boolean[listaLetras.length];
        Arrays.fill(booleanosRetornar, false);
        int contador = 0;
        do {
            int numeroAleatorio = (int) Math.floor(Math.random() * listaLetras.length);
            if (booleanosRetornar[numeroAleatorio] == true) ;
            else {
                booleanosRetornar[numeroAleatorio] = true;
                contador++;
            }
        }
        while (contador < letrasMostradas);
        return booleanosRetornar;
    }

    public static void setEleccion(int eleccionRecibida) {
        eleccion = eleccionRecibida;
    }

    public static void setRepetirJuego(boolean repetirJuegoRecibido) {
        repetirJuego = repetirJuegoRecibido;
    }

    public static void setIntentos(int intentosSiguientePartida){
        intentos = intentosSiguientePartida;
    }

    public static void setTamano(int tamanoSiguientePartida){
        tamano = tamanoSiguientePartida;
    }

    //metodo que pide a jugador las palabras con las que va a jugar
    public static void pedirPalabras(){
        System.out.println("Introduzca las 3 palabras con las que quiere jugar:");
        String[] palabrasLeidas = new String[tamano];
        try {
            for (int i = 0; i < tamano; i++) {
                System.out.println("Introduzca la " + (i + 1) + "º palabra");
                palabrasLeidas[i] = br.readLine().toUpperCase();
            }
        } catch (IOException ioe) {
            System.out.println("Error.");
        }
        arrayString = Arrays.copyOf(palabrasLeidas, tamano);
    }

}