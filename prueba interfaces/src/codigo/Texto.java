package codigo;

public class Texto implements Escribible{
    @Override
    public void escribe(String texto) {
        System.out.println(texto);
    }
}
