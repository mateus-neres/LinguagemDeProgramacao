import java.util.ArrayList;
import java.util.List;

public class VendasDaAgenciaDeTurismo {
        public List<VendaDeTurismoIF> itens = new ArrayList<>();

        public int adicionarVenda(VendaDeTurismoIF item){
            itens.add(item);
            return 1;
        }

        public double getPrecoDeVenda(int posicao){
            return itens.get(posicao).getPreco();
        }
        public double getPrecototal(){
            double precoTotal = 0;
            for (VendaDeTurismoIF item: itens){
                precoTotal += item.getPreco();
            }
            return precoTotal;
        }

        public String listagemDevendas(){
            String lista = "";
            for (VendaDeTurismoIF item: itens){
                lista += itens.toString();
            }
            return lista;
        }
}
