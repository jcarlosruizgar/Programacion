package d17;

public class Principal {

    public static void main(String[] args) {

        Triangulo escaleno = new Triangulo();
        escaleno.setBase(54);
        escaleno.setAltura(21);
        escaleno.setTipo("escaleno");
        escaleno.mostrarDimensiones();
        System.out.println("El área es: " + escaleno.area());
        escaleno.mostrarTipo();

        Triangulo isosceles = new Triangulo();
        isosceles.setBase(23);
        isosceles.setAltura(11);
        isosceles.setTipo("isosceles");
        isosceles.mostrarDimensiones();
        System.out.println("El área es: " + isosceles.area());
        isosceles.mostrarTipo();

    }

}
