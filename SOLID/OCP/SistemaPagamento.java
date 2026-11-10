package SOLID.OCP;

public class SistemaPagamento {
    public void realizarPagamento(Pagamento pagamento, double valor) {
        pagamento.pagar(valor);
    }
}
