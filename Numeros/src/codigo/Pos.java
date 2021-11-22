/*
ENUNCIADO: Decir si el numero introducido es positivo o negativo
FECHA: 5/11/21
AUTOR: Juan Carlos Ruiz García
COMENTARIOS:
*/
package codigo;

import java.util.Scanner;

public class Pos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;//variable bandera
		int condicion = 3;//condicion para cambiar el signo de la variable bandera
		do {//inicio bucle hacer mientras que hace la ejecucion del programa
			System.out.println("Introduzca un número entero por teclado para saber si es positivo o negativo:");
			int numero = teclado.nextInt();
			String parimpar;
			if (numero % 2 == 0) {
				parimpar = "par";
			}
			else {
				parimpar = "impar";
			}
			if (numero > 0) {//evalua si el numero es positivo
				System.out.println("El número " + numero + " es positivo y es " + parimpar);
			}
			else{
				if (numero < 0) {//evalua si el numero es negativo
				System.out.println("El número " + numero + " es negativo y es " + parimpar);
				}
				else {//si es 0
					System.out.println("El número " + numero + " no es positivo ni negativo, es 0 y es " + parimpar);
				}
			}
			do {//inicio bucle hacer mientras control de errores
				System.out.println("Introduzca 1 para volver a ejecutar o 0 para salir");
				condicion = teclado.nextInt();//lectura valor variable condicion
				}
				while(condicion != 1 && condicion != 0);//fin bucle control errores
				if (condicion == 0){
					salir = !salir;//invertimos el valor de la variable bandera
			}
		}
		while (salir == false);//fin bucle ejecucion del programa
		teclado.close();
	}

}
