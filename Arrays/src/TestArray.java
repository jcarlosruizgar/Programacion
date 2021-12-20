public class TestArray {

    public static void main(String[] args) {
        int[] datos = new int []{1, 2, 3, 4, 5, 6};
        int dato = 6;
        int posicion = Arrays.busquedaBinaria(datos, dato);
        System.out.println("La posición es: " + posicion);
    }

}
