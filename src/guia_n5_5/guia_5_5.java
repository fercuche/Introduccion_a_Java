
package guia_n5_5;

import java.util.Locale;
import java.util.Scanner;


public class guia_5_5 {

    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un número entero");
        
        int numero;
        
        numero = leer.nextInt();
        
        System.out.println("El doble de "+ numero + " es --> " + (numero*2));
        System.out.println("El triple de "+ numero + " es --> " + (numero*3));
        System.out.println("La raíz cuadrada de "+ numero + " es --> " + Math.sqrt(numero));

    }
    
}
