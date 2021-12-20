/*
 * hacer multiplicacion de matrices
 */
public class Principal {

    static private final int TAM = 3;
    static private int matrizA[][] = new int [TAM][TAM];
    static private int matrizB[][] = new int [TAM][TAM];

    public static void main(String[] args) {

        cargarMatrices(matrizA);
        cargarMatrices(matrizB);
        mostrarMatrices(matrizA);
        mostrarMatrices(matrizB);
        mostrarMatrices(sumaMatrices());
        mostrarMatrices(restaMatrices());
        mostrarMatrices(multiplicacionMatrices());
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal(matrizA));

    }

    static void cargarMatrices(int matriz [][]) {

        for(int i=0;i<TAM;i++)
            for(int j=0;j<TAM;j++) {
                matriz[i][j]=(int)Math.floor(Math.random()*10);


            }

    }

    static void mostrarMatrices(int matriz [][]) {

        for(int i=0;i<TAM;i++) {
            for(int j=0;j<TAM;j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

    }

    static int[][] sumaMatrices() {

        int sumaMatriz[][] = new int [TAM][TAM];

        for(int i=0;i<TAM;i++)
            for(int j=0;j<TAM;j++) {
                sumaMatriz[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        return sumaMatriz;

    }

    static int[][] restaMatrices() {

        int restaMatriz[][] = new int [TAM][TAM];

        for(int i=0;i<TAM;i++)
            for(int j=0;j<TAM;j++) {
                restaMatriz[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        return restaMatriz;

    }

    static int[][] multiplicacionMatrices(){

        int multiplicaMatriz[][] = new int [TAM][TAM];

        for(int i=0;i<TAM;i++) {
            for(int j=0;j<TAM;j++) {
                for(int x=0;x<TAM;x++) {
                    multiplicaMatriz[i][j] += (matrizA[i][x] * matrizB[x][j]);
                }
            }

        }

        return multiplicaMatriz;

    }

    static int sumaDiagonal(int matriz[][]){
        int suma = 0;
        for(int i=0;i<TAM;i++) {
            suma += matriz[i][i];
        }
        return suma;
    }



}
