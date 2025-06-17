package tomandodecisaonocodigoexercicios;

import java.util.Scanner;

/*
 * Leia 3 números e imprima-os em ordem crescente.
 */
public class OrdemCrescente {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int primeiroNumero = sc.nextInt();
    System.out.println("Digite o segundo número: ");
    int segundoNumero = sc.nextInt();
    System.out.println("Digite o terceiro número: ");
    int terceiroNumero = sc.nextInt();

    System.out.println();

    if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
      System.out.println(primeiroNumero);

      if (segundoNumero < terceiroNumero) {
        System.out.println(segundoNumero);
        System.out.println(terceiroNumero);
      } else {
        System.out.println(terceiroNumero);
        System.out.println(segundoNumero);
      }
    } else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
      System.out.println(segundoNumero);

      if (primeiroNumero < terceiroNumero) {
        System.out.println(primeiroNumero);
        System.out.println(terceiroNumero);
      } else {
        System.out.println(terceiroNumero);
        System.out.println(primeiroNumero);
      }
    } else if (terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) {
      System.out.println(terceiroNumero);

      if (segundoNumero < primeiroNumero) {
        System.out.println(segundoNumero);
        System.out.println(primeiroNumero);
      } else {
        System.out.println(primeiroNumero);
        System.out.println(segundoNumero);
      }
    } else {
      System.out.println("Erro! Resposta não encontrada");
    }

    sc.close();
  }
}
