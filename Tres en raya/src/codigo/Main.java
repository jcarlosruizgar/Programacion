package codigo;

public class Main {

    public static void main(String[] args) {
        boolean juegoFinalizado = false;

        TresEnRaya juego = new TresEnRaya();

        do {
            juego.pintar();
            juego.jugar();
            juegofinalizado=juego.Comprobar3EnRaya() || juego.tablerotaLleno();

        } while (!juegoFinalizado);

    }

}
