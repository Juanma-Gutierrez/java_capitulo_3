/**
 * Exercise: 7
 *
 * @version: 11/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
* Escribe un programa que calcule el total de una factura a partir de la base
* imponible.
*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base;
        System.out.print("Introduce la base de la factura: ");
        base = sc.nextFloat();
        System.out.print("Con una base de "
                + String.format("%.2f", base) + " euros y un IVA del 21% ("
                + String.format("%.2f", (base * .21))
                + " euros) hace un total factura de: "
                + String.format("%.2f", (base * 1.21)) + " euros");
        sc.close();
    }
}
