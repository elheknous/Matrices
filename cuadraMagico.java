import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class cuadraMagico {
    public static void main(String[] args) {
        int[][] matriz = {{2,9,4}, {7,5,3}, {6,1,8}};
        imprimirMatriz(matriz);
        verCuadradoMagico(matriz);


    }

    private static void verCuadradoMagico(int[][] matriz) {
        boolean verificaColumna1 = verificarColumna(matriz,0);
        boolean verificarColumna2 = verificarColumna(matriz,1);
        boolean verificarColumnaa3 = verificarColumna(matriz,2);
        boolean verificaFila1 = verificarFila(matriz,0);
        boolean verificarFila2 = verificarFila(matriz,1);
        boolean verificarFila3 = verificarFila(matriz,2);
        boolean verificarDiagonal1 = verificarDiagonal(matriz);
        boolean verificarDiagonal2 = verificarDiagonal(matriz);

        boolean confirmacion = true;
        boolean[] verificaciones = {verificaColumna1,verificarColumna2,verificarColumnaa3,verificaFila1,verificarFila2,verificarFila3,verificarDiagonal1,verificarDiagonal2};
        for (int i = 0; i < verificaciones.length; i++) {
            if (!verificaciones[i]) {
                confirmacion = false;
                break;
            }

        }
        if (!confirmacion){
            System.out.println("No es un cuadrado magico");
        }else {
            System.out.println("Es un cuadrado magico");
        }
    }

    private static boolean verificarDiagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j){
                    suma = suma + matriz[i][j];
                }

            }

        }
        System.out.println(suma);
        if (suma == 15){
            return true;
        }else {
            return false;
        }
    }

    private static boolean verificarFila(int[][] matriz, int n) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma = suma + matriz[n][i];

        }
        System.out.println(suma);

        if (suma == 15){
            return true;
        }else {
            return false;
        }
    }

    private static boolean verificarColumna(int[][] matriz, int n) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma = suma + matriz[i][n];

        }
        System.out.println(suma);

        if (suma == 15){
            return true;
        }else {
            return false;
        }
    }


    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }

    //  private static int[][] generarMatriz() {
    //    ArrayList<Integer> numeros = new ArrayList<>();
    //  for (int i = 1; i < 10; i++) {
    //    numeros.add(i);

    //7}
    //Collections.shuffle(numeros);
    //int[][] m = new int[3][3];
    //for (int i = 0; i < 3; i++) {
    //77  for (int j = 0; j < 3; j++) {
    // m[i][j] =
    //}
    //}
    //}
}