import java.util.Scanner;

/**
 * Exercise: 8
 * 
 * @version: 11/10/2022 08:55
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float horas;
        System.out.print("Introduce las horas trabajadas: ");
        horas = sc.nextFloat();
        System.out.println(
                "El salario para " + horas + " horas trabajadas sería de " + String.format("%.2f", horas * 12)
                        + " euros");
        sc.close();
    }
}
