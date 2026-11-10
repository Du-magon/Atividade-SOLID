package SOLID.DIP;

public class WhatsApp implements CanalNotificacao {
    public void enviar(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}
