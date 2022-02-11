package codigo;

public class Coche extends Vehiculo{

	//constructor parametrizado
	public Coche(String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
	}

	//redefinicion equals para la clase Coche
	public boolean equals (Object o){
		if ((o!=null) && (o instanceof Coche)){
			if (((Coche)o).matricula==matricula && ((Coche)o).marca==marca && ((Coche)o).modelo==modelo){
				return true;
				}
			else {
					return false;
			}
		}
		else {
			return false;
		}
		
	}
}
