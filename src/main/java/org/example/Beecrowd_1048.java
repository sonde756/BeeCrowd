package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);
        double aumento = 0, reajuste=0;
        String percentual = null;
        double salario = leitor.nextDouble();


        if (salario <= 400 ){
            aumento = salario + (salario*0.15);

            reajuste = aumento - salario;

            percentual = "Em percentual: 15 %";

        }
        else if (salario < 800) {
            aumento = salario + (salario*0.12);
            reajuste = (salario*0.12);
            percentual = "Em percentual: 12 %";
        }
        else if (salario <= 1200) {
            aumento = salario + (salario*0.10);
            reajuste = (salario*0.10);
            percentual = "Em percentual: 10 %";
        }
        else if (salario <= 2000 ) {
            aumento = salario + (salario*0.07);
            reajuste = (salario*0.07);
            percentual = "Em percentual: 7 %";
        }
        else if (salario > 2000 ) {
            aumento = salario + (salario * 0.04);
            reajuste = (salario * 0.04);
            percentual = "Em percentual: 4 %";
        }

        System.out.printf("Novo salario: %.2f%n",aumento);
        System.out.printf("Reajuste ganho: %.2f%n",reajuste);
        System.out.println(percentual);

    }

}
