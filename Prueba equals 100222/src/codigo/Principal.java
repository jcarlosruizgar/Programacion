package codigo;

public class Principal {

	public static void main(String[] args) {
		
		Coche uno = new Coche("Renault", "Megane", "P4324K");
		Coche dos = uno;

		
		boolean resultado = (uno.equals(dos));
		System.out.println(resultado);//true
		resultado = (uno==dos);
		System.out.println(resultado);//true
		
		dos=new Coche("Renault","Megane","P4324K");
		
		resultado = (uno.equals(dos));//true
		System.out.println(resultado);
		resultado = (uno==dos);
		System.out.println(resultado);//false
	}

}
