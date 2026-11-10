package SOLID.SRP;

public class ExibirPedido {
    public void exibir(Pedido pedido) {
        System.out.println("Produto: " + pedido.produto);
        System.out.println("Valor: R$ " + pedido.valor);
    }
}