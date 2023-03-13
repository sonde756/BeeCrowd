package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1045ERRO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        float a = leitor.nextFloat();
        float b = leitor.nextFloat();
        float c = leitor.nextFloat();

        if (a >= b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }

        if (Math.pow(a,2) >= (Math.pow(b,2) + Math.pow(c,2))){
            System.out.println("TRIANGULO RETANGULO");
        }


    }

}
