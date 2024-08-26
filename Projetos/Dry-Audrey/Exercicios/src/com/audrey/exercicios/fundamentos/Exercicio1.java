package com.audrey.exercicios.fundamentos;
import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double frente;
        double lateral;
       
        System.out.println("Bem-vindos à Imobiliária da Dry. Insira as medidas do terreno. \n Digite a medida da frente: ");
        frente = leia.nextDouble();

        System.out.println("Agora digite o valor da lateral: ");
        lateral = leia.nextDouble();
        double area = frente * lateral;
        double valorTotal = 1000 * area;        


        System.out.println("A área do terreno é " + area);
        System.out.println("O valor deste terreno é R$ " + valorTotal);
    }
}
