package com.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class matriz_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        //1°[LINHA] e 2°[COLUNA]

        int n = leitor.nextInt();


        int[][] a = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = leitor.nextInt();
            }
        }

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            int maior = a[i][0];
            for (int j = 0; j < n; j++) {
                if (a[i][j] > maior) {
                    maior = a[i][j];
                }
            }
            System.out.println(maior);
        }


    }
}
