package codigo;

import java.time.LocalDate;

public class Partida {

    private LocalDate fecha;
    private String nombreJugador;
    private int intentos;
    private Palabra[] palabras;

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
    public static void pintarMenu(){

    }

    //metodo que comprueba si se ha ganado el juego
    public static void comprobarJugada(){

    }

    //metodo que comprueba si se ha perdido el juego
    public static void juegoPerdido(){

    }
}