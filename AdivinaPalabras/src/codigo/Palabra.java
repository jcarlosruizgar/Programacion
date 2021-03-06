package codigo;

public class Palabra {

    //atributos
    private String valor;//string con la palabra que se va a tratar de adivinar
    private char[] letrasDisponibles;//array de caracteres con las letras que se van a mostrar
    private boolean[] posicionesOcupadas;//array de booleanos con las posiciones que estan ocupadas en true

    //constructor vacio
    public Palabra() {
    }

    //constructor parametrizado
    public Palabra(String valor, char[] letrasDisponibles, boolean[] posicionesOcupadas) {
        this.valor = valor;
        this.letrasDisponibles = letrasDisponibles;
        this.posicionesOcupadas = posicionesOcupadas;
    }

    //metodo que devuelve letrasDisponibles
    public char[] getLetrasDisponibles() {
        return letrasDisponibles;
    }

    //metodo que devuelve posicionesOcupadas
    public boolean[] getPosicionesOcupadas() {
        return posicionesOcupadas;
    }

    //metodo que pone la posicion a true
    public void asignarLetra(int posicion){
        this.posicionesOcupadas[posicion]=true;
    }
}