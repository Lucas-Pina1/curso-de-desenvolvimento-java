package tomandodecisaonocodigoexercicios;

/*
 * Leia um número e imprima se ele é par ou ímpar.
 */

import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite um numero inteiro e descubra se é par ou impar: ");
    int numero = sc.nextInt();

    String eParOuImpar = numero % 2 == 0 ? "Par" : "Ímpar";

    System.out.printf("O número %d é %s", numero, eParOuImpar);

    sc.close();
  }
}
