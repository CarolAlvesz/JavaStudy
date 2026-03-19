package contaBanco;

public class ContaBancaria {
    private String titular;
    private String cpf;
    private int numConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getnumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        this.saldo -=valor;
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public boolean autenticar(String nome, String cpf, int numConta) {
        return titular.equals(nome) && this.cpf.equals(cpf) && this.numConta == numConta;
    }
}
