package com.cursoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        double[] a = new double[x];
        double maior = 0, menor = 0;

        for (int i = 0; i < x; i++) {
            a[i] = leitor.nextDouble();

            for (int j = 0; j < x ; j++) {
                if (a[i] > maior) {
                    maior = a[i];
                    menor = i;
                }

            }

        }

        System.out.println(maior);
        System.out.println(menor);


    }
}
