package d20;

import java.util.Arrays;

public class Empresa {

    private final int TAMAÑO = 4;
    private Cliente arrayClientes[] = new Cliente[TAMAÑO];
    private int i = 0;

    public void addCliente(Cliente cliente){
        if (i == TAMAÑO) System.out.println("No se pueden añadir más clientes");
        else{
            arrayClientes[i] = cliente;
            i++;
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "arrayClientes=" + Arrays.toString(arrayClientes) +
                '}';
    }
}
