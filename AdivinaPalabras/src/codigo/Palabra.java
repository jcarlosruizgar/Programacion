/*
@author Juan Carlos Ruiz Garcia
@date 24/01/2022
@description juego de adivinar la palabra
 */
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

    public char[] getLetrasDisponibles() {
        return letrasDisponibles;
    }

    public boolean[] getPosicionesOcupadas() {
        return posicionesOcupadas;
    }

    //metodo que pone la posicion a true
    public void asignarLetra(int posicion){
        this.posicionesOcupadas[posicion]=true;
    }
}