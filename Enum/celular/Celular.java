import List.cookies.PedidoCookie;

import java.util.ArrayList;
import java.util.Iterator;

public class Celular {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public int obterPosicaoContato(String nomeContato) {
        for (Contato contato : this.contatos) {
            if (contato.getNome().equals(nomeContato)) {
                return this.contatos.indexOf(contato);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) {
        int posicaoContato = obterPosicaoContato(contato.getNome());

        if (posicaoContato != -1) {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }

        this.contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        int posicaoContatoAntigo = obterPosicaoContato(contatoAntigo.getNome());
        int posicaoNovoContato = obterPosicaoContato(novoContato.getNome());

        if (posicaoContatoAntigo == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }

        if (posicaoNovoContato != -1 && posicaoNovoContato != posicaoContatoAntigo) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        this.contatos.set(posicaoContatoAntigo, novoContato);
    }

    public void removerContato(Contato contato) {
        int posicaoContato = obterPosicaoContato(contato.getNome());

        if (posicaoContato == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }

        this.contatos.removeIf(contatoIt -> contatoIt.getNome().equals(contato.getNome()));
    }

    public void listarContatos() {
        for (Contato contato : this.contatos) {
            System.out.println(contato.getNome() + " -> " + contato.getNumero() + " (" + contato.getTipoNumero() + ")");
        }
    }
}
