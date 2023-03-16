package com.cursoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        double[] altura = new double[x];
        String[] nome = new String[x];
        int[] idade = new int[x];


        for (int i = 0; i < x; i++) {
            nome[i] = leitor.next();
            idade[i] = leitor.nextInt();
            altura[i] = leitor.nextDouble();
        }


        int cont = 0;
        double mediaAlt = 0;

        for (int i = 0; i < x ; i++) {
            if (idade[i] < 16){
                cont += 1;
            }

            mediaAlt += altura[i];
        }



        //Porcentagem idade
        double c = cont * 100.0 /x;
        System.out.printf("%.2f%n", c);

        System.out.printf("%.2f%n\n",mediaAlt/x);


    }
}
