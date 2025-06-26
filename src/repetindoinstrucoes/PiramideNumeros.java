package repetindoinstrucoes;

import java.util.Scanner;

/*
 * Pirâmide de números
Crie um programa Java que lê um número n (no exemplo abaixo n é igual a 5) e gera um padrão de números crescentes da seguinte forma:

1
12
123
1234
12345
Dica: Utilize loops aninhados para resolver o problema.



Importante: Imprima apenas a pirâmide acima, nenhum texto a mais.


 */
public class PiramideNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero de linhas: ");
    int numeroLinhas = sc.nextInt();

    for (int i = 1; i <= numeroLinhas; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Invertida");
    System.out.println();

    for (int i = numeroLinhas; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    sc.close();
  }
}
