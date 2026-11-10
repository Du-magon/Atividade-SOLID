package SOLID.OCP;

public class Cartao implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento com cartão: R$ " + valor);
    }
}
