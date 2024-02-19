package Unidade02ComandosCondicionais;

import java.util.Scanner;

public class Lista03Atividade02 {
    public static void main(String[] args) {
        /*
        2. Vladimir trabalha em uma papelaria da cidade que oferece serviços de xérox e encadernação. Os
        preços cobrados são os seguintes:

        Xérox em preto e branco R$ 0,06 (cada)
        Xérox colorida R$ 0,29 (cada)
        Encadernação (até 100 folhas) R$ 2,00
        Encadernação (mais de 100 folhas) R$ 4,00

        Escreva um programa que receba como entrada o tipo de serviço (xérox ou encadernação) preferido
        por um cliente, e a quantidade de páginas para copiar ou de folhas para encadernar. O programa
        deverá também calcular e exibir o valor total a ser pago. Observe que, caso o usuário opte por xérox,
        será necessário receber como entrada também o tipo de xérox (PB ou colorida).
         */

        Scanner teclado = new Scanner(System.in);
        double xeroxPretoBranco = 0.06;
        double xeroxColorida = 0.29;
        double encaderncaoEmAte100Folhas = 2;
        double encadernacaoEmMaisDe100Folhas = 4;
        String tipoDeServico;
        int quantidadeDeXeroxOuEncadernacao;
        String tipoDeXerox = "";
        double valorASerpago = 0;

        System.out.println("Digite o tipo de serviço que deseja realizar: ");
        tipoDeServico = teclado.nextLine().toUpperCase();
        if (tipoDeServico.equals("XÉROX")) {
            System.out.println("Digite o tipo de xérox desejada, PB ou colorida: ");
            tipoDeXerox = teclado.nextLine().toUpperCase();
        }
        System.out.println("Digite a quantidade de copias para xerox ou de paginas para encadernação: ");
        quantidadeDeXeroxOuEncadernacao = teclado.nextInt();


        if (tipoDeXerox.equals("PB")) {
            valorASerpago = xeroxPretoBranco * quantidadeDeXeroxOuEncadernacao;
        } else if (tipoDeXerox.equals("COLORIDA")) {
            valorASerpago = xeroxColorida * quantidadeDeXeroxOuEncadernacao;
        } else if (tipoDeServico.equals("ENCADERNAÇÃO")) {
            if (quantidadeDeXeroxOuEncadernacao < 100) {
                valorASerpago = encaderncaoEmAte100Folhas;
            } else if (quantidadeDeXeroxOuEncadernacao > 100) {
                valorASerpago = encadernacaoEmMaisDe100Folhas;
            }
        }
        System.out.printf("O valor a ser pago e de R$%.2f", valorASerpago);
    }
}
