//suma de los 100 primeros numeros

package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParesRecursivoInteractivo {
	
	static int numero = 0;
	static int maximo;
	static String m;
	static int resultado;

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			m = teclado.readLine();
			maximo = Integer.parseInt(m);
		
		
		do {
			numero++;
			resultado += numero;
		}
		while(numero < maximo);
		System.out.println(resultado);//progresion mediante iteracion
		System.out.println(progresion(maximo));//progresion mediante recursividad
		
	}
	
	private static int progresion(int numero) {
		if(numero == 0) {
			return 0;
		}
		else {
			return numero + progresion(numero-1);
		}
	}

}

