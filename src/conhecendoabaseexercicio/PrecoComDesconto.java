package conhecendoabaseexercicio;

/*
 * Imprimir preço de um produto com base no desconto à vista e o vaor economizado.
 * 
 * 1. Ler preco
 * 2. Ler %  desconto
 * 3. Imprimir novo preço e valor economizado em reais
 * 
 * Ex: R$100,00 com 10% de desconto = O preço com desconto é R$ 90.00
 * e o valor economizado foi de R$ 10.00
 */

import java.util.Scanner;

public class PrecoComDesconto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o preço do produto: ");
    double precoProduto = scanner.nextDouble();
    System.out.println("Digite o valor o desconto em %: ");
    double desconto = scanner.nextDouble();

    double precoComDesconto = precoProduto - (precoProduto * desconto / 100);
    double valorEconomizado = precoProduto - precoComDesconto;

    System.out.printf("O preço com desconto é R$ %.2f", precoComDesconto);
    System.out.println();
    System.out.printf("o valor economizado foi de R$ %.2f", valorEconomizado);

    scanner.close();
  }
}
