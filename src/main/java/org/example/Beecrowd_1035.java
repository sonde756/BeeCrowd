package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1035 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();


        if (b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a % 2==0){
            System.out.println("Valores aceitos");

        }
        else{
            System.out.println("Valores nao aceitos");
        }





    }

}
