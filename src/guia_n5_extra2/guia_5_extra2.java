/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores 
 */
package guia_n5_extra2;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_extra2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int A, B, C, D, aux;

        A = 15;
        B = 5;
        C = 25;
        D = 80;

        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println();
        System.out.println("El nuevo valor de A es: " + A);
        System.out.println("El nuevo valor de B es: " + B);
        System.out.println("El nuevo valor de C es: " + C);
        System.out.println("El nuevo valor de D es: " + D);

    }

}
