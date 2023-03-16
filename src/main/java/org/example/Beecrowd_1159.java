package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1159 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int num = leitor.nextInt();
        while (num != 0) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                if (num % 2 == 0) {
                    sum += num;
                }
                num++;
            }
            System.out.println(sum);
            num = leitor.nextInt();
        }




    }
}


