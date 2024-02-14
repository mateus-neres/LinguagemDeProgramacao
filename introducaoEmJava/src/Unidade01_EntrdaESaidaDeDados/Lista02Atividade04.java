package Unidade01_EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista02Atividade04 {
    public static void main(String[] args) {
        /*
        4) Todos os anos, os motoristas devem pagar ao Detran o IPVA (Imposto sobre a Propriedade de
        Veículos Automotores) e uma taxa de trânsito. Caso paguem o IPVA com antecedência, recebem um
        desconto de 5% apenas no valor desse imposto. Escreva um programa que receba como entrada o
        valor do IPVA e o valor da taxa de trânsito, e exiba o total a ser pago por um motorista que deseja
        quitar sua dívida cinco dias antes do prazo.
         */

        Scanner teclado = new Scanner(System.in);

        double ipva;
        double taxa;
        double totalASerago;

        System.out.println("Digite o valor do IPVA: ");
        ipva = teclado.nextDouble();
        System.out.println("Digite o valor da taxa: ");
        taxa = teclado.nextDouble();

        totalASerago = (double) (ipva * 0.95) + taxa;

        System.out.printf("O valor total a ser pago com os 5 porcento de desconto é de: R$ %.2f", totalASerago);

    }
}
