package codigo;

public class Automovil {
	
	//constructor
	public Automovil() {
		System.out.println("se creo un objeto de tipo automovil");
	}
	
	

	//atributos
	String marca;
	int modelo;
	int precio;
	
	boolean estado = false;
	
	//metodos
	
	public void encender() {
		if (estado == true) {
			System.out.println("El automovil ya esta encendido");
		}
		else {
			
			System.out.println("El automovil se ha encendido");
			estado = true;
		}
	}
	
	public void apagar() {
		if (estado == true) {
			System.out.println("El automovil se ha apagado");
			estado = false;
		}
		else {
			System.out.println("El automovil ya esta apagado");
		}
		
	}
	
	public void avanzar() {
		if (estado == true) {
			System.out.println("El automovil esta avanzando");
		}
		else {
			System.out.println("El automovil no puede avanzar apagado");
		}
	}
	
	
	
	
	
}
