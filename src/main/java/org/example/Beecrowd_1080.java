package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1080 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int maior = leitor.nextInt();
        int posi = 1;

        for (int i = 2; i <= 100 ; i++) {
            int x = leitor.nextInt();

            if(x > maior){
                maior = x;
                posi = i;
            }


        }

        System.out.println(maior);
        System.out.println(posi);






    }
}


