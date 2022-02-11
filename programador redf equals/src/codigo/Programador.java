package codigo;

public class Programador extends Empleado{

	private int lineasDeCodigoPorHora;
	private String lenguajeUsado;
	
	public Programador() {
		super();
	}

	public Programador(String nombre, int edad, double salario, boolean casado, int lineas, String lenguajeUsado) {
		super(nombre, edad, salario, casado);
		this.lineasDeCodigoPorHora = lineas;
		this.lenguajeUsado = lenguajeUsado;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Escribe " + lineasDeCodigoPorHora + " lineas de código por hora");
		System.out.println("Utiliza el lenguaje " + lenguajeUsado);
	}
	
	public void presentarse() {
		System.out.println("Hola");
	}


	public boolean equals (Object o){
		return (o instanceof Programador &&
				((Programador) o).lenguajeUsado.equals(lenguajeUsado) &&
				((Programador) o).lineasDeCodigoPorHora==lineasDeCodigoPorHora &&
				((Programador) o).casado==casado &&
				((Programador) o).salario==salario &&
				((Programador) o).edad==edad &&
				((Programador) o).nombre.equals(nombre));
	}

}
