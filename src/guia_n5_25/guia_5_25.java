/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package guia_n5_25;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int[][] matriz = new int[3][3];
        int[] comparador = new int[8];
        rellenar(matriz, comparador);
        System.out.println("La matriz 3x3:");
        mostrarMatriz(matriz);
        //imprimirVector(comparador);
        llenarComparador(matriz, comparador);
        System.out.println("El vector comparador es:");
        imprimirVector(comparador);
        verificacion(comparador);
    }

    public static void rellenar(int[][] matriz, int[] comparador) {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int aux;
        //rellenamos la matriz por teclado y con una restriccion
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                do {
                    System.out.println("Ingrese sólo números del 1 al 9");
                    aux = scanner.nextInt();
                } while (aux > 9 || aux < 1);

                matriz[i][j] = aux;
                System.out.println("Número ingresado en la posicion " + i + "," + j);
            }

        }
        //acá se inicializa el comparador
        for (int k = 0; k < 8; k++) {
            comparador[k] = 0;
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        //imprimimos la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.print("\n");
        }

    }

    public static void llenarComparador(int[][] matriz, int[] comparador) {

        //llenamos el vector comparador con la suma de las filas, columnas
        //y diagonales
        int k = 0;

        //filas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                comparador[k] = comparador[k] + matriz[i][j];
            }
            k = k + 1;

        }

        //columnas
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                comparador[k] = comparador[k] + matriz[i][j];

            }
            k = k + 1;
        }

        //diagonales
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    comparador[6] = comparador[6] + matriz[i][j];
                }
                if (i == (2 - j)) {
                    comparador[7] = comparador[7] + matriz[i][j];
                }
            }

        }
    }

    public static void imprimirVector(int[] comparador) {
        //imprimimos el vector comparador para visualizarlo
        System.out.print("|");
        for (int i = 0; i < 8; i++) {
            System.out.print(comparador[i] + "|");
        }
    }

    public static void verificacion(int[] comparador) {

        //verificamos que los valores de los elementos del array sean iguales
        System.out.println("");
        boolean bandera = true;
        int i = 0;

        while (bandera && i < 7) {
            if (comparador[i] != comparador[i + 1]) {
                bandera = false;
            }
            i = i + 1;
        }

        if (bandera == true) {
            System.out.println("El cuadrado es MAGICO");

        } else {
            System.out.println("El cuadrado NO ES MAGICO");
        }

    }

}
