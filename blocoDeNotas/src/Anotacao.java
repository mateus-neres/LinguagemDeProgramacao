import java.time.LocalDate;

public class Anotacao {
    private static int contador = 1;
    private final int id;
    private String texto;
    private final LocalDate dataCriacao;
    private boolean deletada;

    public Anotacao(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("O texto não pode ser vazio!");
        }
        this.id = contador++;
        this.texto = texto;
        this.dataCriacao = LocalDate.now();
        this.deletada = false;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String novoTexto) {
        if (novoTexto == null || novoTexto.isEmpty() || deletada) {
            throw new IllegalArgumentException("O novo texto não pode ser vazio ou está excluído!");
        }
        this.texto = novoTexto;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public boolean isDeletada() {
        return deletada;
    } // Usar uma lista para armazenar os valores deletados e confirmar se estão deletados.

    public void setDeletada(boolean deletada) {
        this.deletada = deletada;
    }

    @Override
    public String toString() {
        return "Anotacao{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", deletada=" + deletada +
                '}';
    }
}
