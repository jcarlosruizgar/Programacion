package depuracion;

public class Potencia_error {

	public static void main(String[] args) {
		
		
		double result=potencia(2.0,3.0);
		
		System.out.println("El resultado de la potencia es: "+ result);
		

	}

	private static double potencia(double base, double exponente) {
		
		double resultado=0.0;
		
		
		try{
		for (int i=0;  i<=exponente; i++){
			resultado=resultado*base;
		}
		}catch (Exception e){
			System.out.println("Se ha producido un error");
		}
		
		return resultado;
	}

}
