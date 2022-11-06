/**
 * Exercise: 11
 *
 * @version: 11/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
* Realiza un conversor de Kb a Mb.
*/

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Var declarations
        double num;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la cantidad en Kb: ");
        num = sc.nextDouble();

        // Output results
        System.out
                .print(String.format("%.0f", (num)) + " Kb equivalen a " + String.format("%.2f", (num / 1024)) + " Mb");

        // Close scanner
        sc.close();

    }

}
