package Unidade02_Comandos_Condicionais;

import java.util.Scanner;

public class Lista02Atividade02 {
    public static void main(String[] args) {
        /*
        2. Escreva um programa que receba como entrada um número e exiba uma mensagem
        informando se ele é par ou ímpar.

        Lembrete: Um número é par se for divisível por dois, ou seja, se na divisão inteira por dois
        o resto for zero. Caso contrário, ele será ímpar.
         */

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = teclado.nextInt();;

        if (numero % 2 == 0){
            System.out.printf("O número %d é par.", numero);
        } else {
            System.out.printf("O número %d é impa.",numero);
        }
    }
}
