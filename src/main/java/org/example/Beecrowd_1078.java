package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1078 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();
        for (int i=0; i<11;i++){

            System.out.println(i+" x "+num+" = "+(i*num));
        }

    }

}
