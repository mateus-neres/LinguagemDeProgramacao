import java.util.List;
import java.util.ArrayList;
public class BlocoDeNotas {
    private List<Anotacao> anotacoes;

    public void blocoDeNotas() {
        this.anotacoes = new ArrayList<>();
    }


    public void adicionarAnotacao (String texto) {
        try {
            Anotacao novaAnotacao = new Anotacao(texto);
            System.out.println("Anotação adicionada");
        } catch (Exception e) {
            System.out.println("Anotação não adicionada");
        }

    }

    public void editarAnotacao (int id, String novoTexto) {
        try {
            for (Anotacao anotacao : anotacoes) {
                if (anotacao.getId() == id && !anotacao.isDeletada()) {
                    anotacao.setTexto(novoTexto);
                    break;
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Anotação não editada");
        }
    }

    public void deletarAnotacao (int id) {
        try {
            for (Anotacao anotacao : anotacoes) {
                if (anotacao.getId() == id && !anotacao.isDeletada()) {
                    anotacao.setDeletada(true);
                    break;
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Anotação já deletada");
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
                break;
            }
        }
        return resultado;
    }
}
