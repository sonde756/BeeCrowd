package org.example;

import java.util.Scanner;

public class Beecrowd_1011 {
    public static void main(String[] args) {



        Scanner leitor = new Scanner(System.in);

        double r, raio;

        r = leitor.nextDouble();

        raio = (4/3.0) * 3.14159 * r * r *r;

        System.out.printf("VOLUME = %.3f%n",raio);




    }

}
