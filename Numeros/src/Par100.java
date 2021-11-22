
public class Par100 {

	public static void main(String[] args) {
		int numero = 0;
		final int NUMERO_MAXIMO = 100;
		while (numero <= NUMERO_MAXIMO) {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
			numero++;
		}
		for (numero=0;numero <= NUMERO_MAXIMO;numero++) {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		}
	}

}
