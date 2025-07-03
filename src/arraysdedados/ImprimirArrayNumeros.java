package arraysdedados;
/*
 * Imprimir Array de Números
Crie um programa que lê um número inteiro n que representa a quantidade de números a serem inseridos pelo usuário e, em seguida, lê esses n números, e finalmente os imprime de volta ao usuário.

Obs: Cada número deve ser impresso numa linha separada. Além disso a impressão deve ser feita depois da leitura de todos os números, e não durante.


 */

import java.util.Scanner;

public class ImprimirArrayNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a capacidade de números: ");
    int capacidadeMaxima = sc.nextInt();

    int[] numeros = new int[capacidadeMaxima];

    for (int i = 0; i < capacidadeMaxima; i++) {
      System.out.println("Digite o " + (i + 1) + " numero: ");
      numeros[i] = sc.nextInt();
    }

    System.out.println("os numeros presentes no array: ");
    for (int numero : numeros) {
      System.out.println(numero);
    }
    sc.close();
  }
}
