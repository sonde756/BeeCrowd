package com.cursoUdemy.array;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        double[] a = new double[x];


        for (int i = 0; i < x; i++) {
            a[i] = leitor.nextDouble();
        }

        for (int i = 0; i < x ; i++) {

            if (a[i] < 0){
                System.out.println(a[i]);            }
        }



    }
}
