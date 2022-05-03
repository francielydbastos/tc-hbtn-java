import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        } else if (valor > this.saldo){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo -= valor;
    }

    public double calcularTarifaMensal(){
        double tarifaSaldo = this.saldo * 0.1;

        if (tarifaSaldo > 10){
            return 10;
        }
        return tarifaSaldo;
    }

    public double calcularJurosMensal(){
        double jurosMensal = 0;

        if (this.saldo > 0){
            jurosMensal = getSaldo() * (getTaxaJurosAnual()/100) / 12;
        }

        return jurosMensal;
    }

    public void aplicarAtualizacaoMensal(){
        this.saldo = getSaldo() - calcularTarifaMensal() + calcularJurosMensal();
    }
}
