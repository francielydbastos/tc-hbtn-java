public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public double calcularTotal() {
        double somaTotal = 0;
        for (ItemPedido item : getItens()){
            somaTotal = somaTotal + item.getProduto().getPrecoBruto() * item.getQuantidade();
        }
        return somaTotal - somaTotal * getPercentualDesconto()/100;
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
}
