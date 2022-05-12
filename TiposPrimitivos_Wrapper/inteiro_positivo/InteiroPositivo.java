public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor < 0) {
            throw new NumberFormatException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {
        int valorEnvelopado = Integer.parseInt(valor);

        if (valorEnvelopado < 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }

        this.valor = valorEnvelopado;
    }

    public boolean ehPrimo() {
        if (this.valor == 1) {
            return false;
        }
        for (int i = 2; i < this.valor; i++){
            if (this.valor % i == 0) {
                return false;
            }
        }
        return true;
    }
}
