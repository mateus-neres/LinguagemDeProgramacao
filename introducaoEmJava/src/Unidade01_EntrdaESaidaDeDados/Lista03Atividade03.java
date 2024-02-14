package Unidade01_EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista03Atividade03 {
    public static void main(String[] args) {
        /*
        3) Janete vai comemorar seu aniversário numa pizzaria muito badalada. Conversando com o dono, ela
        conseguiu uma promoção: a cada 10 rodízios, um será gratuito. Escreva um programa que receba
        como entrada a quantidade de pessoas convidadas e o preço do rodízio, e exiba o total a ser pago
        com duas casas decimais. (Dica: pense em divisão!)
         */

        Scanner teclado = new Scanner(System.in);
        int quantidadeDePessoas;
        double valorDoRodizio;
        double valortotalAPagar;
        double desconto;

        System.out.println("Digite a quantidade de pessoas: ");
        quantidadeDePessoas = teclado.nextInt();
        System.out.println("Digite o valor do rodizio individual: ");
        valorDoRodizio = teclado.nextDouble();

        desconto = quantidadeDePessoas / 10;
        valortotalAPagar = (quantidadeDePessoas - desconto) * valorDoRodizio;

        System.out.printf("O valor total do rodizio é de R$ %.2f", valortotalAPagar);
    }
}
