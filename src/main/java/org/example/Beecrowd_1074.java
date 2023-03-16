package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1074 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int cont = leitor.nextInt();


        for (int i = 0; i < cont ; i++) {
            int x = leitor.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            }
            else if (x % 2 == 0 && x < 0) {
                System.out.println("EVEN NEGATIVE");
            }
            else if (x % 2 == 0 && x > 0) {
                System.out.println("EVEN POSITIVE");
            }
            else if (x % 2 != 0 && x > 0) {
                System.out.println("ODD POSITIVE");
            }
            else {
                System.out.println("ODD NEGATIVE");
            }

        }





    }

}
