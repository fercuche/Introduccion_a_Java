package guia_n5_12;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada es incorrecta, igrese una nota válida:");
            nota = leer.nextInt();
        }

        System.out.println("La nota ingresada es correcta");

    }

}
