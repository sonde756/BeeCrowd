package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1071 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int y = leitor.nextInt();
        int min,max;

        if(x < y){
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }
        int soma=0;
        for (int i = min+1; i < max ; i++) {
                if (i % 2 !=0){
                    soma += i;
                }
        }

        System.out.println(soma);



    }

}
