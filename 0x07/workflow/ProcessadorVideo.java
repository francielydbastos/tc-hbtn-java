import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais = new ArrayList<>();

    public List<CanalNotificacao> getCanais() {
        return canais;
    }

    public void registrarCanal(CanalNotificacao canal){
        this.canais.add(canal);
    }

    public void processar(Video video){
        for (CanalNotificacao canal : this.getCanais()){
            Mensagem mensagem = new Mensagem(TipoMensagem.LOG, video.getArquivo() + " - " + video.getFormato());
            canal.notificar(mensagem);
        }
    }
}
