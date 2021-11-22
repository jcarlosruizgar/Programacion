//suma de los 100 primeros numeros

package codigo;

public class ParesRecursivo {
	
	static int numero = 0;
	final static int maximo = 100;
	static int resultado;

	public static void main(String[] args) {
		
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
