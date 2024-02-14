package Beecrows;

import java.util.Scanner;
public class Q1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NUMERO = sc.nextInt();

        int horasTrabalho = sc.nextInt();

        double valorHora = sc.nextDouble();

        double SALARIO = (horasTrabalho * valorHora);

        System.out.println("NUMBER = " + NUMERO);
        System.out.printf("SALARY = U$ %.2f%n", SALARIO);
    }
}