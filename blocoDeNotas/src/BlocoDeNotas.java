import java.util.List;
import java.util.ArrayList;
public class BlocoDeNotas {
    private List<Anotacao> anotacoes;

    public BlocoDeNotas() {
        this.anotacoes = new ArrayList<>();
    }

    public void adicionarAnotacao(String texto) {
        try {
            Anotacao novaAnotacao = new Anotacao(texto);
            anotacoes.add(novaAnotacao);
        } catch (NullPointerException e) {
            System.out.println("O texto não pode ser vazio!\n"
                    + e.getMessage() + "\n");
        }
    }

    public void editarAnotacao(int id, String novoTexto) {
        try {
            for (Anotacao anotacao : anotacoes) {
                if (anotacao.getId() == id && !anotacao.isDeletada()) {
                    anotacao.setTexto(novoTexto);
                    return;
                }
            }
            System.out.println("Anotação não encontrada ou já deletada!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error ao editar anotação " + e.getMessage());
        }
    }

    public void deletarAnotacao(int id) {
        for (Anotacao anotacao : anotacoes) {
            if (anotacao.getId() == id && !anotacao.isDeletada()) {
                anotacao.setDeletada(true);
                return;
            }
        }
        System.out.println("Anotação não encontrada ou já deletada");
    }

    public List<Anotacao> buscarAnotacao(String busca) {
        List<Anotacao> resultado = new ArrayList<>();
        for (Anotacao anotacao : anotacoes) {
            if (!anotacao.isDeletada() && anotacao.getTexto().contains(busca)) {
                resultado.add(anotacao);
            }
        }
        return resultado;
    }

    public List<Anotacao> listaAnotacaoBlocoDeNotas() {
        List<Anotacao> resultado = new ArrayList<>();
        for (Anotacao anotacao : anotacoes) {
            if (!anotacao.isDeletada()) {
                resultado.add(anotacao);
            }
        }
        return resultado;
    }
}
