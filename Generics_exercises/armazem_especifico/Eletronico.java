import java.util.Locale;

public class Eletronico {
    String descricao;
    double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "[" + this.descricao + "] " + "R$ " + String.format(Locale.GERMANY, "%.6f", this.valor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Eletronico that = (Eletronico) o;

        if (Double.compare(that.valor, valor) != 0) return false;
        return descricao.equals(that.descricao);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = descricao.hashCode();
        temp = Double.doubleToLongBits(valor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
