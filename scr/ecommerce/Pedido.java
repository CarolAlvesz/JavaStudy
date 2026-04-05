package ecommerce;

import ecommerce.tipoPagamento.Pagamento; 

public abstract class Pedido {
    private int id;
    private String cliente;
    private double valorProduto;
    private Pagamento pagamento; 
    private StatusPedido status;
 

    public Pedido(int id, String cliente, double valorProduto) {
        this.id = id;
        this.cliente = cliente;
        this.valorProduto = valorProduto;
        this.status = StatusPedido.PENDENTE;

        //o status sempre vai começar como pendente
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

    public Pagamento getPagamento() {
        return pagamento;
    }

    // setters - permitido a alteração
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void setPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    //método para atualizar o status
    public void atualStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
        System.out.println("Status atualizado: " + this.status);

    }

    //método do pagamento
    public boolean processarPagamento() {
        if(pagamento == null) {
          throw new IllegalStateException("Pagamento não definido.");
        }
        if (status != StatusPedido.PENDENTE) {
            System.out.println("Pagamento não pode ser processado. Status atual: " + status);
            return false;
        }
        pagamento.concluirPagamento(getValorTotal());
        atualStatus(StatusPedido.PROCESSANDO);

        return true;
    }
    
    //print
    public String exibirFolha() {
        return "Pedido #" + id +
        "\nStatus: " +
        this.status +
        "\nValor Total: " + getValorTotal();


    }
}

