/*
 Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3
 */
package guia_n5_extra9;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_extra9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el dividendo");
        int dividendo = scanner.nextInt();
        System.out.println("Ingrese el divisor");
        int divisor = scanner.nextInt();
        int residuo = dividendo - divisor;
        int contador = 1;

        while (divisor < residuo && residuo > 0) {
            residuo = residuo - divisor;
            contador = contador + 1;

        }
        System.out.println("El residuo de la division es: " + residuo);
        System.out.println("El cociente de la division es: " + contador);

    }

}
