package codigo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionIME {
	private static int a;
	private static int b;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			a = teclado.nextInt();
			b = teclado.nextInt();
		}
		catch (InputMismatchException ime) {
			/*System.out.println(ime.toString());
			System.out.println(ime);
			System.out.println(ime.getMessage());*/
			ime.printStackTrace();
		}
		System.out.println(dividir(a,b));
		teclado.close();
	}
	
	private static int dividir(int a, int b) {
		return a / b;
	}

}
