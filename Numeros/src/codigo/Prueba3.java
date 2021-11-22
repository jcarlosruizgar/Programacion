package codigo;

public class Prueba3 {

	public static void main(String[] args) {
		try {
			System.out.println(hacerDivision(3,2));
		}
		catch (ArithmeticException e) {
			System.out.println("Error.");
		}
	}
	
	public static double hacerDivision(int a, int b) {
		return ((double)a/b);
	}

}
