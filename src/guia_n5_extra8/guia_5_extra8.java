/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 */
package guia_n5_extra8;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_extra8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int contador = 0;
        int pares = 0;
        int impares = 0;
        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        while (numero % 5 != 0) {
            if (numero > 0) {
                contador = contador + 1;
                if (numero % 2 == 0) {
                    pares = pares + 1;

                } else {
                    impares = impares + 1;
                }

            }
            numero = scanner.nextInt();
        }
        System.out.println("La cantidad de números ingresados es: " + contador);
        System.out.println("La cantidad de números pares ingresados es: " + pares);
        System.out.println("La cantidad de números impares ingresados es: " + impares);

    }

}
