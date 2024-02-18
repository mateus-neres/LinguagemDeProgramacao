//Escreva um programa chamado CaixaChatBot.

//1. para criar uma nova conta (que deve ser salva na agência)
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

import banco.entidades.Agencia;
import banco.entidades.Conta;
import banco.entidades.ContaSimples;

import java.util.Scanner;

public class CaixaChatBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            exibirMenuInicial();
            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    criarNovaConta();
                    break;
                case 2:
                    encontrarConta();
                    break;
                default:
                    System.out.println("Digite uma opção valida");
            }
        }
    }

    private static void encontrarConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta que deseja encontrar: ");
        long numeroConta = scanner.nextLong();
        Conta conta = Agencia.localizarConta(numeroConta);
        System.out.println(conta);
        exibirMenuConta(conta);
    }

    public static String lerEntradaDoUsuario(){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        return entrada;
    }
    public static void exibirMenuInicial(){
        System.out.printf("%n=========Escolha uma das opções=============%n");
        System.out.printf("( 1 ).Para criar uma conta.%n");
        System.out.printf("( 2 ).Para buscar uma conta pelo número.%n");
        System.out.printf("============================================%n");
        System.out.print("Escolha uma opção: ");

    }

    public static void exibirMenuConta(Conta conta){
            Scanner scanner = new Scanner(System.in);
            int selecao = scanner.nextInt();
            System.out.printf("%n=========Menu da conta=============%n");
            System.out.println("( 1 ). Depositar");
            System.out.println("( 2 ). Sacar");
            System.out.println("( 3 ). Extrato");
            System.out.println("( 4 ). Transferir");
            System.out.println("( 5 ). Saldo");
            System.out.println("( 6 ). Sair da conta");
            System.out.printf("============================================%n");
            System.out.print("Escolha uma opção: ");
            /*switch (selecao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                    System.out.println(conta.getSaldo());
                    break;
                case 2:
                    Conta.sacar();
                    break;
                case 3:
                    Conta.criarExtrato();
                    break;
                case 4:
                    Conta.transferir();
                    break;
                case 5:
                    Conta.saldo();
                    break;
                case 6:
                    exibirMenuInicial();


                default:
                    System.out.println("Digite uma opção valida");
            }*/
    }


    public static void criarNovaConta(){
        String nome, cpf;
        System.out.print("Digite o nome completo: ");
        nome = lerEntradaDoUsuario();
        System.out.print("Digite o CPF: ");
        cpf = lerEntradaDoUsuario();
        System.out.println();
        ContaSimples umaConta = new ContaSimples(nome, cpf);
        Agencia.addConta(umaConta);
        System.out.println("Conta adicionada! O numero da sua conta é: " + umaConta.getNúmero());
    }
}
