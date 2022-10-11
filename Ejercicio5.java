import java.util.Scanner;

/**
 * Exercise: 5
 * 
 * @version: 11/10/2022 08:35
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int altura;
        System.out.println("Introduce base: ");
        base = sc.nextInt();
        System.out.println("Introduce altura: ");
        altura = sc.nextInt();
        System.out.println(
                ("El rectángulo de base " + base + " y altura " + altura + " tiene un área de " + (base * altura)));
        sc.close();
    }

}
