import java.util.Scanner;
import java.lang.Math;
public class AdivinaNumero {

	public static void main(String[] args) {
		int aleatorio = (int) Math.floor (Math.random()*9+1);
		Scanner numero = new Scanner(System.in);
		System.out.println("Introduzca un n�mero del 1 al 10 para adivinar el n�mero:");
		int elegido = numero.nextInt();
		if (elegido == aleatorio) {
			System.out.println("Acertaste");
		}
		else {
			System.out.println("Fallaste");
			System.out.println("El n�mero era: " + aleatorio);
		}
		numero.close();
	}
}