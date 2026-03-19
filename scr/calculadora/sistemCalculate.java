package calculadora;
import java.util.Scanner;

public class sistemCalculate {
    private calculadora Calculadora = new calculadora();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcao;

        do{
            System.out.println("Escolha a operação:");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = Calculadora.somar(num1, num2);
                        break;
                    case 2:
                        resultado = Calculadora.subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = Calculadora.multiplicar(num1, num2);
                        break;
                    case 4:
                        try {
                            resultado = Calculadora.dividir(num1, num2);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;
                }

                System.out.println("Resultado: " + resultado);
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

    } 

    
}
