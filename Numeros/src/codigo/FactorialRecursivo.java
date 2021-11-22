package codigo;

public class FactorialRecursivo {
	
	static int numero = 5;

	public static void main(String[] args) {
		System.out.println(factorial(numero));	
	}
	
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		else {
			return num * factorial(num-1);
		}
	}

}