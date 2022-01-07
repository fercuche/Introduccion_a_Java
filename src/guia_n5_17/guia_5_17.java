/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
****
*  *
*  *
****
 */
package guia_n5_17;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int N;

        System.out.println("Indique el tamaño del cuadrado");

        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.print("*");
        }
        System.out.println("");

        for (int i = 0; i < N - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < N - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < N; i++) {

            System.out.print("*");
        }
        System.out.println("");

    }
}
