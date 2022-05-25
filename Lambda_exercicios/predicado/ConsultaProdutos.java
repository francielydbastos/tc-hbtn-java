package Lambda_exercicios.predicado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> listProduto, Predicate<Produto> criterio) {
        List<Produto> returnList = new ArrayList<>();

        for (Produto produto : listProduto) {
            if (criterio.test(produto)) {
                returnList.add(produto);
            }
        }

        return returnList;
    }
}
