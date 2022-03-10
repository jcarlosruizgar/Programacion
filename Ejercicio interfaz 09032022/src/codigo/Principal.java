package codigo;

public class Principal {

    public static void main(String[] args) {

        Persona p = new Persona("Perico");
        p.cantar();
        p.volar();

        Gallo g = new Gallo(true);
        g.cantar();

        Canario c = new Canario("Verde");
        c.cantar();
        c.volar();
    }


}
