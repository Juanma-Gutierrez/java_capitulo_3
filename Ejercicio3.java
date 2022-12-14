/**
 * Exercise: 3
 *
 * @version: 11/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
* convertir debe ser introducida por teclado.
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Var declarations
        int pesetas;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la cantidad de pesetas: ");
        pesetas = sc.nextInt();

        // Output data
        System.out.print(pesetas + " pesetas equivalen a " + String.format("%.2f", (pesetas / 166.386)) + " euros");

        // Close scanner
        sc.close();
    }
}
