package Unidade02ComandosCondicionais;

import java.util.Scanner;

public class Lista03Atividade01 {
    public static void main(String[] args) {

        /*
        1. Elza precisa comprar um presente para sua filha e foi a uma loja que vende bolsas e relógios. As bolsas
        de couro custam R$ 180, e as de tecido custam R$ 100. Já os relógios com pulseira de metal custam R$
        215, e os com pulseira de couro custam R$ 150. Sabendo que a loja oferece como brinde um chaveiro
        na compra de qualquer relógio, escreva um programa que receba como entrada os dados do presente
        escolhido por Elza (tipo e material), e exiba o valor a ser pago e uma mensagem informando se ela
        ganhou o brinde ou não.
         */

        Scanner teclado = new Scanner(System.in);
        double bolsaDeCouro = 180.00;
        double bolsaDetecido = 100.00;
        double relogioDeMetal = 215.00;
        double relogioDeCouro = 150.00;
        String tipo, material;

        System.out.println("Digite o tipo do presente: ");
        tipo = teclado.nextLine().toUpperCase();
        System.out.println("Digite o material do presente: ");
        material = teclado.nextLine().toUpperCase();

        if (tipo.equals("RELOGIO")) {
            if (material.equals("COURO")) {
                System.out.println(relogioDeCouro + " ganha chaveiro");
            } else if (material.equals("METAL")) {
                System.out.println(relogioDeMetal + " ganha chaveiro");
            }
        } else if (tipo.equals("BOLSA")) {
            if (material.equals("COURO")) {
                System.out.println(bolsaDeCouro);
            } else if (material.equals("TECIDO")) {
                System.out.println(bolsaDetecido);
            }
        }

    }
}