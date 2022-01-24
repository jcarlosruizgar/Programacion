/*
@author Juan Carlos Ruiz Garcia
@date 24/01/2022
@description juego de adivinar la palabra
 */
package codigo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;

public class Partida {

    private LocalDate fecha;
    private String nombreJugador;
    private int intentos;
    private Palabra[] palabras;
    private int palabraSeleccionada;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private boolean terminarJuego = false;
    private boolean repetirJuego = false;
    private int eleccion;

    //constructor vacio
    public Partida() {
    }

    //constructor parametrizado
    public Partida(LocalDate fecha, String nombreJugador, int intentos, Palabra[] palabrasRecibidas) {
        this.fecha = fecha;
        this.nombreJugador = nombreJugador;
        this.intentos = intentos;
        this.palabras = palabrasRecibidas;
    }

    //metodo que muestra la ejecuccion
    public void pintarMenu(){
        System.out.println("Hoy es "+fecha);
        System.out.println("Hola "+nombreJugador);
        do{//bucle do while para repetir el programa con otra palabra
            palabraSeleccionada = (int)Math.floor(Math.random()*3);
            do{//bucle do while que lleva la ejecucion de la partida
                pintarPalabra();
                System.out.println("Puede:\n1-Resolver.\n2-Pedir letra.\n3-Salir.");
                try{
                    switch (Integer.parseInt(br.readLine())){
                        case 1:
                            System.out.println("Introduzca la palabra completa:");
                            resolver(br.readLine().toUpperCase().toCharArray());
                            break;
                        case 2:
                            System.out.println("Introduzca la letra:");
                            //elegirLetra(br.read());
                            elegirLetra(br.readLine().charAt(0));
                            //System.out.println(letra);
                            break;
                        case 3:
                            terminarJuego = true;
                            repetirJuego = true;
                            eleccion = -1;
                            break;
                    }
                }
                catch (Exception e){
                    System.out.println("Error.");
                }
                juegoPerdido();
            }
            while(!terminarJuego);
            if(eleccion != -1){
                System.out.println("¿Quieres jugar con otra palabra?\n1-Si.\n2-No.");
                try{
                    eleccion = Integer.parseInt(br.readLine());
                }
                catch (Exception e){
                    System.out.println("Error.");
                }
                if(eleccion == 2){
                    repetirJuego = true;
                }
            }
        }
        while(!repetirJuego);
        System.out.println("Cerrando el programa.");


    }

    //metodo que comprueba si se ha perdido el juego
    public void juegoPerdido(){
        boolean[] comprobar = new boolean[this.palabras[palabraSeleccionada].getPosicionesOcupadas().length];
        Arrays.fill(comprobar,true);
        if(intentos==0 || Arrays.equals(this.palabras[palabraSeleccionada].getPosicionesOcupadas(),comprobar)){
            System.out.println("Has perdido.");
            terminarJuego = true;
        }
    }

    //metodo para resolver la palabra
    public void resolver(char[] solucion){
        if(Arrays.equals(this.palabras[palabraSeleccionada].getLetrasDisponibles(),solucion)){
            System.out.println("Has ganado.");
            terminarJuego = true;
        }
        else{
            System.out.println("Has fallado.");
            intentos--;
        }
    }

    //metodo que asigna a true las posiciones del array de booleanos que coinciden con la letra elegida
    public void elegirLetra(char letraElegida){
        char letraElegidaMayus = Character.toUpperCase(letraElegida);
        for (int i = 0; i < this.palabras[palabraSeleccionada].getLetrasDisponibles().length; i++) {
            if(this.palabras[palabraSeleccionada].devolverLetra(i)==letraElegidaMayus){
                this.palabras[palabraSeleccionada].asignarLetra(i);
            }
        }
    }

    //metodo que muestra la palabra con las letras elegidas
    public void pintarPalabra(){
        System.out.println("La palabra es:");
        for (int i = 0; i < this.palabras[palabraSeleccionada].getPosicionesOcupadas().length; i++) {
            if(this.palabras[palabraSeleccionada].devolverBooleano(i)){
                System.out.print(this.palabras[palabraSeleccionada].devolverLetra(i));
            }
            else System.out.print('_');
        }
        System.out.println("\nLe quedan: "+intentos+" intentos.");
    }

}