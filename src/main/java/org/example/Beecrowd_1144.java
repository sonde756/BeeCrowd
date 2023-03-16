package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1144 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        int inicio = 0;
        for (int i = 1; i <= n ; i++) {

            inicio += 1;
            int segundo = inicio ;
            int terceiro = inicio;

            int test = segundo = inicio * inicio;
            int test2 = terceiro = inicio * segundo;

            System.out.printf("%d %d %d%n", inicio,test,test2);

            System.out.printf("%d %d %d%n", inicio,(segundo+1),(terceiro+1));


        }








    }
}


