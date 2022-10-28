/**
 * Exercise: 8
 *
 * @version: 11/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
* Escribe un programa que calcule el salario semanal de un empleado en base a
* las horas trabajadas, a razón de 12 euros la hora.
*/

import java.util.Scanner;

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
