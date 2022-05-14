import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int totalCaixas = 0;
        for (PedidoCookie pedidoCookie : this.cookies) {
            totalCaixas += pedidoCookie.getQuantidadeCaixas();
        }
        return totalCaixas;
    }

    public int removerSabor(String sabor) {
        int totalCaixasRemovidas = 0;

        Iterator<PedidoCookie> i = this.cookies.iterator();
        while(i.hasNext()){
            PedidoCookie pedidoCookie = i.next();
            if (pedidoCookie.getSabor().equals(sabor)){
                totalCaixasRemovidas += pedidoCookie.getQuantidadeCaixas();
                i.remove();
            }
        }

        return totalCaixasRemovidas;
    }
}
