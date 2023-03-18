package com.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class matriz_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        //1°[LINHA] e 2°[COLUNA]

        int n = leitor.nextInt();
        int m = leitor.nextInt();


        int[][] a = new int[n][m];
        int[][] b = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = leitor.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = leitor.nextInt();
            }
        }

        int[][] vet = new int[n][m];
        for (int i = 0; i <n; i++) {

            for (int j = 0; j < m; j++) {
                vet[i][j] = (a[i][j] + b[i][j]);
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(vet[i][j]+" ");
            }
            System.out.println();
        }

    }
}
