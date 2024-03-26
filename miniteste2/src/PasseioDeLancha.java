import java.util.Objects;

public class PasseioDeLancha {
    private int numeroDePessoa;
    private int qtdHoras;
    private double PRECO_POR_PESSOA;



    public int getNumeroDePessoa() {
        return numeroDePessoa;
    }

    public void setNumeroDePessoa(int numeroDePessoa) {
        this.numeroDePessoa = numeroDePessoa;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasseioDeLancha that = (PasseioDeLancha) o;
        return numeroDePessoa == that.numeroDePessoa && qtdHoras == that.qtdHoras && Double.compare(PRECO_POR_PESSOA, that.PRECO_POR_PESSOA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDePessoa, qtdHoras, PRECO_POR_PESSOA);
    }

    @Override
    public String toString() {
        return "PasseioDeLancha{" +
                "numeroDePessoa=" + numeroDePessoa +
                ", qtdHoras=" + qtdHoras +
                ", PRECO_POR_PESSOA=" + PRECO_POR_PESSOA +
                '}';
    }
    public double getPreco(){
        double total;
        total = getNumeroDePessoa() * getQtdHoras() * getPreco();
        return total;
    }

    public String getDescricao(){
        return ("Passeio de lancha.");
    }
}
