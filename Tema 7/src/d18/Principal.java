package d18;

public class Principal {

    public static void main(String[] args) {

        Empleado elPrimero = new Empleado("Perico");
        System.out.println(elPrimero);

        Directivo elQueManda = new Directivo("El que manda");
        System.out.println(elQueManda);

        Operario cabezaAgachada = new Operario("Currante");
        System.out.println(cabezaAgachada);

        Oficial ese = new Oficial("Callate");
        System.out.println(ese);

        Tecnico elQueSabe = new Tecnico("El que sabe");
        System.out.println(elQueSabe);

    }




}
