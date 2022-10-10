import java.util.Scanner;

/**
 * Exercise: 2
 * 
 * @version: 10/10/2022 10:10
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float euros;
        System.out.println("Introduce la cantidad de euros:");
        euros = sc.nextFloat();
        System.out.println(euros + " euros equivalen a " + (int)(euros * 166.386) + " pesetas");
        sc.close();
    }
}
