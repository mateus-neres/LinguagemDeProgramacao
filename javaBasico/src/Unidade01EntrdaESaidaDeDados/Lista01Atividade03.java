package Unidade01EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista01Atividade03 {
    public static void main(String[] args) {
        /*
        3. Sabendo que a Copiadora de Rio Tinto cobra R$ 0,15 por cada cópia feita, escreva um programa
        que receba como entrada a quantidade de folhas de um livro e exiba o valor total a ser pago para
        copiá-lo com duas casas decimais. (Lembrete: cada folha corresponde a duas páginas – frente e
        verso)
         */

        Scanner teclado = new Scanner(System.in);
        int quantidadeDeFolhas;
        double custoPorCopia = 0.15;
        double custoTotal;

        System.out.println("Quantas paginas tem o livro que deseja copiar ?");
        quantidadeDeFolhas = teclado.nextInt();

        custoTotal = (quantidadeDeFolhas * 2) * custoPorCopia;

        System.out.printf("O valor total da copia do com %d folhas é de R$ %.2f", quantidadeDeFolhas, custoTotal);

    }
}
