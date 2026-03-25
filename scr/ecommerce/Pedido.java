package ecommerce;

public abstract class Pedido {
    private int id;
    private String cliente;
    private double valorProduto;
    private StatusPedido status;

    public Pedido(int id, String cliente, double valorProduto) {
        this.id = id;
        this.cliente = cliente;
        this.valorProduto = valorProduto;
        this.status = StatusPedido.PENDENTE;
        //o status sempre vai omeçar como pendente
    }

    public abstract double valorFrete();

    public double getValorTotal() {
        return valorProduto + valorFrete();
    }

    //criação dos getters
    public int getId(){
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public StatusPedido getStatus() {
        return status;
    }

    // setters - permitido a alteração
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    //método para atualizar o status
    public void atualStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
        System.out.println("Status atualizado: " + this.status);

    }
    
    //print
    public String exibirFolha() {
        return "Pedido #" + id + "\nStatus: " + this.status + "\n Valor Total: " + getValorTotal();


    }
}

