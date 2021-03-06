package codigo;

public class Principal {

	public static void main(String[] args) {
		
		Programador p0 = new Programador("Perico",46,2300,false,5000,"Java");
		p0.subirSalario(300);
		p0.mostrarDatos();
		System.out.println(p0.clasificarEmpleado());
		p0.presentarse();
		
		Programador p1 = p0;

		System.out.println(p1.equals(p0));//true

		Programador p2 = new Programador("Pedro",23,1980,true,6233,"C");

		System.out.println(p2.equals(p1));//false

		Programador p3 = new Programador("Perico",46,2600,false,5000,"Java");

		System.out.println(p3.equals(p0));//true

		Programador p4 = new Programador();

		Programador p5 = new Programador();

		p4.setLineasDeCodigoPorHora(2000);

		p5.setLineasDeCodigoPorHora(2000);


		System.out.println(p4.equals(p5));

	}

}
