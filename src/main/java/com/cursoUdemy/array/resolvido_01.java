package com.cursoUdemy.array;

import java.util.Scanner;

public class resolvido_01 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        double[] a = new double[x];

        double soma=0;


        for (int i = 0; i < x; i++) {
            a[i] = leitor.nextDouble();
        }

        for (int i = 0; i < x; i++) {
            soma += a[i];
        }

        for (double ab:a) {
            System.out.print(ab+" ");
        }


        System.out.println("\n"+soma);

        System.out.println(soma/4);


    }
}
