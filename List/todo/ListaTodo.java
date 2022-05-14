import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    List<Tarefa> tarefa;

    public ListaTodo() {
        this.tarefa = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefaAdd) {
        for (Tarefa itemTarefa : this.tarefa) {
            if (itemTarefa.getIdentificador() == tarefaAdd.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefaAdd.getIdentificador() + " ja existente na lista");
            }
        }
        this.tarefa.add(tarefaAdd);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa itemTarefa : this.tarefa) {
            if (itemTarefa.getIdentificador() == identificador) {
                itemTarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (Tarefa itemTarefa : this.tarefa) {
            if (itemTarefa.getIdentificador() == identificador) {
                itemTarefa.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : this.tarefa) {
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa itemTarefa : this.tarefa) {
            itemTarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa itemTarefa : this.tarefa) {
            if (itemTarefa.isEstahFeita()) {
                System.out.println("[X]  Id: " + itemTarefa.getIdentificador() + " - Descricao: " + itemTarefa.getDescricao());
            } else {
                System.out.println("[ ]  Id: " + itemTarefa.getIdentificador() + " - Descricao: " + itemTarefa.getDescricao());
            }
        }
    }
}
