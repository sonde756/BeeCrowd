package com.cursoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        String[] nome = new String[x];
        double[] nota1 = new double[x];
        double[] nota2 = new double[x];

        int cont=0;

        for (int i = 0; i < x; i++) {
            nome[i] = leitor.next();
            nota1[i] = leitor.nextDouble();
            nota2[i] = leitor.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < x; i++) {
            if ((nota1[i]+nota2[i])/2 >= 6){
                System.out.println(nome[i]);
            }
        }









    }
}
