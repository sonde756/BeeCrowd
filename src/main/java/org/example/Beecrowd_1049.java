package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1049 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);



        String a = leitor.next();
        String b = leitor.next();
        String c = leitor.next();


        if (a.equals("vertebrado")){
            if (b.equals("ave")){
                if (c.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else {
                    System.out.println("pomba");
                }
            }
            else {
                if(c.equals("onivoro")){
                    System.out.println("homem");
                }

                else {
                    System.out.println("vaca");
                }
            }
        }

        else {
            if (b.equals("inseto")){
                if (c.equals("hematofago")){
                    System.out.println("pulga");
                }
                else {
                    System.out.println("lagarta");

                }

            }
            else {
                if (c.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }
                else {
                    System.out.println("minhoca");
                }

            }


        }



















    }

}
