/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia_n5_extra7;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_extra7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Indique la cantidad de números a ingresar:");

        int n = scanner.nextInt();
        int i = 0;

        int valor;

        int maximo = 0;

        int minimo = 999999999;
        int acumulador = 0;

        while (i < n) {
            System.out.println("Ingrese un número:");
            valor = scanner.nextInt();
            acumulador = acumulador + valor;
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }
            i = i + 1;
        }
        System.out.println("El valor mínimo ingresado es: " + minimo);
        System.out.println("El valor máximo ingresado es: " + maximo);
        System.out.println("El promedio de números ingresados es " + acumulador / n);
        
        int j=0;
        int valor1=0;

        int maximo1 = 0;

        int minimo1 = 999999999;
        int acumulador1 = 0;
        
        do{
            System.out.println("Ingrese un número:");
            valor = scanner.nextInt();
            acumulador1 = acumulador1 + valor1;
            if (valor1 > maximo1) {
                maximo1 = valor1;
            }
            if (valor1 < minimo1) {
                minimo1 = valor1;
            }
            j = j + 1;
            
        }while (j<n);
        
        System.out.println("El valor mínimo ingresado es: " + minimo);
        System.out.println("El valor máximo ingresado es: " + maximo);
        System.out.println("El promedio de números ingresados es " + acumulador / n);
    }

}
