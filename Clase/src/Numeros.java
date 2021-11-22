
public class Numeros {

	public static void main(String[] args) {
		System.out.println("Hola Mundo!");//hola mundo
		//constantes
		final int VALOR_MAX=10;//declaramos la constante para el valor maximo en 10
		final int VALOR_MIN=1;//declaramos la constante para el valor minimo en 1 
		//bucles para monstrar numeros del 1 al 10
		int numero1 = 1;//bucle mientras 1
		while (numero1 <= VALOR_MAX) {
			System.out.println(numero1);
			numero1++;
		}
		for (int numero2=1;numero2<=VALOR_MAX;numero2++) {//bucle para
			System.out.println(numero2);
		}
		int numero3 = 1;
		do {//bucle hacer mientras
			System.out.println(numero3);
			numero3++;
		}
		while (numero3<=VALOR_MAX);
		//bucles para mostrar numeros del 10 al 1
		int numero4 = 10;
		while (numero4 >= VALOR_MIN) {//bucle mientras
			System.out.println(numero4);
			numero4--;
		}
		for (int numero5=10;numero5>=VALOR_MIN;numero5--) {//bucle para
			System.out.println(numero5);
		}
		int numero6 = 10;
		do {//bucle hacer mientras
			System.out.println(numero6);
			numero6--;
		}
		while (numero6>=VALOR_MIN);
	}

}
