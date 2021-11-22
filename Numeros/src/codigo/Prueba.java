package codigo;

public class Prueba {

	static int numeroA = 10;
	static int numeroB = 0;
	
	public static void main(String[] args) {
		System.out.println(division(9,0));
		
	}

		private static double division(int numeroA,int numeroB) {
			int resultado = 0;
			try {
				resultado = numeroA/numeroB;
				return resultado;
			}
			catch (ArithmeticException e) {
				System.out.println("no 0");
			}
			return resultado;
		}
}
