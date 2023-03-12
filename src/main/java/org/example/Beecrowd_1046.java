package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1046 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int inicio, fim, duracao;

            inicio = leitor.nextInt();
            fim = leitor.nextInt();

            if(inicio >= fim){
                duracao= (24+fim)-inicio;
            }
            else {
                duracao = fim - inicio;
            }

        System.out.println("O JOGO DUROU "+duracao+" HORA(S)");


    }

}
