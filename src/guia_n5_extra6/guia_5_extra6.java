/*
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package guia_n5_extra6;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_extra6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        double contGral = 0;
        double contMin = 0;
        int cont = 0;
        System.out.println("Indique el número de personas que se van a ingresar");

        int N = scanner.nextInt();

        for (int i = 0; i < N - 1; i++) {
            System.out.println("Ingrese la altura de la persona "+(i+1));
            double altura = scanner.nextDouble();
            contGral = contGral + altura;
            if (altura < 1.60) {
                contMin = contMin + altura;
                cont = cont + 1;

            }
        }
        
        double promedioGral = contGral/N;
        
        double promedioMin = contMin/cont;
        
        System.out.println("La altura promedio de las "+N+ " personas ingresadas es de "+promedioGral+ " metros.");
        System.out.println("La altura promedio de las "+cont+ " personas ingresadas por debajo de 1.60 metros es de "+promedioMin+" metros.");

    }

}
