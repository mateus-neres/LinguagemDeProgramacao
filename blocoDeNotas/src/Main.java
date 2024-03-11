import java.util.List;

public class Main {
    public static void main(String[] args) {
        BlocoDeNotas novoBlocoDeNotas = new BlocoDeNotas();

        novoBlocoDeNotas.adicionarAnotacao("");
        novoBlocoDeNotas.adicionarAnotacao("ir a escola");

        System.out.println("Lista de Anotações: ");
        listaAnotacaoMain(novoBlocoDeNotas.listaAnotacaoBlocoDeNotas());
        novoBlocoDeNotas.editarAnotacao(1, "Concluído");
        System.out.println("\nLista de anotação após edição: ");
        listaAnotacaoMain(novoBlocoDeNotas.listaAnotacaoBlocoDeNotas());

        novoBlocoDeNotas.deletarAnotacao(2);

        System.out.println("\nLista Após deleção: ");
        listaAnotacaoMain(novoBlocoDeNotas.listaAnotacaoBlocoDeNotas());

        System.out.println("\nBuscar Por 'Concluído': ");
        listaAnotacaoMain(novoBlocoDeNotas.buscarAnotacao("Concluído"));

    }

    private static void listaAnotacaoMain(List<Anotacao> anotacaos) {
        for (Anotacao anotacao : anotacaos) {
            System.out.println(anotacao);
        }
    }

}
