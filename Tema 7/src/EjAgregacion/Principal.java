package EjAgregacion;

public class Principal {

    private static final int NUMERO= 50;

    public static void main(String[] args) {

        Piso delPocero[] = new Piso[NUMERO];

        for (int i = 0; i < NUMERO; i++) {
            delPocero[i] = new Piso((int)Math.floor(Math.random()*(200-40))+40);
        }

    }

}
