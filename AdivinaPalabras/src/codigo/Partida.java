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
            System.out.println("Puede:\n1-Resolver.\n2-Pedir letra.");
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
                }
            }
            catch (Exception e){
                System.out.println("Error.");
            }



        }
        while(!terminarJuego);

    }

    //metodo que comprueba si se ha perdido el juego
    public void juegoPerdido(){

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