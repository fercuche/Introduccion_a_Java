
package guia_n5_3;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        String frase;

        System.out.println("Ingrese una frase:");

        frase = leer.nextLine();

        frase = frase.toUpperCase();
        System.out.println("La frase ingresada pasada a mayusculas es:" + frase);

        frase = frase.toLowerCase();
     
        System.out.println("La frase ingresada pasada a minusculas es:" + frase);
    }

}