import java.util.Scanner;

/**
 * Exercise: 12
 *
 * @version: 11/10/2022 11:05
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay que
 * tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo
 * examen un 60%.
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double notaFinal;
        String res;
        System.out.print("Introduce la nota del primer examen: ");
        nota1 = sc.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        notaFinal = sc.nextDouble();
        res = String.format("%.2f", ((notaFinal - (nota1 * 0.4)) / 0.6));
        System.out.println(
                "Para tener un " + notaFinal + " en el trimestre, necesitas sacar un " + res + " en el segundo examen");

        sc.close();
    }

}
