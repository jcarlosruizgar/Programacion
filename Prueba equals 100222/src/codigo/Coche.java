package codigo;

public class Coche extends Vehiculo{

	public Coche(String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		
	}

	public boolean equals (Object o){
		if ((o!=null) && (o instanceof Coche)){
			if (((Coche)o).matricula==matricula &&
					((Coche)o).marca==marca &&
					((Coche)o).modelo==modelo){
				return true;
				}
			else {
					return false;
			}
		}
		else {
			return false; //Si no se cumple todo lo anterior
		}
		
	}
}
