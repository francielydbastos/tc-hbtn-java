import java.util.HashMap;
import java.util.Map;

public abstract class Armazem <T> implements Armazenavel<T> {
    private Map<String, T> listaItens = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        this.listaItens.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return this.listaItens.get(nome);
    }
}
