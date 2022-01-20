/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
 */
package guia_n5_23;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];

        rellenar(matriz);
        System.out.println("La matriz 4X4:");
        mostrarMatriz(matriz);
        System.out.println("La transpuesta de la matriz es:");
        transpuesta(matriz, matrizT);
        mostrarMatrizT(matrizT);
    }

    public static void rellenar(int[][] matriz) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) (Math.random() * 10);

            }

        }
    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }

    public static void transpuesta(int[][] matriz, int[][] matrizT) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matrizT[i][j] = matriz[j][i];

            }

        }
    }

    public static void mostrarMatrizT(int[][] matrizT) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matrizT[i][j] + " ");

            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }

}
