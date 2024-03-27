public class CartaoDeMetro {
    public static final int VALOR_DE_UMA_VIAGEM = 7;
    private int qtdViagens = 3;


    public CartaoDeMetro(int qtdViagens){
        try{
            if (qtdViagens < 0) {
                throw new RuntimeException("Quantidade de viagens deve ser maior que zero");
            } else {
                this.qtdViagens = qtdViagens;
            }
        } catch (IllegalArgumentException e){
            throw new RuntimeException("Quantidade de viagens deve ser maior que zero" + e.getMessage());
        }

        try{
            if (qtdViagens == 0) {
                throw new RuntimeException("Quantidade de viagens deve ser maior que zero");
            } else {
                this.qtdViagens = qtdViagens;
            }
        } catch (IllegalArgumentException e){
            throw new RuntimeException("Quantidade de viagens deve ser maior que zero" + e.getMessage());
        }
    }

    public int getQtdeViagens() {
        return qtdViagens;
    }

    public void setQtdeViagens(int i){
        if (i > 0 ){
        this.qtdViagens = i;
        }
    }

    public double getPreco() {

        if (qtdViagens >= 20 ){
            return (qtdViagens * VALOR_DE_UMA_VIAGEM) * 0.80;
        } else {
            return qtdViagens * VALOR_DE_UMA_VIAGEM;
        }
    }

    public String getDescricao() {
        return getQtdeViagens()+ " viagens de metro.";
    }

    @Override
    public String toString() {
        return "CartaoDeMetro [" +
                "qtdeViagens=" + qtdViagens +
                ']';
    }
}
