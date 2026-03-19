package contaBanco;
import java.util.Scanner;

public class Sistema {
    public static void menu(ContaBancaria conta, Scanner scanner) {
         int opcao;

          do{
                System.out.println("Escolha uma opção:");
                System.out.println("1. Ver saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Sair");

                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1: 
                        System.out.println("Saldo atual: " + conta.getSaldo());
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser depositado:");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso!");
                        break;
                    case 3:
                        System.out.println("Digite o valor a ser sacado:");
                        double valorSaque = scanner.nextDouble();
                        conta.saque(valorSaque);
                        System.out.println("Saque realizado com sucesso!");
                        break;
                  }
            } while (opcao != 4);
    
        }   }

    