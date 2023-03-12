package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1044 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();

        int b = leitor.nextInt();

        if (a % b == 0 || b % a ==0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");








    }

}
