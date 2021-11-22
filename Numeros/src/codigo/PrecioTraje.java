/*
ENUNCIADO: Si el precio del traje es > 250€ aplicar 15% dto, al resto 8% dto
FECHA: 7/11/21
AUTOR: Juan Carlos Ruiz García
COMENTARIOS:
*/
package codigo;

import java.util.Scanner;

public class PrecioTraje {

	public static void main(String[] args) {
		float precio;//precio del traje
		final int VALOR_DESCUENTO = 250;//precio que determina el descuento a aplicar
		float descuento;//descuento aplicado
		float precio_final;//precio final del traje
		boolean salir = false;//variable bandera para salir
		int condicion = 3;//variable para modificar la variable bandera
		Scanner teclado = new Scanner(System.in);
		do {//inicio bucle hacer mientras para poder repetir el programa
			System.out.println("Introduzca el precio del traje:");
			
			precio = teclado.nextFloat();//lectura por teclado del precio del traje
			if (precio >= VALOR_DESCUENTO) {//evalucación del % de descuento a aplicar
				descuento = 15;
			}
			else {
				descuento = 8;
			}
			precio_final = precio - ( precio * descuento / 100);//asignación del precio final del traje
			do {//inicio hacer mientras para control de errores
				System.out.println("El traje cuesta " + precio_final + " euros y ha obtenido un descuento del " + descuento + "%.");
				System.out.println("1 - para calcular el precio de otro traje.");
				System.out.println("0 - para salir del programa");
				condicion = teclado.nextInt();
			}
			while (condicion != 1 && condicion != 0);//fin bucle control de errores
			if (condicion == 0) {
				salir = !salir;//invertimos el valor de la variable bandera
			}
		}
		while (salir == false);//fin bucle repetición del programa
		teclado.close();
	}
	
}
