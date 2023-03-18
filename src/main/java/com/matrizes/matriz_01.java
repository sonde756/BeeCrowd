package com.matrizes;

import java.util.Scanner;

public class matriz_01 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //1°[LINHA] e 2°[COLUNA]


        int n = leitor.nextInt();

        int[][] a = new int[n][n];

        int neg = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {

                a[i][j] = leitor.nextInt();

                if (a[i][j] < 0){
                    neg +=1;
                }

            }
        }


        System.out.println("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][i] + " ");
        }





        System.out.println("\nQUANTIDADE DE NEGATIVOS: "+neg);






    }
}
