import java.util.List;
import java.util.ArrayList;
public class BlocoDeNotas {
    private List<Anotacao> anotacoes;

    public void colecaoAnotacoes () {
        this.anotacoes = new ArrayList<>();
    }


    public void adicionarAnotacao (String texto) {
        try {
            if (!texto.isEmpty()) {
                Anotacao novaAnotacao = new Anotacao(texto);
                System.out.println("Adição bem sucedida");
            } else {
                throw new IllegalArgumentException("Anotação não adicionada, texto está vazio");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Erro de anotação: " + e.getMessage());
        }
    }

    public void editarAnotacao (int id, String novoTexto) {
        for (Anotacao anotacao : anotacoes) {
            if (anotacao.getId() == id && !anotacao.isDeletada()) {
                anotacao.setTexto(novoTexto);
                break;
            }
        }
    }

    public void deletarAnotacao (int id) {
        for (Anotacao anotacao : anotacoes) {
            if (anotacao.getId() == id && !anotacao.isDeletada()) {
                anotacao.setDeletada(true);
                break;
            }
        }
    }

    public List<Anotacao> buscarAnotacao (String busca) {
        List<Anotacao> resultado = new ArrayList<>();
        for (Anotacao anotacao : anotacoes) {
            if (!anotacao.isDeletada() && anotacao.getTexto().contains(busca)) {
                resultado.add(anotacao);
            }
        }
        return resultado;
    }

    public List<Anotacao> listaAnotacaoBlocoDeNotas () {
        List<Anotacao> resultado = new ArrayList<>();
        for (Anotacao anotacao : anotacoes) {
            if (!anotacao.isDeletada()) {
                resultado.add(anotacao);
            }
        }
        return resultado;
    }
}
