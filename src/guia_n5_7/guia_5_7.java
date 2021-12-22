package guia_n5_7;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese un número:");

        int numero = leer.nextInt();

        if ((numero % 2) == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

}
