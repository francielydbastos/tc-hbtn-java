import java.util.*;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> contatos;

    public ListaTelefonica() {
        this.contatos = new HashMap<String, HashSet<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {

        contatos.forEach((key, value) -> {
            if (key.equals(nome) && value.contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            } else if (!key.equals(nome) && value.contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        });

        if (contatos.containsKey(nome)) {
            HashSet<Telefone> values = contatos.get(nome);
            values.add(telefone);
            contatos.put(nome, values);
        } else {
            HashSet<Telefone> values = new HashSet<>();
            values.add(telefone);
            contatos.put(nome, values);
        }
    }

    public  HashSet<Telefone> buscar(String nome) {
        if (contatos.containsKey(nome)) {
            return contatos.get(nome);
        }
        return null;
    }
}
