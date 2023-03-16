package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1134 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int gaso = 0, alcool = 0, diesel = 0;

        int x = leitor.nextInt();

        while (x != 4){

            if (x == 1){
                alcool++;
            } else if (x == 2) {
                gaso++;
            }
            else if(x == 3){
                diesel++;
            }
            x = leitor.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gaso);
        System.out.println("Diesel: "+diesel);


    }
}


