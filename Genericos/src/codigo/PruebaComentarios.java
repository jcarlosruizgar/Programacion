package codigo;

import java.time.LocalDate;
import java.util.ArrayList;

public class PruebaComentarios {

    private static PilaGenerica<Comentario> pilaComentario = new PilaGenerica<>();

    public static void main(String[] args) {



        Comentario c1 = new Comentario("perico","perez", LocalDate.of(2020,10,05),"Lorem Ipsum is simply dummy text");
        Comentario c2 = new Comentario("patricia","algarrobo", LocalDate.of(2020,10,05),"t is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout");
        Comentario c3 = new Comentario("alberto","castellon", LocalDate.of(2021,10,05),"There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour");
        Comentario c4 = new Comentario("isabel","godoy", LocalDate.of(2020,10,05),"The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested");

        //System.out.println(pilaComentario.estaVacia());

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

        //System.out.println("El comentario mas largo es: " + comentarioMasLargo());
        //System.out.println(autorComentarioMasLargo());
        System.out.println(comentarioDelAnio("2020"));

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

    public static String autorComentarioMasLargo(){
        if(pilaComentario.estaVacia()){
            return "";
        }else{
            boolean encontrado = false;
            int contador = 0;
            StringBuilder sb = new StringBuilder(String.valueOf(comentarioMasLargo()));
            String comentario = String.valueOf(sb.reverse());
            String nombreApellido = "";
            do{
                if(comentario.compareTo(pilaComentario.getPila().get(contador).getComentario()) == 0){
                    nombreApellido = pilaComentario.getPila().get(contador).getNombre()+" "+pilaComentario.getPila().get(contador).getApellidos();
                    encontrado = true;
                }
                contador++;
            }
            while(!encontrado || contador < pilaComentario.getPila().size());
            return "El comentario mas largo ha sido hecho por: " +nombreApellido;
        }
    }

    public static ArrayList<String> comentarioDelAnio(String anio){
        ArrayList<String> listaComentarios = new ArrayList<>();
        for(Comentario comentario: pilaComentario.getPila()){
            if (comentario.getFecha().getYear()==Integer.parseInt(anio)){
                listaComentarios.add(comentario.toString()+"\n");
            }
        }
        return listaComentarios;
    }

}
