package Unidade01_EntrdaESaidaDeDados;

import java.util.Scanner;

public class Lista01Atividade04 {
    public static void main(String[] args) {
        /*
        4. A Escola Legal paga seus professores considerando as aulas que eles dão e os projetos que
        orientam. Sabendo que são pagos R$ 35 por cada hora de aula, e R$ 80 por cada projeto, escreva
        um programa que receba como entrada a quantidade de horas em que um professor esteve em
        sala de aula no mês, e a quantidade de projetos orientados por ele, e exiba o salário desse
        professor.
         */

        Scanner teclado = new Scanner(System.in);
        int horaAula = 35;
        int projetos = 80;
        int horasLecionadas;
        int projetosOrientados;
        double salario;

        System.out.println("Digite o total de horas que o professor lecionou no mês: ");
        horasLecionadas = teclado.nextInt();
        System.out.println("Digite quantos projetos o professor orientu: ");
        projetosOrientados = teclado.nextInt();

        salario = (horaAula * horasLecionadas) + (projetos * projetosOrientados);
        System.out.printf("O professor lecionou %d horasAulas e orientou %d projetos, e seu salário foi de R$ %.2f", horasLecionadas, projetosOrientados, salario);
    }
}
