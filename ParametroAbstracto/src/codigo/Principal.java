package codigo;

public class Principal {

    public static void main(String[] args) {

        Email email = new Email();
        email.setValor("pepe@gmail.com");
        System.out.println(email.getValor());

        Edad edad = new Edad();
        edad.setValor(22);
        System.out.println(edad.getValor());

        Altura<Integer> altura = new Altura<>();
        altura.setValor(30);
        System.out.println(altura.getValor());

    }

}
