package codigo;

import java.util.TreeSet;

public class Aula {

    private TreeSet<Alumno> ta = new TreeSet<Alumno>();

    public void insertarAulumnos(TreeSet aulaOrigen){
        this.ta.addAll(aulaOrigen);
    }

    @Override
    public String toString() {
        return "Aula{" +
                "ta=" + ta +
                '}';
    }
}
