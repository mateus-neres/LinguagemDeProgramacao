package Unidade02ComandosCondicionais;

import java.util.Scanner;

public class Lista04Atividade01 {
    public static void main(String[] args) {
        /*
        1. Na Copa do Mundo, os times são organizados em grupos que disputam as vagas para a
        próxima fase. Para definir qual time será o líder do grupo, primeiro analisa-se a quantidade de
        pontos. Em caso de empate, o próximo critério é o saldo de gols. Se mesmo assim não for
        possível definir, são considerados os gols feitos.
        Escreva um programa que receba como entrada o nome e essas três informações de dois
        times, e exiba o nome do time vencedor (em letras minúsculas). Caso nenhum dos critérios
        seja capaz de definir o vencedor, o programa deverá exibir a mensagem EMPATE (em
        maiúsculas).
         */

        Scanner teclado = new Scanner(System.in);
        String time1, time2;
        int pontosTime1, saldoGolsTime1, golsFeitosTime1, pontosTime2, saldoGolsTime2, golsFeitosTime2;

        System.out.println("Digite o nome do time1: ");
        time1 = teclado.nextLine().toUpperCase();
        pontosTime1 = teclado.nextInt();
        saldoGolsTime1 = teclado.nextInt();
        golsFeitosTime1 = teclado.nextInt();
        System.out.println("Digite o nome do time2: ");
        time2 = teclado.nextLine().toUpperCase();
        pontosTime2 = teclado.nextInt();
        saldoGolsTime2 = teclado.nextInt();
        golsFeitosTime2 = teclado.nextInt();

        if (pontosTime1 > pontosTime2) {

        }

    }
}
