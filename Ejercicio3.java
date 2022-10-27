import java.util.Scanner;

/**
 * Exercise: 3
 *
 * @version: 11/10/2022 08:23
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pesetas;
        System.out.print("Introduce la cantidad de pesetas: ");
        pesetas = sc.nextInt();
        System.out.print(pesetas + " pesetas equivalen a " + String.format("%.2f", (pesetas / 166.386)) + " euros");
        sc.close();
    }
}
