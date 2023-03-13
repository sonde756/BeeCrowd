package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1070 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        int count = 0;

        while (count < 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                count++;
            }
            x++;
        }



        }
    }


