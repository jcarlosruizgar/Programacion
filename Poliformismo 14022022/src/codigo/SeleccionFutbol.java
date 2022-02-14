package codigo;

public abstract class SeleccionFutbol {

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public void viajar(){
        System.out.println("Viajando clase padre");
    }

    public void concentrarse(){
        System.out.println("Concentrandose clase padre");
    }

    public abstract void entrenamiento();

    public void partidoFutbol(){
        System.out.println("Asiste al partido clase padre");
    }



}
