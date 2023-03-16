package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1072 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int cont = leitor.nextInt(), in = 0, out=0;


        for (int i = 0; i < cont ; i++) {
            int num = leitor.nextInt();

            if(num >= 10 && num <= 20){
                in += 1;
            }else {
                out += 1;
            }

        }

        System.out.println(in+" in");
        System.out.println(out+" out");




    }

}
