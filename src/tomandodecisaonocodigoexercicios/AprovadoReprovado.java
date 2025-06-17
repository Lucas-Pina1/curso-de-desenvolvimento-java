package tomandodecisaonocodigoexercicios;

/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir media 7.0 ou maior para ser aprovado
 */

import java.util.Scanner;

public class AprovadoReprovado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a primeira nota do aluno: ");
    double primeiraNota = sc.nextDouble();
    System.out.println("Digite a primeira nota do aluno: ");
    double segundaNota = sc.nextDouble();
    System.out.println("Digite a primeira nota do aluno: ");
    double terceiraNota = sc.nextDouble();
    sc.close();

    double media = (primeiraNota + segundaNota + terceiraNota) / 3;

    String mensagem = media >= 7.0 ? "Aluno Aprovado!" : "Aluno reprovado!";

    System.out.printf("Média final: %.2f, %s", media, mensagem);
  }
}
