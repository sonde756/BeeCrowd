package com.cursoUdemy.array;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int[] idade = new int[x];
        String[] nome = new String[x];
        int maior =0, cont=0;

        for (int i = 0; i < x; i++) {
            nome[i] = leitor.next();
            idade[i] = leitor.nextInt();
        }

        for (int i = 0; i < x; i++) {
            if (idade[i] > maior){
                maior = idade[i];
                cont = i;
            }
        }

        System.out.println("Pessoa mais velha: "+nome[cont]);








    }
}
