package codigo;


public class TresEnRaya {
    private char tablero[][];
    private boolean turno;

    public TresEnRaya() {
        turno = true;
        tablero = new char [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]=' ';
            }
        }
    }

    public void pintar() {

    }

    public boolean tableroLleno() {
        //return

    }

    public boolean comprobar3EnRaya() {
        //return
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public void jugar() {
        // TODO Auto-generated method stub

    }

}
