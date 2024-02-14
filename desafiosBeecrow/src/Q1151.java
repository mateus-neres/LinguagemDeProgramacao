package Beecrows;
import java.util.Scanner;
public class Q1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = 0;
        int b = 1;
        int fib;
        for (int i = 0; i < l; i++){
            System.out.printf(" " + a);
            fib = a;
            a = a + b;
            b = fib;
        }
    }
}
