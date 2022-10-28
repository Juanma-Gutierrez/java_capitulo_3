/**
 * Exercise: 2
 *
 * @version: 10/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
* convertir debe ser introducida por teclado.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float euros;
        System.out.print("Introduce la cantidad de euros: ");
        euros = sc.nextFloat();
        System.out.print(euros + " euros equivalen a " + (int) (euros * 166.386) + " pesetas");
        sc.close();
    }
}
