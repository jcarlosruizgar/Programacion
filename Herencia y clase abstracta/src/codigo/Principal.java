package codigo;

public class Principal {

	public static void main(String[] args) {
		
		Programador programadorPrueba = new Programador("Perico",46,2300,false,5000,"Java");
		programadorPrueba.subirSalario(300);
		programadorPrueba.mostrarDatos();
		System.out.println(programadorPrueba.clasificarEmpleado());
		programadorPrueba.presentarse();
		
		
	}


}
