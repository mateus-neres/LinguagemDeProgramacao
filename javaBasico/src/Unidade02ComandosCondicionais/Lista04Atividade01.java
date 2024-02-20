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

        Scanner scanner = new Scanner(System.in);
        String time1, time2;
        int pontosTime1, saldoGolsTime1, golsFeitosTime1, pontosTime2, saldoGolsTime2, golsFeitosTime2;

        System.out.println("Digite o nome do time1: ");
        time1 = scanner.nextLine().toUpperCase();
        System.out.println("Digite os pontos do time1: ");
        pontosTime1 = scanner.nextInt();
        System.out.println("Digite o saldo de gols do time1: ");
        saldoGolsTime1 = scanner.nextInt();
        System.out.println("Digite os gols do time1: ");
        golsFeitosTime1 = scanner.nextInt();

        scanner.nextLine(); // Consumir linha

        System.out.printf("%nDigite o nome do time2: %n");
        time2 = scanner.nextLine().toUpperCase();
        System.out.println("Digite os pontos do time2: ");
        pontosTime2 = scanner.nextInt();
        System.out.println("Digite o saldo de gols do time2: ");
        saldoGolsTime2 = scanner.nextInt();
        System.out.println("Digite os gols do time2: ");
        golsFeitosTime2 = scanner.nextInt();

        if (pontosTime1 > pontosTime2) {
            System.out.println(time1.toLowerCase());
        } if (pontosTime1 < pontosTime2) {
            System.out.println(time2.toLowerCase());
        } else if (pontosTime1 == pontosTime2) {
            if (saldoGolsTime1 > saldoGolsTime2) {
                System.out.println(time1.toLowerCase());
            } if (saldoGolsTime1 < saldoGolsTime2) {
                System.out.println(time2.toLowerCase());
            } else if (saldoGolsTime1 == saldoGolsTime2) {
                if (golsFeitosTime1 > golsFeitosTime2) {
                    System.out.println(time1.toLowerCase());
                } if (golsFeitosTime1 < golsFeitosTime2) {
                    System.out.println(time2.toLowerCase());
                } else if (golsFeitosTime1 == golsFeitosTime2){
                    System.out.println("EMPATE");
                }
            }
        }
        scanner.close();
    }
}
