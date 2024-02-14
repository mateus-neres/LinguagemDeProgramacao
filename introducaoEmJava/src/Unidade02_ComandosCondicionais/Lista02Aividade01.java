package Unidade02_Comandos_Condicionais;

import java.util.Scanner;

public class Lista02Aividade01 {
    public static void main(String[] args) {
        /*
        1. Escreva um programa que receba como entrada um número e exiba uma mensagem
        informando se ele é positivo, negativo ou neutro.

        Lembrete: Os números maiores que zero são chamados de positivos, enquanto os
        números menores que zero são os negativos. Zero é um número neutro.
         */

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = teclado.nextInt();;

        if (numero > 0){
            System.out.printf("O número %d é positivo.", numero);
        } else if (numero < 0) {
            System.out.printf("O número %d é negativo.",numero);
        }else{
            System.out.printf("O número %d é neutro.", numero);
        }
    }
}
