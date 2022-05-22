/*
@author Juan Carlos Ruiz Garcia
@version 1.2
@date 22/05/2022
@description juego de adivinar la palabra, carga las palabras desde un fichero palabras.txt y cargando en un ArrayList
 */
package codigo;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    //atributos
    private static boolean repetirJuego = false;
    private static int eleccion = 0;
    private static int tamano = 8;//cantidad de palabras
    //private static String[] arrayString;
    private static ArrayList<String> arrayListString = new ArrayList<String>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int intentos = 3;
    private static Palabra[] arrayPalabras;
    private static boolean noModificado = true;//booleano que determina si se han alterado las 3 palabras iniciales
    private static final File RUTA = new File("./palabras.txt");

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        //String nombreJugador = "";
        //para leer el nombre del jugador
        System.out.println("Juego Adivina la palabra version 1.2");
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
        do {//bucle do while que controla la repeticion del programa
            cargarPalabrasFichero();//carga las palabras para la nueva partida
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
                        System.out.println("Eso no es un numero.");
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
        System.out.println("Cerrando el programa...");
    }

    //recibe una array de caracteres y devuelve un array de boleanos con las posiciones que se van a mostrar en true
    public static boolean[] iniciarPosiciones(char[] listaLetras) {
        int letrasMostradas = listaLetras.length / 2;
        boolean[] booleanosRetornar = new boolean[listaLetras.length];
        Arrays.fill(booleanosRetornar, false);
        int contador = 0;
        do {
            int numeroAleatorio = (int) Math.floor(Math.random() * listaLetras.length);
            if (booleanosRetornar[numeroAleatorio]) ;
            else {
                booleanosRetornar[numeroAleatorio] = true;
                contador++;
            }
        }
        while (contador < letrasMostradas);
        return booleanosRetornar;
    }

    //metodo que modifica eleccion
    public static void setEleccion(int eleccionRecibida) {
        eleccion = eleccionRecibida;
    }

    //metodo que modifica repetirJuego
    public static void setRepetirJuego(boolean repetirJuegoRecibido) {
        repetirJuego = repetirJuegoRecibido;
    }

    //metodo que modifica intentos
    public static void setIntentos(int intentosSiguientePartida) {
        intentos = intentosSiguientePartida;
    }

    //metodo que modifica tamano
    public static void setTamano(int tamanoSiguientePartida) {
        tamano = tamanoSiguientePartida;
    }

    //metodo que devuelve tamano
    public static int getTamano() {
        return tamano;
    }

    //metodo que pide a jugador las frases con las que va a jugar
    public static void pedirFrase() {
        System.out.println("Introduzca una nueva palabra con la que quiere jugar:");
        try{
            arrayListString.add(br.readLine());
        }catch (IOException ioe){
            System.out.println("Error de E/S.");
        }
        noModificado = false;
    }

    //metodo que genera las palabras con las que se generara la partida
    public static void cargarPalabras() {
        Palabra[] pal = new Palabra[tamano];
        if (noModificado) {
            arrayListString.add("CODIGO");
            arrayListString.add("TRAZA");
            arrayListString.add("ALGORITMO");
        }
        for (int i = 0; i < arrayListString.size(); i++) {
            char[] letras = arrayListString.get(i).toCharArray();
            boolean[] posiciones = iniciarPosiciones(letras);
            pal[i] = new Palabra(arrayListString.get(i), letras, posiciones);
        }
        arrayPalabras = Arrays.copyOf(pal, tamano);
    }

    //metodo que genera las palabras para la partida mediante el fichero de texto
    public static void cargarPalabrasFichero() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(RUTA);
            br = new BufferedReader(fr);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Error de E/S.");
        }
        Palabra[] pal = new Palabra[tamano];
        if (noModificado) {
            try {
                for (int i = 0; i < arrayListString.size(); i++) {
                    arrayListString.add(br.readLine());
                }
                br.close();
                fr.close();
            } catch (IOException ioe) {
                System.out.println("Error de E/S.");
            }
        }
        for (int i = 0; i < arrayListString.size(); i++) {
            char[] letras = arrayListString.get(i).toCharArray();
            boolean[] posiciones = iniciarPosiciones(letras);
            pal[i] = new Palabra(arrayListString.get(i), letras, posiciones);
        }
        arrayPalabras = Arrays.copyOf(pal, tamano);
    }

}