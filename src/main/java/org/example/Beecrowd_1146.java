package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1146 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();


        while (x != 0){
            for (int i = 1; i < x; i++) {
                System.out.print(i +" ");
            }
            System.out.println(x);
            x = leitor.nextInt();

        }







    }
}


