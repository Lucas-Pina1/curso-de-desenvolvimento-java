package conhecendoabaseexercicio;

/*
 * Faça um programa que converta um valor em dolár em reais.
 * 
 * Ex: Dólares = 100, Cotação = 4,92 => Ovalor em reais é R$ 492,00.
 */

import java.util.Scanner;

public class ConversorDoDolarReal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor em dólar que deseja converter: ");
    double valorDolar = sc.nextDouble();
    System.out.println("Digite a contação do dólar: ");
    double cotacao = sc.nextDouble();

    double valorEmReais = valorDolar * cotacao;

    System.out.printf("O valor em reais é de R$ %.2f", valorEmReais);
    sc.close();
  }
}
