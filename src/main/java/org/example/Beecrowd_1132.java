package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1132 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int y = leitor.nextInt();

        int menor = x;
        int maior = y;

        if (x > y) {
            menor = y;
            maior = x;
        }

        int soma = 0;
        for (int i=menor; i<=maior; i++) {
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);

    }
}


