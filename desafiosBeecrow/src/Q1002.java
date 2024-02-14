package Beecrows;
import java.util.Scanner;
public class Q1002 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        double r = sc.nextDouble();

        double a = pi * (r * r);

        System.out.printf("A = %.4f%n", a);
    }
}
