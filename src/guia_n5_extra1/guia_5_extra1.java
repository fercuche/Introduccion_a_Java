/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 */
package guia_n5_extra1;



import java.util.Locale;
import java.util.Scanner;

public class guia_5_extra1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el tiempo en minutos");
        int minutos = scanner.nextInt();

        int dia = minutos/1440;
        int horas = (minutos-dia*1440)/60;

        
        System.out.println("El tiempo ingresado equivale a ---> " + dia + " dias, " + horas + " horas.");

    }

}
