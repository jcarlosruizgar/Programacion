public class Principal {

    //Persona[] vector = {new Persona(), new Persona("Paco", 24, TipoSexo.ASEXUAL)};
    Persona[] vector = new Persona[3];

    public static void main(String[] args) {
        Persona maria = new Persona("Maria del Pilar", 34, TipoSexo.FEMENINO);
        maria.setSexo(TipoSexo.TRANSEXUALMASCULINO);
        maria.setNombre("Mariano");

        System.out.println(maria);

        Persona juliancito = new Persona("Juliancito");
        juliancito.setEdad(19);
        juliancito.setSexo(TipoSexo.NOBINARIO);

        System.out.println(juliancito);
    }

}
