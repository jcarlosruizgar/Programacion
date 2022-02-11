package codigo;

public abstract class Empleado {

	protected String nombre;
	protected int edad;
	protected double salario;
	protected boolean casado;
		
	public Empleado() {
	}

	public Empleado(String nombre, int edad, double salario, boolean casado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.casado = casado;
	}

	public String clasificarEmpleado() {
		String tipoEmpleado = "";
		if (edad <= 21) tipoEmpleado ="Principiante";
		else if(edad >=22 && edad <= 35) tipoEmpleado = "Intermedio";
		else tipoEmpleado = "Senior";
		return tipoEmpleado;
	}
	
	public void mostrarDatos() {
		System.out.println("El empleado se llama " + this.nombre);
		System.out.println("Tiene " + this.edad + " años");
		System.out.println("Percibe un salario de " + this.salario + "€");
		if (casado) System.out.println("Esta casado");
		else System.out.println("No esta casado");
	}
	
	public void subirSalario(double cantidad) {
		this.salario += cantidad;
	}
	
	abstract public void presentarse();
		
}
