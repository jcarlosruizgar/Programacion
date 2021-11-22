package depuracion;


//Clase principal que llama a las operaciones
public class Operaciones {

	 OperacionesI operacion;
	 
	 public int suma (int uno, int dos)
	 {
		 operacion=new Suma();
		 return operacion.resultado(uno, dos);
	 }
	 
	

	public int multiplicacion(int uno, int dos) {
		operacion=new Multiplicacion();
		 return operacion.resultado(uno, dos);
	}
	 
	 

}
