
public class Impar100 {

	public static void main(String[] args) {
		int contador = 0;
		final int MAX = 100;
		for (int numero = 0; numero <= MAX; numero++) {
			if (numero % 2 == 1) {
				System.out.println(numero);
				contador++;
			}
		}
		System.out.println("Del 0 al 100 hay " + contador + " números impares");
	}
}