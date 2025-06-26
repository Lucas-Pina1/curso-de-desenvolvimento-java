package repetindoinstrucoes;

import java.util.Scanner;

/*
 * Soma dos números de 1 a N
Escreva um programa Java que imprima a soma dos números de 1 até um número inteiro positivo N, onde N é fornecido pelo usuário. O programa deve solicitar ao usuário que insira o valor de N e, em seguida, calcular e exibir a soma dos números de 1 até N.

Ex: Se N = 5, a soma de 1 a N será 15.



Importante: Imprima apenas a soma no seu programa, não imprima mais nenhuma mensagem para não comprometer a correção do exercício.
 */
public class SomaNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int n = sc.nextInt();

    int soma = 0;

    for (int i = 1; i <= n; i++) {
      soma += i;
    }
    System.out.println(soma);
    sc.close();
  }
}
