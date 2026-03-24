package contaBanco;

public class ContaBancaria {
   private String titular;
   private String cpf;
   private int numConta;
   private double saldo;

    public void ContaBancaria(String titular, String cpf, int numConta) {
        this.titular = titular;
        this.cpf = cpf;
        this.numConta = numConta;
    }

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

    public boolean depositar(double valor) {
        if (valor <= saldo) {
           saldo -= valor;
            System.out.println("Depósito realizado com sucesso!");
            return true;
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
            return false;
        }
    }

    public boolean saque(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Não é possível realizar o saque.");
            return false;
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        }
    }

    public boolean autenticar(String nome, String cpf, int numConta) {
        return titular.equals(nome) && this.cpf.equals(cpf) && this.numConta == numConta;
    }
}
