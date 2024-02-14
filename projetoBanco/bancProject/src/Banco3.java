//Escreva um programa chamado CaixaChatBot.

import banco.entidades.Agencia;
import banco.entidades.ContaSimples;

import java.util.Scanner;

public class Banco3 {
    public static void main(String[] args) {
        //1. para criar uma nova conta (que deve ser salva na agência)
        //2. para localizar uma conta já existente através de seu número
        Scanner sc = new Scanner(System.in);
        System.out.printf(
                "=========Escolha uma das opções=============%n" +
                "( 1 ).Para criar uma conta.%n" +
                "( 2 ).Para buscar uma conta pelo número.%n" +
                "============================================%n");

        int escolha;
        escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.printf("%n=========Abrindo uma conta=============%n");
                String nome, cpf;
                System.out.print("Digite o nome completo: ");
                nome = sc.nextLine();
                System.out.printf("%nDigite o CPF: ");
                cpf = sc.nextLine();
                ContaSimples umaConta = new ContaSimples(nome, cpf);
                break;
            case 2:

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
}
private static abrirUmaConta (){

}