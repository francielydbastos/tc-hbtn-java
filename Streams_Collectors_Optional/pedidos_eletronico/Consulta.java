import java.util.Comparator;
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

    public static Produto obterProdutoMaiorPreco(List<Produto> produtosPedido) {
        Optional<Produto> max = produtosPedido.stream().max(Comparator.comparingDouble(Produto::getPreco));
        return max.orElse(null);
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(p -> p.getProdutos().stream().anyMatch(pr -> pr.getCategoria().equals(CategoriaProduto.ELETRONICO)))
                .collect(Collectors.toList());
    }
}
