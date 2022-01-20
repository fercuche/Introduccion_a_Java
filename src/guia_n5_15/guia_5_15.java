/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia_n5_15;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US); //creamos un nuevo scanner

        int acumulador = 0; //inicializamos el acumulador

        int numero; //creamos la variable numero

        for (int i = 0; i < 20; i++) {//for que recorra 20 entradas con paso 1 iniciando en 0
            System.out.println("Ingrese el valor " + (i+1));

            numero = scanner.nextInt(); //acá ingresamos los números a sumar

            if (numero > 0) { //condicion para que no sume números negativos
                acumulador = acumulador + numero; //se suman los números ingresados
            } else if (numero == 0) {//un if para que si el número ingresado es 0, se termine el programa

                System.out.println("Se capturó el número 0");//imprime por pantalla que capturó el cero

                break; //se corta la ejecución del for
            }

        }
        System.out.println("La suma de los números ingresados es " + acumulador); // se imprime por pantalla la suma

    }
}
