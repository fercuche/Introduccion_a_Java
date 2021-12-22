
package guia_n5_10;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese una frase:");

        String frase = leer.nextLine();

        if (frase.substring(0, 1).equals("A")) {
            System.out.println("Correcto");

        } else {
            System.out.println("Incorrecto");
        }
    }

}
