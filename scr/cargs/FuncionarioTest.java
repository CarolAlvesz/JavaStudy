package scr.cargs;

public class FuncionarioTest {
    public static void main (String[] args) {
    Funcionario funcionario = new Funcionario();
    funcionario.nome = "Carol";
    funcionario.idade = 30;
    funcionario.salarios = new double[] {12000, 930, 2000};

    funcionario.imprime();
    funcionario.imprimeMediaSalario();
    }
}
