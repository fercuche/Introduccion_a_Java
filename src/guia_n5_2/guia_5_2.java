
package guia_n5_2;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_2 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese su nombre");
        
        String nombre;
        
        nombre = leer.nextLine();
        
        
        System.out.println("El nombre ingresado es : "+ nombre);
    }
    
}
