/*
@author Juan Carlos Ruiz Garcia
@date 24/01/2022
@description juego de adivinar la palabra
 */
package codigo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Partida {

    private LocalDate fecha;
    private String nombreJugador;
    private int intentos;
    private Palabra[] palabras;
    private int palabraSeleccionada;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private boolean terminarJuego = false;

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
        palabraSeleccionada = (int)Math.floor(Math.random()*3);
        System.out.println("Hoy es "+fecha);
        System.out.println("Hola "+nombreJugador);
        do{
            pintarPalabra();
        }
        while(!terminarJuego);

    }

    //metodo que comprueba si se ha ganado el juego
    public void comprobarJugada(){

    }

    //metodo que comprueba si se ha perdido el juego
    public void juegoPerdido(){

    }

    //metodo que asigna a true las posiciones del array de booleanos que coinciden con la letra elegida
    public void elegirLetra(char letraElegida){
        char letraElegidaMayus = Character.toUpperCase(letraElegida);
        for (int i = 0; i < this.palabras[palabraSeleccionada].getLetrasDisponibles().length; i++) {
            if(this.palabras[palabraSeleccionada].devolverLetra(i)==letraElegidaMayus){
                this.palabras[palabraSeleccionada].asignarLetra(palabraSeleccionada);
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