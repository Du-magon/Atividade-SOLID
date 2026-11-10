package SOLID.DIP;

public class SistemaNotificacao {
    private CanalNotificacao canal;

    public SistemaNotificacao(CanalNotificacao canal) {
        this.canal = canal;
    }

    public void notificar(String mensagem) {
        canal.enviar(mensagem);
    }
}
