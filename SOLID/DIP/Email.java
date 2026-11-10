package SOLID.DIP;

public class Email implements CanalNotificacao {
    public void enviar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}