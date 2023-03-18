package com.matrizes;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //1°[LINHA] e 2°[COLUNA]

        int m = leitor.nextInt();
        int n = leitor.nextInt();

        int[][] a = new int[m][n];


        for (int i = 0; i <m ; i++) {

            for (int j = 0; j < n ; j++) {

                a[i][j] = leitor.nextInt();
            }
        }


        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }  






    }
}
