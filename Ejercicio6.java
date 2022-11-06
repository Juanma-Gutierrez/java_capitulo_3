/**
 * Exercise: 6
 *
 * @version: 11/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
* Escribe un programa que calcule el área de un triángulo.
*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Var declarations
        float base;
        float altura;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce base: ");
        base = sc.nextInt();
        System.out.print("Introduce altura: ");
        altura = sc.nextInt();

        // Output data
        System.out.print(
                ("El triángulo de base " + base + " y altura " + altura + " tiene un área de "
                        + String.format("%.2f", (base * altura / 2))));

        // Close scanner
        sc.close();
    }

}
