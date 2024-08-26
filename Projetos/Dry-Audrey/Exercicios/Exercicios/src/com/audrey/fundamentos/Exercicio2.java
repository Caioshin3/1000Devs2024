package com.audrey.fundamentos;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double salMinimo = 1500 ;

        double salFuncionario;


        System.out.println("Digite o salario do funcionario");
        salFuncionario = leia.nextDouble();


        double qtddSalMin = salFuncionario/salMinimo;

        System.out.printf("O funcionário ganha %.2f salários mínimos%n", qtddSalMin);

        leia.close();

    }
}
