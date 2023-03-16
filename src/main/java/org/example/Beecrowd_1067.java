package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1067 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        for(int i = 0; i <= x; i++) {

            if (i % 2 !=0){
                System.out.println(i);
            }

        }



    }

}
