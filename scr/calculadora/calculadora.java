package scr.calculadora;

public class calculadora {
        public double somar(double a, double b) {
          return a + b;
        }

        public double subtrair(double a, double b) {
          return a - b;
        }

        public double multiplicar(double a, double b) {
          return a * b;
        }

        public double dividir(double a, double b) {
          if (b != 0) {
            return a / b;
          } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
          }
        }


    
}
