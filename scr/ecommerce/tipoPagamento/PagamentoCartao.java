package ecommerce.tipoPagamento;

public class PagamentoCartao implements Pagamento {
    @Override
    public boolean concluirPagamento(double valor) {
        System.out.println("Pagamento via Cartão concluído no valor de: R$" + valor);
        return true;
    }
    
}
