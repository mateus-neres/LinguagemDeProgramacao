package Unidade01EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista02Atividade03 {
    public static void main(String[] args) {
        /*
        3) Regiane vai comemorar o aniversário de seu filho e precisa encomendar docinhos. Cada brigadeiro
        custa R$ 1,90 e cada beijinho custa R$ 1,70. Escreva um programa que receba como entrada a
        quantidade de brigadeiros e de beijinhos pedidos, e também a quantidade de crianças convidadas,
        e exiba o valor total gasto, e a quantidade total de docinhos que cada criança vai comer.
         */

        Scanner teclado = new Scanner(System.in);
        double valorBrigadeiro = 1.90;
        double valorBeijinho = 1.70;
        int quantidadeDeCrianca;
        int quantidadeDeBrigadeiro;
        int quantidadeDEBeijinho;
        double totalGasto;
        int docinhorPorcrianca;

        System.out.println("Digite a quantidade de crianças: ");
        quantidadeDeCrianca = teclado.nextInt();
        System.out.println("Digite a quantidade de rigadeiros: ");
        quantidadeDeBrigadeiro = teclado.nextInt();
        System.out.println("Digite a quantidade de beijinhos: ");
        quantidadeDEBeijinho = teclado.nextInt();

        totalGasto = (quantidadeDeBrigadeiro * valorBrigadeiro) + (quantidadeDEBeijinho * valorBeijinho);
        docinhorPorcrianca = (int) (quantidadeDeBrigadeiro + quantidadeDEBeijinho) / quantidadeDeCrianca;

        System.out.printf("Serão gastos R$ %.2f e %d de docinhos para cada criança", totalGasto, docinhorPorcrianca);
    }
}
