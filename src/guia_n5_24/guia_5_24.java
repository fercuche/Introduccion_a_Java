/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package guia_n5_24;

/*import java.util.Locale;
import java.util.Scanner;*/
import java.util.Arrays;

public class guia_5_24 {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);*/
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizT = new int[3][3];
        int[][] matrizN = new int[3][3];

        System.out.println("La matriz es:");
        mostrarMatriz(matriz);
        System.out.println("La transpuesta de la matriz es:");
        transpuesta(matriz, matrizT);
        mostrarMatrizT(matrizT);
        //System.out.println("La matriz cambiada de signo es:");
        cambiarSigno(matrizN, matriz);
        // mostrarMatrizN(matrizN);

        if (Arrays.deepEquals(matrizN, matrizT)) {
            System.out.println("La matriz es igual a su transpuesta cambiada de signo.");
            System.out.println("La matriz es ANTISIMETRICA");

        } else {
            System.out.println("La matriz NO ES ANTISIMETRICA");
        }

    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }

    public static void transpuesta(int[][] matriz, int[][] matrizT) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrizT[i][j] = matriz[j][i];

            }

        }
    }

    public static void mostrarMatrizT(int[][] matrizT) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matrizT[i][j] + " ");

            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }

    public static void cambiarSigno(int[][] matrizN, int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrizN[i][j] = -matriz[i][j];

            }

        }
    }

    /*public static void mostrarMatrizN(int[][] matrizN) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matrizN[i][j] + " ");

            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }*/
}
