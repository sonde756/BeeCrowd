package com.cursoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class resolvido_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        String[] nome = new String[x];
        double[] compra = new double[x];
        double[] venda = new double[x];


//     double porcentagemCoelhos = (double) coelhos / total * 100.0;

        double maior = 0, mediaM = 0, contM=0;

        int cont=0;
        for (int i = 0; i < x; i++) {

            nome[i] = leitor.next();
            compra[i] = leitor.nextDouble();
            venda[i] = leitor.nextDouble();
        }


        int contAbaixoDe10 = 0;
        int contEntre10E20 = 0;
        int contAcimaDe20 = 0;
        for (int i = 0; i < x; i++) {

            double lucro = venda[i] - compra[i];

            double porcentagemDeLucro = lucro / compra[i] * 100.0;

            if (porcentagemDeLucro < 10.0) {
                contAbaixoDe10++;
            }
            else if (porcentagemDeLucro <= 20.0) {
                contEntre10E20++;
            }
            else {
                contAcimaDe20++;
            }
        }


        System.out.println("Lucro abaixo de 10%: " + contAbaixoDe10);
        System.out.println("Lucro entre 10% e 20%: " + contEntre10E20);
        System.out.println("Lucro acima de 20%: " + contAcimaDe20);



        // 2: vamos achar os totais
        double totalCompra = 0.0;
        double totalVenda = 0.0;

        for (int i=0; i<x; i++) {
            totalCompra = totalCompra + compra[i];
            totalVenda = totalVenda + venda[i];
        }

        double totalLucro = totalVenda - totalCompra;

        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", totalLucro);







    }

}
