package Unidade01_EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista03Atividade04 {
    public static void main(String[] args) {
        /*
        4) Sheldon tem uma grande coleção de revistas em quadrinhos raras e resolveu doá-las a seus amigos
        (Bazinga!!!). Escreva um programa que receba como entrada a quantidade total de revistas e a
        quantidade de amigos que serão beneficiados, e exiba quantas revistas cada um vai receber e
        quantas sobrarão para Sheldon
         */

        Scanner teclado = new Scanner(System.in);
        int quantidadeDeRevistas;
        int quantidadeDeAmigos;
        double revistasParaCadaAmigo;
        double resvistasRestantes;

        System.out.println("Quantos revistas: ");
        quantidadeDeRevistas = teclado.nextInt();
        System.out.println("Quantas amigos: ");
        quantidadeDeAmigos = teclado.nextInt();

        revistasParaCadaAmigo = quantidadeDeRevistas / quantidadeDeAmigos;
        resvistasRestantes = quantidadeDeRevistas % quantidadeDeAmigos;

        System.out.printf("Cada amigo receberá %.0f revistas e sobrarão %.0f.",revistasParaCadaAmigo, resvistasRestantes);

    }
}
