package com.audrey.fundamentos;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

                System.out.println("Lanchonete Lhama Burguers");

    Scanner leia = new Scanner(System.in);

    int qtddLanches;

    float pesoFatiaQueijoGramas = 50;
    float pesoFatiaPresuntoGramas = 50;
    float pesoRodelaHamburguerGramas = 120;


        System.out.println("Quantidade de sanduiches a ser produzido: ");

    qtddLanches = leia.nextInt();

    float presuntoASerComprado = (qtddLanches *pesoFatiaPresuntoGramas) / 1000;
    float queijoASerComprado = (qtddLanches *pesoFatiaQueijoGramas) / 1000;
    float carneASerComprada = (qtddLanches * pesoRodelaHamburguerGramas) / 1000;

        System.out.printf("Para produzir %d sanduiches serao necessários, em kilos: \n %.3f kg de mussarela \n %.3f kg de presunto \n %.3f kg de hamburguer. ", qtddLanches, queijoASerComprado, presuntoASerComprado, carneASerComprada );

        leia.close();
    }
}
