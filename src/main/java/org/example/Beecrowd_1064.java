package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        double num,media=0,receba = 0;
        int valores = 0;

        for (int i =0; i < 6; i++){

            num =leitor.nextDouble();

            if(num > 0){
                valores++;
                media += num;
            }


        }
        media = media/valores;

        System.out.println(valores+" valores positivos");
        System.out.printf("%.1f\n",media);




        }
    }


