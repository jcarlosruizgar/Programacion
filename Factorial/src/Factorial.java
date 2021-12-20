public class Factorial {

    public static void main(String[] args) {
        final int MAXIMO = 5;
        System.out.println(calculoFactorial(MAXIMO));
    }

    private static int calculoFactorial(int numero) {
        int contador = 1;
        int resultado = 1;
        if (numero == 0) {
            return 1;
        }
        else {
            while (contador <= numero) {
                resultado = contador * resultado;
                contador++;
            }
            return resultado;
        }

    }
}
