import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        setSaldo(getSaldo() - 0.1);
        this.quantidadeTransacoes = getQuantidadeTransacoes() + 1;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        setSaldo(getSaldo() - 0.1);
        this.quantidadeTransacoes = getQuantidadeTransacoes() + 1;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
