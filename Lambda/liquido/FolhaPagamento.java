public class FolhaPagamento {

    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculo) {
        return calculo.calcular(funcionario.getSalario());
    }
}
