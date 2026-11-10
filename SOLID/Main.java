package SOLID;
import SOLID.SRP.*;
import SOLID.OCP.*;
import SOLID.LSP.*;
import SOLID.ISP.*;
import SOLID.DIP.*;

public class Main {
    public static void main(String[] args) {

        // SRP
        CriarPedido criar = new CriarPedido();
        Pedido pedido = criar.criar("Pizza", 45.00);

        SalvarPedido salvar = new SalvarPedido();
        salvar.salvar(pedido);

        ExibirPedido exibir = new ExibirPedido();
        exibir.exibir(pedido);

        // OCP
        SistemaPagamento sistema = new SistemaPagamento();
        sistema.realizarPagamento(new Pix(), 45.00);

        // LSP
        Produto produto = new Hamburguer();
        produto.exibir();

        // ISP
        EnviarMensagem mensagem = new EnviarMensagem();
        mensagem.enviarNotificacao();

        // DIP
        SistemaNotificacao notificacao =
                new SistemaNotificacao(new WhatsApp());

        notificacao.notificar("Seu pedido está pronto!");
    }
}
