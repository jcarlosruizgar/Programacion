package codigo;

public class PruebaInterfaz {

    public static void main(String[] args) {
        Arrancable motorcito;
        Coche c = new Coche();
        BombaAgua ba = new BombaAgua();
        motorcito=c;
        motorcito.arrancar();
        motorcito=ba;
        motorcito.arrancar();

        Escribible e = new Texto();
        Prueba p = new Prueba(e);
        p.enviaTexto("dsgsgf");

    }

}
