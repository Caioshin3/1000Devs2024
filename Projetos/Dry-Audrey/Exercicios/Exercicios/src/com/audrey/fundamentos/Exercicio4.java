package com.audrey.fundamentos;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Folha de Pagamento");

        float salarioInicial;

        System.out.println("Informe o salário: ");
        salarioInicial = leia.nextFloat();

        float reajuste = salarioInicial * 0.15F;
        float salarioReajustado = salarioInicial + reajuste;

        float descontoINSS = salarioReajustado * 0.11F;
        float descontoFGTS = salarioReajustado * 0.08F;
        float totalDesconto = descontoINSS + descontoFGTS;


        float salarioFinal = salarioReajustado - totalDesconto;

        System.out.printf("Salário Inicial : R$ %.2f \n", salarioInicial );
        System.out.printf("Salário Reajustado  : R$ %.2f \n", salarioReajustado );
        System.out.printf("Desconto 11%% do INSS : R$ %.2f \n", descontoINSS );
        System.out.printf("Desconto 8%% FGTS : R$ %.2f \n" ,descontoFGTS  );
        System.out.printf("Total desconto INSS + FGTS : R$ %.2f \n", totalDesconto );
        System.out.printf("Salario Final: R$ %.2f \n" , salarioFinal);

        leia.close();

    }
}
