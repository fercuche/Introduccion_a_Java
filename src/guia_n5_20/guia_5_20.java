/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.
 */
package guia_n5_20;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int[] vector = new int[100];

        rellenarVector(vector);

        mostrarVector(vector);

    }

    public static void rellenarVector(int[] vector) {

        for (int i = 0; i < 100; i++) {
            
            vector[i] += i;
        }

    }

    public static void mostrarVector(int[] vector) {
        
        for (int i=0; i<100; i++ ){
            
            System.out.println(vector[i]);
        }

    }

}
