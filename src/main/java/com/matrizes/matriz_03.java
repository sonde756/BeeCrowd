package com.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class matriz_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        //1°[LINHA] e 2°[COLUNA]


        int m = leitor.nextInt();
        int n = leitor.nextInt();


        double[][] a = new double[m][n];


        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                a[i][j] = leitor.nextDouble();
            }
        }


        System.out.println("VALORES NEGATIVOS");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] < 0){
                    System.out.println(a[i][j]);
                }
            }
        }









    }
}
