package repetindoinstrucoes;

import java.util.Scanner;

/*
 * Sequência de Fibonacci
A Sequência de Fibonacci é uma série matemática em que cada número subsequente é a soma dos dois números anteriores. Começando com 0 e 1, os primeiros termos da sequência são 0, 1, 1, 2, 3, 5, 8, 13, 21 e assim por diante. Por exemplo, dado o número 7, o termo fibonacci é 13.

0 1 2 3 5 8 13

Você deve criar um programa Java que permita ao usuário informar um número e calcule o termo da Sequência de Fibonacci correspondente a esse número inteiro positivo.

Utilizar a estrutura de repetição for e jump statements (return).
 */
public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    int termoAnterior = 0;
    int termoAtual = 1;
    int fibonacci = 0;

    if (numero == 0) {
      fibonacci = 0;
      System.out.println(fibonacci);
      return;
    } else if (numero == 1) {
      fibonacci = 1;
      System.out.println(fibonacci);
      return;
    }

    for (int i = 2; i <= numero; i++) {
      fibonacci = termoAnterior + termoAtual;

      termoAnterior = termoAtual;

      termoAtual = fibonacci;
    }

    System.out.println(fibonacci);

    sc.close();
  }

}
