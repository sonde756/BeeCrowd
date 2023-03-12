package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        float a = leitor.nextFloat();
        float b = leitor.nextFloat();
        float c = leitor.nextFloat();


        System.out.printf("TRIANGULO: %.3f%n", a*c/2);
        System.out.printf("CIRCULO: %.3f%n", (3.14159 * c*c));
        System.out.printf("TRAPEZIO: %.3f%n", ((a+b)/2)*c);
        System.out.printf("QUADRADO: %.3f%n", (b*b));
        System.out.printf("RETANGULO: %.3f%n", (a*b));




    }

}
