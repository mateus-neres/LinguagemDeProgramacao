package Unidade01_EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista03Atividade02 {
    public static void main(String[] args) {
        /*
        2) Betina trabalha em um escritório de advocacia e todos os dias analisa vários processos. Sabendo
        que ela cumpre um expediente diário de 8h, escreva um programa que receba como entrada
        quantos minutos ela leva para analisar cada processo, e exiba o total de processos revisados em um
        dia de trabalho. (Dica: Uma hora tem 60 minutos, e considere que um processo não pode ser
        analisado parcialmente, apenas totalmente)
         */

        Scanner teclado = new Scanner(System.in);
        int expedienteDiario = 8;
        final int horaEmMinutos = 60;
        int tempoMedioparaAnaliseDeProcessos;
        int totalDeProcessosAnalisados;

        System.out.println("Digite quantos minutos leva para analiser um processo: ");
        tempoMedioparaAnaliseDeProcessos = teclado.nextInt();

        totalDeProcessosAnalisados = (expedienteDiario * horaEmMinutos) / tempoMedioparaAnaliseDeProcessos;

        System.out.printf("Betina analisa %d processos em um dia.",totalDeProcessosAnalisados);

    }
}
