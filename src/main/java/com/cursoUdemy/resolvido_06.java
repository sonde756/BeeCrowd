package com.cursoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        double[] a = new double[x];

        double soma = 0;


        for (int i = 0; i < x; i++) {
            a[i] = leitor.nextDouble();
            soma += a[i];
        }

        System.out.println(soma/x);


        for (double co:
             a) {
            if (co <= 10.0){
                System.out.println(+co);
            }
        }









    }
}
