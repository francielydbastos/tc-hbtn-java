package provedores;

public class JadLog implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;

        if (peso > 2000) {
            valorFrete = 0.07 * valor;
        } else {
            valorFrete = 0.045 * valor;
        }

        return new Frete(valorFrete, TipoProvedorFrete.JADLOG);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
