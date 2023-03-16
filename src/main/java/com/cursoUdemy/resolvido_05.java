package com.cursoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int[] a = new int[x];
        int[] b = new int[x];
        int[] c = new int[x];


        for (int i = 0; i < x; i++) {
            a[i] = leitor.nextInt();
        }

        for (int i = 0; i < x; i++) {
            b[i] = leitor.nextInt();
        }

        for (int i = 0; i < x; i++) {
          c[i]  = a[i]+b[i];
        }


        for (int i = 0; i < x ; i++) {
            System.out.print(c[i]+" ");
        }







    }
}
