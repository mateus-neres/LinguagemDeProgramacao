import java.time.LocalDate;
class Postagem {
    private String texto;
    private LocalDate dataPostagem;

    public Postagem(String texto) {
        this.texto = texto;
        this.dataPostagem = LocalDate.now();
    }

    @Override
    public String toString() {
        return texto + " (" + dataPostagem + ")";
    }
}
