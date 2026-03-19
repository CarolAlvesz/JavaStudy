package cadastro;

import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nome;
    int idade;
    String email;

    Usuario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("----------------------");
    }
}

public class cadastro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Usuario usuario = new Usuario(nome, idade, email);
                    listaUsuarios.add(usuario);

                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaUsuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        for (Usuario u : listaUsuarios) {
                            u.exibir();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}