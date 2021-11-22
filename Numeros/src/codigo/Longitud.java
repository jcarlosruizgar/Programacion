package codigo;

import java.util.Scanner;

public class Longitud {

	public static void main(String[] args) {
		String frase;
		int longitud;
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Escriba una frase para conocer cuantos caracteres tiene:");
		frase = teclado.nextLine();
		
		longitud = frase.length();
		System.out.println("La frase: " + frase + " tiene " + longitud + " caracteres.");

		teclado.close();
	}

}
