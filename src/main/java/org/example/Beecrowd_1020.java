package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int n,ano,mes,dia,resto;

        n = leitor.nextInt();

        ano = n / 365;
        resto = n % 365;

        mes = resto / 30;
        resto = resto % 30;

        dia = resto / 1;


        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");



    }

}
