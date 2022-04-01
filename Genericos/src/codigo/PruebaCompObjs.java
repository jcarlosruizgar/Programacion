package codigo;

public class PruebaCompObjs {

    private static ComparadorObjs<String, StringBuffer> comp;

    public static void main(String[] args) {

        String s1 = "Hola";
        StringBuffer s2 = new StringBuffer("Adiós");
        ComparadorObjs<String, StringBuffer> comp = new ComparadorObjs<String, StringBuffer>(s1, s2);
        System.out.println(comp.mismaPrimeraLetra());

    }

}
