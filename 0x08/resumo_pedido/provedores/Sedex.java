package provedores;

public class Sedex implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;

        if (peso > 1000) {
            valorFrete = 0.1 * valor;
        } else {
            valorFrete = 0.05 * valor;
        }

        return new Frete(valorFrete, TipoProvedorFrete.SEDEX);
    }
}
