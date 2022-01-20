package guia_n5_11;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int motor = leer.nextInt();

        switch (motor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;

            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
                break;
        }

        /*if (motor == 1){
            System.out.println("La bomba es una bomba de agua");
        }
        else if (motor == 2) {
            System.out.println("La bomba es una bomba de gasolina");
        }
        else if (motor == 3){
            System.out.println("La bomba es una bomba de hormigón");
        }      
        else if (motor == 4){
            System.out.println("La bomba es una bomba de pasta alimenticia");
        }
        else{
            System.out.println("No existe un valor válido para tipo de bomba");
        }*/
    }
}
