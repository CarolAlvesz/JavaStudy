package contaBanco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Natalia");
        conta.setCpf("123456789");
        conta.setNumConta(12345);
        System.out.println("Digite o nome do titular da conta:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do titular da conta:");
        String cpf = scanner.nextLine();
        System.out.println("Digite o número da conta:");
        int numConta = scanner.nextInt();

        if (conta.autenticar(nome, cpf, numConta)) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Autenticação falhou. Verifique suas credenciais.");
        }

        scanner.close();
    }
}    