import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> contatos;

    public ListaTelefonica() {
        this.contatos = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        if (contatos.containsKey(nome)) {
            ArrayList<Telefone> values = contatos.get(nome);
            values.add(telefone);
            contatos.put(nome, values);
        } else {
            ArrayList<Telefone> values = new ArrayList<>();
            values.add(telefone);
            contatos.put(nome, values);
        }
    }

    public  ArrayList<Telefone> buscar(String nome) {
        if (contatos.containsKey(nome)) {
            return contatos.get(nome);
        }
        return null;
    }
}
