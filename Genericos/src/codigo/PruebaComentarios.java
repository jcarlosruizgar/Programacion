package codigo;

import java.time.LocalDate;

public class PruebaComentarios {

    private static PilaGenerica<Comentario> pilaComentario = new PilaGenerica<>();

    public static void main(String[] args) {



        Comentario c1 = new Comentario("perica","perez", LocalDate.of(2020,10,05),"hola fgfhfg ghjghjd dfhgf ");
        Comentario c2 = new Comentario("pericu","perez", LocalDate.of(2020,10,05),"hola fhg jgf");
        Comentario c3 = new Comentario("perici","perez", LocalDate.of(2020,10,05),"df dh fsgj on es5huh 9e5hg esh8g5e ege");
        Comentario c4 = new Comentario("perice","perez", LocalDate.of(2020,10,05),"holdfgdsh asdrhfghgf");

        System.out.println(pilaComentario.estaVacia());

        pilaComentario.aniadir(c1);
        pilaComentario.aniadir(c2);
        pilaComentario.aniadir(c3);
        pilaComentario.aniadir(c4);

        /*
        System.out.println(pc.estaVacia());

        System.out.println(pc.extraer());
        System.out.println(pc.extraer());
        System.out.println(pc.primero());

        System.out.println(pc);
         */

        System.out.println("El comentario mas largo es: " + comentarioMasLargo());

    }

    public static String comentarioMasLargo(){
        String comentarioLargo = "";
        for(Comentario comentario: pilaComentario.getPila()){
            if(comentario.getComentario().length() > comentarioLargo.length()){
                comentarioLargo = comentario.getComentario();
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(comentarioLargo));
        return sb.reverse().toString();
    }

}