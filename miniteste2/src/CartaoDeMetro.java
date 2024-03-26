public class CartaoDeMetro {
    public static final int VALOR_DE_UMA_VIAGEM = 7;
    private int qtdViagens;


    public CartaoDeMetro(int qtdViagens){
        this.qtdViagens = qtdViagens;
    }

    public int getQtdeViagens() {
        return qtdViagens;
    }

    public void setQtdeViagens(int i){
        this.qtdViagens = i;
    }

    public int getPreco() {
        return qtdViagens * VALOR_DE_UMA_VIAGEM;
    }

    public String getDescricao() {
        return "Cartão de metro";
    }

    
}
