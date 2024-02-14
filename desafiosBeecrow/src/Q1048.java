package Beecrows;
import java.util.Scanner;
public class Q1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextFloat();

        if (salario >= 0 && salario <= 400){
            double novoSalario = salario + (salario * 0.15);
            double reajuste = salario * 0.15;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 15%");

        } else if (salario >= 400.01 && salario <= 800){
            double novoSalario = salario + (salario * 0.12);
            double reajuste = salario * 0.12;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 12%");

        } else if (salario >= 800.01 && salario <= 1200) {
            double novoSalario = salario + (salario * 0.10);
            double reajuste = salario * 0.10;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 10%");

        } else if (salario >= 1200.01 && salario <= 2000) {
            double novoSalario = salario + (salario * 0.07);
            double reajuste = salario * 0.07;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 7%");

        } else if (salario > 2000) {
            double novoSalario = salario + (salario * 0.04);
            double reajuste = salario * 0.04;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 4%");
        }
    }
}

