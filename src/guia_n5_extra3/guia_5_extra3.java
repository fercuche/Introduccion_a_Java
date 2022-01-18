/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
 */
package guia_n5_extra3;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_extra3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una letra");

        String letra = scanner.next();

        letra = letra.toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {

            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada no es una vocal");
        }

    }

}
