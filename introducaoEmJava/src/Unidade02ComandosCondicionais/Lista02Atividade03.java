package Unidade02_Comandos_Condicionais;

import java.util.Scanner;
import java.util.SequencedSet;

public class Lista02Atividade03 {
    public static void main(String[] args){
        /*
        3. Escreva um programa que receba como entrada três números e exiba uma mensagem
        informando qual é o maior deles. (Dica: desconsidere a entrada de números iguais)
         */

        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite o primeiro número; ");
        n1 = teclado.nextInt();
        System.out.println("Digite o primeiro número; ");
        n2 = teclado.nextInt();
        System.out.println("Digite o primeiro número; ");
        n3 = teclado.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.printf("O mior número é: %d", n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.printf("O mior número é: %d", n2);
        }else {
            System.out.printf("O mior número é: %d", n3);
        }



    }
}
