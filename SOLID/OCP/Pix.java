package SOLID.OCP;

public class Pix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX: R$ " + valor);
    }
}