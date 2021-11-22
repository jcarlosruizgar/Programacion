/*
ENUNCIADO: Calculadora modular que sume, reste, multiplique y divida.
FECHA: 9/11/21
AUTOR: Juan Carlos Ruiz Garc�a
COMENTARIOS:
*/
package codigo;

import java.util.Scanner;

public class CalculadoraModular {
	
	static int operacion;
	static double operandoA;
	static double operandoB;
	static double resultado;
	static boolean salir = false;
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {//metodo main
		do {
			menu();//se elige la operacion a realizar
			introducirOperandos();//se introducen los 2 operandos
			mostrarResultado();//se muestra el resultado de la operacion elegida
			repetirOperacion();//permite repetir el programa
		}
		while(salir == false);
	}

	private static double suma(double a, double b) {//metodo suma
		return a + b;
	}
	
	private static double resta(double a, double b) {//metodo resta
		return a - b;
	}
	
	private static double multiplicacion(double a, double b) {//metodo multiplicacion
		return a * b;
	}
	
	private static double division(double a, double b) {//metodo division
		return a / b;
	}
	
	private static void menu() {//metodo para elegir operacion
		do {
			System.out.println("Introduzca:");
			System.out.println("1 - Para suma.");
			System.out.println("2 - Para resta.");
			System.out.println("3 - Para multiplicación.");
			System.out.println("4 - Para división");
			operacion = teclado.nextInt();
			if (operacion < 1 || operacion > 4) {
				System.out.println("Eso no es una opción valida.");
			}
		}
		while(operacion < 1 || operacion > 4);//control de error para numeros < 1 & > 4 en el menu
	}
	
	private static void introducirOperandos() {//metodo para elegir los operandos
		System.out.println("Introduzca el 1º operando:");
		operandoA = teclado.nextInt();
		do {
			System.out.println("Introduzca el 2º operando:");
			operandoB = teclado.nextInt();
			if (operacion == 4 && operandoB == 0) {
				System.out.println("Un número no puede ser dividido entre 0.");
			}
		}
		while(operacion == 4 && operandoB == 0);//control de error en division entre 0
	}
	
	private static void mostrarResultado() {//metodo que muestra el resultado de la operacion elegida
		if (operacion == 1) {
			resultado = suma(operandoA, operandoB);
		}
		else if (operacion == 2) {
			resultado = resta(operandoA, operandoB);
		}
		else if (operacion == 3) {
			resultado = multiplicacion(operandoA, operandoB);
		}
		else if (operacion == 4) {
			resultado = division(operandoA, operandoB);
		}
		System.out.println(resultado);
	}
	
	private static void repetirOperacion() {//metodo que permite repetir el programa
		int repetir;
		do {
			System.out.println("¿Quiere realizar otra operación?");
			System.out.println("1 - Para repetir.");
			System.out.println("0 - Para salir.");
			repetir = teclado.nextInt();
			if (repetir < 0 || repetir >1) {
				System.out.println("Eso no es opción valida.");
			}
		}
		while(repetir < 0 || repetir > 1);//control de error si es 1 o 0
		if (repetir == 0) {
			salir = !salir;//invierte el valor de la variable bandera si elegimos salir del programa
		}
	}

	
}
