import java.util.List;
public class Main {
    public static void main(String[] args) {
        BlocoDeNotas novoBlocoDeNotas = new BlocoDeNotas();

        novoBlocoDeNotas.adicionarAnotacao("Ir à academia");
        novoBlocoDeNotas.adicionarAnotacao("Ir à escola");

        System.out.println("Lista de Anotações: ");
        imprimirAnotacoes(novoBlocoDeNotas.listaAnotacaoBlocoDeNotas());

        novoBlocoDeNotas.editarAnotacao(1, "Concluído");
        System.out.println("\nLista de anotações após edição: ");
        imprimirAnotacoes(novoBlocoDeNotas.listaAnotacaoBlocoDeNotas());

        novoBlocoDeNotas.deletarAnotacao(2);

        System.out.println("\nLista após deleção: ");
        imprimirAnotacoes(novoBlocoDeNotas.listaAnotacaoBlocoDeNotas());

        System.out.println("\nBuscar por 'Concluído': ");
        imprimirAnotacoes(novoBlocoDeNotas.buscarAnotacao("Concluído"));
    }

    private static void imprimirAnotacoes(List<Anotacao> anotacoes) {
        if (anotacoes.isEmpty()) {
            System.out.println("Nenhuma anotação encontrada.");
        } else {
            for (Anotacao anotacao : anotacoes) {
                System.out.println(anotacao);
            }
        }
    }
}
