package com.cursoUdemy.array;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);



        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        String[] nome = new String[x];
        double[] altura = new double[x];


        double maior = 0, mediaM = 0, contM=0;

        int cont=0;
        for (int i = 0; i < x; i++) {
            altura[i] = leitor.nextDouble();
            nome[i] = leitor.next();

            if (nome[i].equals("M")){
                cont +=1;
            }
            if (nome[i].equals("F")){
                mediaM += altura[i];
                contM +=1;
            }
        }

        for (int i = 0; i < x; i++) {
            if (altura[i] > maior){
                maior = altura[i];
            }

        }

        double menor = altura[0];
        for (int j = 0; j < x ; j++) {
            if ( altura[j] < menor ){
                menor = altura[j];
            }



        }

        System.out.println("Maior altura = "+maior);
        System.out.println("Menor altura = "+menor);
        System.out.printf("Media das alturas das mulheres =  %.2f%n",mediaM/contM);
        System.out.println("Numero de homens = "+cont);









    }

}
