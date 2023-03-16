package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1142 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        int inicio = 1;
        for (int i = 1; i <= n ; i++) {

            int segundo = inicio + 1;
            int terceiro = inicio + 2;

            System.out.printf("%d %d %d PUM%n", inicio,segundo,terceiro);

            inicio += 4;
        }








    }
}


