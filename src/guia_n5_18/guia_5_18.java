/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:

5 *****
3 ***
11 ***********
2 **
 */
package guia_n5_18;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese 4 números de entre 1 y 20");

        int num1, num2, num3, num4;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        
        if (num1>0 && num1<21){
            System.out.print(num1+" ");
            for (int i=0; i<num1; i++){
                System.out.print("*");
            }
        }else{
            System.out.print("El número ingresado no es válido");
        }
        System.out.println();
        
        if (num2>0 && num2<21){
            System.out.print(num2+" ");
            for (int i=0; i<num2; i++){
                System.out.print("*");
            }
        }else{
            System.out.print("El número ingresado no es válido");
        }
        System.out.println();
        if (num3>0 && num3<21){
            System.out.print(num3 + " ");
            for (int i=0; i<num3; i++){
                System.out.print("*");
            }
        }else{
            System.out.print("El número ingresado no es válido");
        }
        System.out.println();
        if (num4>0 && num4<21){
            System.out.print(num4 + " ");
            for (int i=0; i<num4; i++){
                System.out.print("*");
            }
        }else{
            System.out.println("El número ingresado no es válido");
        }
        System.out.println();
    }
}
