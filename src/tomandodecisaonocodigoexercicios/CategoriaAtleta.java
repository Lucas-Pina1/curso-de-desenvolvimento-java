package tomandodecisaonocodigoexercicios;

/*
 * Dada a idade do atleta, imprima sua categoria:
 * 
 * Mirim: 10 a 12 anos
 * Infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 * 
 */
import java.util.Scanner;

public class CategoriaAtleta {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a idade do atleta para saber sua categoria: ");
    int idade = sc.nextInt();

    boolean mirim = idade >= 10 && idade <= 12;
    boolean infantil = idade >= 13 && idade <= 15;
    boolean juvenil = idade >= 16 && idade <= 18;

    String categoria = null;

    if (mirim) {
      categoria = "Mirim";
    } else if (infantil) {
      categoria = "Infantil";
    } else if (juvenil) {
      categoria = "Juvenil";
    } else {
      System.out.println("Não tem categoria para a idade digitada");
    }

    if (categoria != null) {
      System.out.printf("A categoria do atleta é %s", categoria);
    }

    sc.close();
  }

}
