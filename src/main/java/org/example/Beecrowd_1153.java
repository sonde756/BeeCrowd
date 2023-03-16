package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1153 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt(),resultado=1;

        for (int i = 1; i <= num; i++) {

            resultado = resultado * i;

        }

        System.out.println(resultado);



    }

}
