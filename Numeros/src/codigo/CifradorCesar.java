/*
 * Autor: Juan Carlos Ruiz García
 * Fecha: 20/11/2021
 * Comentarios: Cifrador cesar interactivo de 1 a 26 posiciones
 */
package codigo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CifradorCesar {
	
	private static int posiciones;
	private static String frase;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		pedirFrase();
		try {
			pedirPosiciones();
			mostrarFrase();
		}
		catch(InputMismatchException ime) {
			System.out.println("Introduzca un valor valido.");
		}
	}
	
	private static void pedirFrase() {
		System.out.println("Introduzca la frase a cifrar:");
		frase = teclado.nextLine();
		frase = frase.toUpperCase();
	}
	
	private static void pedirPosiciones() throws InputMismatchException{
		do {
			System.out.println("Indique un número entre 1 y 26:");
			posiciones = teclado.nextInt();
		}
		while(posiciones < 1 || posiciones > 26);
	}
	
	private static void mostrarFrase() {
		char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};//para poder cifrar cualquier letra
		for(int i = 0;i < frase.length();i++) {//reccorre la posicion de la frase
			for(int j = 0; j < 27;j++) {//recorre la letra en la posicion de la frase
				if (frase.charAt(i) == letras[j]) {//compara la letra de la frase con el array
					System.out.print(letras[j+posiciones]);//muestra el cifrado
				}
			}
		}
	}
}
