package Unidade03RepeticoesWhile;

import java.util.Scanner;

public class Lista03Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String controle = "";
        String coletarLetras;
        int contador = 0;
        while (!controle.toUpperCase().equals("X")) {
            System.out.println("Digite uma letra: ");
            coletarLetras = scanner.nextLine();

            if (coletarLetras.toUpperCase().equals("W") || coletarLetras.toUpperCase().equals("Y") || coletarLetras.toUpperCase().equals("K")) {
                contador ++;
            }
            controle = coletarLetras.toUpperCase();
        }
        System.out.println(contador);
    }
}
