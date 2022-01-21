package d21;

import java.util.Arrays;

public class Empresa {

    private final int TAMAÑO = 4;
    private Cliente arrayClientes[] = new Cliente[TAMAÑO];
    private int i = 0;

    public void addCliente(Cliente unCliente){
        if (i == TAMAÑO) System.out.println("No se pueden añadir más clientes");
        else{
            arrayClientes[i] = new Cliente();
            arrayClientes[i].setTelefono(unCliente.getTelefono());
            arrayClientes[i].setNombre(unCliente.getNombre());
            i++;
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "TAMAÑO=" + TAMAÑO +
                ", arrayClientes=" + Arrays.toString(arrayClientes) +
                ", i=" + i +
                '}';
    }
}
