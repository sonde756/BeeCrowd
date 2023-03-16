package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1113 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int x = leitor.nextInt();
        int y = leitor.nextInt();

        while (x != y){

            if (x > y){
                System.out.println("Descrecente");
            }
            else {
                System.out.println("Crescente");
            }
             x = leitor.nextInt();
             y = leitor.nextInt();
        }




    }
}


