package codigo;

public class Prueba2 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		try {
			int resultado = n1/n2;
			System.out.println(resultado);
		}
		catch(ArithmeticException e) {
			System.out.println("Funciona!");
		}

	}

}
