/*
ENUNCIADO: mostrar numeros de 1 a 100 por teclado, calcula suma de todos los pares y la de los impares
FECHA: 5/11/21
AUTOR: Juan Carlos Ruiz García
COMENTARIOS:
*/
package codigo;

public class par_impar {

	public static void main(String[] args) {
		int contador = 1;
		int sumaPar = 0;
		int sumaImpar = 0;
		final int MAX = 100;
		while (contador <= MAX) {
			System.out.println(contador);
			if (contador % 2 == 0) {
				sumaPar += contador;
			}
			else {
				sumaImpar += contador;
			}
			contador++;
		}
		System.out.println("Los números pares suman: " + sumaPar + " y los números impares suman: " + sumaImpar);

	}

}
