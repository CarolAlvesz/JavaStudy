package contaBanco.tipoConta;

import contaBanco.ContaBancaria;
import contaBanco.Main;

abstract class Conta extends ContaBancaria {
    public Conta(String titular, String cpf, int numConta) {
        super(titular, cpf, numConta);

}
}
