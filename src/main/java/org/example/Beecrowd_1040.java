package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        float n1 = leitor.nextFloat();
        float n2 = leitor.nextFloat();
        float n3 = leitor.nextFloat();
        float n4 = leitor.nextFloat();
        float media,exameFinal=0, nFinal=0;


        media = ((n1 * 2.0f)+(n2 * 3.0f)+(n3 * 4.0f)+(n4 * 1.0f))/10;

        if (media >= 7.0){
            System.out.printf("Media: %.1f%n",media);

            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.printf("Media: %.1f%n",media);
            System.out.println("Aluno reprovado.");
        }
        else{
            System.out.printf("Media: %.1f%n",media);
            System.out.println("Aluno em exame.");
            exameFinal = leitor.nextFloat();
            nFinal = (media + exameFinal)/2;
            if (nFinal >= 5.0){
                System.out.printf("Nota do exame: %.1f%n",exameFinal);
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n",nFinal);
            }
            else {
                System.out.printf("Nota do exame: %.1f%n",exameFinal);
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n",nFinal);
            }
        }


    }

}
