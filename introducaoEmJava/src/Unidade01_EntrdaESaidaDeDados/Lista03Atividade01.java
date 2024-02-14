package Unidade01_EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista03Atividade01 {
    public static void main(String[] args) {
        /*
        1) O doutor Jonas Gutierrez é cardiologista e atende diversos pacientes. Ele recebe R$ 170 por cada
        consulta realizada por convênio, e R$ 310 por consulta particular. Escreva um programa que receba
        como entrada quantas consultas de convênio e quantas consultas particulares ele realizou em uma
        semana, e exiba o valor total recebido por ele.
         */

        Scanner teclado = new Scanner(System.in);
        double valorConsultaPaticular = 310;
        double valorConsultaConvenio = 170;
        double totalRecebido;
        int quantidadeDeConsultaParticular;
        int quantidadeDeConsultaPorConvenio;

        System.out.println("Quantas consultas particulares realizou: ");
        quantidadeDeConsultaParticular = teclado.nextInt();
        System.out.println("Quantas consultas por plano realizou: ");
        quantidadeDeConsultaPorConvenio = teclado.nextInt();

        totalRecebido = (quantidadeDeConsultaParticular * valorConsultaPaticular) + (quantidadeDeConsultaPorConvenio * valorConsultaConvenio);

        System.out.printf("O valor total a ser recebido é de; R$ %.2f", totalRecebido);


    }
}
