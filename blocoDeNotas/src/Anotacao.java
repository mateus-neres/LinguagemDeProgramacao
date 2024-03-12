import java.time.LocalDate;
import java.util.Objects;

public class Anotacao {
    private static int contador;
    private final int id;
    private String texto;
    private final LocalDate dataCriacao;
    private boolean deletada;

    public Anotacao(String texto) {
        if (texto.equals(null)) {
            throw new NullPointerException("O texto não pdoe ser vazio!");
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
        Objects.requireNonNull(novoTexto, "O novo texto não pode ser nulo");
        this.texto = novoTexto;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public boolean isDeletada() {
        return deletada;
    }

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
