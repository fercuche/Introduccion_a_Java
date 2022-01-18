/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package guia_n5_extra4;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_extra4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese un número entre 1 y 10");
        int numero = scanner.nextInt();

        while (numero > 10 || numero < 1) {
            System.out.println("Incorrecto.Ingrese un número entre 1 y 10");
            numero = scanner.nextInt();
        }

        switch (numero) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }
    }

}
