/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros la cantidad de euros y la moneda a
convertir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 E
 * 1.28611 $ es un 1 E
 * 129.852 yenes es un 1 E
 */
package guia_n5_19;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese la cantidad de euros y la moneda a la que desea convertirlos:");

        float euros = scanner.nextFloat();

        String moneda = scanner.next();

        conversor(euros, moneda);

    }

    public static void conversor(float euros, String moneda) {

        double resultado = 0;

        switch (moneda) {
            case "libras":
                resultado = euros * 0.86;
                break;
            case "dolares":
                resultado = euros * 1.28611;
                break;
            case "yenes":
                resultado = euros * 129.852;
                break;

        }
        System.out.println(euros + " euros convertidos a " + moneda + " son " + resultado);

    }

}
