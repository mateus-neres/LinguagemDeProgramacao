package Unidade02ComandosCondicionais;

import java.util.Scanner;

public class Lista03Atividade04 {
    public static void main(String[] args) {
        /*
        4. Uma locadora de veículos cobra seus clientes por eventuais atrasos na devolução dos carros alugados.
        Caso o atraso seja inferior a duas horas, será cobrada uma multa de R$ 30. Para atrasos de até três
        horas, a multa é de R$ 80. Se o atraso for superior a três horas, a multa será de R$ 40 por hora. Escreva
        um programa que receba como entrada o valor da diária do veículo alugado, a quantidade de dias do
        aluguel, e o tempo de atraso na devolução em horas, e exiba o valor total a ser pago. (Dica: nem todos
        os clientes devolvem os veículos com atraso)
         */

        Scanner teclado = new Scanner(System.in);
        double valorDiaria, totalAPagar, multa = 0;
        int quantidadeDeDias, tempoDeAtraso;

        System.out.println("Digite o valor da diaria: ");
        valorDiaria = teclado.nextDouble();
        System.out.println("Digite a quantidade de dias: ");
        quantidadeDeDias = teclado.nextInt();
        System.out.println("Digite o tempo de atraso");
        tempoDeAtraso = teclado.nextInt();

        if (tempoDeAtraso > 0 && tempoDeAtraso < 2) {
            multa = 30;
        } else if (tempoDeAtraso >= 2 && tempoDeAtraso <= 3) {
            multa = 80;
        } else if (tempoDeAtraso > 3) {
            multa = tempoDeAtraso * 40;
        }

        totalAPagar = (valorDiaria * quantidadeDeDias) + multa;

        System.out.printf("%.2f", totalAPagar);
    }
}
