package repetindoinstrucoes;

import java.util.Scanner;

/*
 * 
Fatorial
Você deve criar um programa Java que permita ao usuário calcular o fatorial de um número inteiro positivo. Lembre-se de que o fatorial de um número n é o produto de todos os inteiros positivos de 1 a n.

Por exemplo, se o usuário informar o número 7, o programa deve imprimir o fatorial de 7 que é 5040.

Usar a estrutura de repetição for e jump statements (break).
 */
public class Fatorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero inteiro para saber a fatorial: ");
    int numero = sc.nextInt();
    int fatorial = 1;

    for (int i = 1; i <= numero; i++) {
      fatorial *= i;
    }

    if (numero > 0) {
      System.out.println(fatorial);
    } else {
      System.out.println("Digite um numero positivo");
    }
    sc.close();
  }
}
