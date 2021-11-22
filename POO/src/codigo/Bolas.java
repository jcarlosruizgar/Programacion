package codigo;

public class Bolas {

	public static void main(String[] args) {
		
		Bola bola1 = new Bola();
		bola1.setColor("rojo");
		bola1.setTamaño(10);
		
		Bola bola2 = new Bola();
		bola2.setColor("verde");
		bola2.setTamaño(15);
		
		System.out.println(bola1.getColor());
		System.out.println(bola1.getTamaño());
		System.out.println(bola2.getColor());
		System.out.println(bola2.getTamaño());

	}

}
