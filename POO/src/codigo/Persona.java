package codigo;

enum TipoSexo{
	MASCULINO, FEMENINO, TRANSEXUALMASCULINO, TRANSEXUALFEMENINO, NOBINARIO, ASEXUAL;
}

public class Persona {
	
	String nombre;
	int edad;
	TipoSexo sexo;
	
	public Persona() {
	}

	public Persona(String nombre, int edad, TipoSexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	

	
	
	
	
}
