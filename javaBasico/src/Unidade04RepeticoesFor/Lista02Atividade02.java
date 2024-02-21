package Unidade04RepeticoesFor;

import java.util.Scanner;

public class Lista02Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contaVotoMarcilio = 0;
        int contaVotoAurelio = 0;
        int contaVotoBranco = 0;
        String voto;
        for (int i = 0 ; i < 4 ; i++) {
            System.out.println("Digite em quem deseja votar: ");
            voto = scanner.nextLine();
            if (voto.toUpperCase().equals("MARCILIO")) {
                contaVotoMarcilio ++;
            } else if (voto.toUpperCase().equals("AURELIO")) {
                contaVotoAurelio ++;
            } else {
                contaVotoBranco ++;
            }
        }
        if (contaVotoAurelio > contaVotoMarcilio & contaVotoAurelio > contaVotoBranco) {
            System.out.println("Aurélio");
        } else if (contaVotoMarcilio > contaVotoAurelio & contaVotoMarcilio > contaVotoBranco) {
            System.out.println("Márcílio");
        } else if (contaVotoBranco >= contaVotoMarcilio || contaVotoBranco >= contaVotoAurelio) {
            System.out.println("Nova votação");
        } else {
            System.out.println("Nova votação");
        }
    }
}

