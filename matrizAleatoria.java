import java.util.ArrayList;
import java.util.Collections;

public class matrizAleatoria {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = validaNumero(matriz,numeros);

            }

        }
        imprimirMatriz(matriz);
    }

    private static int validaNumero(int[][] matriz, ArrayList<Integer> numeros) {
        numeros.add(numeros.get(0));
        numeros.remove(0);
        return numeros.get(0);
    }


    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }

}

