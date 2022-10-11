import java.util.Scanner;

/**
 * Exercise: 10
 * 
 * @version: 11/10/2022 10:47
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce la cantidad en Mb: ");
        num = sc.nextInt();
        System.out.print(num + " Mb equivalen a " + (num * 1024) + " Kb");
        sc.close();

    }

}
