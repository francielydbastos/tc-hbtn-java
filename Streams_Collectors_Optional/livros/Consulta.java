import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> produtosPedido = pedido.getProdutos();

        return produtosPedido.stream()
                .filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());
    }

}
