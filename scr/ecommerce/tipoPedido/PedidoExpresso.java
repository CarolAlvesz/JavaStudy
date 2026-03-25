package ecommerce.tipoPedido;

import ecommerce.Pedido;

public class PedidoExpresso extends Pedido {
    public PedidoExpresso (int id, String Cliente, double valorProduto) {
        super(id, Cliente, valorProduto);
    }

    @Override
    public double valorFrete() {
        return 40.0;
    }
}
