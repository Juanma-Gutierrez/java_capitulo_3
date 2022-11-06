/**
 * Exercise: 5
 *
 * @version: 11/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que calcule el área de un rectángulo.
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Var declarations
        int base;
        int altura;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce base: ");
        base = sc.nextInt();
        System.out.print("Introduce altura: ");
        altura = sc.nextInt();

        // Output results
        System.out.print(
                ("El rectángulo de base " + base + " y altura " + altura + " tiene un área de " + (base * altura)));

        // Close scanner
        sc.close();
    }

}
