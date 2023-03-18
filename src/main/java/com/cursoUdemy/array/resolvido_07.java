package com.cursoUdemy.array;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        double[] a = new double[x];
        double soma=0;
        int cont =0;

        for (int i = 0; i < x; i++) {
            a[i] = leitor.nextDouble();

            if (a[i] % 2==0){
                soma += a[i];
                cont +=1;
            }
        }

        System.out.println(soma/cont);








    }
}
