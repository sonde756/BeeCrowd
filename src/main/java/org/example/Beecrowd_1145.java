package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1145 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int x = leitor.nextInt();
        int y = leitor.nextInt();

        for (int i=1; i<=y; i++) {

            System.out.print(i);

            if (i % x == 0) {
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
        }





    }
}


