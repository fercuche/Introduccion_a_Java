package guia_n5_13;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese un valor límite");

        int limite = leer.nextInt();
        int valor = 0;
        int incremento;
        while (valor <= limite) {
            System.out.println("Ingrese un valor");
            incremento = leer.nextInt();
            valor += incremento;
        }
        System.out.println("La suma de los valores ingresados es mayor al valor límite");
    }

}
