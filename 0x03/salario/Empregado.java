public class Empregado {
    double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        double bonusSalario = 0;
        if (departamento.alcancouMeta()){
            bonusSalario = 0.1 * this.salarioFixo;
        }
        return bonusSalario;
    }

    public double calcularSalarioTotal(Departamento departamento){
        double bonusSalario = calcularBonus(departamento);

        return this.salarioFixo + bonusSalario;
    }
}
