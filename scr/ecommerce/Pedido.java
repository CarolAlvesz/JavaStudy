package ecommerce;

public class Pedido {
    private int id;
    private String cliente;
    private double valorTotal;
    private StatusPedido status;

    public Pedido(int id, String cliente, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.status = StatusPedido.PENDENTE;
        //o status sempre vai omeçar como pendente
    }

    //criação dos getters
    public int getId(){
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public StatusPedido getStatus() {
        return status;
    }

    // setters - permitido a alteração
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    //método para atualizar o status
    public void atualStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
        System.out.println("Status atualizado: " + this.status);

    }
    
    //print
    public String exibirFolha() {
        return "Pedido #" + id + "\nStatus: " + this.status;


    }
}

