package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int lanhce = leitor.nextInt();
        int quantidade = leitor.nextInt();
        double total = 0;



        switch (lanhce){

            case 1: total = 4.00;
                break;

            case 2: total = 4.50;
                break;

            case 3: total = 5.00;
                break;

            case 4: total = 2.00;
                break;

            case 5: total = 1.50;
                break;
        }


        System.out.printf("Total: R$ %.2f%n",total*quantidade);
    }

}
