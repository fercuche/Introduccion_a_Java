
package guia_n5_9;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese una frase:");

        String frase = leer.nextLine();

        if (frase.length() == 8) {
            System.out.println("Correcto");

        } else {
            System.out.println("Incorrecto");
        }
    }

}
