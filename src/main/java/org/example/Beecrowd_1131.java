package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1131 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int inter;
        int gremia;
        int empate = 0, grenais = 0;

        int placar1 = 0, placar2 = 0;

        int cont = 0;

        while (cont != 2) {

            inter = leitor.nextInt();
            gremia = leitor.nextInt();

            if (inter > gremia) {
                placar1 += 1;
            } else if (inter < gremia) {
                placar2 += 1;
            } else {
                empate += 1;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            cont = leitor.nextInt();
            grenais++;

        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter: " + placar1);
        System.out.println("Gremio: " + placar2);
        System.out.println("Empates: " + empate);
        if (placar1 > placar2) {
            System.out.println("Inter venceu mais");
        } else if (placar1 < placar2) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }


    }

}


