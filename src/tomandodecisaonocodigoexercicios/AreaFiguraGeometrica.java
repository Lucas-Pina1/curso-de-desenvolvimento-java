package tomandodecisaonocodigoexercicios;

import java.util.Scanner;

/*
 * Dada uma figura geométrica ( retângulo, triângulo, circulo),
 * informar a sua área.
 * 
 * retangulo = base x atura
 * triangulo = (base x atura) / 2
 * circulo = pi x (raio x raio)
 */
public class AreaFiguraGeometrica {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o numero referente a á figura geométrica para calcular sua área:");
    System.out.println("[1] - retângulo");
    System.out.println("[2] - triângulo");
    System.out.println("[3] - circulo");
    int opcao = sc.nextInt();

    double base;

    double altura;

    double area;

    switch (opcao) {
      case 1 -> {
        System.out.println("Digite a base: ");
        base = sc.nextDouble();
        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();
        area = base * altura;
        System.out.printf("A área do retângulo é de %.2f", area);
      }
      case 2 -> {
        System.out.println("Digite a base: ");
        base = sc.nextDouble();
        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("A área do triângulo é de %.2f", area);
      }
      case 3 -> {
        double pi = 3.14;
        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();
        area = pi * (raio * raio);
        System.out.printf("A área do circulo é de %.2f", area);
      }
      default -> {
        System.out.println("Opção inválida, tente novamente!");
      }
    }
    sc.close();
  }
}
