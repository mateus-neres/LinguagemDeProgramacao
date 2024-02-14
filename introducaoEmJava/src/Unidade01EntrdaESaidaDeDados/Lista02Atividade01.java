package Unidade01_EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista02Atividade01 {
    public static void main(String[] args) {
        /*
        1) Uma dúzia de laranjas custa R$ 9,75 no supermercado mais próximo. Escreva um programa que
        receba como entrada a quantidade desejada de laranjas e exiba o valor total necessário para
        comprá-las. (Dica: uma dúzia corresponde a 12 laranjas. Descubra o preço unitário)
         */

        double valorUnitarioLaranja = (double) 9.75 / 12;
        int quantidadeDelaranjas;
        double custoTotal;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de laranja que você deseja: ");
        quantidadeDelaranjas = teclado.nextInt();

        custoTotal = quantidadeDelaranjas * valorUnitarioLaranja;
        System.out.printf("O valor de %d é de R$ %.2f", quantidadeDelaranjas, custoTotal );

    }
}
