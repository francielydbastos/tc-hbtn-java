import atividades.Atividade;
import java.util.ArrayList;

public class Workflow {
    public ArrayList<Atividade> atividades = new ArrayList<>();

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void registrarAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }
}
