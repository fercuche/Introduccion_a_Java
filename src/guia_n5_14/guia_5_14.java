package guia_n5_14;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese un número positivo");
        int num1 = leer.nextInt();

        System.out.println("Ingrese otro numero positivo");
        int num2 = leer.nextInt();

        double calc;

        int opcion = 0;

        do {

            System.out.println("---MENU---");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDR");
            System.out.println("5.SALIR");
            System.out.println("Elegir una opcion");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    calc = num1 + num2;
                    System.out.println("La suma es " + calc);
                    break;

                case 2:
                    calc = num1 - num2;
                    System.out.println("la resta es " + calc);
                    break;

                case 3:
                    calc = num1 * num2;
                    System.out.println("La multiplicacion de los números es " + calc);
                    break;

                case 4:
                    calc = num1 / num2;
                    System.out.println("La division de los números es " + calc);
                    break;
            }

        } while (opcion != 5);
    }
}
