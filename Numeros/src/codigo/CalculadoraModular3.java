/*
ENUNCIADO: Calculadora modular que sume, reste, multiplique y divida.
FECHA: 9/11/21
AUTOR: Juan Carlos Ruiz García
COMENTARIOS:
*/
package codigo;

import java.util.Scanner;

public class CalculadoraModular3 {
	
	private static int tipoOperacion;
	private static int operacion;
	private static double operandoA;
	private static double operandoB;
	private static boolean booleanoA;
	private static boolean booleanoB;
	private static boolean salir = false;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {//metodo main
		do {//inicio bucle repetir el programa
			menu();//se elige si realizar operaciones aritmeticas o logicas
			switch (tipoOperacion) {//ejecuta las operaciones aritmeticas o logicas
			case 1:{
				menuAritmetico();//se elige la operacion aritmetica a realizar
				introducirOperandosAritmeticos();//se introducen los operandos aritmeticos
				mostrarResultadoAritmetico();//se muestra el resultado de la operacion elegida
				break;
			}
			case 2:{
				menuLogico();//se elige la operacion logica a realizar
				introducirOperandosLogicos();//se introducen los operandos logicos
				mostrarResultadoLogico();
				break;
			}
			}//fin swith tipo de operacion
			repetirOperacion();//permite repetir el programa
		}//
		while(!salir);//fin bucle repetir el programa
	}

	private static double hacerSuma(double a, double b) {//metodo suma
		return a + b;
	}
	
	private static double hacerResta(double a, double b) {//metodo resta
		return a - b;
	}
	
	private static double hacerMultiplicacion(double a, double b) {//metodo multiplicacion
		return a * b;
	}
	
	private static double hacerDivision(double a, double b) {//metodo division
		return a / b;
	}
	
	private static void menuAritmetico() {//metodo para elegir operacion aritmetica
		do {
			System.out.println("Elija la operación aritmética a realizar.");
			System.out.println("Para ello introduzca:");
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
	
	private static void introducirOperandosAritmeticos() {//metodo para elegir los operandos
		System.out.println("Introduzca el 1º operando:");
		operandoA = teclado.nextInt();
		System.out.println("Introduzca el 2º operando:");
		operandoB = teclado.nextInt();
	}
	
	private static void mostrarResultadoAritmetico() {//metodo que muestra el resultado de la operacion aritmetica elegida
		switch (operacion) {
		case 1:
			System.out.println(hacerSuma(operandoA, operandoB));
			break;
		case 2:
			System.out.println(hacerResta(operandoA, operandoB));
			break;
		case 3:
			System.out.println(hacerMultiplicacion(operandoA, operandoB));
			break;
		case 4:
			try {
				int opA = (int) operandoA;
				int opB = (int) operandoB;
				System.out.println(hacerDivision(opA, opB));
				System.out.println(opB);
			}
			catch (ArithmeticException e) {
				System.out.println("Un número no puede dividirse por 0.");
			}
			break;
		}
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

	private static boolean hacerAnd(boolean a, boolean b) {//metodo operador logico and
		return a && b;
	}
	
	private static boolean hacerOr(boolean a, boolean b) {//metodo operador logico or
		return a || b;
	}
	
	private static boolean hacerNot(boolean a) {//metodo operador logico not
		return !a;
	}
	
	private static boolean hacerNand(boolean a, boolean b) {//metodo operador logico nand
		return !(a && b);
	}
	
	private static boolean hacerNor(boolean a, boolean b) {//metodo operador logico nor
		return !(a || b);
	}
	
	private static boolean hacerXor(boolean a, boolean b) {//metodo operador logico xor
		return a ^ b;
	}
	
	private static void menuLogico() {//metodo para elegir operacion logica
		do {
			System.out.println("Elija la operación lógica a realizar.");
			System.out.println("Para ello introduzca:");
			System.out.println("1 - Para and.");
			System.out.println("2 - Para or.");
			System.out.println("3 - Para not.");
			System.out.println("4 - Para nand");
			System.out.println("5 - Para nor.");
			System.out.println("6 - Para xor");
			operacion = teclado.nextInt();
			if (operacion < 1 || operacion > 6) {
				System.out.println("Eso no es una opción valida.");
			}
		}
		while(operacion < 1 || operacion > 6);//control de error para numeros < 1 & > 6 en el menu
	}
	
	private static void menu() {//metodo para elegir entre operaciones aritmeticas y logicas
		do {
			System.out.println("Elija que tipo de operación quiere realizar.");
			System.out.println("Para ello introduzca:");
			System.out.println("1 - Para operaciones aritméticas");
			System.out.println("2 - Para operaciones lógicas");
			tipoOperacion = teclado.nextInt();
			if (tipoOperacion < 1 || tipoOperacion > 2) {
				System.out.println("Eso no es una opción valida.");
			}
		}
		while (tipoOperacion < 1 || tipoOperacion > 2);
	}
	
	private static void mostrarResultadoLogico() {//metodo que muestra el resultado de la operacion logica elegida
		switch (operacion) {
		case 1:
			System.out.println(hacerAnd(booleanoA, booleanoB));
			break;
		case 2:
			System.out.println(hacerOr(booleanoA, booleanoB));
			break;
		case 3:
			System.out.println(hacerNot(booleanoA));
			break;
		case 4:
			System.out.println(hacerNand(booleanoA, booleanoB));
			break;
		case 5:
			System.out.println(hacerNor(booleanoA, booleanoB));
		case 6:
			System.out.println(hacerXor(booleanoA, booleanoB));
		}
	}
	
	private static void introducirOperandosLogicos() {//metodo para elegir los operandos
		System.out.println("Introduzca un valor lógico true o false:");
		booleanoA = teclado.nextBoolean();
		if (operacion != 3) {
			System.out.println("Introduzca otro valor lógico true o false:");
			booleanoB = teclado.nextBoolean();
		}
		
	}
	
}
