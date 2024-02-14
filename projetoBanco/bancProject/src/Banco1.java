// Programa Banco1
import banco.entidades.ContaSimples;
public class Banco1 {
    public static void main(String[] args) {
        // Abra uma conta para João com CPF 309140605-06
        ContaSimples umaConta = new ContaSimples("João","309140605-06");
        // A conta será "referenciada" com a variável umaConta
        // Nesta conta, deposite R$1000,00
        umaConta.depositar(1000);
        // Imprima o saldo da conta de João
        System.out.println(umaConta.getSaldo());
        // Saque R$300,00 desta conta
        umaConta.sacar(300);
        // Imprima o objeto umaConta
        System.out.println(umaConta);
        // Imprima o saldo da conta de João
        System.out.println("O saldo da conta N° " + umaConta.getNúmero() + " é " + umaConta.getSaldo());
    }
}
