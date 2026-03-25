package ecommerce;

public class Main {
    public static void main(String[] args) {
        
    // criando pedidos
    Pedido p1 = new Pedido(01, "Ana", 120.0);
    Pedido p2 = new Pedido(02, "Jorge", 40.0);
    
    //print 

    System.out.println(p1.exibirFolha());
    p1.atualStatus(StatusPedido.ENVIADO);
    p1.atualStatus(StatusPedido.ENTREGUE);

 
    System.out.println(p2.exibirFolha());
    p2.atualStatus(StatusPedido.PROCESSANDO); 
    p2.atualStatus(StatusPedido.CANCELADO);

    }
}
