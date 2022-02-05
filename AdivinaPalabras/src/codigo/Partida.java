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

public class Partida {

    //atributos
    private LocalDate fecha;
    //private String nombreJugador;
    private int intentos;
    private Palabra[] palabras;
    private int palabraSeleccionada;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private boolean terminarJuego = false;

    //constructor vacio
    public Partida() {
    }

    //constructor parametrizado
    public Partida(LocalDate fecha, int intentos, Palabra[] palabrasRecibidas) {
        this.fecha = fecha;
        //this.nombreJugador = nombreJugador;
        this.intentos = intentos;
        this.palabras = palabrasRecibidas;
    }

    //metodo que muestra la ejecuccion
    public void pintarMenu() {
        System.out.println("Hoy es " + fecha);
        //System.out.println("Hola " + nombreJugador);

        palabraSeleccionada = (int) Math.floor(Math.random() * Principal.getTamano());
        do {//bucle do while que lleva la ejecucion de la partida
            pintarPalabra();
            try {
                int eleccionMenu = 0;
                do{//bucle do while que solo deja introducir 1, 2, 3 o 4
                    try{
                        System.out.println("Puede:\n1-Resolver.\n2-Pedir letra.\n3-Preferencias.\n4-Salir.");
                        eleccionMenu = Integer.parseInt(br.readLine());
                    }
                    catch (NumberFormatException nfe){
                        System.out.println("Eso no es un número.");
                    }
                }
                while(eleccionMenu !=1 && eleccionMenu !=2 && eleccionMenu !=3 && eleccionMenu !=4);
                switch (eleccionMenu) {//opciones a elegir
                    case 1:
                        System.out.println("Introduzca la palabra completa:");
                        resolver(br.readLine().toUpperCase().toCharArray());
                        break;
                    case 2:
                        System.out.println("Introduzca la letra:");
                        elegirLetra(br.readLine().charAt(0));//ver si hay una opcion mejor
                        break;
                    case 3:
                        int eleccionPreferencias = 0;
                        do{//bucle do while que solo deja introducir 1, 2 o 3
                            try{
                                System.out.println("Introduzca:");
                                System.out.println("1-Definir palabras.\n2-Modificar intentos.\n3-Menú anterior.");
                                eleccionPreferencias = Integer.parseInt(br.readLine());
                            }
                            catch (NumberFormatException nfe){
                                System.out.println("Eso no es un número.");
                            }
                        }
                        while(eleccionPreferencias !=1 && eleccionPreferencias !=2 && eleccionPreferencias !=3);
                        switch (eleccionPreferencias){//submenu
                            case 1://carga de nuevas palabras
                                cargaInteractiva();
                                break;
                            case 2://modifica los intentos para las siguientes partidas
                                int intentosSiguiente = 3;
                                boolean numeroElegido = true;
                                do{//bucle do while para introducir un numero valido
                                    try{
                                        System.out.println("Introduzca cuantos intentos quiere en las próximas partidas");
                                        intentosSiguiente = Integer.parseInt(br.readLine());
                                    }
                                    catch (NumberFormatException nfe){
                                        System.out.println("Introduzca un número.");
                                        numeroElegido = false;
                                    }
                                }
                                while(!numeroElegido);
                                modificarIntentos(intentosSiguiente);
                                break;
                            case 3://volver menu anterior
                                break;
                        }
                        break;
                    case 4://cerrar el programa
                        terminarJuego = true;
                        Principal.setRepetirJuego(true);
                        Principal.setEleccion(-1);
                        break;
                }
            } catch (IOException ioe) {
                System.out.println("Dato introducido no valido.");
            }
            juegoPerdido();
        }
        while (!terminarJuego);
    }

    //metodo que comprueba si se ha perdido el juego
    public void juegoPerdido() {
        boolean[] comprobar = new boolean[this.palabras[palabraSeleccionada].getPosicionesOcupadas().length];//crea un array de booleano con la longitud de la palabra con la que se juega
        Arrays.fill(comprobar, true);//asigna todas las posiciones a true
        if (intentos == 0 || Arrays.equals(this.palabras[palabraSeleccionada].getPosicionesOcupadas(), comprobar)) {//si intentos a 0, o todas las posiciones a true
            System.out.println("Has perdido.");
            terminarJuego = true;
        }
    }

    //metodo para resolver la palabra
    public void resolver(char[] solucion) {
        if (Arrays.equals(this.palabras[palabraSeleccionada].getLetrasDisponibles(), solucion)) {//si la palabra introducida y la elegida coinciden
            System.out.println("Has ganado.");
            terminarJuego = true;
        } else {
            System.out.println("Has fallado.");
            intentos--;
        }
    }

    //metodo que asigna a true las posiciones del array de booleanos que coinciden con la letra elegida
    public void elegirLetra(char letraElegida) {
        char letraElegidaMayus = Character.toUpperCase(letraElegida);//convierte la letra a mayuscula
        for (int i = 0; i < this.palabras[palabraSeleccionada].getLetrasDisponibles().length; i++) {
            if (this.palabras[palabraSeleccionada].getLetrasDisponibles()[i] == letraElegidaMayus) {//comprueba si coinciden las letras
                if (this.palabras[palabraSeleccionada].getPosicionesOcupadas()[i]){
                    System.out.println("La letra " + letraElegida + " ya estaba elegida.");
                    i=this.palabras[palabraSeleccionada].getLetrasDisponibles().length;
                }
                else{
                    this.palabras[palabraSeleccionada].asignarLetra(i);//pone a true la posicion de la letra si coincide
                }
            }
        }
    }

    //metodo que muestra la palabra con las letras elegidas
    public void pintarPalabra() {
        System.out.println("La palabra es:");
        for (int i = 0; i < this.palabras[palabraSeleccionada].getPosicionesOcupadas().length; i++) {
            if (this.palabras[palabraSeleccionada].getPosicionesOcupadas()[i]) {
                System.out.print(this.palabras[palabraSeleccionada].getLetrasDisponibles()[i]);
            } else System.out.print('-');
        }
        System.out.println("\nLe quedan: " + intentos + " intentos.");
    }

    //metodo que permite modificar el atributo terminar juego
    public void setTerminarJuego(boolean terminarJuego) {
        this.terminarJuego = terminarJuego;
    }

    //metodo para cargar un numero de palabras variables
    public void cargaInteractiva(){
        boolean tamanoElegido = false;
        do{
            try{
                System.out.println("¿Con cuantas palabras quiere jugar?");
                Principal.setTamano(Integer.parseInt(br.readLine()));
            }
            catch (Exception e){
                System.out.println("Eso no es un numero.");
                tamanoElegido = true;
            }
        }
        while(tamanoElegido);
        Principal.pedirFrase();//pide los strings con los que se va a jugar
        terminarJuego = true;
        Principal.setEleccion(-1);
    }

    //metodo para modifcar los intentos de las proximas partidas
    public void modificarIntentos(int intentosElegidos){
        Principal.setIntentos(intentosElegidos);
    }
}