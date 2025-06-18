package tomandodecisaonocodigoexercicios;

import java.util.Scanner;

/*
 * Crie uma calculadora que dados 2 números e uma operação
 * (adição, subtração, multiplicação e divisão), retorne o resultado dessa 
 * operação entre os dois números
 */
public class Calculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    double primeiroNumero = sc.nextDouble();
    System.out.println("Digite o segundo número: ");
    double segundoNumero = sc.nextDouble();
    System.out.println("Agora digite o número referente a operação a ser relizada: ");
    System.out.println("[1] - adição");
    System.out.println("[2] - subtração");
    System.out.println("[3] - multiplicação");
    System.out.println("[4] - divisão");

    int operacao = sc.nextInt();

    double resultado = 0.0;
    String menssagemOperacao = null;

    switch (operacao) {
      case 1 -> {
        menssagemOperacao = "adição";
        resultado = primeiroNumero + segundoNumero;
      }
      case 2 -> {
        menssagemOperacao = "subtração";
        resultado = primeiroNumero - segundoNumero;
      }
      case 3 -> {
        menssagemOperacao = "multiplicação";
        resultado = primeiroNumero * segundoNumero;
      }
      case 4 -> {
        menssagemOperacao = "divisão";
        resultado = primeiroNumero / segundoNumero;
      }
      default -> System.out.println("Operação inválida");
    }

    if (resultado != 0) {
      System.out.printf("A %s de %.0f por %.0f é %.1f", menssagemOperacao, primeiroNumero, segundoNumero, resultado);
    }
    sc.close();
  }
}
