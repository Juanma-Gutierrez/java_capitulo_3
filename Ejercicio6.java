import java.util.Scanner;

/**
 * Exercise: 6
 *
 * @version: 11/10/2022 08:35
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que calcule el área de un triángulo.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base;
        float altura;
        System.out.print("Introduce base: ");
        base = sc.nextInt();
        System.out.print("Introduce altura: ");
        altura = sc.nextInt();
        System.out.print(
                ("El triángulo de base " + base + " y altura " + altura + " tiene un área de "
                        + String.format("%.2f", (base * altura / 2))));
        sc.close();
    }

}
