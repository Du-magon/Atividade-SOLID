package SOLID.SRP;

public class CriarPedido {
    public Pedido criar(String produto, double valor) {
        return new Pedido(produto, valor);
    }
}