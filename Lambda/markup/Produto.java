import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkUp;
    public Supplier<Double> precoComMarkUp;
    public Consumer<Double> atualizarMarkUp = x -> this.percentualMarkUp = x;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkUp = 10;

        this.precoComMarkUp = () -> this.preco * (1 + this.percentualMarkUp/100);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
