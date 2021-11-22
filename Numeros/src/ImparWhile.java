
public class ImparWhile {

	public static void main(String[] args) {
		final int MAX = 100;
		int numero = 0;
		int contador = 0;
		while (numero <= MAX) {
			if (numero % 2 == 1) {
				System.out.println(numero);
				contador++;
			}
			numero++;
		}
		System.out.println("Del 0 al 100 hay " + contador + " numeros impares");

	}

}
