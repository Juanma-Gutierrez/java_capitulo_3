import java.util.Scanner;

/**
 * Exercise: 11
 * 
 * @version: 11/10/2022 11:00
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.print("Intoduce la cantidad en Kb: ");
        num = sc.nextInt();
        System.out
                .print(String.format("%.0f", (num)) + " Kb equivalen a " + String.format("%.2f", (num / 1024)) + " Mb");
        sc.close();

    }

}
