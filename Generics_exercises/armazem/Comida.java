import java.util.Locale;

public class Comida {
    String nome;
    double calorias;
    double preco;

    public Comida(String nome, double calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "[" + this.nome + "] " + String.format(Locale.GERMANY, "%.6f", this.calorias) + " R$ " + String.format(Locale.GERMANY, "%.6f", this.preco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comida comida = (Comida) o;

        if (Double.compare(comida.calorias, calorias) != 0) return false;
        if (Double.compare(comida.preco, preco) != 0) return false;
        return nome.equals(comida.nome);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nome.hashCode();
        temp = Double.doubleToLongBits(calorias);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(preco);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
