package guia_n5_6;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el primer número");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int numero2 = leer.nextInt();

        if (numero1 < numero2) {
            System.out.println("El mayor número es " + numero2);
        } else if (numero1 > numero2) {
            System.out.println("El mayor número es " + numero1);
        } else {
            System.out.println("Los números son iguales");
        }
    }

}
