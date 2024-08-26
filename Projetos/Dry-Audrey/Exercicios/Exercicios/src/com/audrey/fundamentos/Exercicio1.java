package com.audrey.fundamentos;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float frente;
        float lateral;

        System.out.println("Bem-vindos à Imobiliária da Dry. Insira as medidas do terreno. \n Digite a medida da frente: ");
        frente = leia.nextFloat();

        System.out.println("Agora digite o valor da lateral: ");
        lateral = leia.nextFloat();
        float area = frente * lateral;
        float valorTotal = 1000 * area;


        System.out.printf("A área do terreno com %.2f m de frente por %.2f m de lateral é: %.2f m2\n", frente, lateral, area);
        System.out.println("O valor deste terreno é R$ " + valorTotal);

        leia.close();

    }
}
