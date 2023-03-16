package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1157 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i % num == 0){
                System.out.println(i);
            }

        }





    }

}
