import java.time.LocalDate;
public class Anotacao {
    private static int contador;
    private int id;
    private String texto;
    private LocalDate dataDaCriacao;
    private Boolean deletada;

    public Anotacao(String texto) {
        if (texto.equals(null)) {
            throw new IllegalArgumentException("O texto não pode ser vazio!");
        }
        this.id = contador++;
        this.texto = texto;
        this.dataDaCriacao =LocalDate.now();
        this.deletada = false;

    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDate getDataDaCriacao() {
        return dataDaCriacao;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setDeletada(boolean deletada) {
        this.deletada = deletada;
    }

    public boolean isDeletada () {
        return deletada;
    }

    @Override
    public String toString() {
        return "Anotacao{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", dataDaCriacao=" + dataDaCriacao +
                ", deletada=" + deletada +
                '}';
    }
}
