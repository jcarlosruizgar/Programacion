package codigo;

public class Programador extends Empleado{

	private int lineadDeCodigoPorHora;
	private String lenguajeUsado;
	
	public Programador() {
		super();
	}

	public Programador(String nombre, int edad, double salario, boolean casado, int lineas, String lenguajeUsado) {
		super(nombre, edad, salario, casado);
		this.lineadDeCodigoPorHora = lineas;
		this.lenguajeUsado = lenguajeUsado;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Escribe " + lineadDeCodigoPorHora + " lineas de código por hora");
		System.out.println("Utiliza el lenguaje " + lenguajeUsado);
	}
	
	public void presentarse() {
		System.out.println("Hola");
	}
	
}
