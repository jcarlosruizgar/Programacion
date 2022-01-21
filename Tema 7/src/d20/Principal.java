package d20;

public class Principal {

    public static void main(String[] args) {

        Empresa amazon = new Empresa();

        Cliente pepe = new Cliente();
        Cliente francisco = new Cliente();
        Cliente alvaro = new Cliente();
        Cliente perico = new Cliente();
        Cliente mario = new Cliente();

        amazon.addCliente(pepe);
        amazon.addCliente(francisco);
        amazon.addCliente(alvaro);
        amazon.addCliente(perico);
        amazon.addCliente(mario);

        pepe.setNombre("Pepe");
        pepe.setTelefono("+34625325121");

        System.out.println(amazon);


    }

}
