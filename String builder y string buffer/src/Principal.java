public class Principal {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hola caracola");
        System.out.println(sb);
        System.out.println("Este StringBuilder tiene una capacidad de: " + sb.capacity());
        System.out.println("Este StringBuilder tiene una longitud de: " + sb.length());
        sb.replace(1,4,"ay");
        sb.append("s");
        System.out.println(sb);
        int numero = 5000;
        sb.replace(4, 4, String.valueOf(numero) + " ");
        System.out.println(sb);
        sb.append(" en el mar");
        System.out.println(sb);
        String cadena = new String(sb.substring(24, 28));
        System.out.println(cadena);
        System.out.println("Este StringBuilder tiene una capacidad final de: " + sb.capacity());
        System.out.println("Este StringBuilder tiene una longitud final de: " + sb.length());

        System.out.println(" ");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////////SOY UNA BARRA SEPARADORA//////////////////////////////////");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(" ");

        StringBuffer sf = new StringBuffer("Hola caracola");
        System.out.println(sf);
        System.out.println("Este StringBuffer tiene una capacidad de: " + sf.capacity());
        System.out.println("Este StringBuffer tiene una longitud de: " + sf.length());
        sf.replace(1,4,"ay");
        sf.append("s");
        System.out.println(sf);
        int numeroB = 5000;
        sf.replace(4, 4, String.valueOf(numeroB) + " ");
        System.out.println(sf);
        sf.append(" en el mar");
        System.out.println(sf);
        String cadenaB = new String(sf.substring(24, 28));
        System.out.println(cadenaB);
        System.out.println("Este StringBuffer tiene una capacidad final de: " + sf.capacity());
        System.out.println("Este StringBuffer tiene una longitud final de: " + sf.length());
    }

}
