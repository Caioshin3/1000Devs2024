package com.audrey.fundamentos;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float anelIdentificacao = 4.00F;
        float anelAlimentacao = 3.50F;
        int qtddFrango;

        System.out.println("Digite a quantidade de frangos a ser identificados: ");
        qtddFrango = leia.nextInt();

        float gastoTotal = (qtddFrango * anelIdentificacao) + ((qtddFrango * anelAlimentacao) * 2);

        System.out.printf("O valor total para identificar os frangos é %.2f", gastoTotal);

        leia.close();
    }
}
