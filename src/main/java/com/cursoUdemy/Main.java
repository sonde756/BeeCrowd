package com.cursoUdemy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);



        int a = leitor.nextInt();

        int count  = 0;
        double conta = 0, media;


        while (a > 0){

            count++;
            conta += a;

            a = leitor.nextInt();
        }

        media = conta/count;

        System.out.println(media);




    }
}
