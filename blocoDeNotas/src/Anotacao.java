import java.time.LocalDate;

public class Anotacao {
    private static int contador = 1;
    private int id;
    private String texto;
    private LocalDate dataCriacao;
    private Boolean deletada;

    public Anotacao (String texto) {
        this.id = contador++;
        this.texto = texto;
        this.dataCriacao = LocalDate.now();
        this.deletada = false;
    }

    public int getId(){
        return id;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto (String novoTexto) {
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
