package ecommerce.tipoPedido;

import ecommerce.Pedido;

public class PedidoNormal extends Pedido{
    public PedidoNormal (int id, String Cliente, double valorProduto) {
        super(id, Cliente, valorProduto);
    }

    @Override 

    public double valorFrete() {
        return 15.0;
    }
}
