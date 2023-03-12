package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int maior,maior2;



        maior2 = (a+b+Math.abs(a-b))/2;
        maior = (maior2 + c + Math.abs(maior2 - c))/2;

        System.out.println(maior+" eh o maior");









    }

}
