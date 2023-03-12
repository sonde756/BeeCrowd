package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();
        double distancia;


        distancia = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y2-y1),2));

        System.out.printf("%.4f%n",distancia);









    }

}
