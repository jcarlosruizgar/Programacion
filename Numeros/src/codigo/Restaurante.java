/*
ENUNCIADO: Tarifas restaurante, 95€ el plato, si vienen > 200 a 85€, para > 300 a 75€. Calcular el presupuesto
FECHA: 7/11/21
AUTOR: Juan Carlos Ruiz García
COMENTARIOS:
*/
package codigo;

import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		int precio;
		int presupuesto;
		int asistentes;
		boolean salir = false;
		int condicion = 3;
		Scanner teclado = new Scanner(System.in);
		do {//inicio bucle repetición programa
			System.out.println("Indique el número de asistentes para conocer el presupuesto total");
			asistentes = teclado.nextInt();
			if (asistentes >= 300) {//si hay 300 asistentes o más
				precio = 75;
			}
			else {
				if (asistentes >= 200) {//si hay 200 asistentes o más
					precio = 85;
				}
				else {//si son menso de 200 asistentes
					precio = 95;
				}
			}
			presupuesto = asistentes * precio;
			System.out.println("El presupuesto total es de " + presupuesto + " euros" + " y el precio del plato es de " + precio + " euros.");
			do {//inicio bucle control de errores
				System.out.println("1 - para volver a ejecutar.");
				System.out.println("0 - para salir.");
				condicion = teclado.nextInt();
			}
			while (condicion != 1 && condicion !=0);//fin bucle control de errores
			if (condicion == 0) {
				salir = !salir;//invertimos el valor de la variable bandera
			}
			}
		while (salir == false);//fin bucle repetición programa
		teclado.close();
	}
	
}
