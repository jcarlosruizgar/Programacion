package P12;

public class PruebaCoche {

    public static void main(String[] args) {
        Coche coche1 = new Coche(100,50);
        coche1.acelerar(100);
        coche1.repostar(20);
        coche1.acelerar(10);
        System.out.println(coche1);
        coche1.parar();
        System.out.println(coche1);
    }

}
