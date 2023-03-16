package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();

        int count  = 0;
        double conta = 0, media;


        while (a > 0){

            count++;
            conta += a;

            a = leitor.nextInt();
        }

        media = conta/count;

        System.out.printf("%.2f%n",media);



    }
}


