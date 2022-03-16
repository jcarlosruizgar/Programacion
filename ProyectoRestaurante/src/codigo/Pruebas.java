package codigo;

public class Pruebas {

    public static void main(String[] args) {

        Jarra[] jarras = new Jarra[2];
        jarras[0] = new Jarra("Cerveza",30);
        jarras[1] = new Jarra("Agua",10);
        Mesa mesa1 = new Mesa(jarras);

    }

}
