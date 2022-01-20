package guia_n5_4;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese los grados centígrados");

        double gradosC = leer.nextDouble();

        double fahrenheit = 32 + (9 * gradosC / 5);

        System.out.println("El equivalente en grados Fahrenheit (°F) de " + gradosC + "°C es " + fahrenheit + "°F");

    }

}
