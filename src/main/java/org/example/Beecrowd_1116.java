package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int cont = leitor.nextInt(),i=0;

        do {
            double num = leitor.nextDouble();
            double num2 = leitor.nextDouble();

         double media;


         if (num2 == 0){
             System.out.println("divisao impossivel");
         }else {
             media = num/num2;
             System.out.println(media);
         }

            i++;
            if (i == cont){
                break;
            }
        } while (true);





    }

}


