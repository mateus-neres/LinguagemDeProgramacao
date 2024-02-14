package Unidade02_Comandos_Condicionais;

import java.util.Scanner;

public class Lista03Atividade05 {
    public static void main(String[] args){
        /*
        5. Helena trabalha na bilheteria de um cinema, e vende ingressos e lanches. Os ingressos para filmes em
        2D custam R$ 8,50, e para os filmes em 3D custam R$ 14,50. Caso queira adquirir um combo simples
        (pipoca e refrigerante), o cliente deve pagar mais R$ 10, e se preferir um combo completo (pipoca,
        refrigerante e chocolate) deve desembolsar mais R$ 12.
        Escreva um programa que receba como entrada as escolhas de cada cliente e exiba o valor total a ser
        pago. (Dica: nem todo cliente que vai ver filme compra lanche)
         */

        Scanner teclado = new Scanner(System.in);
        double ingressos2d = 8.50;
        double ingressos3d = 14.50;
        double comboSimples = 10;
        double comboCompleto = 12;
        String tipoDeFilme, lanche;
        double valorASerPago;
        
        System.out.println("Digite o tipo de filme que deseja: ");
        tipoDeFilme = teclado.nextLine().toUpperCase();
        System.out.println("Digite se deseja lanche simples, completo ou não: ");
        lanche = teclado.nextLine().toUpperCase();
        
        if (tipoDeFilme.equals("2D")){
            if (lanche.equals("NÃO")){
                valorASerPago = ingressos2d;
            } else if (lanche.equals("COMBO SIMPLES")) {
                valorASerPago = ingressos2d + comboSimples;
            } else {
                valorASerPago = ingressos2d + comboCompleto;
            }
        } else {
            if (lanche.equals("NÃO")){
                valorASerPago = ingressos3d;
            } else if (lanche.equals("COMBO SIMPLES")) {
                valorASerPago = ingressos3d + comboSimples;
            } else {
                valorASerPago = ingressos3d + comboCompleto;
            }
        }
        System.out.printf("%.2f",valorASerPago);
    }
}
