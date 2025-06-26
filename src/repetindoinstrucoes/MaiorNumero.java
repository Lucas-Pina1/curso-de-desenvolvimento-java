package repetindoinstrucoes;

import java.util.Scanner;

/*
 * Imprimindo o maior número
Crie um programa Java que solicita ao usuário uma série de números e quando ele digitar um número negativo, o programa irá encerrar e imprimir o maior número entre os digitados. Você deve utilizar estruturas de repetição para coletar os números e determinar qual é o maior.

Ex: Suponha que o usuário insira os seguintes números: 5, 12, 8, 25, 3, -1. A saída do programa deve ser: 25.



Importante: Imprima apenas o maior número e nenhum texto adicional!

Utilizar a estrutura de repetição while e jump statements (break).
 */
public class MaiorNumero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero:");
    int numero = sc.nextInt();
    int maior = numero;

    while (numero > 0) {
      System.out.println("Digite um numero:");
      numero = sc.nextInt();

      if (numero > maior) {
        maior = numero;
      }

      if (numero < 0) {
        break;
      }
    }

    System.out.println(maior);

    sc.close();
  }
}
