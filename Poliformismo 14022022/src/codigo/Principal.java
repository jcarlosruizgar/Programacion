package codigo;

public class Principal {

    public static void main(String[] args) {

        SeleccionFutbol[] lista = new SeleccionFutbol[3];
        lista[0] = new Futbolista();
        lista[1] = new Entrenador();
        lista[2] = new Masajista();

        for (int i = 0; i < lista.length; i++) {
            lista[i].viajar();
            lista[i].concentrarse();
        }

        for (int i = 0; i < lista.length; i++) {
            lista[i].entrenamiento();
            lista[i].partidoFutbol();
        }

        /*for (int i = 0; i < lista.length; i++) {
            lista[i].entrevista();
            lista[i].planificarEntrenamiento();
            lista[i].darMasaje();
        }*/

        //lista[0].entrevista();
        ((Futbolista)lista[0]).entrevista();


        //main que cree, un entrenador, un futbolista y un masajista y los mete en un array
        //despues llamamos a los metodos de la clase padre, viajas y concentrarse


    }


}
