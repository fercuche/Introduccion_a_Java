/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia_n5_22;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el tamaño del vector:");

        int N = scanner.nextInt();

        int[] vector = new int[N];

        rellenar(N, vector);
        mostrarVector(N, vector);
        contarDigitos(N, vector);

    }

    public static void rellenar(int N, int[] aleatorio) {

        for (int i = 0; i < N; i++) {

            aleatorio[i] = (int) (Math.random() * 999);
        }
    }

    public static void mostrarVector(int N, int[] aleatorio) {
        System.out.print("[ ");

        for (int i = 0; i < N; i++) {

            System.out.print(aleatorio[i] + " ");
        }
        System.out.print("]\n");

    }

    public static void contarDigitos(int N, int[] vector) {

        int digitos;

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        for (int i = 0; i < N; i++) {

            digitos = String.valueOf(vector[i]).length();
            switch (digitos) {

                case (1):
                    contador1++;
                    break;
                case (2):
                    contador2++;
                    break;
                case (3):
                    contador3++;
                    break;
                case (4):
                    contador4++;
                    break;
                case (5):
                    contador5++;
                    break;
            }

        }
        System.out.println("La cantidad de números de 1 dígito es de: " + contador1);
        System.out.println("La cantidad de números de 2 dígito es de: " + contador2);
        System.out.println("La cantidad de números de 3 dígito es de: " + contador3);
        System.out.println("La cantidad de números de 4 dígito es de: " + contador4);
        System.out.println("La cantidad de números de 5 dígito es de: " + contador5);
    }

}