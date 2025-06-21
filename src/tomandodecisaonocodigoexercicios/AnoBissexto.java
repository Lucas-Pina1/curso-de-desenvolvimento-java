package tomandodecisaonocodigoexercicios;

import java.util.Scanner;

/*
 * Escreva um programa que checa se um ano é bissexto.
 * Um ano bissexto é um ano divisivell por 4, com exceção dos anos 
 * divisiveis por 100 mas não por 400.
 * 
 * Ex: O ano 2000 foi um ano bissexto porque é divisivel por 400,
 * mas o ano 1900 não foi porque é divisivel por 100 e não por 400.
 */
public class AnoBissexto {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um ano e descubra se ele é bissexto: ");
    int ano = sc.nextInt();

    boolean naoBissexto = ano % 4 != 0 || (ano % 100 == 0 && ano % 400 != 0);
    if (naoBissexto) {
      System.out.println("Não é bissexto");
    } else {
      System.out.println("bissexto");
    }
    sc.close();
  }
}
