import java.util.Scanner;

/**
 * Exercise: 9
 *
 * @version: 11/10/2022 09:12
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
 * 1/3 πr²h
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        double altura;
        System.out.print("Introduce el radio del cono: ");
        radio = sc.nextFloat();
        System.out.print("Introduce la altura del cono: ");
        altura = sc.nextFloat();
        double res = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volúmen del cono es de " + String.format("%.8f", res));
        sc.close();
    }
}
