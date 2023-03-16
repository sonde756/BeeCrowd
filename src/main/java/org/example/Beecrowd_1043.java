package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();


        if(A < B + C && B < A + C && C < A + B){
            double peri = A + B + C;
            System.out.println("Perimetro = "+peri);

        }
        else{
            double area= (A +B)* C / 2;
            System.out.println("Area = "+area);
        }


    }

}
