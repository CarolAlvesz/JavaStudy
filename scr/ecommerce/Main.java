package ecommerce;

import ecommerce.tipoPagamento.PagamentoCartao;
import ecommerce.tipoPagamento.PagamentoPix;
import ecommerce.tipoPedido.PedidoExpresso;
import ecommerce.tipoPedido.PedidoNormal;

public class Main {
    public static void main(String[] args) {
        
    // criando pedidos
    Pedido p1 = new PedidoExpresso(01, "Ana", 120.0);
    Pedido p2 = new PedidoNormal(02, "Jorge", 40.0);
    
    
    //print 

    System.out.println(p1.exibirFolha());
    p1.setPagamento(new PagamentoCartao());
    p1.processarPagamento();
    p1.atualStatus(StatusPedido.ENVIADO);
    p1.atualStatus(StatusPedido.ENTREGUE);
 
    System.out.println("\n-----------------------------\n");

    System.out.println(p2.exibirFolha());
    p2.setPagamento(new PagamentoPix());
    p2.processarPagamento();
    p2.atualStatus(StatusPedido.CANCELADO);

    }
}
