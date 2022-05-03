public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento){
        double bonusSalario = 0;

        if (departamento.alcancouMeta()){
            double diferencaMeta = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            bonusSalario = 0.2 * this.salarioFixo + 0.01 * diferencaMeta;
        }
        return bonusSalario;
    }
}
