package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int n,hora,minutos,segundos,resto;


        n = leitor.nextInt();

        hora = n / 3600;
        resto = n % 3600;

        minutos = resto / 60;

        segundos = resto % 60;


        System.out.println(hora+":"+minutos+":"+segundos);



    }

}
