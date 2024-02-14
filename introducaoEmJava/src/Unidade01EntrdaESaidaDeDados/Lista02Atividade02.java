package Unidade01_EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista02Atividade02 {
    public static void main(String[] args) {
        /*
        2) Otávio resolveu organizar um churrasco para comemorar seu aniversário. A estimativa é que cada
        pessoa consuma 400 gramas de carne e 6 latas de cerveja. Pelas pesquisas que ele fez no
        supermercado de seu bairro, o quilo de carne custará R$ 41 e cada cerveja sairá por R$ 5,20.
        Escreva um programa que receba como entrada a quantidade de pessoas que irão para o churrasco
        e exiba o valor total que ele gastará com carne e cerveja com duas casas decimais cada um.
         */

        Scanner teclado = new Scanner(System.in);

        int consumoDeCarnePorPesso = 400;
        int consumoDeCervejaPorPesso = 6;
        double valorDaCarnePorGrama = (double) 41 / 1000;
        double unidadeCerveja = 5.20;
        int quantidadeDePessoas;
        double totalCarne;
        double totalCerveja;

        System.out.println("Digite quantas pessoas participarão do churrasco: ");
        quantidadeDePessoas = teclado.nextInt();

        totalCerveja = (unidadeCerveja * consumoDeCervejaPorPesso) * quantidadeDePessoas;
        totalCarne = (consumoDeCarnePorPesso * valorDaCarnePorGrama) * quantidadeDePessoas;
        System.out.printf("O valor total do churrasco para %d pessoas é de : tota em carne: R$ %.2f e total em cerveja R$ %.2f ", quantidadeDePessoas, totalCarne, totalCerveja);

    }
}
