/*
@author Juan Carlos Ruiz García
@date 04/01/2022
 */
package codigo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //variables
        boolean juegoFinalizado = false;//determina cuando se acaba la partida
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int posicionJugar = 0;//determina la posicion en la que se va a jugar
        TresEnRaya juego = new TresEnRaya();//llamada al constructor con el tablero vacio
        //ejecucion del programa
        System.out.println("3 en Raya");
        do{//bucle con la ejecucion de los turnos
            juego.pintarTablero();
            if(!juego.isTurno()){//turno jugador
                System.out.println("Introduzca del 1 al 9 para elegir posición:");
                try{
                    do{//bucle para elegir una casilla valida
                        posicionJugar = Integer.parseInt(br.readLine());
                        if(posicionJugar <1 || posicionJugar > 9) System.out.println("Esa no es una posición valida.\nIntroduzca del 1 al 9 para elegir posición otra vez:");//si la casilla no es valida
                        if(juego.casillaOcupada(posicionJugar)) System.out.println("Esa casilla ya esta ocupada.\nIntroduzca del 1 al 9 para elegir posición otra vez:");//si la casilla esta ocupada
                    }
                    while(juego.casillaOcupada(posicionJugar) || (posicionJugar < 1 || posicionJugar > 9));
                }
                catch (IOException ioe){
                    System.out.println("Ese no es un valor valido.");
                }
            }
            else{//turno maquina
                System.out.println("Turno de la máquina:");
                do{//bucle para que la maquina juegue una casilla valida
                    posicionJugar = (int)Math.floor(Math.random()*9+1);//casilla aleatoria entre 1 y 9
                }
                while(juego.casillaOcupada(posicionJugar) || (posicionJugar < 1 || posicionJugar > 9));
            }
            juego.jugada(posicionJugar);//asigna a la casilla X o O dependiendo del turno
            juegoFinalizado = juego.tableroLleno() || juego.comprobar3EnRaya();//comprueba si se cumple condicion para finalizar el juego
            juego.setTurno(!juego.isTurno());//cambia el turno para la siguiente jugada
        }
        while(!juegoFinalizado);
        juego.pintarTablero();//muestra la ultima jugada cuando se acaba el juego
        if(juego.comprobar3EnRaya() && juego.isTurno()) System.out.println("¡Has ganado!");//mensaje si gana el jugador
        if(juego.comprobar3EnRaya() && !juego.isTurno()) System.out.println("¡Has perdido!");//mensaje si gana la maquina
        if(!juego.comprobar3EnRaya() && juego.tableroLleno()) System.out.println("¡Empate!");//mensaje si se queda empate
    }
}
