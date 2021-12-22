
package guia_n5_8;

import java.util.Locale;
import java.util.Scanner;


public class guia_5_8 {


    public static void main(String[] args) {
    
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase:");
        
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("Correcto");
           
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
