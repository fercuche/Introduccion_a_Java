/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
 */
package guia_n5_extra5;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_extra5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese la categoria del socio");
        System.out.println("1)A\n2)B\n3)C");
        String socio = scanner.next();
        System.out.println("Ingrese el importe del tratamiento ($):");
        int importe = scanner.nextInt();
        socio = socio.toUpperCase();

        switch (socio) {
            case "A":
                System.out.println("El costo del tratamiento es de $" + importe * 0.5);
                break;
            case "B":
                System.out.println("El costo del tratamiento es de $" + importe * (1-0.35));
                break;
            case "C":
                System.out.println("El costo del tratamiento es de $" + importe);
                break;

        }

    }

}
