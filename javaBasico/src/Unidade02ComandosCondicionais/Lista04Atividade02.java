package Unidade02ComandosCondicionais;

import java.util.Scanner;

public class Lista04Atividade02 {
    public static void main(String[] args) {
        String tipoAparelho, modelo;
        int quantidade;
        double valorCelularSansung, valorCelularMotorola, valorTableteSansung, valorTableteMultilase, valorPago;
        valorCelularSansung = 921.40;
        valorCelularMotorola = 879.18;
        valorTableteMultilase = 339.50;
        valorTableteSansung = 417.72;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de aparelho que deseja: ");
        tipoAparelho = scanner.nextLine().toUpperCase();
        System.out.println("Digite o modelo de aparelho que deseja: ");
        modelo = scanner.nextLine().toUpperCase();
        //scanner.nextLine(); // Consumir linha
        System.out.println("Digite o quantidade que deseja: ");
        quantidade = scanner.nextInt();

        if (tipoAparelho.equals("CELULAR")) {
            if (modelo.equals("SANSUNG")) {
                valorPago = valorCelularSansung * quantidade;
                System.out.println(valorPago);
            } else if (modelo.equals("MOTOROLA")) {
                valorPago = valorCelularMotorola * quantidade;
                System.out.println(valorPago);
            }
        } else if (tipoAparelho.equals("TABLETE")) {
            if (modelo.equals("SANSUNG")) {
                valorPago = valorTableteSansung * quantidade;
                System.out.println(valorPago);
            } else if (modelo.equals("MULTILASE")) {
                valorPago = valorTableteMultilase * quantidade;
                System.out.println(valorPago);
            }
        }

    }
}
