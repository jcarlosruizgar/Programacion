
public class Calculadora {
	public int atributo1;
	private int y;
	public Calculadora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculadora(int x, int y) {
		super();
		this.atributo1 = x;
		this.y = y;
	}
	public int getX() {
		return atributo1;
	}
	public void setX(int x) {
		this.atributo1 = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Calculadora [x=" + atributo1 + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
