/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido.
 */
package guia_n5_21;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el tamaño del vector:");

        int N = scanner.nextInt();

        int[] aleatorio = new int[N];

        rellenar(N, aleatorio);

        System.out.println("Ingrese el numero a buscar:");

        int numero = scanner.nextInt();

        mostrarVector(N, aleatorio);

        buscar(N, aleatorio, numero);

    }

    public static void rellenar(int N, int[] aleatorio) {

        for (int i = 0; i < N; i++) {

            aleatorio[i] = (int) (Math.random() * 10);

        }
    }

    public static void mostrarVector(int N, int[] aleatorio) {
        System.out.print("[ ");

        for (int i = 0; i < N; i++) {

            System.out.print(aleatorio[i] + " ");

        }
        System.out.print("]\n");

    }

    public static void buscar(int N, int[] aleatorio, int numero) {

        int contador = 0;

        for (int i = 0; i < N; i++) {

            if (numero == aleatorio[i]) {
                contador = contador + 1;
                System.out.println("El numero " + numero + " se encuentra en la posición " + i);

            }

        }

        if (contador == 0) {
            System.out.println("El número no se encuentra en el arreglo");
        } else {
            System.out.println("El número " + numero + " aparece " + contador + " veces en el vector");
        }
    }

}
