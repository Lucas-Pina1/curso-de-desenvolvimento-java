/*
 * Exercicio 1:
 * 
 * Dadas 3 notas, imprimir a média aritmética do aluno.
 * 
 * 1. Ler 3 notas
 * 2. Calcular média
 * 3. Imprimir resultado
 * 
 * Fórmula: MA = (n1 + n2 + n3) / 3
 */

import java.util.Scanner;

public class MediaAritimetica {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.println("------- Calcular média notas -------");
    System.out.println();
    System.out.println("Digite a primeira nota: ");
    double primeiraNota = scanner.nextDouble();
    System.out.println("Digite a segunda nota: ");
    double segundaNota = scanner.nextDouble();
    System.out.println("Digite a terceira nota: ");
    double terceiraNota = scanner.nextDouble();

    double mediaDasNotas = (primeiraNota + segundaNota + terceiraNota) / 3;

    System.out.println();
    System.out.println("-------------------------------------");
    System.out.printf("A média das notas foi de: %.2f", mediaDasNotas);

    scanner.close();
  }

}
