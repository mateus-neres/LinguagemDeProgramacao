//Escreva um programa chamado CaixaChatBot.

import banco.entidades.Agencia;
import banco.entidades.ContaSimples;
import banco.entidades.GeradorDeNumeroDeConta;

import java.util.Scanner;

public class CaixaChatBoat {
    public static void main(String[] args) {
        //1. para criar uma nova conta (que deve ser salva na agência)
        Scanner scanner = new Scanner(System.in);
        while (true) {
            exibirmenuInicial();
            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    String nome, cpf;
                    System.out.print("Digite o nome completo: ");
                    nome = lerEntradaDoUsuario();
                    System.out.print("Digite o CPF: ");
                    cpf = lerEntradaDoUsuario();
                    System.out.println();
                    ContaSimples umaConta = new ContaSimples(nome, cpf);
                    Agencia.addConta(umaConta);
                    System.out.println(Agencia.getContas());
                    break;
                case 2:
                    System.out.println(Agencia.localizarConta(scanner.nextInt()));
                    break;
                default:
                    System.out.println("Digite uma opção valida");
            }
        }

        //Com a conta identificada o menu de opções do bot deve mudar o menu para as seguintes opções:
        //1. Depositar
        //2. Sacar
        //3. Extrato
        //4. Transferir
        //5. Saldo
        //6. Sair


        /*Realize o desejo do usuário e em seguida, se a opção não é a de sair, apresente o menu novamente.
          Para cada opção é preciso solicitar do usuário os dados necessários para a operação.
          Se o usuário quer sacar, pergunte quanto e saque... Se quer transferir pergunte para que conta (número) e o valor...*/

        /*Fique neste loop até que o usuário deseje sair do programa.
          Antes de terminar o programa imprima o saldo final da conta e feche a agência para salvar a conta manipulada.*/

        /*Anexe aqui o arquivo CaixaEletronico.java que você desenvolver.
          Lembre de escrever um código fácil de entender e que segue as regras de estilo de programação Java.*/

    }
    public static String lerEntradaDoUsuario(){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        return entrada;
    }
    public static void exibirmenuInicial(){
        System.out.printf("=========Escolha uma das opções=============%n");
        System.out.printf("( 1 ).Para criar uma conta.%n");
        System.out.printf("( 2 ).Para buscar uma conta pelo número.%n");
        System.out.printf("============================================%n");
    }
    public static void criarNovaConta(String nome, String cpf){

    }
}
