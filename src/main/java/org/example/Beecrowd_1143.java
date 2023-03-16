package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1143 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        int inicio = 1;
        for (int i = 1; i <= n ; i++) {

            int segundo = inicio * inicio;
            int terceiro = inicio * segundo;

            System.out.printf("%d %d %d%n", inicio,segundo,terceiro);

            inicio += 1;
        }








    }
}


