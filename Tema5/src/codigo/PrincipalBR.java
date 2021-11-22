/*
ENUNCIADO: Mostrar los valores de un arrays
FECHA: 19/11/21
AUTOR: Juan Carlos Ruiz Garc�a
COMENTARIOS:
*/
package codigo;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincipalBR {

	
	private static double notas[] = new double [5];
	
	//private final static int TAM = 3;
	//private static double notas[TAM];
	//private static double notas[] = new double[TAM];	
	
	public static void main(String[] args) {
		//cargarDatosLineales();
		//cargarDatosAleatorios();
		try {
			//cargarDatosInteractivosScanner();
			cargarDatosInterativosBuffered();
		}
		catch (NumberFormatException nfe) {
			System.out.println("Eso no es un valor valido.");
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}
		mostrarDatos();
		mostrarSumaNotas();
		System.out.println("La media es: " + mediaNotas());
	}

	public static void cargarDatosLineales() {//0,1,2,3,.....
		for(int i=0; i<notas.length; i++) {
			notas[i] = i;
		}
	}
	
	public static void cargarDatosAleatorios() {//usando math
		for(int i=0; i<notas.length; i++) {
			notas[i] = Math.floor(Math.random()*11);
		}
	}
	
	public static void cargarDatosInteractivosScanner() throws InputMismatchException {
		Scanner teclado = new Scanner(System.in);
		for(int i=0; i<notas.length; i++) {
			System.out.println("Introduza la " + (i+1) + "� nota:");
			notas[i] = teclado.nextDouble();
		}
		teclado.close();
	}
	
	public static void cargarDatosInterativosBuffered() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<notas.length; i++) {
			System.out.println("Introduzca la " + (i+1) + "� nota:");
			notas[i] = Integer.parseInt(br.readLine());
		}
	}
	
	public static void mostrarDatos() {
		for(int i=0; i<notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
	}
	
	public static void mostrarSumaNotas() {
		double suma = 0;
		for(int i=0; i<notas.length; i++) {
			suma += notas[i];
		}
		System.out.println("\nLa suma de las notas es: " + suma);
	}
	
	public static double mediaNotas() {
		double sumaMedia = 0;
		for(int i=0; i<notas.length; i++) {
			sumaMedia += notas[i];
		}
		return sumaMedia / notas.length;
	}
}
