package com.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class matriz_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        //1°[LINHA] e 2°[COLUNA]

        int n = leitor.nextInt();


        double[][] a = new double[n][n];


        double soma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = leitor.nextDouble();

                if (a[i][j] > 0) {
                    soma += a[i][j];
                }

            }
        }

        System.out.print("SOMA DOS POSITIVOS: " + soma + "\n");
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][i] + " ");
        }

        //1°[LINHA] e 2°[COLUNA]

        int linha = leitor.nextInt();
        int coluna = leitor.nextInt();


        System.out.print("\nCOLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][coluna] + " ");
        }

        System.out.print("\nLINHA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[linha][i] + " ");
        }

        System.out.println("\nMATRIZ ALTERADA: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] < 0) {
                    a[i][j] = Math.pow(a[i][j], 2);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
