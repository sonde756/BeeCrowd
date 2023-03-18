package com.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class matriz_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        //1°[LINHA] e 2°[COLUNA]


        int m = leitor.nextInt();
        int n = leitor.nextInt();


        double[][] a = new double[m][n];

        double l1 = 0, l2 = 0;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {

                a[i][j] = leitor.nextDouble();


            }
        }

        double[] vet = new double[m];


        for (int i = 0; i < m; i++) {
            double soma=0;
            for (int j = 0; j < n ; j++) {
                soma += a[i][j];
            }
            vet[i] = soma;
        }


        for (int i = 0; i < m; i++) {
            System.out.printf("%.1f%n", vet[i]);
        }









    }
}
