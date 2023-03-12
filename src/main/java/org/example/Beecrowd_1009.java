package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        String nome;
        double salario,vendas,total;

        nome = leitor.next();
        salario = leitor.nextDouble();
        vendas = leitor.nextDouble();

        total = salario + (vendas * 0.15);


        System.out.printf("TOTAL = R$ %.2f%n",total);

    }
}
