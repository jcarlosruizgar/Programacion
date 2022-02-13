package codigo;

import java.util.Objects;

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
				Objects.equals(((Programador) o).nombre,nombre) &&
				Objects.equals(((Programador) o).edad,edad) &&
				Objects.equals(((Programador) o).salario,salario) &&
				Objects.equals(((Programador) o).casado,casado) &&
				Objects.equals(((Programador) o).lineasDeCodigoPorHora,lineasDeCodigoPorHora) &&
				Objects.equals(((Programador) o).lenguajeUsado,lenguajeUsado));
	}

	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}

	public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}

	public String getLenguajeUsado() {
		return lenguajeUsado;
	}

	public void setLenguajeUsado(String lenguajeUsado) {
		this.lenguajeUsado = lenguajeUsado;
	}
}
