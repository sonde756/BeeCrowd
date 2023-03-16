package com.cursoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int[] a = new int[x];
        int pares = 0, quant = 0;


        for (int i = 0; i < x; i++) {
            a[i] = leitor.nextInt();
            }


        for (int i = 0; i < x ; i++) {
            if (a[i] % 2==0){
                System.out.print(a[i]+" ");
                quant += 1;
            }
        }
        System.out.println("\n"+quant);


    }
}
