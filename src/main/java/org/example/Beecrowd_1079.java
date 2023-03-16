package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int cont = leitor.nextInt(),i=0;

        do {
            double media;
            double x = leitor.nextDouble();
            double z = leitor.nextDouble();
            double y = leitor.nextDouble();

            media = ((x*2)+(z*3)+(y*5))/10;


            System.out.printf("%.1f%n",media);

            i++;
            if (i == cont){
                break;
            }
        } while (true);





    }

}
