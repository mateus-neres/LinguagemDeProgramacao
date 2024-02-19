package Unidade01EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista01Atividade05 {
    public static void main(String[] args) {
        /*
        5. Um restaurante self-service de Rio Tinto cobra R$ 40 por quilo nas refeições. Sabendo que, na hora
        de determinar o valor da refeição, deve ser desconsiderado o peso do prato vazio (230 gramas),
        escreva um programa que receba como entrada o peso total do prato de um cliente em gramas e
        exiba o preço cobrado com duas casas decimais. (Lembrete: 1 quilo = 1000 gramas)
         */


        double precoDaGrama = (double) 40 / 1000;
        int taraPrato = 230;
        int pesoPrato;
        double totalAPagar;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso do prato em gramas: ");
        pesoPrato = teclado.nextInt();
        totalAPagar = (pesoPrato - taraPrato) * precoDaGrama;
        System.out.printf("O valor total será de: R$ %.2f", totalAPagar);

    }
}
