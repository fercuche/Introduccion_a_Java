/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia_n5_16;

import java.util.Locale;
import java.util.Scanner;

public class guia_5_16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int correctas = 0;

        int incorrectas = -1;

        String frase = "";

        System.out.println("Ingrese una frase de 5 caracteres de largo");
        System.out.println("El 1er caracter debe ser un X");
        System.out.println("El último debe ser una O");

        do {

            frase = scanner.nextLine();

            if (frase.length() == 5 && "X".equals(frase.substring(0, 1)) && "O".equals(frase.substring(4, 5))) {
                correctas = correctas + 1;
            } else {
                incorrectas = incorrectas + 1;
            }

        } while (!frase.equals("&&&&&"));

        System.out.println("Las frases ingresadas correctamente son " + correctas);
        System.out.println("Las frases ingresadas incorrectamente son " + incorrectas);

    }

}
