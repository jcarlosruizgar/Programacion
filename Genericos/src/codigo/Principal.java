package codigo;

public class Principal {

    public static void main(String[] args) {
        Email em = new Email();
        em.setValor("paco@gmail.com");
        System.out.println(em.getValor());

        Edad ed = new Edad();
        ed.setValor(30);
        System.out.println(ed.getValor());

        Ancho<Integer> ai = new Ancho<>();
        ai.setValor(90);
        System.out.println(ai.getValor());

        Ancho<Float> af = new Ancho<>();
        af.setValor(93.3f);
        System.out.println(af.getValor());
    }

}
