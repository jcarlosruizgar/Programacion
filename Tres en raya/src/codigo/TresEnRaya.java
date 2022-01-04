/*
@author Juan Carlos Ruiz García
@date 04/01/2022
 */
package codigo;

public class TresEnRaya {
    private char tablero[][];
    private boolean turno;

    //constructor
    public TresEnRaya() {
        turno = false;
        tablero = new char [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]=' ';
            }
        }
    }
    //metodo para mostrar el tablero en su estado actual
    public void pintarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + this.tablero[i][j]);
                if(j == 2) System.out.print("|");
            }
            if(i != 2) System.out.println("\n-------");
            else System.out.println("");
        }
    }

    //metodo que comprueba si el tablero esta lleno
    public boolean tableroLleno() {
        boolean lleno = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(this.tablero[i][j] == ' ') lleno = false;
            }
        }
        return lleno;
    }

    //metodo que comprueba si hay linea de algun jugador
    public boolean comprobar3EnRaya() {
        boolean linea = false;
        //lineas horizontales X J1
        if (this.tablero[0][0] == 'X' && this.tablero[0][1] == 'X' && this.tablero[0][2] == 'X') return true;
        if (this.tablero[1][0] == 'X' && this.tablero[1][1] == 'X' && this.tablero[1][2] == 'X') return true;
        if (this.tablero[2][0] == 'X' && this.tablero[2][1] == 'X' && this.tablero[2][2] == 'X') return true;
        //lineas horizontales O J2
        if (this.tablero[0][0] == 'O' && this.tablero[0][1] == 'O' && this.tablero[0][2] == 'O') return true;
        if (this.tablero[1][0] == 'O' && this.tablero[1][1] == 'O' && this.tablero[1][2] == 'O') return true;
        if (this.tablero[2][0] == 'O' && this.tablero[2][1] == 'O' && this.tablero[2][2] == 'O') return true;
        //lineas verticales X J1
        if (this.tablero[0][0] == 'X' && this.tablero[1][0] == 'X' && this.tablero[2][0] == 'X') return true;
        if (this.tablero[0][1] == 'X' && this.tablero[1][1] == 'X' && this.tablero[2][1] == 'X') return true;
        if (this.tablero[0][2] == 'X' && this.tablero[1][2] == 'X' && this.tablero[2][2] == 'X') return true;
        //lineas verticales O J2
        if (this.tablero[0][0] == 'O' && this.tablero[1][0] == 'O' && this.tablero[2][0] == 'O') return true;
        if (this.tablero[0][1] == 'O' && this.tablero[1][1] == 'O' && this.tablero[2][1] == 'O') return true;
        if (this.tablero[0][2] == 'O' && this.tablero[1][2] == 'O' && this.tablero[2][2] == 'O') return true;
        //lineas diagonales X J1
        if(this.tablero[0][0] == 'X' && this.tablero[1][1] == 'X' && this.tablero[2][2] == 'X') return true;
        if(this.tablero[2][0] == 'X' && this.tablero[1][1] == 'X' && this.tablero[0][2] == 'X') return true;
        //lineas diagonales O J2
        if(this.tablero[0][0] == 'O' && this.tablero[1][1] == 'O' && this.tablero[2][2] == 'O') return true;
        if(this.tablero[2][0] == 'O' && this.tablero[1][1] == 'O' && this.tablero[0][2] == 'O') return true;
        return linea;
    }

    //metodo para jugar, convierte numero de 1 a 9 en las posiciones del array
    public void jugada(int numero){
        int a = 0;
        int b = 0;
        if(numero == 1){
            a = 0; b = 0;
        }
        else if(numero == 2){
            a = 0; b = 1;
        }
        else if(numero == 3){
            a = 0; b = 2;
        }
        else if(numero == 4){
            a = 1; b = 0;
        }
        else if(numero == 5){
            a = 1; b = 1;
        }
        else if(numero == 6){
            a = 1; b = 2;
        }
        else if(numero == 7){
            a = 2; b = 0;
        }
        else if(numero == 8){
            a = 2; b = 1;
        }
        else if(numero == 9){
            a = 2; b = 2;
        }
        if(this.turno == false) this.tablero[a][b] = 'X';
        else this.tablero[a][b] = 'O';
    }

    //devuelve el turno
    public boolean isTurno() {
        return turno;
    }

    //asigna el turno
    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    //metodo que comprueba si la casilla elegida esta ocupada
    public boolean casillaOcupada(int numero){
        boolean ocupada = false;
        int a = 0;
        int b = 0;
        if(numero == 1){
            a = 0; b = 0;
        }
        else if(numero == 2){
            a = 0; b = 1;
        }
        else if(numero == 3){
            a = 0; b = 2;
        }
        else if(numero == 4){
            a = 1; b = 0;
        }
        else if(numero == 5){
            a = 1; b = 1;
        }
        else if(numero == 6){
            a = 1; b = 2;
        }
        else if(numero == 7){
            a = 2; b = 0;
        }
        else if(numero == 8){
            a = 2; b = 1;
        }
        else if(numero == 9){
            a = 2; b = 2;
        }
        if(this.tablero[a][b] != ' '){
            ocupada = true;
        }
        return ocupada;
    }

}
