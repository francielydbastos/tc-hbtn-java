import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        for (Agencia agencia : this.agencias) {
            if (agencia.getNome().equals(nomeAgencia)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if (buscarAgencia(nomeAgencia) == null){
            this.agencias.add(new Agencia(nomeAgencia));
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorInicial) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null && agencia.buscarCliente(nomeCliente) == null) {
            agencia.novoCliente(nomeCliente, valorInicial);
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            agencia.adicionarTransacaoCliente(nomeCliente, valorTransacao);
        }
        return false;
    }

    public void listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);

        if (agencia != null) {
            int i = 1;
            for (Cliente cliente : agencia.getClientes()) {
                System.out.println("Cliente: " + cliente.getNome() + "[" + i + "]");
                i++;
                if (imprimeTransacoes) {
                    int j = 1;
                    for (Double transacao : cliente.getTransacoes()) {
                        System.out.println("    [" + j + "] valor " + transacao);
                        j++;
                    }
                }
            }
        }
    }
}