package SOLID.DIP;

public class SMS implements CanalNotificacao {
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}