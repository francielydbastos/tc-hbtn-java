import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> listProduto, CriterioFiltro criterio) {
        List<Produto> returnList = new ArrayList<>();

        for (Produto produto : listProduto) {
            if (criterio.testar(produto)) {
                returnList.add(produto);
            }
        }

        return returnList;
    }
}
