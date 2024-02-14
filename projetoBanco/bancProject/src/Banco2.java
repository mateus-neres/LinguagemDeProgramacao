import banco.entidades.ContaSimples;
public class Banco2 {
    public static void main(String[] args) {
        // Abra uma conta de número 1 para João com CPF 309140605-06
        ContaSimples contaJoao = new ContaSimples("João", "309140605-06");
        // Nesta conta, deposite R$1000,00
        contaJoao.depositar(1000);
        // Abra uma conta de número 2 para Ana com CPF 123456789-01
        ContaSimples contaAna = new ContaSimples("Ana", "123456789-01");
        // Transfira R$400,00 da conta de João para a conta de Ana
        contaJoao.transferir(contaAna, 400.00);
        // Imprima o saldo da conta de João
        System.out.println("Saldo da conta de João é: " + contaJoao.getSaldo());
        // Imprima o saldo da conta de Ana
        System.out.println("Saldo da conta de Ana é: " + contaAna.getSaldo());
    }
}
