package SOLID.OCP;

public class Dinheiro implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento em dinheiro: R$ " + valor);
    }
}
