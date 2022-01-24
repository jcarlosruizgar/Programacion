package codigo;

public class Palabra {

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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public char[] getLetrasDisponibles() {
        return letrasDisponibles;
    }

    public void setLetrasDisponibles(char[] letrasDisponibles) {
        this.letrasDisponibles = letrasDisponibles;
    }

    public boolean[] getPosicionesOcupadas() {
        return posicionesOcupadas;
    }

    public void setPosicionesOcupadas(boolean[] posicionesOcupadas) {
        this.posicionesOcupadas = posicionesOcupadas;
    }

    //metodo que devuelve el booleano del array de booleanos
    public boolean devolverBooleano(int posicion){
        return this.posicionesOcupadas[posicion];
    }

    //metodo que devuelve la letra del array de caracteres
    public char devolverLetra(int posicion){
        return this.letrasDisponibles[posicion];
    }

    //metodo que pone la posicion a true
    public void asignarLetra(int posicion){
        this.posicionesOcupadas[posicion]=true;
    }
}