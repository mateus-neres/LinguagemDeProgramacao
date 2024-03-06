import java.util.List;

public class Main {
    public static void main(String[] args) {
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        blocoDeNotas.adicionarAnotacao("Mateus Neres");
        blocoDeNotas.adicionarAnotacao("Natália henrique");

        System.out.println("Lista de Anotações: ");
        listaAnotacao(blocoDeNotas.listaAnotacao());

        blocoDeNotas.editarAnotacao(1, "Mateus");
        System.out.println("\nLista de anotação após edição: ");
        listaAnotacao(blocoDeNotas.listaAnotacao());

        blocoDeNotas.deletarAnotacao(2);

        System.out.println("\nLista Após deleção: ");
        listaAnotacao(blocoDeNotas.listaAnotacao());

        System.out.println("\nBuscar Por 'Mateus': ");
        listaAnotacao(blocoDeNotas.buscarAnotacao("Mateus"));

    }

    private static void listaAnotacao (List<Anotacao> anotacaos) {
        for (Anotacao anotacao : anotacaos) {
            System.out.println(anotacao);
        }
    }
}
