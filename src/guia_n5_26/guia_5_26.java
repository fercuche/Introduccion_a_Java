/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P
 */
package guia_n5_26;

public class guia_5_26 {

    public static void main(String[] args) {
        
        

        int[][] matriz = {
            {55, 35, 89, 4, 1, 5, 9, 8, 78, 4},
            {74, 89, 7, 2, 36, 21, 45, 69, 87, 14},
            {7, 8, 9, 6, 5, 2, 1, 4, 7, 8},
            {4, 45, 6, 9, 87, 9, 6, 17, 8, 90},
            {87, 9, 63, 5, 4, 78, 2, 14, 4, 69},
            {4, 45, 5, 6, 9, 8, 7, 9, 8, 78},
            {45, 54, 57, 8, 98, 5, 17, 85, 78, 32},
            {4, 74, 5, 85, 69, 20, 36, 47, 85, 2},
            {89, 32, 12, 45, 78, 96, 32, 7, 8, 98},
            {8, 58, 6, 98, 2, 7, 85, 96, 25, 4}
        };

        int[][] matrizP = {
            {8, 78, 4},
            {69, 87, 14},
            {4, 7, 8}
        };
        
    }

}
