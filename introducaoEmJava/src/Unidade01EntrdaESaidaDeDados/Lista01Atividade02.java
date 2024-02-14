package Unidade01_EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista01Atividade02 {
    public static void main(String[] args) {
        /*
        2. A biblioteca de Rio Tinto empresta gratuitamente seus livros a alunos, professores e funcionários
        de todo o campus. Entretanto, sempre que um usuário atrasa a entrega de um livro, ele tem que
        pagar uma multa de R$ 2,50 por cada dia de atraso.
        Escreva um programa que receba como entrada a quantidade de dias de atraso do empréstimo de
        um livro, e exiba o valor da multa a ser paga pelo usuário com duas casas decimais.
         */
        Scanner teclado = new Scanner(System.in);
        double multaPorDia = 2.5;
        int diasAtrasados;
        double totalDaMulta;

        System.out.println("Digite quntos dia foram de atraso: ");
        diasAtrasados = teclado.nextInt();

        totalDaMulta = diasAtrasados * multaPorDia;

        System.out.printf("O valor da multa por %d dias, é de R$ %.2f", diasAtrasados, totalDaMulta);
    }
}
