package Beecrows;

import java.util.Scanner;
public class Q1006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        A = A * 0.2;
        double B = sc.nextDouble();
        B = B * 0.3;
        double C = sc.nextDouble();
        C = C * 0.5;

        double MEDIA = (A + B + C);

        System.out.printf("MEDIA = %.1f%n", MEDIA);

    }
}
