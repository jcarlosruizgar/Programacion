/*
ENUNCIADO: Mostrar los n�meros naturales desde la unidad, hasta un n�mero introducido por teclado
FECHA: 5/11/21
AUTOR: Juan Carlos Ruiz Garc�a
COMENTARIOS:
CONTROL DE ERRORES: solo pueda ser el numero > 0 y que se pueda repetir el programa
*/

import java.util.Scanner;
public class MostrarDesdeUnidad {

	public static void main(String[] args) {
		int numero = 1;//variable contadora que muestra los numeros
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un n�mero natural:");
		int hasta = teclado.nextInt();//variable por teclado hasta el que queremos contar
		while (numero <= hasta) {
			System.out.println(numero);
			numero++;
		}
		teclado.close();
	}
}