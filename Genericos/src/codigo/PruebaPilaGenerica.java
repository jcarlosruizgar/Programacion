package codigo;

public class PruebaPilaGenerica {

    public static void main(String[] args) {

        PilaGenerica <Integer> pl = new PilaGenerica<>();

        System.out.println(pl.estaVacia());

        pl.aniadir(7);
        pl.aniadir(6);
        pl.aniadir(2);
        pl.aniadir(1);
        pl.aniadir(79);

        System.out.println(pl);

        System.out.println(pl.estaVacia());

        System.out.println(pl.primero());

        System.out.println(pl.extraer());
        System.out.println(pl.extraer());

        System.out.println(pl);



    }

}
