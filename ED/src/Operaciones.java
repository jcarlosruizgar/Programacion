import java.util.ArrayList;
import java.util.Set;

/*
@author Juan Carlos
*/
public class Operaciones {

	private int x;
	private int y;
	private ArrayList<Integer> listaEnteros;
	private Set<Integer> listaEnteros2;

	public Operaciones(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	



	public Operaciones() {
		super();
		// TODO Auto-generated constructor stub
	}






	public ArrayList<Integer> getListaEnteros() {
		return listaEnteros;
	}






	public void setListaEnteros(ArrayList<Integer> listaEnteros) {
		this.listaEnteros = listaEnteros;
	}






	public int restar() {
		return this.x - this.y;
	}
	
	public int sumar() {
		return this.x + this.y;
	}

}
