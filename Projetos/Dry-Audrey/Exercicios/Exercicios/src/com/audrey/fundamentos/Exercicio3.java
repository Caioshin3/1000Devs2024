package com.audrey.fundamentos;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int cavalos;
        float valorUnitFerradura;


        System.out.println("Informe a quantidade de cavalos: ");
        cavalos = leia.nextInt();

        int qtddFerraduras = cavalos * 4;

        System.out.println("Informe o valor de cada ferradura: R$ ");
        valorUnitFerradura = leia.nextFloat();

        float valorTotalFerradura = valorUnitFerradura * qtddFerraduras;


        System.out.println("A quantidade de ferraduras necessarias: "+ qtddFerraduras);
        System.out.printf("Valor total para a compra das ferraduras é : R$ %.2f ", valorTotalFerradura );

        leia.close();

    }
}
