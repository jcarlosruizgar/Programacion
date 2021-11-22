/*
ENUNCIADO: 2 enteros de entrada para determinar un aleatorio de salida comprendido entre ellos dos, hacerlo con un metodo
FECHA: 8/11/21
AUTOR: Juan Carlos Ruiz García
COMENTARIOS:
*/
package codigo;

import java.lang.Math;
import java.util.Scanner;

public class Aleatorios {
	private static int min;
	private static int max;
	private static int repetir;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		pedirDatos();
		
		if (comprobarParametros(min,max) == false){
			System.out.println("Error, primero debe introducir el número menor.");
			System.out.println("¿Quiere calcular el número aleatorio invirtiendo los operandos?");
			System.out.println("1 - Si.");
			System.out.println("0 - No.");
			repetir = teclado.nextInt();
				if (repetir == 1) {
					System.out.println(aleatorio(max,min));
				}
			
		}
		else {
			System.out.println(aleatorio(min,max));
		}
			
	}

	
	private static int aleatorio(int min,int max) {
		return (int) Math.floor(Math.random()* (max - min + 1) + min);
	}
	
	
	private static boolean comprobarParametros(int min, int max) {
		return (min < max);
	}
	
	private static void pedirDatos() {
		System.out.println("Introduzca el valor mínimo;");
		min = teclado.nextInt();
		System.out.println("Introduzca el valor máximo;");
		max = teclado.nextInt();
	}
	
	
}
