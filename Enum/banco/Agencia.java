import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String nomeCliente) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getNome().equals(nomeCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean novoCliente(String nomeCliente, double valorInicial) {
        if (buscarCliente(nomeCliente) == null) {
            this.clientes.add(new Cliente(nomeCliente, valorInicial));
            return true;
        }
        return false;
    }
}
