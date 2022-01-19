package EjComposicion;

public class Edificio {

    private Piso arrayPisos[];

    public Edificio(int pisos) {
        arrayPisos = new Piso[pisos];
        for (int i = 0; i < pisos; i++) {
            arrayPisos[i] = new Piso();
        }
    }

}
