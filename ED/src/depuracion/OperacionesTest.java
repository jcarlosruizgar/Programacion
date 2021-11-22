package depuracion;


public class OperacionesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Operaciones operaciones=new Operaciones();
		
		int uno=8;
		int dos=8;
		int resultado=0;
		
		resultado=operaciones.suma(uno, dos);
		System.out.println("La suma es: "+resultado);
		resultado=operaciones.multiplicacion(uno, dos);
		System.out.println("La multiplicacion es: "+resultado);
		if (resultado==64){
			System.out.println("Exitoso");				
		}
		else
		{
			System.out.println("Error");	
		}

	}

}
