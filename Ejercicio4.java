import java.util.Scanner;

/**
 * Exercise: 4
 *
 * @version: 11/10/2022 08:29
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduce número 1: ");
        num1 = sc.nextInt();
        System.out.print("Introduce número 2: ");
        num2 = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        if (num2 != 0)
            System.out.println(num1 + " / " + num2 + " = " + ((float) num1 / (float) num2));
        else
            System.out.println("No se puede dividir entre 0");
        sc.close();
    }
}
