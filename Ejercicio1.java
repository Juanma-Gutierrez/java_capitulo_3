/**
 * Exercise: 1
 *
 * @version: 10/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
* Realiza un programa que pida dos números y que luego muestre el resultado de
* su multiplicación.
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();
        System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
        sc.close();
    }
}
