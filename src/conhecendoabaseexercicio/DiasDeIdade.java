package conhecendoabaseexercicio;

/* 
 * Escreva um programa que leia uma idade em anos e imprima essa idade em dias.
 * 
 * Ex: 1 ano => 365 dias de idade
 * 
*/

import java.util.Scanner;

public class DiasDeIdade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("------- Idade em dias -------");
    System.out.println("Digite a idade que gostaria de saber em dias:");
    int idade = scanner.nextInt();

    int idadeEmDias = idade * 365;

    System.out.println("A idade " + idade + " anos é equivalente a " + idadeEmDias + " dias");

    scanner.close();
  }
}
