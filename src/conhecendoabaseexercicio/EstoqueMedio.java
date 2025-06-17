package conhecendoabaseexercicio;

/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 * 
 * Ex: quantidadeMinima = 3, quantidadeMaxima = 7: O estoque médio é de 5 unidades.
 */

import java.util.Scanner;

public class EstoqueMedio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade minima de peças no estoque: ");
    int quantidadeMinima = scanner.nextInt();
    System.out.println("Digite a quantidade maxima de peças no estoque: ");
    int quantidadeMaxima = scanner.nextInt();
    double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2.0;

    System.out.printf("O estoque médio é de %.1f unidades", estoqueMedio);
    scanner.close();
  }
}
