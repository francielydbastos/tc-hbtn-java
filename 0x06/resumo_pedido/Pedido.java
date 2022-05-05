public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public double calcularTotal() {
        double somaTotal = 0;
        for (ItemPedido item : getItens()){
            somaTotal = somaTotal + item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return somaTotal * (1 - getPercentualDesconto()/100);
    }

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        double totalSemDesconto = 0;
        for (ItemPedido item : getItens()) {
            String titulo =  item.getProduto().getTitulo();
            double precoLiquido = item.getProduto().obterPrecoLiquido();
            int quantidade = item.getQuantidade();
            double precoTotal = (item.getProduto().obterPrecoLiquido() * item.getQuantidade());
            totalSemDesconto += precoTotal;

            System.out.printf(java.util.Locale.GERMANY, "Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", item.getProduto().getClass().getSimpleName(), titulo, precoLiquido, quantidade, precoTotal);
        }
        System.out.println("----------------------------");
        double desconto = (totalSemDesconto * getPercentualDesconto()/100);
        double totalComDesconto = (totalSemDesconto - desconto);
        System.out.printf(java.util.Locale.GERMANY, "DESCONTO: %.2f\n", desconto);
        System.out.printf(java.util.Locale.GERMANY, "TOTAL PRODUTOS: %.2f\n", totalSemDesconto);
        System.out.println("----------------------------");
        System.out.printf(java.util.Locale.GERMANY, "TOTAL PEDIDO: %.2f\n", totalComDesconto);
        System.out.println("----------------------------");
    }
}
