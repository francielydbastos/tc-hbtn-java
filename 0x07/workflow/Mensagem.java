public class Mensagem {
    private String texto;
    private TipoMensagem tipoMensagem;

    public String getTexto() {
        return texto;
    }

    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }

    public Mensagem(TipoMensagem tipoMensagem, String texto) {
        this.texto = texto;
        this.tipoMensagem = tipoMensagem;
    }
}
