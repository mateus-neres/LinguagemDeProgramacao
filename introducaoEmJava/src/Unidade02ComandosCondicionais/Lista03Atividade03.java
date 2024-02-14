package Unidade02_Comandos_Condicionais;

import java.util.Scanner;

public class Lista03Atividade03 {
    public static void main(String[] args) {
        /*
        3. Pensando no grande número de motoristas que viajam no feriado, o posto de combustíveis Abasteça Já
        resolveu fazer uma superpromoção, oferecendo preços bem abaixo do mercado:

                    Tipo de Combustível e Valor por Litro
                    Gasolina R$ 2,53
                    Etanol R$ 2,09
                    Diesel R$ 1,92

        Além disso, todos os clientes que abastecerem seus veículos com mais de 30 litros de etanol serão
        premiados com uma troca de óleo. Escreva um programa para esse posto de modo que ele receba
        como entrada o combustível escolhido e o valor em dinheiro que se deseja gastar, e informe o total de
        combustível abastecido e uma mensagem indicando se o cliente ganhou ou não a troca de óleo.
         */

        Scanner teclado = new Scanner(System.in);
        double gasolina = 2.53;
        double etanol = 2.09;
        double diesel = 1.92;
        String tipoCombustivel;
        double valorAbastecido, litrosAbastecido = 0;

        System.out.println("Digite o tipo de combustivel desejado: ");
        tipoCombustivel = teclado.nextLine().toUpperCase();
        System.out.println("Digite o valor que deseja abastecer: ");
        valorAbastecido = teclado.nextDouble();

        if (tipoCombustivel.equals("GASOLINA")){
            litrosAbastecido = valorAbastecido / gasolina;
        } else if (tipoCombustivel.equals("ETANOL")) {
            litrosAbastecido = valorAbastecido / etanol;
        } else if (tipoCombustivel.equals("DIESEL")) {
            litrosAbastecido = valorAbastecido / diesel;
        }

        if (litrosAbastecido > 30){
            System.out.printf("Litros %.2f%n", litrosAbastecido);
            System.out.println("Ganhou troca de óleo.");
        }else {
            System.out.printf("Litros %.2f%n", litrosAbastecido);
            System.out.println("Não ganhou troca de óleo.");
        }
    }
}
