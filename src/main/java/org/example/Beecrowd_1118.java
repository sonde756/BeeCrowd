package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int novoCalculo = 1;

        while (novoCalculo == 1) {
            double nota1 = leitor.nextDouble();
            while (nota1 < 0.0 || nota1 > 10.0) {
                System.out.println("nota invalida");
                nota1 = leitor.nextDouble();
            }

            double nota2 = leitor.nextDouble();
            while (nota2 < 0.0 || nota2 > 10.0) {
                System.out.println("nota invalida");
                nota2 = leitor.nextDouble();
            }

            double media = (nota1 + nota2) / 2.0;
            System.out.printf("media = %.2f%n", media);

            System.out.println("novo calculo (1-sim 2-nao)");
            novoCalculo = leitor.nextInt();
            while (novoCalculo != 1 && novoCalculo != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = leitor.nextInt();
            }
        }


    }

}


