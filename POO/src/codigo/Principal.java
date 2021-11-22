package codigo;

public class Principal {

	public static void main(String[] args) {
		Persona maria = new Persona("Maria del Pilar", 34, TipoSexo.FEMENINO);
		maria.setSexo(TipoSexo.TRANSEXUALMASCULINO);
		maria.setNombre("Mariano");
		
		System.out.println(maria);
		
		Persona juliancito = new Persona("Juliancito");
		juliancito.setEdad(19);
		juliancito.setSexo(TipoSexo.NOBINARIO);
		
		System.out.println(juliancito);
	}

}
