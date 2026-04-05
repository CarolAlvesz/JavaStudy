
package ecommerce.tipoPagamento;

public class PagamentoPix implements Pagamento {
    @Override
    public boolean concluirPagamento(double valor) {
        System.out.println("Pagamento via Pix concluído no valor de: R$" + valor);
        return true;
    }
}