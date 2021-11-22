/*
ENUNCIADO: introducir 3 numeros y decir cual de ellos es el mayor
FECHA: 7/11/21
AUTOR: Juan Carlos Ruiz Garc�a
COMENTARIOS:
*/
package codigo;

import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		float numeroA;//1� n�mero
		float numeroB;//2� n�mero
		float numeroC;//3� n�mero
		boolean salir = false;//variable bandera
		int condicion = 3;//variable para invertir valor de la bandera
		Scanner teclado = new Scanner(System.in);
		do {//inicio bucle repetici�n del programa
			System.out.println("Introduzca el 1� n�mero a comparar");
			numeroA = teclado.nextFloat();
			System.out.println("Introduzca el 2� n�mero a comparar");
			numeroB = teclado.nextFloat();
			System.out.println("Introduzca el 3� n�mero a comparar");
			numeroC = teclado.nextFloat();
			if (numeroA > numeroB) {
				if (numeroA > numeroC) {
					System.out.println("El n�mero mayor es: " + numeroA);//si el 1� n�mero es el mayor
				}
					}
			else {
				if (numeroB > numeroC) {
					if (numeroB > numeroC) {
						System.out.println("El n�mero mayor es: " + numeroB);//si el 2� n�mero es el mayor
					}
					}
				else {
					System.out.println("El n�mero mayor es: " + numeroC);//si el 3� n�mero es el mayor
				}
			}
			do {//inicio bucle control de errores
				System.out.println("1 - para repetir el programa.");
				System.out.println("0 - para salir.");
				condicion = teclado.nextInt();
			}
			while(condicion != 1 && condicion != 0);//fin bucle control de errores
			if (condicion == 0) {
				salir = !salir;//invertimos el valor de la variable bandera
			}
		}
		while (salir == false);//fin bucle repetici�n del programa
		teclado.close();
	}

}
