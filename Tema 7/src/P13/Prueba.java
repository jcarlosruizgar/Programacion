package P13;

public class Prueba {

    public static void main(String[] args) {

        Animal oto = new Animal(4,7);
        oto.comer();
        oto.dormir();
        oto.reproducir();
        System.out.println(oto);

        Perro toby = new Perro(4,9,"Casero","De los que muerden");
        toby.comer();
        toby.dormir();
        toby.gruñir();
        toby.ladrar();
        toby.reproducir();
        System.out.println(toby);

    }

}
